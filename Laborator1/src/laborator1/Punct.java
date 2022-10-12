package laborator1;

public class Punct {
        Double x,y;

    public void setX(Double x) {
        this.x = x;
    }

    public void setY(Double y) {
        this.y = y;
    }
    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Punct(Double x, Double y) {
            this.x=x;
            this.y=y;
        }

        public String toString(){
            String s=" ";
            s=String.format("(%.1d,%.1d)",x,y);
            return s;

        }
        public double distanta(Punct p){
            double d;
            d=Math.pow((p.x-x),2)+Math.pow((p.y-y),2);
            return d;
        }


}
