import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        long result = 1;

        if (N == 0) {
            result = 1;
        } else {
            for (int i = N; i > 0; i--) {
                result *= i;
            }
        }

        System.out.println(result);

    }
}
