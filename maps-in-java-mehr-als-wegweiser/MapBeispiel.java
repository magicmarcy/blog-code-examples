import java.util.HashMap;
import java.util.Map;

public class MapBeispiel {
    public static void main(String[] args) {
        // Eine neue Map erstellen
        Map<String, String> telefonbuch = new HashMap<>();

        // Einträge hinzufuegen
        telefonbuch.put("Anna", "0151-1234567");
        telefonbuch.put("Bernd", "0170-9876543");
        telefonbuch.put("Clara", "0160-5551234");

        // Zugriff auf einen bestimmten Eintrag
        String nummerAnna = telefonbuch.get("Anna");
        System.out.println("Annas Nummer: " + nummerAnna);

        // Alle Eintraege durchlaufen
        System.out.println("Alle Einträge im Telefonbuch:");
        for (Map.Entry<String, String> eintrag : telefonbuch.entrySet()) {
            System.out.println(eintrag.getKey() + " → " + eintrag.getValue());
        }

        // Existenz eines Schluessels pruefen
        if (telefonbuch.containsKey("Bernd")) {
            System.out.println("Bernd ist im Telefonbuch.");
        }

        // Eintrag entfernen
        telefonbuch.remove("Clara");

        // Anzahl der Eintraege
        System.out.println("Anzahl der Kontakte: " + telefonbuch.size());
    }
}