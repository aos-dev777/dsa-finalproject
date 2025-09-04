
// This is a generic linked list class, works w/ any type that implements IDedObject
//I made this so i can store and manage a list of products

     public class SinglyLinkedList <AnyType extends IDedObject> {

    //Inner class for node in the linked list. node will hold data to point to next node

    private static class Node<AnyType> {
        AnyType data; //data will be stored in this node. product

        Node<AnyType> next; //this is a pointer to the next node, will start as null

        //Constructor to create a node with data

        Node(AnyType data) {
            this.data = data; //i use this to set the data
            this.next = null; //initially set no next node
        }

    }

    private Node<AnyType> head; //set the first node in list. starts as null which is an empty list

    //I make a constructor to create a n empty linked list

    public SinglyLinkedList() {

        head = null;


    }
//This method empties the list by setting head to null. Everything else gets garbage collected.

    public void makeEmpty() {
        head = null; // Poof! The list is empty.
    }

    //I create this method to find an object in the list by using its ID

    public AnyType findID(int ID) {


        Node<AnyType> current = head;
            while (current != null) {

                if (current.data.getID() == ID) {

                    return current.data; //i will return the data only if the id matches

            }
            current = current.next; //move to the next node
        }
        return null; //if we didnt find it , return null
    }

    //now creating a method than inserts the object at the front of the list

    public boolean insertAtFront(AnyType x) {

        if (findID(x.getID()) != null) {
            return false;

        }

        Node<AnyType> newNode = new Node<>(x); // create a new node with the data

        newNode.next = head; // point the new node to the current head
        head = newNode; // update the head to be the new node

        return true; // return true to indicate successful insertion
    }
// now i will create a method that deleted an object from the front of the list

        public AnyType deleteFromFront() {

            if (head == null) { // if list is empty you have nothing to delete
                return null; //just return nul
            }
            AnyType data = head.data; //save the data from the first node
            head = head.next; //move the head to the next node
            return data; //that means we return data that we have saved



}

//now i will create a method that deleted an object by tis ID

public AnyType delete(int ID) {

        if (head==null){
            return null;
        }
        if (head.data.getID() == ID){
            return deleteFromFront();
        }
        Node <AnyType> current = head;
        while (current.next != null) {
            if ( current.next.data.getID() ==ID ) {

                AnyType data= current.next.data;
                current.next = current.next.next;
                return data;


            }

            current = current.next;
        }
return null;
    }
         // This method prints all the records in the list.

         public void printAllRecords() {

             if (head == null) { // If the list is empty...

                 System.out.println("The list is empty."); // Just say so.

                 return;
             }
             Node<AnyType> current = head; // Start at the head.

             while (current != null) { // Keep going until we reach the end of the list.
                 current.data.printID(); // Print the details of the current node.

                 System.out.println(); // Add a blank line between records.
                 current = current.next; // Move to the next node.
             }
         }
     }