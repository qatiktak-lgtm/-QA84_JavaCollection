package h_w_12L16;

public class Books {
    private String name;
    private String story;
    private int pages;
    private double price;

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", story='" + story + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }

    public Books(String name, String story, int pages, double price) {
        super();
        this.name = name;
        this.story = story;
        this.pages = pages;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.trim().length() < 2) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        if (story == null || story.isBlank() || story.trim().length() < 2) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.story = story;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException(
                    "Pages must be greater than 0");
        }
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 || Double.isNaN(price) || Double.isInfinite(price)) {
            throw new IllegalArgumentException(
                    "Invalid price");
        }
        this.price = price;
    }
}
