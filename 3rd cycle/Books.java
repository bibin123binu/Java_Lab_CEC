import java.util.Scanner;

class BooksManager {
    private static Scanner scanner = new Scanner(System.in);

    private static int count;
    private static Literature[] literatureBooks;
    private static Fiction[] fictionBooks;
    private static int countLiterature, countFiction;
    private static String publisher, bookname, author;
    private static int publishedYear;
    private static double price;

    public static void main(String args[]) {
        System.out.println("No of literature books to add: ");
        countLiterature = scanner.nextInt();
        literatureBooks = new Literature[countLiterature];
        for (count = 0; count < countLiterature; count++) {
            read("Literature", count + 1);
            literatureBooks[count] = new Literature(publisher, bookname, author, publishedYear, price);
        }
        System.out.println("No of fiction books to add: ");
        countFiction = scanner.nextInt();
        fictionBooks = new Fiction[countFiction];
        for (count = 0; count < countFiction; count++) {
            read("Fiction", count + 1);
            fictionBooks[count] = new Fiction(publisher, bookname, author, publishedYear, price);
        }
        display();
    }

    static void read(String type, int count) {
        System.out.printf("\nEnter details for %s book %d\n", type, count);
        System.out.println("Publisher name: ");
        scanner.nextLine();
        publisher = scanner.nextLine();
        System.out.println("Book name: ");
        bookname = scanner.nextLine();
        System.out.println("Author: ");
        author = scanner.nextLine();
        System.out.println("Published Year: ");
        publishedYear = scanner.nextInt();
        System.out.println("Price: ");
        price = scanner.nextDouble();
    }

    static void display() {
        int i;
        System.out.println("Literature Books:\n");
        for (i = 0; i < countLiterature; i++) {
            System.out.printf("Book name: %s\nPublisher name: %s\nAuthor: %s\nYear: %d\nPrice: %,.2f\n\n",
                    literatureBooks[i].bookName, literatureBooks[i].pubName, literatureBooks[i].author,
                    literatureBooks[i].publishedYear, literatureBooks[i].price);
        }
        System.out.println("\nFiction Books:\n");
        for (i = 0; i < countFiction; i++) {
            System.out.printf("Book name: %s\nPublisher name: %s\nAuthor: %s\nYear: %d\nPrice: %,.2f\n\n",
                    fictionBooks[i].bookName, fictionBooks[i].pubName, fictionBooks[i].author,
                    fictionBooks[i].publishedYear, fictionBooks[i].price);
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
    String bookName, author;
    int publishedYear;
    double price;

    Book(String _pubName, String _bookName, String _author, int _publishedYear, double _price) {
        super(_pubName);
        this.bookName = _bookName;
        this.author = _author;
        this.publishedYear = _publishedYear;
        this.price = _price;
    }
}

class Literature extends Book {
    Literature(String _pubName, String _bookName, String _author, int _publishedYear, double _price) {
        super(_pubName, _bookName, _author, _publishedYear, _price);
    }
}

class Fiction extends Book {
    Fiction(String _pubName, String _bookName, String _author, int _publishedYear, double _price) {
        super(_pubName, _bookName, _author, _publishedYear, _price);
    }
}