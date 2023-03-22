import java.util.Scanner;

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

    // Constructor to create a book with user input
    public Book() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book code: ");
        this.code = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline character

        System.out.print("Enter book title: ");
        this.title = scanner.nextLine();

        System.out.print("Enter book price: ");
        this.price = scanner.nextDouble();
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
        /*return "Book [code=" + code + ", title=" + title + ", price=" + price + "]";*/
        return "Book Details:\n" +
               "Code: " + code + "\n" +
               "Title: " + title + "\n" +
               "Price: " + price;
    }
}

class Books {
    public static void main(String[] args) {
        Book book = new Book();

        System.out.println(book);
    }
}
