public class TestPhase1CarList {
  
  
  public static void main(String[] args) {
    
    // Creating some CarType objects and Car object for use in the CarList 
    CarType t1 = new CarType("Toyota", "Corolla", 2010, "blue");
    CarType t2 = new CarType("Toyota", "Rav4", 2018, "red");
    CarType t3 = new CarType("Ford", "Explorer", 2012, "white");
    CarType t4 = new CarType("Honda", "CRV", 2021, "blue");
    
    Car c1 = new Car(t1);
    Car c2 = new Car(t2);
    Car c3 = new Car(t1);
    Car c4 = new Car(t3);
    
    // Instantiate a CarList object
    CarList dealership = new CarList();
    System.out.println("Created an empty CarList");
    System.out.println(dealership);
    System.out.println("Size: " + dealership.size());
    
    //Insert one Car
    dealership.insert(c1);
    System.out.println("\nAfter inserting c1");
    System.out.println(dealership);
    System.out.println("Size: " + dealership.size());
    
    //Insert three more Cars
    dealership.insert(c3);
    dealership.insert(c4);
    dealership.insert(c2);
    
    System.out.println("\nAfter inserting c3, c4 and c2 ");
    System.out.println(dealership);
    System.out.println("Size: " + dealership.size());
    
    // Trying out the get method
    System.out.println("\nTrying out the get method");
    System.out.println("Car at position 0: " + dealership.get(0));
    System.out.println("Car at position 3: " + dealership.get(3));
    System.out.println("Car at position 6: " + dealership.get(6));
    
    //Trying out the rentType method
    System.out.println("\nRenting a t2 car");
    System.out.println("Returned id: " + dealership.rentType(t2));
    System.out.println("Renting a t4 that isn't isn't in the list");
    System.out.println("Should return NOT_FOUND: " + (dealership.rentType(t2) == CarList.NOT_FOUND));
    System.out.println("Trying to rent another t2 car");
    System.out.println("Should return NOT_FOUND: " + (dealership.rentType(t2) == CarList.NOT_FOUND));
    System.out.println(dealership);
    
    //Trying out the returnCar method
    System.out.println("\nReturning the rented car");
    dealership.returnCar(c2.getID());
    System.out.println("Returning a car that doesn't exist. Should return false: " + dealership.returnCar(1404));
    System.out.println(dealership);
    
    //Trying out the getRented method 
    System.out.println("\nRenting two cars: a t1 and t2");
    dealership.rentType(t2);
    dealership.rentType(t1);
    System.out.println("Getting the list of rented cars");
    CarList rentedCars = dealership.getRented();
    System.out.println(rentedCars);
    
    //Trying out the remove method
    System.out.println("\n Removing some cars");
    dealership.remove(c2.getID());
    System.out.println("c2 removed. Size is now: " + dealership.size());
    System.out.println(dealership);
    
    
    dealership.remove(c1.getID());
    System.out.println("c1 removed. Size is now: " + dealership.size());
    System.out.println(dealership);
    
    dealership.remove(14);
    
    System.out.println("Tried to removed an ID not in the list. Size is now: " + dealership.size());
    System.out.println(dealership);
    
    System.out.println("\nAdding c1 and c2 back");
    dealership.insert(c1);
    dealership.insert(c2);
    System.out.println(dealership);
    
    
    //Trying out remove(Type)
    System.out.println("\nRemoving cars of this type: " + t1);
    System.out.println("Number of cars removed: " + dealership.remove(t1) + ". Size of list is: " + dealership.size());
    System.out.println(dealership);
    
  }
  
}

