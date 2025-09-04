
//Omer Tariq
//DSA Project 1
//Main class Java

// I created the main class to have a product management system



import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        //i created a scanner that is ready to read user input
        Scanner scanner = new Scanner (System.in);
        SinglyLinkedList<Product> productList = new SinglyLinkedList<> ();

        int choice; //created a varaible to store what the users menu choice is

        do{

            //i now used print statement to display the menu for the user

            System.out.println("Operations on List");

            System.out.println("1. Make Empty");
            System.out.println("2. Find ID");
            System.out.println("3. Insert At Front");

            System.out.println("4. Delete From Front");
            System.out.println("5. Delete ID");

            System.out.println("6. Print All Records");

            System.out.println("7. Done");
            System.out.print("Your choice: ");

            //we have to read what the users choice is
            choice = scanner.nextInt();

            //i decided to use a switch statement as the user picks thier options

            switch (choice) {

                case 1:

                    productList.makeEmpty(); //to clear the list
                    System.out.println("List is now empty. ");
                    break;

                case 2:

                    System.out.println("Enter Product ID to find: ");
                    int findID = scanner.nextInt(); //find the id you are scanning for
                    Product foundProduct = productList.findID(findID); //find the product


                    if (foundProduct !=null ) {

                        foundProduct.printID();

                    } else{

                        System.out.println( "Product  with ID " +findID + "not found");

                    } break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    int productID = scanner.nextInt();

                    //we have to clear the character
                    scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String productName = scanner.nextLine();

                    System.out.print("Enter Supplier name: ");
                    String supplierName = scanner.nextLine(); //we have to read the supplier name

                    //implement new product
                    Product newProduct = new Product(productID, productName, supplierName); //i will use this in my program to create a new product

                    if(productList.insertAtFront(newProduct))  {

                        //if when you add the product and is sucesful
                        System.out.println("Product Added.");


                    }   else {

                        System.out.println("Product with ID " + productID + " already exists.");

                    } break;

                case 4:

                    //i created this to delete products from the front of the list

                    Product deletedProduct = productList.deleteFromFront();

                    //if sucessful delete the it and print the data

                    if (deletedProduct != null){
                        System.out.println("Deleted Product: ");

                        deletedProduct.printID();


                    } else {
                       //f the list is empty tell the user
                      System.out.println("List is Empty.");
                    }
                    break;

                case 5:

                    System.out.print("Enter the Product ID to delete: ");

                    //i make the program read the id that needs to be deleted
                    int deleteID = scanner.nextInt();

                    //try to delete the pdoduct
                    Product deletedProductById = productList.delete(deleteID);

              if (deletedProductById != null) {

                  System.out.println("Deleted Product:");

                  deletedProductById.printID();

              } else {

                  //if it is not found then tell the user
                  System.out.println("Product with ID " + deleteID + " not found.");
              }
break;


                case 6:


                    // I will now print all products in the list.
                    productList.printAllRecords();



                    break;


                case 7:

                    //if the user chooses this option, i opt them out of the program
                    System.out.println("Done.");

        break;
                default:

                    //if user plugs in any unknown value, i put it as an invalid choice

                    System.out.println("Invalid choice. Please try again.");
            }


            //i created a loop  until the user chooses to exit

        } while (choice != 7);


        scanner.close();
    }
}







