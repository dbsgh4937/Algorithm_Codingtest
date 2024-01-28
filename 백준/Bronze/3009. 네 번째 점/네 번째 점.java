import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader 사용
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //split하기 위해 bufferReader로 받은 내용을 split하기 위해 선언
        StringTokenizer stringTokenizer;

        int[] x_value = new int[3];     //x값들 다 저장
        int[] y_value = new int[3];     //y값들 다 저장

        //입력 받은 점을 배열에 저장하기 위해
        for (int i = 0; i < 3; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            x_value[i] = Integer.parseInt(stringTokenizer.nextToken());
            y_value[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        //구하려고하는 마지막 점의 좌표
        int x_real = 0;
        int y_real = 0;

        if (x_value[0] == x_value[1]) {
            x_real = x_value[2];
        } else if (x_value[0] == x_value[2]) {
            x_real = x_value[1];
        } else {
            x_real = x_value[0];
        }

        if (y_value[0] == y_value[1]) {
            y_real = y_value[2];
        } else if (y_value[0] == y_value[2]) {
            y_real = y_value[1];
        } else {
            y_real = y_value[0];
        }

        System.out.println(x_real + " " + y_real);
    }
}
