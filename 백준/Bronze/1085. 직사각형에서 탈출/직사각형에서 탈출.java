import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader 사용
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //split하기 위해 bufferReader로 받은 내용을 split해서 저장
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        //들어온 stirng을 int형으로 바꿔서 쓸 예정이기 때문에 parseInt로 형변환을 해줘야 한다
        int x = Integer.parseInt(stringTokenizer.nextToken());
        int y = Integer.parseInt(stringTokenizer.nextToken());
        int w = Integer.parseInt(stringTokenizer.nextToken());
        int h = Integer.parseInt(stringTokenizer.nextToken());

        int x_min = Math.min(x, w - x);
        int y_min = Math.min(y, h - y);

        System.out.println(Math.min(x_min, y_min));
    }
}
