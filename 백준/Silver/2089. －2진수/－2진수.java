import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());

        while (true) {
            //N의 값을 -2로 나눠주고 절대값으로 변환
            stringBuilder.append(Math.abs(N % -2));

            //정확한 값을 나눈 몫을 반올림해야 하기 떄문에 캐스팅이 필요
            N = (int) Math.ceil((double) N / -2);

            if (N == 0) {
                break;
            }
        }

        System.out.println(stringBuilder.reverse());

        bufferedReader.close();
    }
}