import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //String을 불러와서 read해놓기
        String str = bufferedReader.readLine();
        //알파벳을 넣어줄 배열 선언(최대 26)
        int[] countAlphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {

            //대문자일 경우 대문자 아스키를 빼서 index로만 배열에 찾아 카운트++
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
                countAlphabet[str.charAt(i) - 'A'] += 1;
            }
            //소문자일 경우 소문자 아스키를 빼서 index로만 배열에 찾아 카운트++
            else {
                countAlphabet[str.charAt(i) - 'a'] += 1;
            }
        }

        int max = -1;
        char sameValueResult = '?';

        for (int i = 0; i < countAlphabet.length; i++) {

            if (countAlphabet[i] > max) {
                //max, sameValueResult 변수를 통해 배열의 값과 아스키코드를
                //(char)으로 강제 형변환을 해서 나타내 char형이 나오게끔해서 도출한다
                max = countAlphabet[i];
                sameValueResult = (char) (i + 65);
            } else if (countAlphabet[i] == max) {
                sameValueResult = '?';
            }
        }

        System.out.println(sameValueResult);

    }

}
