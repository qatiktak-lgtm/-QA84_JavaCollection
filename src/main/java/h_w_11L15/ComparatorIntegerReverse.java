package h_w_11L15;

import java.util.Comparator;

public class ComparatorIntegerReverse implements Comparator <Integer> {

    @Override
    public int compare(Integer int1, Integer int2) {
        return int2.compareTo(int1);
    }
}
