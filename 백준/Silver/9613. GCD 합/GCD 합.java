import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        //각 몇줄을 할지
        int t = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < t; i++) {
            //전체 GCD의 합
            long totalSum = 0;

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            //각 행에서 몇개를 할지
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int[] arr = new int[n];

            //한 줄에서 각각의 값들을 배열에 저장
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(stringTokenizer.nextToken());
            }

            for (int each1 = 0; each1 < n; each1++) {
                for (int each2 = (each1 + 1); each2 < n; each2++) {
                    totalSum += GCD(arr[each1], arr[each2]);
                }
            }

            stringBuilder.append(totalSum).append("\n");

        }
        System.out.println(stringBuilder);
    }

    //'유클리드 호제법'을 사용한 최대공약수 구하기
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}
