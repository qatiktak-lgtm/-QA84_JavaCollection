package h_w_11L15;

import java.util.ArrayList;
import java.util.LinkedList;
//home work # 11 2026-06-01
public class MainListsMethodsHw11 {
    public static void main(String[] args) {
        ArrayList<Double> listD = new ArrayList<>();
        listD.add(12.5);
        listD.add(127.9458);
        listD.add(-0.00000);
        listD.add(2.5);
        listD.add(0.00000);
        listD.add(0.0);
        listD.add(-0.5942357);
        listD.add(-11999990.5);
        listD.add(-7777.5);
        System.out.println(listD);

        listD.add(3, 9950012.0010);
        System.out.println(listD);

        System.out.println(listD.get(3));

        listD.remove(1);
        System.out.println(listD);
        listD.remove(0.);
        System.out.println(listD);
        listD.remove(7); // ругается когда выходит за предел индексов
        System.out.println(listD);
        boolean resD = listD.contains(2.5);
        System.out.println(resD);
        boolean resD2 = listD.isEmpty();
        System.out.println(resD2);
        listD.set(3, 5.5);
        System.out.println(listD);
        listD.sort(null);
        System.out.println(listD);

        System.out.println(listD.get(listD.size() - 1));

        System.out.println("- = DoubleSorter work = -");
        ComparatorsDoubleReverseHw11 compar1 = new ComparatorsDoubleReverseHw11();
        listD.sort(compar1);
        System.out.println(listD);
// ============================================================
        LinkedList<Integer> listInt = new LinkedList<>();
        listInt.add(12);
        listInt.add(127);
        listInt.add(-0);
        listInt.add(2);
        listInt.add(0);
        listInt.add(0);
        listInt.add(-10);
        listInt.add(-999990);
        listInt.add(-7777);
        System.out.println(listInt);

        listInt.add(3, 999950012);
        System.out.println(listInt);

        System.out.println(listInt.get(3));

        listInt.remove(1);
        System.out.println(listInt);
        listInt.remove((Object) 0);
        System.out.println(listInt);
        listInt.remove(7); // ругается когда выходит за предел индексов
        System.out.println(listInt);
        boolean resD3 = listInt.contains(2);
        System.out.println(resD3);
        boolean resD4 = listInt.isEmpty();
        System.out.println(resD4);
        listInt.set(3, 5);
        System.out.println(listInt);
        listInt.sort(null);
        System.out.println(listInt);

        System.out.println(listInt.get(listInt.size() - 1));

        System.out.println("- = IntegerSorter work = -");
        ComparatorIntegerReverse compar2 = new ComparatorIntegerReverse();
        listInt.sort(compar2);
        System.out.println(listInt);
    }
}
