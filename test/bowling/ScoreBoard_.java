package bowling;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class ScoreBoard_ {

    @Test
    public void when_no_rolls_should_return_no_frames() throws Exception {
        Match match = new Match("Player 1");
        ScoreBoard board = new ScoreBoard(match);

        assertThat(board.getFrames().length, is(0));
    }

    @Test
    public void when_one_roll_should_return_one_frame() throws Exception {
        Match match = new Match("Player 1");
        match.addRoll("Player 1", 5);
        ScoreBoard board = new ScoreBoard(match);

        assertThat(board.getFrames().length, is(1));
        assertThat(board.getFrames()[0].getScore(), is(nullValue()));
    }

}
