package laborapor2_pct2;

public class Inginer extends Angajat {

    public static  int nrMaxOreLucrate=250;
    private int nrOreLucrate;
    public double salariuInginer;
    private int salariulOrarInginer=15;
    private double coeficientSalarial=1.5;


    public Inginer(String nume, String prenume) {
        this.nume=nume;
        this.prenume=prenume;
    }


    public void setNrOreLucrate(int nrOreLucrate) {
        if(nrOreLucrate<0)
            this.nrOreLucrate=0;
        else if (nrOreLucrate > nrMaxOreLucrate)
            this.nrOreLucrate=nrMaxOreLucrate;
        else
            this.nrOreLucrate=nrOreLucrate;
    }
    @Override
    public int getNrOreLucrate() {
        return nrOreLucrate;
    }


    public static int getNrMaxOreLucrate() {

        return nrMaxOreLucrate;
    }


    public double getCoeficientSalarial() {

        return coeficientSalarial;
    }

    public double salariu() {

        return salariuInginer =coeficientSalarial * salariulOrarInginer * nrOreLucrate ;
    }

}
