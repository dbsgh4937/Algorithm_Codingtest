import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //문자열을 반복문에서 저장할 mutable한 String생성
        StringBuilder stringBuilder = new StringBuilder();

        char[][] arr = new char[5][15];

        //입력받은 2차원 배열을 arr에 저장
        for (int i = 0; i < 5; i++) {
            String string = bufferedReader.readLine();

            for (int j = 0; j < string.length(); j++) {
                arr[i][j] = string.charAt(j);
            }
        }

        //만든 배열 내에서 빈칸을 제외하고 역순서로 stringBuilder에 추가
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                //null이 아니면 stringBuilder에 저장
                if (arr[j][i] != '\0') {
                    stringBuilder.append(arr[j][i]);
                }
            }
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
