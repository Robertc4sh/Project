import java.util.ArrayList;
/**
 * Write a description of class Spear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spear extends Weapon
{
    int durability;
    public Spear(){
        super("Spear", 5);
        durability = 15;
        int chance = (int)(Math.random() * 10);
        if (chance <= 3){
            parry = true;
        }
        else{
            parry = false;
        }
    }
}
