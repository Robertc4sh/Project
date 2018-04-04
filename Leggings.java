import java.util.ArrayList;
/**
 * Write a description of class Leggings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Leggings extends Armor
{
    public Leggings(){
        super("Leggings");
        int chance = (int)(Math.random() * 2);
        if (chance == 1){
            blocked = true;
        }
        else{
            blocked = false;
        }
    }
}
