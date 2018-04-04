
/**
 * Write a description of class Sledgehammer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sledgehammer extends Weapon
{
    int SpAttack;
    public Sledgehammer(){
        super("Sledgehammer", 6);
        this.SpAttack = SpAttack;
        int chance = (int)(Math.random() * 10);
        if (chance <= 5){
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
