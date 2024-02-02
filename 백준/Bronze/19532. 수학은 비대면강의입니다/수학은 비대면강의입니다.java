import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

//        StringBuilder stringBuilder = new StringBuilder();

        int x1 = Integer.parseInt(stringTokenizer.nextToken());
        int y1 = Integer.parseInt(stringTokenizer.nextToken());
        int result1 = Integer.parseInt(stringTokenizer.nextToken());

        int x2 = Integer.parseInt(stringTokenizer.nextToken());
        int y2 = Integer.parseInt(stringTokenizer.nextToken());
        int result2 = Integer.parseInt(stringTokenizer.nextToken());

        //BruteForce(전수조사) 문제
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (((x1 * i) + (y1 * j) == result1) && ((x2 * i) + (y2 * j) == result2)) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
        bufferedReader.close();
    }
}
