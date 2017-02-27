package hackerrank;

import org.junit.After;
import org.junit.Before;

import java.io.*;

/**
 * Created by carlosmcv on 27/02/17.
 */
public class HackerRankTest {

    private final InputStream original = System.in;
    private final PrintStream old = System.out;

    private InputStream inputIn;
    private InputStream expectedOutputIn;
    private ByteArrayOutputStream baos;

    ClassLoader classLoader = getClass().getClassLoader();

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
        System.setIn(original);

        System.out.flush();
        System.setOut(old);
    }

    protected void setInputAndExpectedOutputFiles(String inputResource, String expectedOutputResource) {
        inputIn = classLoader.getResourceAsStream(inputResource);
        expectedOutputIn = classLoader.getResourceAsStream(expectedOutputResource);

        baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        System.setIn(inputIn);
        System.setOut(ps);
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
                sb.append(line);
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

        return sb.toString();
    }
}
