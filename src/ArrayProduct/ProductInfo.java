package ArrayProduct;


import java.util.Arrays;
import java.util.Scanner;

public class ProductInfo {
    public String [] name; double [] price; int idx;

    public  void setData() {
        name = new String[5];   price = new double[5];
        name[0] = "Coke";       price[0] = 10.75;
        name[1] = "Fanta";       price[1] = 10.50;
        name[2] = "MaMa";       price[2] = 5.25;
        name[3] = "Pepsi";       price[3] = 10.25;
        name[4] = "Sprite";       price[4] = 11.25;
    }

    public void showData(){
        System.out.printf("%-10s %10s\n","name","price");
        System.out.printf("====================\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s %10.2f\n",name[i], price[i]);
        }
        System.out.println("====================\n");
    }
    public void  getData() {
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Enter Product name: ");
            String pd = scan.nextLine();
            idx = Arrays.binarySearch(name, pd);
            if(idx < 0)
                System.out.println("product not found");
        }while (idx < 0);
        System.out.println("Enter product units: ");
        int u = scan.nextInt();
        System.out.println("======================\n");
        System.out.println("You order is " + name[idx] + " " + u + " units = " + u
                + " * " + price[idx] + " = " + u*price[idx] + " บาท");
        System.out.println("======================\n");
    }
}
