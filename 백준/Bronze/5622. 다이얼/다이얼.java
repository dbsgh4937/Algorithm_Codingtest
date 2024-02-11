import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String string = bufferedReader.readLine();

        int stringLength = string.length();
        int seconds = 0;

        for (int i = 0; i < stringLength; i++) {
            switch (string.charAt(i)) {
                case'A': case'B': case 'C':
                    seconds += 3;
                    break;

                case 'D': case 'E': case 'F':
                    seconds += 4;
                    break;

                case 'G': case 'H': case 'I':
                    seconds += 5;
                    break;

                case 'J': case 'K': case 'L':
                    seconds += 6;
                    break;

                case 'M': case 'N': case 'O':
                    seconds += 7;
                    break;

                case 'P': case 'Q': case 'R': case'S':
                    seconds += 8;
                    break;

                case 'T': case 'U': case 'V':
                    seconds += 9;
                    break;

                case 'W': case 'X': case 'Y': case 'Z':
                    seconds += 10;
                    break;
            }
        }

        System.out.println(seconds);

        bufferedReader.close();
    }
}
