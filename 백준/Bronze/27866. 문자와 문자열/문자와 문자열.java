import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string= bufferedReader.readLine();

        int num = Integer.parseInt(bufferedReader.readLine());

        System.out.println(string.charAt(num - 1));

        bufferedReader.close();
    }
}
