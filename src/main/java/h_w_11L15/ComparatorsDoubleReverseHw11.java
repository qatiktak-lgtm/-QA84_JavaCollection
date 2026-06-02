package h_w_11L15;

import java.util.Comparator;

//home work # 11 2026-06-01
public class ComparatorsDoubleReverseHw11
        implements Comparator<Double> {

    @Override
    public int compare(Double d1, Double d2) {
        return d2.compareTo(d1);
    }
}

/*
public class HWComparatorDoubleReverse
implements Comparator<Double> {

@Override new*
public int compare(Double d1, Double d2) {
return Double.compare(d2,d1);  второй вариант записи
    }
}


 */

