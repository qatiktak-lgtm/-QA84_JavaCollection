package klass_work17;

public class Book implements Comparable<Book> {
    private String author;
    private String title;
    private int pages;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public Book(String author, String title, int pages, double price) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book other) {
        return this.author.compareToIgnoreCase(other.author);
    }


//    @Override
//    public int compareTo(Book other) {
//        return this.author.compareToIgnoreCase(other.author);
//    }


}
