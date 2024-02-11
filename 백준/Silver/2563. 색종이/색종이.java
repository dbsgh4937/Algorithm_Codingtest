import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());
        boolean[][] totalArea = new boolean[100][100];
        int count=0;

        for (int i = 0; i < number; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());

            //칸을 boolean식으로 표현해서 count할 예정
            for (int j = x; j < (x + 10); j++) {
                for (int k = y; k < (y + 10); k++) {
                    if (totalArea[j][k] == false) {
                        totalArea[j][k] = true;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        
        bufferedReader.close();
    }
}
