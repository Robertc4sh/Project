
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player extends Character
{
    public Player(String name){
        super(name, 100);
    }

    public void gainHealth(){
        health += consumable.regen;
        consumable.quantity -= 1;
        System.out.println(consumable.quantity);
        getHealth();
        if (consumable.quantity == 0){
            pack.useItem(consumable);
        }
    }

    public void seeBackpack(){
        System.out.println("Amount of items in backpack: " + pack.countItems());
        System.out.println("Things in backpack: " + pack.getInventory());
    }
}
