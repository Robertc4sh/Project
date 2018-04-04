import java.util.ArrayList;
import java.lang.Math;
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Weapon extends Item implements WeaponInterface
{
    int attack;
    boolean parry;
    public Weapon(String name, int attack){
        super(name);
        this.attack = attack;
    }
    public int attack(){
        return attack;
    }
    public boolean parry(){
        return parry;
    }
}
