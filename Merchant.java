import java.util.Scanner;
/**
 * Write a description of class Merchant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Merchant extends NPC
{

    public Merchant(){
        super("Merchant", 100);
    }

    public static void Trade(){
        int x = (int)(Math.random() * 4);
        Scanner choose = new Scanner(System.in);
        if(x == 0){
            System.out.println("Merchant: You want a weapon?");
            String answer = choose.nextLine();
            if (answer.equals("yes")){
                System.out.println("Here you go.");
                int y = (int)(Math.random() * 3);
                if(y == 0){
                    weapon = new Sword();
                }
                else if(y == 1){
                    weapon = new Spear();
                }
                else if(y == 2){
                    weapon = new Axe();
                }
                pack.storeItem(weapon);
                System.out.println("*Acquired " + weapon.getName() + "!*");
            }
            else{
                System.out.println("Your loss in case an enemy is nearby.");
            }
        }
        else if(x == 1){
            System.out.println("Merchant: Have you any food? Here, just in case.");
            int y = (int)(Math.random() * 3);
            if(y == 0){
                consumable = new Steak(3);
            }
            else if(y == 1){
                consumable = new Apple(5);
            }
            else if(y == 2){
                consumable = new GranolaBar(5);
            }
            pack.storeItem(consumable);
            System.out.println("*Acquired " + consumable.getName() + "!*");
        }
        else if(x == 2){
            System.out.println("Merchant: You look a little dehydrated. Here's a drink.");
            int y = (int)(Math.random() * 3);
            if(y == 0){
                consumable = new Wine(3);
            }
            else if(y == 1){
                consumable = new Water(5);
            }
            else if(y == 2){
                consumable = new Milk(5);
            }
            pack.storeItem(consumable);
            System.out.println("*Acquired " + consumable.getName() + "!*");
        }
        else if(x == 3){
            System.out.println("Merchant: Whatever I have, I'll try to sell it.");
        }
        System.out.println();
    }
}
