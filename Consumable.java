import java.util.ArrayList;
/**
 * Write a description of class Consumable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Consumable extends Item
{
    int regen;
    int quantity;
    public Consumable(String name, int regen, int quantity){
        super(name);
        this.regen = regen;
        this.quantity = quantity;
    }
}
