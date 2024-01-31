import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //BufferReader로 부터 받은 것을 형변확을 꼭 해줘서 N으로 주입시키기 위해
        int N = Integer.parseInt(bufferedReader.readLine());

        int maxX = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;

        int maxY = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            //한줄씩 blank 기준으로 입력 받기 위해(token화 해서)
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int X = Integer.parseInt(stringTokenizer.nextToken());
            int Y = Integer.parseInt(stringTokenizer.nextToken());

            maxX = Math.max(maxX, X);
            minX = Math.min(minX, X);

            maxY = Math.max(maxY, Y);
            minY = Math.min(minY, Y);
        }

        System.out.println((maxX - minX) * (maxY - minY));

    }

}
