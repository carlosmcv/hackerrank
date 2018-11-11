package hackerrank.n26test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TheHuffmanDecoder {

    private static final String NEWLINE_INPUT = "[newline]";
    private static final char NEWLINE_CHAR = '\n';
    private static final char ZERO_CHAR = '0';
    private static final String SEPARATOR = "\t";

    public static String decode(List<String> codes, String encoded) {
        TreeNode root = new TreeNode();
        StringBuilder result = new StringBuilder();

        loadTree(codes, root);

        TreeNode current = root;
        for (char c : encoded.toCharArray()) {
            if (c == ZERO_CHAR)
                current = current.left;
            else current = current.right;

            if (current.left == null && current.right == null) {
                result.append(current.val);
                current = root;
            }
        }

        return result.toString();
    }

    private static void loadTree(List<String> codes, TreeNode root) {
        codes.stream().map(c -> c.split(SEPARATOR)).forEach(code -> {
            TreeNode current = root;
            for (char c : code[1].toCharArray()) {
                if (c == ZERO_CHAR) {
                    if (current.left == null)
                        current.left = new TreeNode();
                    current = current.left;
                } else {
                    if (current.right == null)
                        current.right = new TreeNode();
                    current = current.right;
                }
            }
            current.val = NEWLINE_INPUT.equals(code[0]) ? NEWLINE_CHAR : code[0].charAt(0);
        });
    }

    private static class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int codesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codes = new ArrayList<>();

        for (int i = 0; i < codesCount; i++) {
            String codesItem = bufferedReader.readLine();
            codes.add(codesItem);
        }

        String encoded = bufferedReader.readLine();

        String result = decode(codes, encoded);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
