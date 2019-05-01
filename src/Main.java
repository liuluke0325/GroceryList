import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static GroceryList groceryList = new GroceryList();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){


        boolean flag = true;


        do {

            printMenu();
            int select = scanner.nextInt();
            scanner.nextLine();




            switch (select){

                case 1:
                    System.out.println("Please enter the item name");
                    groceryList.addGroceryItem(scanner.nextLine());
                    break;
                case 2:
                    groceryList.printGroceryItem();
                    break;
                case 3:
                    System.out.println("Please enter the number you want to delete");
                 int option1 = scanner.nextInt();
                    scanner.nextLine();
                    groceryList.deleteGroceryItem(option1-1);
                break;
                case 4:
                    System.out.println("Please enter the index you want to change");
                    int option  = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter the new name of that item");
                    String newname = scanner.nextLine();
                    groceryList.modifiedGroceryItem(option-1,newname);
                    break;
                case 5:
                    System.out.println("Copy the array...");
                    break;
                case 0 :
                    flag = false;
                    System.out.println("Closing.....");
                    break;

                default:
                    System.out.println("Please Enter the correct number");
            }

            System.out.println("------------------------------------");

        }while(flag);





    }


    public static void printMenu(){

        System.out.println("1. Add Item");
        System.out.println("2. Display Item");
        System.out.println("3. Delete Item");
        System.out.println("4. Modified Item");
        System.out.println("0. Exit the application");
        System.out.println("\t Please enter the number: ");

    }


    public static void cpyArray(){

        ArrayList<String> newArray= new ArrayList<String>(groceryList.getGrocerylist());
        String [] nextArray = new String[groceryList.getGrocerylist().size()];
        nextArray = groceryList.getGrocerylist().toArray(nextArray);


    }


}
