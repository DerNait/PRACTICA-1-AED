import java.util.Comparator;

public class AutomovilComparator<V> implements Comparator<V>{

    @Override
    public int compare(V o1, V o2) {
        
        String placa1 = (String)o1;
        String placa2 = (String)o2;

        return placa1.compareTo(placa2);
    }
    
}