import java.lang.Math;

public class Vehicle {
    private int location = (int)(Math.random()*40)-20;

    public Vehicle(){
        location = 0;
    }

    public Vehicle(int loc){
        if (loc >= -20 && loc <= 20){
            location = loc;
        }
        else{
            location = 0;
        }
    }

    public void forward(){
        if (location >= 20){
            System.out.println("Cannot move past 20.");
        }
        else{
            location++;
        }
    }

    public 
}
