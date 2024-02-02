import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //첫번째 줄에 입력되는 N값 저장
        int N = Integer.parseInt(bufferedReader.readLine());
        //두번째 줄에 입력되는 값을 저장
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] arr = new int[N];

        //두번째 줄을 blank기준으로 token화 해서 배열에 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int count = 0;

        //횟수 제공을 통해 N번돌리는 loop
        for (int j = 0; j < N; j++) {

            int k;

            for (k = 2; k < arr[j]; k++) {
                if (arr[j] % k == 0) {
                    break;
                }
            }

            if (arr[j] == k) {
                count++;
            }
        }
        
        System.out.println(count);

        bufferedReader.close();
    }
}
