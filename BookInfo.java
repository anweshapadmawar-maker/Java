import java.util.Scanner;

class Book {
    String author;
    String title;
    String publisher;
}

class BookInfo extends Book {
    int price;
    int stock;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author: ");
        author = sc.nextLine();

        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter publisher: ");
        publisher = sc.nextLine();

        System.out.print("Enter price: ");
        price = sc.nextInt();

        System.out.print("Enter stock: ");
        stock = sc.nextInt();
        sc.nextLine();
    }

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        BookInfo b1 = new BookInfo();
        BookInfo b2 = new BookInfo();
        BookInfo b3 = new BookInfo();

        System.out.println("Enter details of Book 1");
        b1.getData();

        System.out.println("Enter details of Book 2");
        b2.getData();

        System.out.println("Enter details of Book 3");
        b3.getData();

        System.out.println("\nBook 1 Details");
        b1.show();

        System.out.println("\nBook 2 Details");
        b2.show();

        System.out.println("\nBook 3 Details");
        b3.show();
    }
}