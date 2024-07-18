package listadiamant;
/**
 *
 * @author Decanat1
*/
public class AplicatieListaGen {
    public static void main(String[] args) {
        ListaGenerica<String> lst = new ListaGenerica<>();
        lst.insertLaUrma("Bucuresti");
        lst.insertInFata("Suceava");
        lst.insertLaUrma("Iasi");
        System.out.println("Orasele din lista:" + lst);
        lst.eliminaToateElementele();
        for (int i = 0; i < 21; i++) {
            String o = Integer.toString(i); // o=""+i
            if (i % 2 != 0)
                lst.insertInFata(o);
            else
                lst.insertLaUrma(o);
        }
        System.out.println("Numerele din lsta:" + lst);
        System.out.print("Intregii din lsta x10: ");
        for (String el : lst) {
            System.out.print((Integer.valueOf(el) * 10) + ", ");
        }
        System.out.print("\nLungimea listei este: ");
        System.out.print(lst.size());


        ListaGenerica2<String> lst2 = new ListaGenerica2<>();
        for (int i = 0; i < 21; i++) {
            String o = Integer.toString(i); // o=""+i
            if (i % 2 != 0)
                lst2.insertInFata(o);
            else
                lst2.insertLaUrma(o);
        }
        System.out.println();
        while(lst2.size() > 0) {

            System.out.print("Numerele din lista (" + lst.size() + ") :");
            for (String el : lst2) {
                System.out.print(el + " ");
            }
            lst2.eliminaPrimul();
            System.out.println();
        }

    }
}
