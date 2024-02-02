import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //첫번째 줄에 입력되는 N값 저장
        int N = Integer.parseInt(bufferedReader.readLine());
        int result = 0;

        //BruteForce(전수조사)
        for (int i = 1; i < N; i++) {
            int num = i;
            int totalsumOfEachNumber = 0;

            while (num > 0) {
                totalsumOfEachNumber += num % 10;
                num /= 10;
            }

            if ((i + totalsumOfEachNumber) == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);

        bufferedReader.close();
    }
}
