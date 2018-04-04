import java.util.ArrayList;
/**
 * Write a description of class Axe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Axe extends Weapon
{
    int durability;
    public Axe(){
        super("Axe", 7);
        durability = 20;
        int chance = (int)(Math.random() * 10);
        if (chance <= 5){
            parry = true;
        }
        else{
            parry = false;
        }
    }
}
