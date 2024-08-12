public class App {

    public static void main(String[] args) {
        System.out.println("\nVocaloid Software\n");
        Vocaloid miku = new Vocaloid(args[0]);

        Voice voice = new Voice(miku);

        System.out.println("Vocaloid Name: " + miku.getName());
        System.out.println("Count Songs: " + miku.countSongs());

        int idSong = 2;

        System.out.println("\nSelect Song ID: " + idSong);
        System.out.println("Song Name: " + miku.getSongName(idSong));

        voice.playSong(idSong);
    }
}
