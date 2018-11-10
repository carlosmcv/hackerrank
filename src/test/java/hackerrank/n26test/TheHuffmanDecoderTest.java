package hackerrank.n26test;

import hackerrank.HackerRankTest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TheHuffmanDecoderTest extends HackerRankTest {


    @Test
    public void testTheHuffmanDecoder0() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/n26test/thehuffmandecoder_0_in.txt",
                "hackerrank/n26test/thehuffmandecoder_0_out.txt"
        );

        //execute
        TheHuffmanDecoder.main(new String[]{});

        //verify
        assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

    @Test
    public void testTheHuffmanDecoder1() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/n26test/thehuffmandecoder_1_in.txt",
                "hackerrank/n26test/thehuffmandecoder_1_out.txt"
        );

        //execute
        TheHuffmanDecoder.main(new String[]{});

        //verify
        assertEquals(getExpectedOutputString(), getProgramOutputString());
    }


    @Test
    public void testSplit() {

        String s = "a\t001";

        String[] ss = s.split("\t");

        assertEquals("a", ss[0]);
        assertEquals("001", ss[1]);

    }
}
