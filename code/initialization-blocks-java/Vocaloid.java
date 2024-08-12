public class Vocaloid {
    private String id;
    private String name;
    private int countSongs;

    public Vocaloid(String id) {
        this.id = id;
        this.name = Database.getName(id);
        this.countSongs = Database.countSongNames(id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public int countSongs() {
        return this.countSongs;
    }

    public String getSongName(int number) {
        if (number >= 0 && number < this.countSongs) {
            return Database.getSongName(id, number);
        } else {
            throw new IndexOutOfBoundsException("Invalid song number: " + number);
        }
    }

    public String getLyrics() {
        return "la la la, oh la la";
    }
}
