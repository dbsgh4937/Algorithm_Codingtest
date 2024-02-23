import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        //문자의 길이
        int addLenght = 1;
        //자릿수가 바뀌는 기점을 파악하기 위함
        int changeValue = 10;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            //1, 10, 100... 이 되면 추가되는 수의 길이가 달라지니까 이 부분을 기점으로 변수에 변화를 준다
            if ((i % changeValue) == 0) {
                changeValue *= 10;
                addLenght++;
            }
            result += addLenght;
        }

        System.out.println(result);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : Brute Force]

[만약 Brute Force가 아니였으면 사용]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= N; i++) {
            stringBuilder.append(i);
        }

        System.out.println(stringBuilder.length());

        bufferedReader.close();
    }
}

[1, 10, 100처럼 자릿수가 바뀌게 되면 더하는 값의 길이를 생각하면서 풀기]

*/