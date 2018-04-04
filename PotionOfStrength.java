
/**
 * Write a description of class PotionOfStrength here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PotionOfStrength extends Potion
{
    public PotionOfStrength(){
        super("Potion of Strength", 3);
        int chance = (int)(Math.random() * 2);
        for (int i = effect; i > 0; i--){
            if (chance == 1){
            System.out.println("You have been Strengthened.");
        }
        else{
            
        }
        }
    }
}
