import java.util.HashMap;
import java.util.Map;

public class MainHashMapPersona {
    public static void main(String[] args) {
        Map<String,Integer> persona = new HashMap<>();

        persona.put("Ismael",27);
        persona.put("Judith",33);
        persona.put("Amara",8);

        // Acceso por clave
        System.out.println("Edad de Ismael: " + persona.get("Ismael"));

        System.out.println("MUESTRO LA COLECCIÓN");
        // Recorrer el mapa mostrando claves y valores
        for (String nombre : persona.keySet()) {
            System.out.println(nombre + ": " + persona.get(nombre));
        }

        System.out.println("--------------BORRADO----------------");
        // Eliminar un par clave-valor
        persona.remove("Judith");

        System.out.println("MUESTRO LA COLECCIÓN DESPUÉS DEL BORRADO");
        // Recorrer el mapa mostrando claves y valores
        for (String nombre : persona.keySet()) {
            System.out.println(nombre + ": " + persona.get(nombre));
        }
    }
}
