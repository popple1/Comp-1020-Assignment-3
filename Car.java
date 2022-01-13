/* Represents a physical instance of a Car of a particular CarType
* Each Car consists of 4 basic values: The type, it's availability, and an id
* There is also a class variable nextID to track the id to be given to the next Car
* */
public class Car {
  //instance variable
  private CarType type;
  private boolean available;
  private int id;

  //class variable nextID tracks the id to be given to the next Car
  static private int nextID = 20210001;

  // The constructor initializes both instances variables uses the next available id
  public Car(CarType type) {
    this.type = type;

    // All new cars are set to available
    this.available = true;

    // Assign the nextID, it will get incremented after the assignment
    this.id = nextID++;
  }

  // accessor method
  public CarType getType() {
    return type;
  }

  // accessor method
  public int getID() {
    return id;
  }

  // accessor method
  public boolean isAvailable() {
    return available;
  }

  // Two Cars are equal if their ids match
  public boolean matches(int id) {
    return this.id == id;
  }

  // return a car, it is now available
  public void returnCar() {
    available = true;
  }

  // rent a car, it is no longer available
  public void rentCar() {
    available = false;
  }

  // returns a String representation of the object and it's availability
  public String toString() {
    return this.type.toString() + ", ID-" + id + ", " + (available ? "Available" : "Rented");
  }
}
