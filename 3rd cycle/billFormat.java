import java.util.Scanner;

public class billFormat {
    public static int orderNo = 0;

    public static double netTotal = 0;

    public static void main(String[] args) {
        Order order = new Order(++orderNo);
        printBill(order);

    }

    static void printBill(Order order) {
        System.out.println(String.format("\n\nOrder Number: %d\nDate: %s\n", order.orderNo, order.date));
        System.out.println(String.format("Product ID\tName\tQuantity\tUnit Price\tTotal\n"));
        for (int i = 0; i < order.product.length; i++) {
            System.out.println(String.format("%d\t\t%s\t%d\t\t%,.2f\t\t%,.2f", i + 1, order.product[i].pName,
                    order.product[i].qty, order.product[i].unitPrice, order.product[i].total));
            netTotal += order.product[i].total;
        }
        System.out.println("\n\t\t\t\t\t\tNet Total: " + netTotal);

    }
}

interface billInterface {
    double calculate();
}

class Product {
    int qty;
    double unitPrice, total;
    String pName;
    Scanner scanner = new Scanner(System.in);

    Product() {
        out("Product name: ");
        this.pName = scanner.nextLine();
        out("Unit price: ");
        this.unitPrice = scanner.nextDouble();
        out("Quantity: ");
        this.qty = scanner.nextInt();
        this.total = this.qty * this.unitPrice;
    }

    static void out(String msg) {
        System.out.println(msg);
    }

}

class Order implements billInterface {
    int orderNo, pCount;
    double unitPrice, total;
    String pName, date;
    Product[] product;

    Scanner scanner = new Scanner(System.in);

    Order(int orderNo) {
        out("Enter the order info:\n");
        this.orderNo = orderNo;
        out("Date: [format dd-mm-yy] ");
        this.date = scanner.nextLine();
        out("No of products to add: ");
        pCount = scanner.nextInt();
        product = new Product[pCount];
        for (int i = 0; i < pCount; i++) {
            product[i] = new Product();
        }
        this.total = calculate();

    }

    public double calculate() {
        int sum = 0;
        for (int i = 0; i < this.product.length; i++) {
            sum += this.product[i].total;
        }
        return sum;
    }

    static void out(String msg) {
        System.out.println(msg);
    }
}
