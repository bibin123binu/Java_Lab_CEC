import java.util.Scanner;

class BooksManager {
    private static Scanner scanner = new Scanner(System.in);

    private static int count;
    private static Literature[] lBooks;
    private static Fiction[] fBooks;
    private static int countL, countF;
    private static String publisher, bName, author;
    private static int pubYear;
    private static double price;

    public static void main(String args[]) {
        System.out.println("No of literature books to add: ");
        countL = scanner.nextInt();
        lBooks = new Literature[countL];
        for (count = 0; count < countL; count++) {
            read("Literature", count + 1);
            lBooks[count] = new Literature(publisher, bName, author, pubYear, price);
        }
        System.out.println("No of fiction books to add: ");
        countF = scanner.nextInt();
        fBooks = new Fiction[countF];
        for (count = 0; count < countF; count++) {
            read("Fiction", count + 1);
            fBooks[count] = new Fiction(publisher, bName, author, pubYear, price);
        }
        display();
    }

    static void read(String type, int count) {
        System.out.printf("\nEnter details for %s book %d\n", type, count);
        System.out.println("Publisher name: ");
        scanner.nextLine();
        publisher = scanner.nextLine();
        System.out.println("Book name: ");
        bName = scanner.nextLine();
        System.out.println("Author: ");
        author = scanner.nextLine();
        System.out.println("Published Year: ");
        pubYear = scanner.nextInt();
        System.out.println("Price: ");
        price = scanner.nextDouble();
    }

    static void display() {
        int i;
        System.out.println("Literature Books:\n");
        for (i = 0; i < countL; i++) {
            System.out.printf("Book name: %s\nPublisher name: %s\nAuthor: %s\nYear: %d\nPrice: %,.2f\n\n",
                    lBooks[i].bName, lBooks[i].pubName, lBooks[i].author,
                    lBooks[i].pubYear, lBooks[i].price);
        }
        System.out.println("\nFiction Books:\n");
        for (i = 0; i < countF; i++) {
            System.out.printf("Book name: %s\nPublisher name: %s\nAuthor: %s\nYear: %d\nPrice: %,.2f\n\n",
                    fBooks[i].bName, fBooks[i].pubName, fBooks[i].author,
                    fBooks[i].pubYear, fBooks[i].price);
        }
    }
}

class Publisher {
    String pubName;

    Publisher(String pubName) {
        this.pubName = pubName;
    }
}

class Book extends Publisher {
    String bName, author;
    int pubYear;
    double price;

    Book(String _pubName, String _bNa, String _author, int _pubYear, double _price) {
        super(_pubName);
        this.bName = _bNa;
        this.author = _author;
        this.pubYear = _pubYear;
        this.price = _price;
    }
}

class Literature extends Book {
    Literature(String _pubName, String _bNa, String _author, int _pubYear, double _price) {
        super(_pubName, _bNa, _author, _pubYear, _price);
    }
}

class Fiction extends Book {
    Fiction(String _pubName, String _bNa, String _author, int _pubYear, double _price) {
        super(_pubName, _bNa, _author, _pubYear, _price);
    }
}