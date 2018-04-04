import java.util.ArrayList;
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehicle extends Item
{
    int seats;
    double speed;

    public Vehicle(String name, int seats, double speed){
        super(name);
        this.seats = seats;
        this.speed = speed;
    }
    public void moveForward(){
        System.out.print("You move forward.");
    }
    
}
