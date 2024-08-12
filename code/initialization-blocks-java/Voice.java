public class Voice {
    private Vocaloid vocaloid;
    private DriverVoice driverVoice;

    {
        this.driverVoice = new DriverVoice();
        try {
            driverVoice.reportStatus();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playSong(int id) {
        driverVoice.sing(this.vocaloid.getLyrics());
    }

    public Voice(Vocaloid vocaloid) {
        this.vocaloid = vocaloid;
    }
}
