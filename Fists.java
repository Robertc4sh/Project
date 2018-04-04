import java.lang.Math;
import java.util.ArrayList;
/**
 * Write a description of class Fists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fists extends Weapon
{
    int SpAttack;
    public Fists(){
        super("Fists", 2);
        this.SpAttack = SpAttack;
        int chance = (int)(Math.random() * 10);
        if (chance == 1){
            parry = true;
        }
        else{
            parry = false;
        }
    }
    public int SpecialAttack(){
        int chance = (int)(Math.random() * 4);
        if (chance == 1){
            SpAttack = attack*2;
        }
        else{
            System.out.print("Your special attack failed!");
            SpAttack = 2;
        }
        return SpAttack;
    }
}
