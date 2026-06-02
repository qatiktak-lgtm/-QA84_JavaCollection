package h_w_12L16;

import java.util.Comparator;

public class hw_12CmprtStrByABC implements Comparator<String> {
    @Override
    public int compare(String st1, String st2) {
        return st1.compareTo(st2);
    }
}
