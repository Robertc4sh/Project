import java.util.ArrayList;
/**
 * Write a description of class Helmet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Helmet extends Armor
{
    public Helmet(){
        super("Helmet");
        int chance = (int)(Math.random() * 4);
        if (chance == 1){
            blocked = true;
        }
        else{
            blocked = false;
        }
    }
}
