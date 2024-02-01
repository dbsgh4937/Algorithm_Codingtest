import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int rangeOfValue = 2;
        int resultLayer = 1;

        if (N == 1) {
            System.out.println(1);
        } else {

            while (rangeOfValue <= N) {
                rangeOfValue = rangeOfValue + (resultLayer * 6);
                resultLayer++;
            }
            System.out.println(resultLayer);
        }
    }
}
