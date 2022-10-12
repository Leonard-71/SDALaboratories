package laborator1;

public class EcuatieGrad1 {

    double a;
    double b;

    public EcuatieGrad1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public String toString() {
        String s = "  ";
        s = String.format("%.1fx ", this.a) + String.format("+") + String.format("%.1f", this.b);
        return s;
    }

    public double rezolva() {
        return -(this.a / this.b);
    }

}
