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
    public void testTheHuffmanDecoderX() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/n26test/thehuffmandecoder_X_in.txt",
                "hackerrank/n26test/thehuffmandecoder_X_out.txt"
        );

        //execute
        TheHuffmanDecoder.main(new String[]{});

        //verify
        assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

    @Test
    public void testTheHuffmanDecoderY() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/n26test/thehuffmandecoder_Y_in.txt",
                "hackerrank/n26test/thehuffmandecoder_Y_out.txt"
        );

        //execute
        TheHuffmanDecoder.main(new String[]{});

        //verify
        assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

    @Test
    public void testTheHuffmanDecoderZ() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/n26test/thehuffmandecoder_Z_in.txt",
                "hackerrank/n26test/thehuffmandecoder_Z_out.txt"
        );

        //execute
        TheHuffmanDecoder.main(new String[]{});

        //verify
        assertEquals(getExpectedOutputString(), getProgramOutputString());
    }
}
