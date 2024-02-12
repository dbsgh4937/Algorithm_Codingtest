import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a1 = Integer.parseInt(stringTokenizer.nextToken());
        int a0 = Integer.parseInt(stringTokenizer.nextToken());

        int c = Integer.parseInt(bufferedReader.readLine());
        int n0 = Integer.parseInt(bufferedReader.readLine());

        if (((a1 * n0) + a0) <= (c * n0) && (c >= a1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        bufferedReader.close();
    }
}
