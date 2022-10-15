package laborator2;

public class Inginer extends Persoana implements IAngajat{
    private static final int nrMaxOreLucrate=250;
    private double coeficientSalarial=1.5;
    private int nrOreLucrate;
    public double salariuInginer;
    private int salariulOrarInginer=15;

    public Inginer() {}

    public Inginer(String nume, String prenume) {
        super(nume, prenume);
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        if(nrOreLucrate<0)
            this.nrOreLucrate=0;
        else if (nrOreLucrate > nrMaxOreLucrate)
            this.nrOreLucrate=nrMaxOreLucrate;
        else
            this.nrOreLucrate=nrOreLucrate;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public double salariu() {
        return salariuInginer =coeficientSalarial * salariulOrarInginer * nrOreLucrate ;
    }

}
