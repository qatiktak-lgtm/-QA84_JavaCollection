import java.util.*;

public class MainJavaCollections {
    public static void main(String[] args) {
        // 2026-05-29
        ArrayList list = new ArrayList(); //здесь комптлятор ругается! Правильно: ArrayList<Object> list = new ArrayList<>(); // Теперь Java понимает, что это твой осознанный выбор - данные разных типов
        list.add(5);
        list.add(34.23);
        list.add("hello");
        list.add(true);
        System.out.println(list);
        // Klass work 2026-06-01
        ArrayList<String> list1 = new ArrayList<>(); // во 2м случае в <> можно String (Integer...) не указывать.
        list1.add("money");
        list1.add("happy");
        list1.add("Hi");
        list1.add("bye");
        System.out.println(list1);


    }

}
/*

> Task :MainListsTest.main()
  0     1       2       3       4     5
[kiwi, apple, grape, banana, lemon, melon]

 */

/*
JCF => Java Collections Framework
1.List
    ArrayList
      0   1    2    3   4
ar-> [8] [5] [-1] [66] [4]

    LinkedList
 0       1        2        3       4 (псевдо индексы)
[9] -- >[5] -- >[-1] -- >[66] -- >[4] --> [7]
head                                      tale (хвост)

2.Sets
    HashSet     LinkedHashSet       TreeSet

3.Map (аналог Dictionary в Python --> ключ: значение)
    HashMap     LinkedHashMap       TreeMap



 */