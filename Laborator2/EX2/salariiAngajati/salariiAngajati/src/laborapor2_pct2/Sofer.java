package laborapor2_pct2;

public class Sofer extends Angajat {

    public static int nrMaxOreLucrate=300;
    private int nrOreLucrate;
    private int km_Parcursi;
    private  static final int kmMaxParcursi=5000;
    private int salariulOrarSofer= 15;
    private double coeficientSalarial=1.00;
    public double salariuSofer;

    public Sofer(String nume, String prenume) {
        this.nume=nume;
        this.prenume=prenume;
    }
    public String toString()
    {
        return nume+" "+prenume;
    }

    public static int getNrMaxOreLucrate() {
        return nrMaxOreLucrate;
    }
    public int getNrOreLucrate() {
        return nrOreLucrate;
    }
    public void setNrOreLucrate(int nrOreLucrate) {
        if(nrOreLucrate<0)
            this.nrOreLucrate=0;
        else if (nrOreLucrate > nrMaxOreLucrate)
            this.nrOreLucrate=nrMaxOreLucrate;
        else
            this.nrOreLucrate=nrOreLucrate;
    }

    public void setKm_Parcursi(int km_Parcursi) {
        if(km_Parcursi<0)
            this.km_Parcursi=0;
        else if (km_Parcursi > kmMaxParcursi)
            this.km_Parcursi=kmMaxParcursi;
        else
            this.km_Parcursi=km_Parcursi;

    }
    public int getKm_Parcursi() {return km_Parcursi;}

    public double salariu() {
        salariuSofer =  salariulOrarSofer * nrOreLucrate + km_Parcursi * 0.1;
        return salariuSofer;
    }



}
