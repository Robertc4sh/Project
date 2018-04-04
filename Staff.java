import java.util.ArrayList;
/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Weapon
{
    int SpAttack;
    int durability;
    public Staff(){
        super("Staff", 15);
        this.SpAttack = SpAttack;
        int chance = (int)(Math.random() * 10);
        if (chance <= 7){
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
