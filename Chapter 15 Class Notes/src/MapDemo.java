import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
         * The Map interface is a generic. The first type is the type
         *      of the key; the second, the type of the value.
         */
        Map<String, Color> favoriteColors = new HashMap<>();

        favoriteColors.put("Maaz", Color.GREEN);
        favoriteColors.put("Wyatt", Color.GREEN);
        favoriteColors.put("Kurt", Color.BLUE);

        // two different keys can have the same value
        favoriteColors.put("Alanna", Color.BLUE);
        favoriteColors.put("Samika", Color.PINK);

        // but the same key cannot have two different values
        // this code changes the value for the key "Samika"
        favoriteColors.put("Samika", Color.GREEN);

        // create a set of the keys in the map
        Set<String> keys = favoriteColors.keySet();
        for(String key : keys)
        {
            System.out.println(key + " (" + key.hashCode() + "): " +
                    favoriteColors.get(key));  
        }


    }
}
