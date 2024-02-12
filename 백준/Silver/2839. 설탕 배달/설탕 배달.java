import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        while (true) {
            //5의 배수일 때를 먼저 생각
            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                break;
            } else if (N < 0) {
                System.out.println(-1);
                break;
            }

            //5의 배수를 먼저 처리하려고하는데 3을빼서 결과값을 저장해서 5의 배수를 선정해야 하는 경우를 위해
            N -= 3;
            count++;
        }

        bufferedReader.close();
    }
}
