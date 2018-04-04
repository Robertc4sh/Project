
/**
 * Write a description of class Misc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Misc extends Item
{
    int effect;
    int quantity;
    public Misc(String name, int effect, int quantity){
        super(name);
        this.effect = effect;
        this.quantity = quantity;
    }
}
