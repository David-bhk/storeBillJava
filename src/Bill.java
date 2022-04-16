import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        // variables
        int id = 0;
        String productName = null;
        int quantity = 0;
        double price = 0.0;
        double totalPrice = 0.0;
        double overAllPrice = 0.0;
        char choice = '\0';

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        List<Products> product = new ArrayList<Products>();

        do {
            // read input values
            System.out.println("Welcome to Sarte's Store");
            System.out.print("Enter ID: ");
            id = scan.nextInt();
            System.out.print("Enter Name: ");
            productName = scan.next();
            System.out.print("Enter Quantity: ");
            quantity = scan.nextInt();
            System.out.print("Enter Price (per item): ");
            price = scan.nextDouble();

            // calculate total price for that product
            totalPrice = price * quantity;

            // calculate overall price
            overAllPrice += totalPrice;

            // create Product class object and add it to the list
            product.add( new Products(
                 id, productName, quantity, price, totalPrice) );

            // ask for continue?
            System.out.print("Want to add more item? Press [1]yes, [0] if no: ");
            choice = scan.next().charAt(0);

            // read remaining characters, don't store (no use)
            scan.nextLine();
        } while (choice == '1' || choice == '0');

        // display all product with its properties
        Products.displayFormat();
        for (Products p : product) {
            p.display();
        }

        // overall price
        System.out.println("\nTotal Price = " + overAllPrice);

        // close Scanner
        scan.close();
    }

}
