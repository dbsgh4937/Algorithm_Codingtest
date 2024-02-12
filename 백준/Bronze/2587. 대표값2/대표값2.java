import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        int midValue = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int value = Integer.parseInt(bufferedReader.readLine());

            arr[i] = value;
            total += value;
        }

        Arrays.sort(arr);
        System.out.println(total / 5);
        System.out.println(arr[2]);

        bufferedReader.close();
    }
}
