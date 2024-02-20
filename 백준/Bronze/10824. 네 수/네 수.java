import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        String A = stringTokenizer.nextToken();
        String B = stringTokenizer.nextToken();
        String C = stringTokenizer.nextToken();
        String D = stringTokenizer.nextToken();

        System.out.println(Long.parseLong(A + B) + Long.parseLong(C + D));

        bufferedReader.close();

    }
}
