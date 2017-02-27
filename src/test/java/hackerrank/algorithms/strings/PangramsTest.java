package hackerrank.algorithms.strings;

import hackerrank.HackerRankTest;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by carlosmcv on 26/02/17.
 */
public class PangramsTest extends HackerRankTest {

    @Test
    public void testPangrams1() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/strings/pangrams_in1.txt",
                "hackerrank/algorithms/strings/pangrams_out1.txt"
        );

        //execute
        Pangrams.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }
}