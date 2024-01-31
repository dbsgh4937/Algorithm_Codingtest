import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int firstNum = Integer.parseInt(stringTokenizer.nextToken());
            int secondNum = Integer.parseInt(stringTokenizer.nextToken());

            if ((firstNum == 0) && (secondNum == 0)) {
                break;
            }

            if ((firstNum % secondNum == 0)) {
                System.out.println("multiple");
            } else if ((secondNum % firstNum) == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
