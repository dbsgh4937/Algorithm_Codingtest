import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍트스를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //StringTokenizer을 사용해서 특정 구분자를 기준으로 분리를 할 것인데 이때 readline()은 공백 기준으로 토큰으로 분리해준다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //readline()을 사용했기 때문에 형변환을 꼭 해줘야 한다.
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        //1부터 사용하는 index를 사용하기 위해
        int[] arr = new int[N + 1];

        //각 index에 해당하는 숫자를 배열에 저장
        for (int count = 1; count <= N; count++) {
            arr[count] = count;
        }

        for (int lengthCount = 1; lengthCount <= M; lengthCount++) {

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            int changeValue = 0;

            changeValue = arr[i];
            arr[i] = arr[j];
            arr[j] = changeValue;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            stringBuilder.append(arr[i] + " ");
        }

        System.out.println(stringBuilder);

    }
}
