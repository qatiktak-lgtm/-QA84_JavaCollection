package h_w_12L16;

import java.util.Comparator;

public class hw_12CmprtStrByL implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        return Integer.compare(len2,len1);
    }
}
