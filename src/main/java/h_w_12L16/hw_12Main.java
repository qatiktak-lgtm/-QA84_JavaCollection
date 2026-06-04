package h_w_12L16;
// home work 2026-06-02
import java.util.*;

public class hw_12Main {
    public static void main(String[] args) {
        ArrayList<String> listHw = new ArrayList<>();
        listHw.add("bug");
        listHw.add("I");
        listHw.add("browser");
        listHw.add("performance");
        listHw.add("qa");
        listHw.add("framework");

        System.out.println("=".repeat(80));
        System.out.print("Source string: ");
        System.out.println(listHw);

        listHw.sort(null);
        System.out.printf("Sort string \"by null\": " + listHw + "\n");

        listHw.sort(new hw_12CmprtStrByL());
        System.out.printf("Sort string \"by revers length\": " + listHw + "\n");
        System.out.println("-".repeat(80));

        listHw.sort((new hw_12CmprtStrByABC()));
        System.out.printf("Sort string \"by ABC\": " + listHw + "\n");
        System.out.println("=".repeat(80));

//        klWrkComparStrByLrev comp2 = new klWrkComparStrByLrev();
//        listHw.sort(new comp2());

    }
}
