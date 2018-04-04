import java.util.ArrayList;
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Armor extends Item implements DefenseCommands
{
    boolean blocked;
    public Armor(String name){
        super(name);
    }
    public boolean blocked(){
        return blocked;
    }
}
