import java.util.Comparator;
// klassWork 2026-06-01
public class ComparatorStrinsReverse
        implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {

        return s2.compareTo(s1);  //  порядок сортировки - от я/z до a (если  s2.compareTo(s1) то от я до а)
    }
}
