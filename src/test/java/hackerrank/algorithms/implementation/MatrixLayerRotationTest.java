package hackerrank.algorithms.implementation;

import hackerrank.HackerRankTest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by carlosmcv on 26/02/17.
 */
public class MatrixLayerRotationTest extends HackerRankTest {

    @Test
    public void testMatrixLayerRotation2() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/implementation/matrix_layer_rotation_in2.txt",
                "hackerrank/algorithms/implementation/matrix_layer_rotation_out2.txt"
        );

        //execute
        MatrixLayerRotation.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }

    @Test
    public void testMatrixLayerRotation9() throws IOException {
        //setup
        setInputAndExpectedOutputFiles(
                "hackerrank/algorithms/implementation/matrix_layer_rotation_in9.txt",
                "hackerrank/algorithms/implementation/matrix_layer_rotation_out9.txt"
        );

        //execute
        MatrixLayerRotation.main(new String[]{});

        //verify
        Assert.assertEquals(getExpectedOutputString(), getProgramOutputString());
    }
}