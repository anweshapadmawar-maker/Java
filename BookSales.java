import java.util.Scanner;

class Book {
    String author;
    String title;
    String publisher;
}

class BookInfo extends Book {
    int price;
    int stock;
}

public class BookSales extends BookInfo {
    int copiesSold;

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

        System.out.print("Enter copies sold: ");
        copiesSold = sc.nextInt();
    }

    void revenueGenerated() {
        int revenue = price * copiesSold;
        System.out.println("Revenue Generated: " + revenue);
    }

    void allShow() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
        System.out.println("Copies Sold: " + copiesSold);
    }

    public static void main(String[] args) {
        BookSales b = new BookSales();

        b.getData();

        System.out.println("\nBook Details");
        b.allShow();

        b.revenueGenerated();
    }
}