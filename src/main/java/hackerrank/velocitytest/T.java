package hackerrank.velocitytest;

/**
 * Created by carlosmcv on 14/08/16.
 */
public class T {

    public static void main(String[] args) {
        try {
            m();
            System.out.println("0000");
        }
        catch (Exception e) {
            System.out.println("A");
        }
        finally {
            System.out.println("SSSS");
        }

        System.out.println("FFF");
    }

    public static void m() {
        throw new RuntimeException();
    }
}
