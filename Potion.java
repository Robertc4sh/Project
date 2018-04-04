
/**
 * Write a description of class Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potion extends Misc
{
    public Potion(String name, int quantity){
        super(name, 5, quantity);
    }
    public int effect(){
        return effect;
    }
}
