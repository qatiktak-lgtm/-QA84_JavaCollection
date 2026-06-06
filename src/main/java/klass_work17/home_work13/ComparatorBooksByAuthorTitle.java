package klass_work17.home_work13;

import klass_work17.Book;

import java.util.Comparator;

public class ComparatorBooksByAuthorTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();
        if (author1.compareToIgnoreCase(author2) == 0) {
            //return o1.getTitle().compareToIgnoreCase(o2.getTitle()); // первый вариант
            return CharSequence.compare(o1.getTitle(), o2.getTitle()); // Best вариант для всех текстовых типов в Java
            // может работать с любыми строками: обычными (String), изменяемыми (StringBuilder, StringBuffer)
            // и даже системными (например, CharBuffer). Экономия памяти: Позволяет работать с кусками текста
            // (через метод .subSequence()) без создания тяжелых дубликатов строк в куче (Heap), что критично
            // при обработке больших объемов данных. Совместимость с регулярными выражениями: Большинство
            // встроенных инструментов Java (например, Pattern и Matcher) принимают именно CharSequence,
            // что позволяет искать текст по маске прямо внутри StringBuilder без лишнего конвертирования в String.
            // Защита от NullPointerException (частичная)

        }
        return author1.compareToIgnoreCase(author2); //третий вариант через дополнительные переменные author1 и author2
    }
}

/*
@Override
public int compare(Book o1, Book o2) {
    String book1Title = o1.getTitle();
    String book2Title = o2.getTitle();
    String book1Author = o1.getAuthor();
    String book2Author = o2.getAuthor();

    // Сравниваем авторов (в обратном порядке o2 против o1)
    int authorCompare = book2Author.compareToIgnoreCase(book1Author);

    // Если авторы РАЗНЫЕ (результат не равен 0), возвращаем этот результат
    if (authorCompare != 0) {
        return authorCompare;
    }

    // Если авторы ОДИНАКОВЫЕ, сравниваем названия (тоже в обратном порядке)
    return book2Title.compareToIgnoreCase(book1Title);
}
 */