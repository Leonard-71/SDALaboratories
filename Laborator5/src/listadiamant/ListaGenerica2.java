package listadiamant;

import java.util.Iterator;

public class ListaGenerica2<T> extends ListaGenerica<T>{
    public T eliminaPrimul()
    {
        if (primul == null) return null;

        nr--;
        T info = primul.getInfo();
        if(primul.getUrm()==null) {
            primul=null;
            ultimul = null;
            return info;
        }

        primul = primul.getUrm();
        return info;
    }
//
//    public T eliminaUltimul()
//    {
//        if (ultimul == null) return null;
//
//        nr--;
//        T info = ultimul.getInfo();
//        if(ultimul.getUrm()==null) {
//            primul=null;
//            ultimul = null;
//            return info;
//        }
//
//        ultimul = ultimul.getInfo();
//        return info;
//    }
}
