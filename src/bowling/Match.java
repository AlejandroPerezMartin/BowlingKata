package bowling;

public class Match {

    private final String[] players;
    private int rolls = 0;

    public Match(String... players) {
        this.players = players;
    }

    public void addRoll(String s, int i) {
        rolls++;
    }

    public int rolls() {
        return 0;
    }
}
