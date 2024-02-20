import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String S = bufferedReader.readLine();
        String[] arr = new String[S.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.substring(i, arr.length);
        }

        Arrays.sort(arr);

        for (int j = 0; j < arr.length; j++) {
            stringBuilder.append(arr[j] + "\n");
        }
        System.out.println(stringBuilder);

        bufferedReader.close();

    }
}
