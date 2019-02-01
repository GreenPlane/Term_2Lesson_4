package ap2014.t2.lesson4;

/**
 Created by acorn on 1/16/15.
 
 Create a class called Vehicle that simulates a car moving along a 40 block stretch of road.

Your class will build a vehicle and keep track of its location on the road. Location values may range from -20 to 20. A location value of 0 represents block 0, a location value of 1 represents block 1, a location value of 2 represents block 2, etc. If the user tries to move the vehicle beyond block +20 or -20, set the location to +/- 20 respectively.

In previous exercises, we had a requirement that you name your class Main. In this exercise, you must name your class Vehicle.
 **/
public class Vehicle {
  private int location;

  public Vehicle() {
    this(0);
  }

  public Vehicle(int loc) {
    if (loc >= -20 && loc <= 20) {
      this.location = loc;
    } else {
      this.location = 0;
    }
  }

  public void forward() {
    if (location < 20) {
      ++location;
    }
  }

  public void backward() {
    if (location > -20) {
      --location;
    }
  }

  public int getLocation() {
    return location;
  }

  @Override
  public String toString() {
    String result = "";
    for (int i=-20; i<location; i++) {
      result += " ";
    }
    return result + "@";
  }
}
