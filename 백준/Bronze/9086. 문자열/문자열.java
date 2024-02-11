import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int count = Integer.parseInt(bufferedReader.readLine());
        
        for (int i = 0; i < count; i++) {

            String inputString = bufferedReader.readLine();
            stringBuilder.append(inputString.charAt(0));
            stringBuilder.append(inputString.charAt(inputString.length() - 1) + "\n");

        }

        System.out.println(stringBuilder);
        
        bufferedReader.close();
    }
}
