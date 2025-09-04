//This class respents a product, and implements IdedObject, has to provide getID() and printID()
//I made this class to store product details like ID , name and the supplier
// class for products to be entered, along with product id, name, supplier id

public class Product implements IDedObject {

    //create all private varaibles for names, id, and supplier

    private int productID; //Unique ID for the product. each product has one
    private String productName; //Name of the product
    private String supplierName; //Name of the supplier. Using it to track where the product is coming from

    public Product(int productID, String productName, String supplierName) {

        this.productID = productID;

        this.productName = productName; //setting the product name
        this.supplierName = supplierName; //set supplier name


    }

// I create this method to return the product ID. its required by IdedObject

    @Override

    public int getID() {
        return productID; //returning product ID . super easy

    }
    //I am creating this method to print the details of the product. May update later if needed with more details

    @Override

    public void printID() {

        System.out.println("Product ID: " + productID); // Print the ID.
        System.out.println("Product Name: " + productName) ; // Print the name.
        System.out.println("Supplier Name: " + supplierName); // Print the supplier.


    }
    // if someone needs to access the product name. i added this in case

    public String getProductName() {

        return productName; //return same name
    }

    //I added this in case someone needs to update.
    public void setProductName(String productName) {

        this.productName = productName; //update name using this to avoid with the paramenter

    }
// again jus same thing i did above

    public void setSupplierName(String supplierName) {

        this.supplierName = supplierName; // Update the supplier name.

    }

}
