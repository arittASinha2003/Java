class Book {
    private int code;
    private String title;
    private double price;

    // Constructor to initialize all fields
    public Book(int code, String title, double price) {
        this.code = code;
        this.title = title;
        this.price = price;
    }

    // Getters and setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method to print book details
    @Override
    public String toString() {
        return "Book [code=" + code + ", title=" + title + ", price=" + price + "]";
    }
}

class Books2 {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", 29.99);
        Book book2 = new Book(102, "Data Structures and Algorithms", 39.99);

        System.out.println(book1);
        System.out.println(book2);

        book1.setPrice(19.99);

        System.out.println(book1);
    }
}
