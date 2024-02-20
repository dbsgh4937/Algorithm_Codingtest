import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        //10! = 3628800
        for (int i = 5; i <= N; i *= 5) {
            //5의 배수 단위로 갯수 파악
            //5!~9! -> 1개
            //10!~14! -> 2개
            //15!~19! -> 3개
            count += N / i;
        }

        System.out.println(count);

    }
}
