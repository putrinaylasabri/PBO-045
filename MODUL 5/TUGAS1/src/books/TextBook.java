package books;

public class TextBook extends Book {
    private String category;
    public TextBook (String bookId, String title, String author, int stock, String category) {
        super(bookId, title, author, category, stock);
        this.category = category;
    }

    public void setCategory (String category) {
        this.category = category;
    }

    public String getCategory () {
        return category;
    }
}
