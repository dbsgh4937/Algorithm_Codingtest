import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //String입력 받기위해 선언
        String str = bufferedReader.readLine();
        //문자열을 char타입의 배열에 저장
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        for (int i = (str.length()-1); i >= 0; i--) {
            System.out.print(arr[i]);
        }

        bufferedReader.close();
    }
}
