
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
import java.lang.Math;
public class Item implements ItemInterface{
    //Implemented in your own way
    String name;
    private ArrayList stats;
    public Item(String name){
        this.name = name;
        stats = new ArrayList();
        stats.add(name);
    }
    public String getName(){
        return name;
    }
    public ArrayList getStats(){
        return stats;
    }
}
