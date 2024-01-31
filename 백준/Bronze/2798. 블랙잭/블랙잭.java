import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //bruteforce문제(전수조사)
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        //N개의 카드(전체)에 대한 배열 생성
        int[] arr = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //전체 카드 개수를 다 비교해야 하기 때문에 배열을 선언 후 숫자를 배열에 집어넣기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int max = 0;

        //삼중 for 문으로 max값을 구하기(ex. 5개면, 배열의 index : 012~345, 5c3 => 10개의 경우의수 도출)
        for (int i = 0; i < (N - 2); i++) {
            for (int j = (i + 1); j < (N - 1); j++) {
                for (int k = (j + 1); k < N; k++) {

                    int totalSum = arr[i] + arr[j] + arr[k];

                    if (totalSum <= M) {
                        max = Math.max(totalSum, max);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
