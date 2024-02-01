import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int count = 0;      //약수의 index를 저장
        int ornotValue = 0; //존재여부를 파악해서 K번째 약수를 저장

        for (int i = 1; i <= N; i++) {

            //약수 구해서 count 횟수를 파악
            if ((N % i) == 0) {
                count++;
            }

            if (count == K) {
                ornotValue = i;
                break;
            }
        }

        System.out.println(ornotValue);

    }
}
