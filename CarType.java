/* Represents a Car Model
* Each CarModel consists of 4 basic values: The Make, Model, Year, and Colour (Phases 1-3)
**/
public class CarType {

  // Instance Variables
  private String make;
  private String model;
  private int year;
  private String colour;

  // The constructor initializes the basic instance variables (Phase 1-3) and the
  // Partially Filled Array (Phase 4)
  public CarType(String make, String model, int year, String colour) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.colour = colour;

  }

  

  // returns a String representation of the object's basic instance variables,
  // seperated by commas
  public String toString() {
    return make + ", " + model + ", " + year + ", " + colour;
  }

  // Two CarModels are equal if they have the same Make, Model, Year, and Colour
  public boolean equals(CarType otherCar) {
    return this.make.equals(otherCar.make) && this.model.equals(otherCar.model) && this.year == otherCar.year
        && this.colour.equals(otherCar.colour);
  }
}
