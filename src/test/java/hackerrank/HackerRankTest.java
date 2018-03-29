package hackerrank;

import org.junit.After;
import org.junit.Before;

import java.io.*;

/**
 * Created by carlosmcv on 27/02/17.
 */
public class HackerRankTest {

    public final InputStream originalIn = System.in;
    public final PrintStream originalOut = System.out;

    private InputStream inputIn;
    private InputStream expectedOutputIn;
    private ByteArrayOutputStream baos;

    ClassLoader classLoader = getClass().getClassLoader();

    @Before
    public void setUp() {
        //set output
        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
    }

    @After
    public void tearDown() {
        //reset input
        System.setIn(originalIn);
        //reset output
        System.out.flush();
        System.setOut(originalOut);
    }

    protected void setInputAndExpectedOutputFiles(String inputResource, String expectedOutputResource) {
        setInputFile(inputResource);
        setExpectedOutputFiles(expectedOutputResource);
    }

    protected void setInputFile(String inputResource) {
        inputIn = classLoader.getResourceAsStream(inputResource);
        System.setIn(inputIn);
    }

    protected void setExpectedOutputFiles(String expectedOutputResource) {
        expectedOutputIn = classLoader.getResourceAsStream(expectedOutputResource);
    }

    protected String getExpectedOutputString() throws IOException {
        return getStringFromInputStream(expectedOutputIn);
    }

    protected String getProgramOutputString() {
        return baos.toString().trim();
    }

    private static String getStringFromInputStream(InputStream is) throws IOException {

        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.substring(0,sb.length()-1).toString();
    }
}
