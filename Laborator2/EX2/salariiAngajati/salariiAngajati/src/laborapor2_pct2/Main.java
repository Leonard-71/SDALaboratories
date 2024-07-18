package laborapor2_pct2;

public class Main {
    public static void main(String[] args) {
        Inginer ing1= new Inginer("Barbulescu", "Barbu");
        Inginer ing2= new Inginer("Trestie", "Tudor");
        Sofer sof1=new Sofer("Repede", "Raul");

        ing1.setNrOreLucrate(100);
        ing2.setNrOreLucrate(200);
        sof1.setNrOreLucrate(250);
        sof1.setKm_Parcursi(6000);

        System.out.println(" Inginer " + ing1.toString() + " a lucrat " + ing1.getNrOreLucrate() + " ore - salariu= " + ing1.salariu());
        System.out.println(" Inginer " + ing2 + " a lucrat " + ing2.getNrOreLucrate() + " ore - salariu= " + ing2.salariu());
        System.out.println(" Sofer " + sof1.toString() + " a lucrat " + sof1.getNrOreLucrate() + " ore, a parcurs " + sof1.getKm_Parcursi() + " km - salariu= " + sof1.salariu());


       Angajat[] salariati= new Angajat[]{ ing1, ing2, sof1};
        int[] ore= new int[]{100,200,250};
        double suma=0;
        for(int i=0;i< salariati.length;i++)
        {
            salariati[i].setNrOreLucrate(ore[i]);
            suma=suma+salariati[i].salariu();
        }
        System.out.println(String.format("Total salarii= %.1f",suma));



    }

    }