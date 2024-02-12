import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            //남아있는 토큰에 대한 여부를 파악해서 while문을 끝내기 위해 hasMoreTokens 메소드 사용
            while (stringTokenizer.hasMoreTokens()) {
                //StringBuilder로 " " 기준으로 단어들을 저장
                StringBuilder stringBuilder = new StringBuilder(stringTokenizer.nextToken());
                //저장된 값을 계속 reverse하고 위치를 똑같이 하기 위해 " " 를 넣어 순서만 바꾸게 함
                result.append(stringBuilder.reverse() + " ");
            }

            result.append("\n");
        }
        System.out.println(result);

        bufferedReader.close();
    }
}
