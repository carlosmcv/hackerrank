package hackerrank.algorithms.strings;

import hackerrank.HackerRankTest;
import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by carlosmcv on 27/02/17.
 */
public class SuperReducedStringTest extends HackerRankTest {

    @Test
    public void testSuperReducedString1() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/strings/super_reduced_string_in1.txt",
                "hackerrank/algorithms/strings/super_reduced_string_out1.txt"
        );

        //execute
        SuperReducedString.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }
}