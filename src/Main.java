import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Listing list = new Listing();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Etner your choice");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    list.printMyList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem() {
        System.out.println("Please enter item to add: ");
        list.addToMyList(scan.nextLine());
    }
    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int num = scan.nextInt();
        System.out.println("Enter replacement item: ");
        String newItem = scan.nextLine();
        list.modifyMyList((num-1), newItem);
    }
    public static void removeItem() {
        System.out.println("Choose postion of item to delete");
        list.removeFromMyList(scan.nextInt());
    }
    public static void searchForItem() {
        System.out.println("Type the name of searched Item :");
        String item = scan.nextLine();
        list.findItem(item);
    }
}
