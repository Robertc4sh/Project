import java.lang.Math;
/**
 * Write a description of class Villager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Villager extends NPC
{
    public Villager(){
        super("Villager", 100);
    }
    public static void Speak(){
        int x = (int)(Math.random() * 6);
        if (x == 0){
            System.out.println("Villager: How are you? I'm great.");
        }
        else if(x == 1){
            System.out.println("Villager: How about the weather today?");
        }
        else if(x == 2){
            System.out.println("Villager: Have you seen my house? It's pretty rad.");
        }
        else if(x == 3){
            System.out.println("Elderly Villager: I like your body.");
        }
        else if(x == 4){
            System.out.println("Villager: Have you met the merchant yet? You should.");
        }
        else if(x == 5){
            System.out.println("Villager: Watch out. There are enemies nearby urging for battle.");
        }
        System.out.println();
    }
}
