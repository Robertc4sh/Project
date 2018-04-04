
/**
 * Write a description of interface CharacterInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{
    String name;
    int health;
    static Weapon weapon;
    static Weapon eWeapon;
    static Consumable consumable;
    static Armor armor;
    static Backpack pack = new Backpack();
    static Misc potion;
    public Character(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return weapon.attack;
    }
    
    public int getEDamage(){
        return eWeapon.attack;
    }

    public void takeDamage(int damage) {
        health -= damage;
        getHealth();
    }
}
