import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static int formingMagicSquare(List<List<Integer>> s) {
        int length = 3;
        int replaced = 0;
        int[] rowSum = new int[length];
        int[] colSum = new int[length];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                rowSum[i] += s.get(i).get(j);
                colSum[i] += s.get(j).get(i);
            }
        }
        int expectedSum = 15;
        for(int i = 0; i < length; i++){
            if(rowSum[i] != expectedSum){
                replaced += Math.abs(expectedSum - rowSum[i]);
            }else if(colSum[i] != expectedSum){
                replaced += Math.abs(expectedSum - colSum[i]);
            }
        }
        System.out.println(Arrays.toString(rowSum));
        System.out.println(Arrays.toString(colSum));
        return replaced;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
