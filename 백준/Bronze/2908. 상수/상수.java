import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //입력받은 String을 빈칸 기준으로 token화 하고 이것을 mutable하게 바뀔 수 있는 StringBuilder로 선언 후
        //StringBuilder의 reverse() 메소드를 사용해 순서를 바꿔 저장하고 이를 Integer로 저장
        int firstNum = Integer.parseInt(new StringBuilder(stringTokenizer.nextToken()).reverse().toString());
        int secondNum = Integer.parseInt(new StringBuilder(stringTokenizer.nextToken()).reverse().toString());

        System.out.println(Math.max(firstNum,secondNum));

        bufferedReader.close();
    }
}
