package hackerrank.algorithms.implementation;

import hackerrank.HackerRankTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by carlosmcv on 26/02/17.
 */
public class TheBombermanGameTest extends HackerRankTest {

    @Test
    public void testTheBombermanGameSample() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/implementation/TheBombermanGame_testSample_input.txt",
                "hackerrank/algorithms/implementation/TheBombermanGame_testSample_output.txt"
        );

        //execute
        TheBombermanGame.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

    @Test
    public void testTheBombermanGame1() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/implementation/TheBombermanGame_test_1_input.txt",
                "hackerrank/algorithms/implementation/TheBombermanGame_test_1_output.txt"
        );

        //execute
        TheBombermanGame.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

    @Test
    public void testTheBombermanGame5() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/implementation/TheBombermanGame_test_5_input.txt",
                "hackerrank/algorithms/implementation/TheBombermanGame_test_5_output.txt"
        );

        //execute
        TheBombermanGame.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

    @Test
    public void testTheBombermanGame13() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/implementation/TheBombermanGame_test_13_input.txt",
                "hackerrank/algorithms/implementation/TheBombermanGame_test_13_output.txt"
        );

        //execute
        TheBombermanGame.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

}