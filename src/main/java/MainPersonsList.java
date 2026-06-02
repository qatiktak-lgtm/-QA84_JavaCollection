import java.util.ArrayList;
// KlassWork 2026-06-02
public class MainPersonsList {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("Alex", 101, 25.0);
        Person p2 = new Person("Maria", 102, 30.0);
        Person p3 = new Person("John", 103, 22.0);
        Person p4 = new Person("Emma", 104, 28.0);
        Person p5 = new Person("David", 105, 35.0);
        Person p6 = new Person("Sophia", 106, 27.0);
        Person p7 = new Person("Michael", 107, 40.0);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);

        printPersonsList(list);
    }
    private static void printPersonsList(ArrayList<Person> list) {
        for (Person p: list){
            System.out.println(p);
        }
    }
}
