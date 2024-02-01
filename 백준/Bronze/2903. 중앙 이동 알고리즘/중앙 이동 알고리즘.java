import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int basicPointValue = 2;
        int plusValue = 0;

        //input의 N에 비례해 바뀌는 것을 2의 n승을 통해 plus해놓는다
        for (int i = 0; i < N; i++) {
            //casting해서 실수를 정수형으로 넣어놓는다.
            plusValue += (int) Math.pow(2, i);
        }

        System.out.println((int) Math.pow((basicPointValue + plusValue), 2));

    }
}
