import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
            //동생들과의 간격을 절대값으로 산출해서 배열로 저장
            arr[i] = Math.abs(S - Integer.parseInt(stringTokenizer.nextToken()));
        }

        //모든 동생들 간의 거리 차이를 통해 최대공약수를 구함
        //동생 수(N)가 1이면 default로 하나의 거리가 최대공약수로 도출되기 위해 따로 빼고
        //이후부터 반복문에서 GCD를 호출해서 result를 갱신해가며 최대공약수를 찾아낸다 
        int handleResult = arr[0];
        for (int i = 1; i < N; i++) {
            handleResult = GCD(handleResult, arr[i]);
        }

        System.out.println(handleResult);
    }

    // 유클리드 호제법을 사용한 최대공약수 구하기
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
