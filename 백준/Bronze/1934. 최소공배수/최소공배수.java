import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            //최대공약수 계산
            int result = GCD(A, B);

            System.out.println((A * B) / result);
        }
    }

    //최대공약수를 재귀 함수를 이용해서 푸는 방식을 이용
    public static int GCD(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return firstNum;
        }
        return GCD(secondNum, firstNum % secondNum);
    }
}
