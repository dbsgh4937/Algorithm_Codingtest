import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int S = Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Math.abs(S - Integer.parseInt(stringTokenizer.nextToken()));
        }

        // 모든 동생들 간의 거리 차이의 최대공약수를 구함
        int resultMaxValue = arr[0];
        for (int i = 1; i < N; i++) {
            resultMaxValue = GCD(resultMaxValue, arr[i]);
        }

        System.out.println(resultMaxValue);
    }

    // 유클리드 호제법을 사용한 최대공약수 구하기
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
