
/**
 * Write a description of class PotionOfBlindness here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PotionOfBlindness extends Potion
{
    public PotionOfBlindness(){
        super("Potion of Blindness", 3);
        int chance = (int)(Math.random() * 2);
        for (int i = effect; i > 0; i--){
            if (chance == 1){
            System.out.println("You have been Blinded. You cannot hit.");
        }
        else{
            
        }
        }
    }
}
