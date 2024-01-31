import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍트스를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        //StringTokenizer을 사용해서 특정 구분자를 기준으로 분리를 할 것인데 이때 readline()은 공백 기준으로 토큰으로 분리해준다.
//        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        //1~5번째 줄 까지
        for (int i = 1; i <= N; i++) {

            //한줄에 빈공간
            for (int j = 1; j <= (N - i); j++) {
                stringBuilder.append((" "));
            }

            //한줄에 별찍기
            for (int k = 1; k <= (2 * i)- 1; k++) {
                stringBuilder.append(("*"));
            }

            stringBuilder.append("\n");
        }

        //6~9번째 줄 까지
        for (int i = (N - 1); i >= 1; i--) {

            //한줄에 빈공간
            for (int j = 1; j <= (N - i); j++) {
                stringBuilder.append((" "));
            }

            //한줄에 별찍기
            for (int k = 1; k <= (2 * i) - 1; k++) {
                stringBuilder.append(("*"));
            }

            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);

    }
}
