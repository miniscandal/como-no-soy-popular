import java.util.HashMap;
import java.util.Map;

public enum TitanType {
    COLOSSAL_TITAN(1, "Colossal Titan"),
    ARMOR_TITAN(2, "Armor Titan"),
    BEAST_TITAN(3, "Beast Titan"),
    FEMALE_TITAN(4, "Female Titan"),
    JAW_TITAN(5, "Jaw Titan");

    private final int id;
    private final String name;

    private static final Map<Integer, TitanType> ID_TO_TITAN_MAP = new HashMap<>();

    static {
        for (TitanType titan : values()) {
            ID_TO_TITAN_MAP.put(titan.id, titan);
        }
    }

    TitanType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public static TitanType fromId(int id) {
        return ID_TO_TITAN_MAP.getOrDefault(id, JAW_TITAN);
    }
}
