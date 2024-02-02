import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int endNum = 666;
        int count = 1;

        //BruteForce(전수조사) 방법 사용
        while (count != N) {

            endNum++;

            if (String.valueOf(endNum).contains("666")) {
                count++;
            }

        }

        System.out.println(endNum);

    }
}
