import java.util.ArrayList;
/**
 * Write a description of class Boots here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boots extends Armor
{
        public Boots(){
        super("Boots");
        int chance = (int)(Math.random() * 4);
        if (chance == 1){
            blocked = true;
        }
        else{
            blocked = false;
        }
    }
}
