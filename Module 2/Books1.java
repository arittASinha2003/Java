class Books1 {
    int code;
    String title;
    double price;

    public Books1(int code, String title, double price) {
        this.code = code;
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        Books1 book1 = new Books1(1, "The Alchemist", 10.99);
        System.out.println("Book Code: " + book1.code);
        System.out.println("Book Title: " + book1.title);
        System.out.println("Book Price: $" + book1.price);
    }
}