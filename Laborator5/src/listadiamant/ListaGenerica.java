/**
 *
 * @author PSG
 * @param <T> - tipul informatiei din elementele listei
 */
package listadiamant;
import java.util.Iterator;
public class ListaGenerica<T> implements Iterable<T> {
    protected Element<T> primul=null, ultimul=null;
    public int nr=0;
    @Override
    public Iterator<T> iterator() {
        return new IteratorLst<>(primul);
    }
    public void insertInFata(T x){
        Element<T> primulInitial=primul;
        primul=new Element(x, primulInitial);
        nr++;
        if(primulInitial == null) ultimul=primul;

    }
    public void insertLaUrma(T x){
        Element<T> ultimulInitial=ultimul;
        ultimul = new Element(x, null);
        nr++;
        if(ultimulInitial == null) primul = ultimul;
        else
            ultimulInitial.setUrm(ultimul);

    }
    public void eliminaToateElementele(){
        primul=ultimul=null;
        nr=0;
    }
    @Override
    public String toString(){
        StringBuilder rez=new StringBuilder("[");
        for(Iterator<T> it=new IteratorLst(primul); it.hasNext();) {
            T info = it.next();
            rez.append( info==null ? "null" : info.toString() );
            if(it.hasNext())
                rez.append(", ");
        }
        rez.append(']');
        return rez.toString();
    }
    public int size()
//    { int k=0;
//        for(Iterator<T> it=new IteratorLst(primul);it.hasNext();)
//    {   T info = it.next();
//        k++;
//    }
//        return k;}
    {
        return nr;
    }
}