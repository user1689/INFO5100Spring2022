package multitonPattern;
import java.util.HashMap;
import java.util.Map;

public class SecurityCamera {
    private static Map<Integer, SecurityCamera> cameras = new HashMap<>();
    private static Object obj = new Object();

    public SecurityCamera getSecurityCamera(int id) {
        if (!cameras.containsKey(id)) {
            synchronized(obj) {
                if (!cameras.containsKey(id)) {
                    cameras.put(id, new SecurityCamera());
                }
            }
        }
        return cameras.get(id);
    }

}
