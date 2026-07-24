import java.util.Hashtable;
import java.util.Map;
public class HashCollision {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht =
                new Hashtable<>();
        ht.put(106, "Uttam");
        ht.put(117, "Mukesh");
        ht.put(128, "Abhiram");
        ht.put(96, "Manish");
        ht.put(99, "Shravani");
        ht.put(98, "Disha");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
