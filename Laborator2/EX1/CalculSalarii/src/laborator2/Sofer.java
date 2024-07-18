package laborator2;

public class Sofer extends Persoana implements IAngajat {

    private static final int nrMaxOreLucrate=300;
    private static final int kmMaxParcursi=5000;
    private double coeficientSalarial=1.00;

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    private int nrOreLucrate;
    private int salariulOrarSofer= 15;
    public double salariuSofer;
    public int kmParcursi;

    public Sofer() {}

    public Sofer(String nume, String prenume) {super(nume, prenume);}

    @Override
    public void setNrOreLucrate(int nrOreLucrate)
    {
        if(nrOreLucrate<0)
            this.nrOreLucrate=0;
        else if (nrOreLucrate > nrMaxOreLucrate)
            this.nrOreLucrate=nrMaxOreLucrate;
        else
            this.nrOreLucrate=nrOreLucrate;
    }

    public void setkmParcursi(int kmParcursi)
    {
        if(kmParcursi<0)
            this.kmParcursi=0;
        else if (kmParcursi > kmMaxParcursi)
            this.kmParcursi=kmMaxParcursi;
        else
            this.kmParcursi=kmParcursi;
    }
    public int getKmParcursi() {return kmParcursi;}

    @Override
    public double salariu() {
        salariuSofer =  salariulOrarSofer * nrOreLucrate + kmParcursi * 0.1;
        return salariuSofer;
    }


}
