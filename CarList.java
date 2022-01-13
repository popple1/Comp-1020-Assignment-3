/*
 *COMP 1020		SECTION A03
 *INSTRUCTOR:	Dr. Andrea Bunt
 *NAME:			Raj Rathod
 *ASSIGNMENT:	Assignment 4
 *QUESTION:		Phase 3
 *PURPOSE:		This program will create a linked list
 */
public class CarList {
    private CarNode top;
    public static final int NOT_FOUND = -1;
    private static int count = 0;
    //constructor
    public CarList() {
        top = null;
    }


    //this function will insert the
    public void insert(Car newCar) {
        CarNode newNode = new CarNode(newCar, top);
        top =  newNode;
    }


    //this method will return the size of the linked list
    public int size() {
        CarNode current = top;          //node is set to the top
        int count = 0;
        while (current != null) {
            count++;                        //value increases as the new node is counted
            current = current.getLink();
        }
        return count;
    }

    //this method returns the node at the certain position
    public Car get(int pos) {
        CarNode current = top;
        while (pos > 0) {               //loops until the position is greater than zero
            if (current == null)
                return null;
            current = current.getLink();
            pos--;
        }
        return (Car) current.getData();
    }

    //this method is a toString method
    public String toString() {
        String answer = "Cars in the list: \n";
        CarNode current = top;
        if (current == null) {                      //checks if the current is null or not
            answer = "There are no cars in the list";
        }
        while (current != null) {                       //checks if the current is not null
            answer += (Car) current.getData() +"\n";
            current = current.getLink();
        }

        return answer;
    }


    //this method ensures that the car is rented by checking the given object type
    public int rentType(CarType obj) {
        CarNode current = top;          //ensures the current node is at the top
        int id = 0;
        while (current != null) {
            if (obj.equals(current.getData().getType()) && current.getData().isAvailable()) {           //this will check the condition
                id = current.getData().getID();
                current.getData().rentCar();
                break;
            }
            current = current.getLink();
        }
        if(id == 0)
        {
            id = NOT_FOUND;             //id is set to NOT_FOUND condition when id is not set properly
        }
        return id;
    }


    //this method will return the car which means it will be available
    public boolean returnCar(int id) {
        boolean truthValue = false;
        CarNode current = top;
        while (current != null) {
            if (current.getData().getID() == id) {              //this will check the id
                current.getData().returnCar();
                truthValue = true;
            }
            current =current.getLink();
        }
        return truthValue;
    }


    //this method will return the whole list of car which is rented
    public CarList getRented() {
        String answer = " ";
        CarNode current = top;
        CarList newList = new CarList();
        while (current != null) {
            if (!current.getData().isAvailable())                           //checks if the car is available or not
                newList.insert(current.getData());
            current = current.getLink();
        }
        return newList;
    }


    //thhis method will remove the car from the list which has that specific id
    public boolean remove(int id) {
        CarNode prev = null;
        CarNode current = top;
        boolean elementRemoved = false;

        while (current != null && current.getData().getID() == id) {
            prev = current;
            current = current.getLink();
            elementRemoved = true;
        }

        if (current != null) {

            if (prev == null)
                top = top.getLink();

            else
                prev.setLink(current.getLink());
        }
        return elementRemoved;
    }

    //this method will remove the care with that specific CarType
    public int remove(CarType carObj) {
        int count = 0;
        CarNode prev = null;
        CarNode current = top;

        while (current != null && current.getData().equals(carObj)) {
            prev = current;
            current = current.getLink();
            count++;
        }

        if (current != null) {

            if (prev == null)
                top = top.getLink();

            else
                prev.setLink(current.getLink());

        }
        return count;
    }

    //this method will tranverse through the list and find the number of car that is available
    public int getNumAvailable()
    {
        CarNode current = top;
        return traverse(current);

    }

    //this method is a helper method
    static int traverse(CarNode head)
    {
        if (head == null)
            return count;
        // If head is not null, print current node
        if(head.getData().isAvailable())
        {
            count++;
        }
        traverse(head.getLink());
        return count;
    }

    //public boolean equals(CarList listObj)
    {


    }

    //public CarList getAvailable(CarType carTypeObj)
    {

    }
}
