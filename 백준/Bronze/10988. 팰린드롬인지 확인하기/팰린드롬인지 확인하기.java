import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String을 불러와서 read해놓기
        String str = bufferedReader.readLine();

        problemFunction(str);
    }

    static void problemFunction(String str) {

        int stringLength = str.length();
        int count = 0;

        for (int i = 0; i < (str.length() / 2); i++) {
            char selectChar = str.charAt(i);
            char anotherChar = str.charAt((stringLength - i) - 1);

            if (selectChar == anotherChar) {
                count++;
            }
        }

        //값 비교해서 도출 하는 방법
        if (count == (stringLength / 2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
