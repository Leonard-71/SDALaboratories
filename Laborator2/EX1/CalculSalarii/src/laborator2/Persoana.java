package laborator2;

public class Persoana {
    String nume, prenume;

    public Persoana()
    {

    }
    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }


    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    public String getPrenume() {
        return prenume;
    }

    public String toString()
    {
        return nume+" "+prenume;
    }

}
