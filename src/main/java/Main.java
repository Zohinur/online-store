import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner myScanner = new Scanner(System.in);
    static ArrayList<onlineStore> onlineShop = new ArrayList<onlineStore>();
    static boolean running = true;
    static String userSelection;
//    static HashMap<>

    public static void main(String[] args) {
        String productFile = "src/main/resources/Products.csv";
        String homeScreen;
        String prompt;

        displayProduct(productFile);
        do {
            prompt = """
                    1. Display Product
                    2. Display Cart
                    3. Exit this application!""";
            System.out.println(prompt);
            userSelection = myScanner.nextLine();
            myScanner.nextLine();
            if (userSelection.equals("1")) {

            } else if (userSelection.equals("2")) {

            } else if (userSelection.equals("3")) {
                break;
            }

        } while (running);
    }

    public static void displayProduct(String filePath) {

        try (FileReader reader = new FileReader(filePath);
             BufferedReader buffReader = new BufferedReader(reader);
        ) {
            buffReader.readLine();
            String currentLine;
            while ((currentLine = buffReader.readLine()) != null) {
                String[] partProduct = currentLine.split("\\|");
                String storeSKU = partProduct[0];
                String storeProductName = partProduct[1];
                double storePrice = Double.parseDouble(partProduct[2]);
                String storeDepartment = partProduct[3];

                onlineShop.add(new onlineStore(storeSKU, storeProductName, storePrice, storeDepartment));
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found: " + ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        do  {
            System.out.println("""
                    1. search or filter the list of product
                    2. Add a product to the cart
                    3. Go back to the home page""");
            userSelection = myScanner.nextLine();
            myScanner.nextLine();
            // HashMap<>
            if (userSelection.equals("1")) {
                showProduct();
            }
        } while (running);

    }

    public static void showProduct() {
        for (onlineStore s : onlineShop) {
            s.displayProduct();
        }
    }
}
