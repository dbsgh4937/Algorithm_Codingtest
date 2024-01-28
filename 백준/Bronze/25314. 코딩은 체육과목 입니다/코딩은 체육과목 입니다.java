import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader 사용
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //객체 선언
        StringBuilder stringBuilder = new StringBuilder();

        //N 입력 받아서
        int N = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < N / 4; i++) {
            stringBuilder.append("long ");
        }

        stringBuilder.append("int");

        System.out.println(stringBuilder);
    }
}
