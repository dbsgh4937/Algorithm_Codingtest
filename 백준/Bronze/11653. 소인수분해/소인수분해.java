import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 2; i <= Math.sqrt(N); i++) {
            while ((N % i) == 0) {
                stringBuilder.append(i).append("\n");
                N /= i;
            }
        }

        //34나 39일 경우 Math.sqrt(N)으로 범위에서 나오는 값이 생략될 수 있다 17이나 13처럼
        //이때 제일 큰 소수를 하나 출력시켜야줘야하기 때문에 하나의 조건문 설정(마지막에 하나 넣는 느낌)
        if (N != 1) {
            stringBuilder.append(N);
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
