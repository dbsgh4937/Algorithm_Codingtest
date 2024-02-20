import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;

        //한줄씩 read해야되는데 갯수를 모르니까
        while ((str = bufferedReader.readLine()) != null) {
            int small = 0;
            int big = 0;
            int number = 0;
            int space = 0;

            for (int i = 0; i < str.length(); i++) {
                int eachSource = str.charAt(i);

                //소문자(아스키 코드 : 97~122)
                if ((97 <= eachSource) && (eachSource <= 122)) {
                    small++;
                }
                //대문자(아스키 코드 : 65~100)
                else if ((65 <= eachSource) && (eachSource <= 90)) {
                    big++;
                }
                //숫자(아스키 코드 : 48~57)
                else if ((48 <= eachSource) && (eachSource <= 57)) {
                    number++;
                }
                //공백(아스키 코드 : 32)
                else if (eachSource == 32) {
                    space++;
                }
            }

            System.out.println(small + " " + big + " " + number + " " + space);

        }

        bufferedReader.close();

    }
}
