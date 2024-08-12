import java.util.Map;
import java.util.HashMap;

public class Database {
    private static final Map<String, String> vocaloids;
    private static final Map<String, String[]> songNames;

    static {
        vocaloids = new HashMap<>();
        vocaloids.put("01", "Hatsune Miku");
        vocaloids.put("02", "Kagamine Rin");
        vocaloids.put("03", "Megurine Luka");

        songNames = new HashMap<>();
        songNames.put("01", new String[] { "World is Mine", "Rolling Girl", "Tell Your World" });
        songNames.put("02", new String[] { "Meltdown", "Tokyo Teddy Bear", "Kokoro" });
        songNames.put("03", new String[] { "Just Be Friends", "Luka Luka★Night Fever", "Magnet" });
    }

    public static String getSongName(String id, int number) {
        return songNames.get(id)[number];
    }

    public static String getName(String id) {
        return vocaloids.get(id);
    }

    public static int countSongNames(String id) {
        return songNames.get(id).length;
    }

    public static int countVocaloids() {
        return vocaloids.size();
    }
}
