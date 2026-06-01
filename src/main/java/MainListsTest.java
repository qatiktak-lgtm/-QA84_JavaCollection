import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainListsTest {
    //klass work 2026-06-01
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("kiwi"); // Добавление в конец
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("lemon");
        list.add("melon");

        System.out.println(list);
        list.add(2, "cherry"); // add(int index, E element) (Вставка в середину или начало) ArrayList: Медленно.LinkedList: Быстро.
        System.out.println(list);
        //list.clear();   // удалить все элементы массива, превращая список в пустой. Объект - переменная list никуда не исчезает — можно сразу продолжить складывать туда новые данные
        String s = list.get(2); // Получение по индексу. ArrayList: Мгновенно. LinkedList: Медленно.(Java буквально по цепочке пойдет с самого начала)
        System.out.println(s);
        list.remove(2); //Удаление ArrayList: Медленно (если удаление не с самого конца). LinkedList: Быстро (сам процесс удаления) Но учти: чтобы удалить элемент из середины, его сначала нужно найти методом get(), что займет время.
        System.out.println(list);
        list.remove("apple");
        System.out.println(list);
        list.remove("cherry");
        System.out.println(list);
//        list.remove(9);
//        System.out.println(list);
        int index = list.indexOf("kiwi"); //ищет элемент в списке и возвращает его индекс (порядковый номер). если такого элемента в списке нет, метод возвращает -1
        System.out.println("in index: " + index);
        int index2 = list.lastIndexOf("kiwi"); // то же что и .indexOf() но начинает с конца списка к началу.Если элемент встречается в списке несколько раз, lastIndexOf() вернет позицию самого последнего из них
        System.out.println("in index: " + index);

        System.out.println("size: " + list.size());
        boolean res = list.contains("lemon");
        System.out.println(res);
        boolean res2 = list.isEmpty(); //true — если в списке нет ни одного элемента
        System.out.println(res2);
        list.set(3, "pineapple"); //делает замену по индексу
        System.out.println(list);
        List<String> sub = list.subList(1, 3); // не включая 3-й.НЕ создает новый список и НЕ копирует элементы в памяти! возвращает так называемый View cмотрит на определенное «окно» внутри исходного списка.
        System.out.println(sub);
        list.sort(null); // сотрировка списка в его естественном (натуральном) порядке
        System.out.println(list); // удобно для простых списков (строк или чисел) по возрастанию. Если нужно отсортировать как-то иначе — null уже не подойдет, придется создавать и передавать полноценный Comparator.
        list.get(0);
        System.out.println(list.get(0));

        ComparatorStrinsReverse comp = new ComparatorStrinsReverse();
        list.sort(comp);
        System.out.println(list);

    }

}
