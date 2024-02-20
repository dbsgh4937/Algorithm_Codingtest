import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String S = bufferedReader.readLine();

        for (int i = 0; i < S.length(); i++) {
            int eachCh = S.charAt(i);

            //대문자(아스키 코드 : 65~90)
            if ((65 <= eachCh) && (eachCh <= 90)) {
                //ROT13 암호화
                eachCh += 13;

                if (eachCh > 90) {
                    //넘어가서 앞쪽으로 돌아가기 위한 로직(91 = 65(A) + 26(대문자 알파벳 갯수))
                    eachCh = 65 + (eachCh - 91);
                }
            }
            //소문자(아스키 코드 : 97~122)
            else if ((97 <= eachCh) && (eachCh <= 122)) {
                //ROT13 암호화
                eachCh += 13;

                if (eachCh > 122) {
                    //넘어가서 앞쪽으로 돌아가기 위한 로직(123 = 97(A) + 26(대문자 알파벳 갯수))
                    eachCh = 97 + (eachCh - 123);
                }
            }
            //캐스팅해서 결과값 저장
            stringBuilder.append((char) eachCh);

        }

        System.out.println(stringBuilder);
        bufferedReader.close();

    }
}
