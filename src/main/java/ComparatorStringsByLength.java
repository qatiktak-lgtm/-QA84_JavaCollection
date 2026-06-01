import java.util.Comparator;

public class ComparatorStringsByLength
        implements Comparator <String>{

    private final boolean isReverse;

    public ComparatorStringsByLength() {
        this.isReverse = false; // Конструктор по умолчанию (для обычной сортировки по возрастанию)
    }
    public ComparatorStringsByLength(boolean isReverse) {
        this.isReverse = isReverse; // Конструктор с выбором направления (передаем true, если нужен реверс)
    }

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length(); //2
        int len2 = o2.length(); //5

        if (isReverse) {
            return Integer.compare(len2, len1); // Если нужен реверс: меняем len2 и len1 местами (убывание)
        } else {
            return Integer.compare(len1, len2); // Обычный порядок (возрастание)
        }
        //return len1 - len2; //или сложнеее через if (или следующая строка универсальная)
        //return Integer.compare(len1,len2); это то же самое по сути универсальный метод
    }



}
