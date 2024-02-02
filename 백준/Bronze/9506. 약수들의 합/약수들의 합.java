import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //출력될 가변적인 String생성(배열 사용을 안 할 것이다)
        StringBuilder stringBuilder;

        while (true) {
            stringBuilder = new StringBuilder();
            int n = Integer.parseInt(bufferedReader.readLine());

            if (n == -1) {
                break;
            }

            int totalSum = 1;
            stringBuilder.append(n + " = 1");

            for (int i = 2; i < n; i++) {
                if ((n % i) == 0) {
                    //약수면 string에 더해놓기
                    stringBuilder.append(" + " + i);
                    totalSum += i;
                }
            }

            if (n == totalSum) {
                System.out.println(stringBuilder);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        bufferedReader.close();
    }
}
