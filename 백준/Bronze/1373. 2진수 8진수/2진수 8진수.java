import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        //string을 2진수로 바꿔서 저장(정수로 바뀜)
        //형 변환시 long을 넘을 수 있기 때문에 정수형을 BigInteger로 선언
        BigInteger changeValue = new BigInteger(str, 2);

        //정수형 값을 String(8진수)으로 바꾸는 방식
        String result = changeValue.toString(8);

        System.out.println(result);

        bufferedReader.close();
    }
}