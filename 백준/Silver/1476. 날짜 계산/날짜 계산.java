import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //E(1~15), S(1~28), M(1~19)
        int input_E = Integer.parseInt(stringTokenizer.nextToken());
        int input_S = Integer.parseInt(stringTokenizer.nextToken());
        int input_M = Integer.parseInt(stringTokenizer.nextToken());

        //E, S, M의 범위
        int setE = 15;
        int setS = 28;
        int setM = 19;

        //루프문 안에서 사용될 변수 선언
        int useE = 0;
        int useS = 0;
        int useM = 0;
        int result = 0;

        while (true) {
            useE++;
            useS++;
            useM++;
            result++;

            if (useE > setE) {
                useE = 1;
            }
            if (useS > setS) {
                useS = 1;
            }
            if (useM > setM) {
                useM = 1;
            }

            if ((input_E == useE) && (input_S == useS) && (useM == input_M)) {
                break;
            }
        }

        System.out.println(result);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : Brute Force]


*/