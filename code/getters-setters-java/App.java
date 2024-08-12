public class App {
    public static void main(String... args) {
        Anime anime = new Anime("Sword Art Online", 12);
        anime.setWatchedEpisode(3);

    }

    static class Anime {
        private String name;
        private int episodes;
        private int watchedEpisode;

        public Anime(String name, int episodes) {
            this.name = name;
            this.episodes = episodes;
        }

        public String getName() {
            return name;
        }

        public int getWatchedEpisode() {
            return watchedEpisode;
        }

        public boolean setWatchedEpisode(int watchedEpisode) {
            boolean valid = watchedEpisode > 0 && watchedEpisode <= episodes;
            if (valid) {
                this.watchedEpisode = watchedEpisode;
            }

            return valid;
        }
    }
}
