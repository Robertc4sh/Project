
/**
 * Write a description of class PotionOfWeakness here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PotionOfWeakness extends Potion
{
    public PotionOfWeakness(){
        super("Potion of Weakness", 3);
        int chance = (int)(Math.random() * 2);
        for (int i = effect; i > 0; i--){
            if (chance == 1){
            System.out.println("You have been Weakened.");
        }
        else{
            
        }
        }
    }
}
