import java.util.Scanner;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main{
    public static void main(String[] args) {
        int health = 0;
        int counter = 5;
        boolean death = false;
        //Name input
        Scanner id = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = id.nextLine();
        //Characters
        Player a = new Player(name);
        Merchant merchant = new Merchant();
        Villager villager = new Villager();
        Enemy b = new Enemy(name, health);

        //Story
        System.out.println("\n\n" + a.getName() + " wakes up from an amazing slumber and wants to go on a large adventure. ");
        for (int i = 0; i < counter; i++){
            Scanner choice = new Scanner(System.in);
            System.out.println("\nWhat do you wish to do?");
            System.out.println("1: Go to Merchant       2: Go to Villager");
            System.out.println("3: Battle               4: View Backpack");

            String pick = choice.nextLine();
            if (pick.equals("1")){
                merchant.Trade();
            }
            else if (pick.equals("2")){
                villager.Speak();
            }
            else if (pick.equals("3")){
                int chance = (int)(Math.random() * 4);
                if (chance == 0){
                    b = new Wizard();
                    b.eWeapon = new Staff();
                }
                else if (chance == 1){
                    b = new Skeleton();
                    int y = (int)(Math.random() * 2);
                    if (y == 0){
                        b.eWeapon = new Sword();
                    }
                    else{
                        b.eWeapon = new Spear();
                    }
                }
                else if (chance == 2){
                    b = new Zombie();
                    int y = (int)(Math.random() * 2);
                    if (y == 0){
                        b.eWeapon = new Sword();
                    }
                    else{
                        b.eWeapon = new Axe();
                    }
                }
                else if (chance == 3){
                    b = new Bandit();
                    b.eWeapon = new Sledgehammer();
                }

                Scanner choose = new Scanner(System.in);
                System.out.println("Do you want to battle an enemy?");
                String answer = choose.nextLine();
                if (answer.equals("yes")){

                    int damage;
                    System.out.println("BATTLE START: " + a.getName() + " has " + a.getHealth() + " HP, " + b.getName() + " has " + b.getHealth() + " HP");
                    System.out.println(b.getName() + " has a " + b.eWeapon.getName());
                    a.weapon = new Fists();
                    System.out.println(a.getName() + " has a " + a.weapon.getName());
                    while(true) {
                        Scanner fight = new Scanner(System.in);
                        System.out.println("\nWhat do you want to do?");
                        System.out.println("1: Attack       2: Heal");
                        System.out.println("3: Run");
                        String click = fight.nextLine();
                        if(click.equals("1")){
                            damage = a.getDamage();
                            b.takeDamage(damage);
                            System.out.println(a.getName() + " hit " + b.getName() + " for " + a.getDamage() + " damage, ");
                            System.out.println(a.getName() + " has " + a.getHealth() + " HP, " + b.getName() + " has " + b.getHealth() + " HP");
                            if(b.health <= 0) {
                                System.out.println(a.getName() + " killed " + b.getName() + " with " + a.getHealth() + " HP Left.");
                                break;
                            }
                        }
                        else if (click.equals("2")){
                            
                            System.out.println("You cannot heal.");
                        }
                        else if (click.equals("3")){
                            System.out.println("Got away safely.");
                            break;
                        }
                        damage = b.getEDamage();
                        a.takeDamage(damage);
                        System.out.println(b.getName() + " hit " + a.getName() + " for " + b.getEDamage() + " damage, ");
                        System.out.println(a.getName() + " has " + a.getHealth() + " HP, " + b.getName() + " has " + b.getHealth() + " HP");
                        if(a.health <= 0) {
                            System.out.println(b.getName() + " killed " + a.getName() + " with " + b.getHealth() + " HP Left.");
                            i = counter;
                            death = true;
                            break;
                        }
                    }
                }
                else if (answer.equals("no")){
                    System.out.println("\nOkay. The adventure goes on.");
                }
            }
            else if (pick.equals("4")){
                a.seeBackpack();
                i-=1;
            }

        }
        if (death){
            System.out.print("\n\n" + a.getName() + " has died! Their journey ends here.");
        }
        else{
            System.out.print(a.getName() + " continues their journey off into the vast horizon. But that is all for now. Thanks for playing!");
        }
    }

}