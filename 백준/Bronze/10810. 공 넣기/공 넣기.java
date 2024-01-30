import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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

        int[] arr = new int[N + 1];
        for (int lengthCount = 1; lengthCount <= M; lengthCount++) {

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());

            //i~j까지 범위에 k를 넣는 코드
            for (int putinCount = i; putinCount <= j; putinCount++) {
                arr[putinCount] = k;
            }
        }

        //메소드 사용하기 위해서 String이 계속 바뀔거니까 StringBuilder을 사용
        StringBuilder stringBuilder = new StringBuilder();
        for (int spaceCount = 1; spaceCount <= N; spaceCount++) {
            stringBuilder.append(arr[spaceCount] + " ");
        }

        System.out.println(stringBuilder);

    }
}
