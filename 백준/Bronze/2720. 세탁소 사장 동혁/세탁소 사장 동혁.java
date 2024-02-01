import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        for (int i = 0; i < N; i++) {
            int C = Integer.parseInt(bufferedReader.readLine());

            //Quarter 계산
            stringBuilder.append((C / Quarter) + " ");
            C %= Quarter;

            //Dime 계산
            stringBuilder.append((C / Dime) + " ");
            C %= Dime;

            //Nickel 계산
            stringBuilder.append((C / Nickel) + " ");
            C %= Nickel;

            //Penny 계산은 남아있는거 그냥 뒤에다 붙이면 됨
            stringBuilder.append((C / Penny) + "\n");
        }

        System.out.println(stringBuilder);

    }
}
