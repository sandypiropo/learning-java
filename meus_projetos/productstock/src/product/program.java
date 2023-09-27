package product;

import product.product;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var product001 = new product("TV philips", 2799.00, 10);

        System.out.println(product001.toString());

        System.out.println("ADD PRODUCTS: ");
        int quantity = sc.nextInt();
        product001.AddProduct(quantity);
        System.out.println(product001.toString());

        System.out.println("REMOVE PRODUCTS: ");
        quantity = sc.nextInt();
        product001.RemoveProducts(quantity);

        System.out.println(product001.toString());

        sc.close();
    }
}
