import java.util.HashMap;
import java.util.Map;

public class MainHashMapPersona {
    public static void main(String[] args) {
        Map<String,Integer> persona = new HashMap<>();

        persona.put("Ismael",27);
        persona.put("Judith",33);
        persona.put("Amara",8);

        System.out.println(persona.get("Ismael"));
    }
}
