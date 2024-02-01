import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //n * n이 되면 int 범위를 뛰어넘음
        Long n = Long.parseLong(bufferedReader.readLine());
        System.out.println((n * (n - 1)) / 2);
        System.out.println("2");
    }
}
