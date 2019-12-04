import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        HashMap<String, String> hashMap = new HashMap<>();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        HashSet<String> hashSet = new HashSet<>();
        System.out.println(hashMap.put("1", "1"));
        System.out.println(hashMap.put("1", "1"));
        System.out.println(hashMap.put("2", "2"));
    }
}
