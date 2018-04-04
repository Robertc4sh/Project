import java.util.ArrayList;
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HorseDrawnCarriage extends Vehicle
{
    int wheels;
    int cylinders;
    boolean engineOn;
    int doors;

    /**
     * Constructor for objects of class Car
     */
    public HorseDrawnCarriage(String name, int seats, double speed, int wheels, int cylinders, int doors){
        super(name, seats, speed);
        engineOn = false;
        this.wheels = wheels;
        this.cylinders = cylinders;
        this.doors = doors;
    }
    public void turnOn(){
        if (engineOn){
            System.out.println("The engine is already on.");
        }
        else{
            System.out.println("You turn the key and the engine turns on.");
            engineOn = true;
        }
    }
    public void turnOff(){
        if (engineOn){
            System.out.println("The engine turns off. You can now remove the key.");
            engineOn = false;
        }
        else{
            System.out.println("The engine is already off.");
        }
    }
    public void honk(){
        System.out.println("honk");
    }
}
