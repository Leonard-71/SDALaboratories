package laborapor2_pct2;

public class Angajat extends Persoana{
    protected Object nume;
    protected Object prenume;
    private static int nrMaxOreLucrate;
    private static int nrOreLucrate;
    private static double coeficientSalarial;
    private static final double salariuOrarMinim=15;
    private static double salariu;

    public Angajat() {}
    public String toString()
    {
        return nume+" "+prenume;
    }

    public int getNrOreLucrate() {

        return nrOreLucrate;
    }
    public void setNrOreLucrate(int i) {}

    public static int getNrMaxOreLucrate() {
        return nrMaxOreLucrate;
    }
    public double getCoeficientSalarial() {

        return coeficientSalarial;
    }
    public double salariu() {
        return salariu;
    }

}
