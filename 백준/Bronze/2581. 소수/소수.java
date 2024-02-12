import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());
        int total = 0;
        int minValue = MAX_VALUE;

        for (int i = M; i <= N; i++) {

            boolean checkEvent = true;

            //1은 소수X
            if (i == 1) {
                continue;
            }

            //소수 구하기
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    //소수일때 true, 소수가 아니면 false로 선언
                    checkEvent = false;
                    break;
                }
            }

            if (checkEvent) {
                total += i;
                minValue = Math.min(minValue, i);
            }

        }

        if (minValue == MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(total + "\n" + minValue);
        }

        bufferedReader.close();
    }
}
