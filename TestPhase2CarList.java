public class TestPhase2CarList {
  

  public static void main(String[] args) {
    
    // Creating some new Car and CarType objects
   CarType t1 = new CarType("Toyota", "Corolla", 2010, "blue");
   CarType t2 = new CarType("Toyota", "Rav4", 2018, "red");
   CarType t3 = new CarType("Ford", "Explorer", 2012, "white");
   CarType t4 = new CarType("Honda", "CRV", 2021, "blue");
   
   Car c1 = new Car(t1);
   Car c2 = new Car(t2);
   Car c3 = new Car(t1);
   Car c4 = new Car(t3);
   
   // Creating an initial empty list
   CarList dealership = new CarList();
  
   // populating the list with data
   dealership.insert(c1);
   dealership.insert(c2);
   dealership.insert(c3);
   dealership.insert(c4);
   dealership.rentType(t2);
   
   System.out.println(dealership);
   
   //Trying out the getNumAvaible method
   System.out.println("The number of available cars: " + dealership.getNumAvailable());
   
   //Creating and populating a second list.
   CarList d2 = new CarList();
   d2.insert(c1);
   d2.insert(c2);
   d2.insert(c3);
   d2.insert(c4);
   
   System.out.println("\nd2 is: ");
   System.out.println(d2);
   
   //Trying out the equals method
   System.out.println("\nAre dealership and d2 equal(Should be true)? " + dealership.equals(d2));
   d2.remove(c4.getID());
   System.out.println("After removing an item. Are dealership and d2 equal now (Should be false)? " + dealership.equals(d2));
   
   
   //Trying out the getAvailable method
   //CarList d3 = dealership.getAvailable(t1);
   System.out.println("\nCalling getAvailable with type: " + t1);
   //System.out.println(d3);
   
   System.out.println("Checking that the original list remained unchanged is: ");
   System.out.println(dealership);
   
   System.out.println("\nCalling getAvailable with type: " + t2);
   //CarList d4 = dealership.getAvailable(t2);
   System.out.println("d4 is: ");
   //System.out.println(d4);
  }
  
}

