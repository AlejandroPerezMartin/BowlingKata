package bowling;

public class ScoreBoard {

    private final Match match;

    public ScoreBoard(Match match) {
        this.match = match;
    }

    public Frame[] getFrames() {
        return (match.rolls() > 0) ? new Frame[] {new Frame()} : new Frame[0];
    }

    public static class Frame {

        public Integer getScore() {
            return null;
        }
    }
}
