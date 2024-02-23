import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int[] arr = new int[9];
        int totalHeight = 0;
        int noReal_1 = 0;
        int noReal_2 = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
            totalHeight += arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if ((totalHeight - arr[i] - arr[j]) == 100) {
                    noReal_1 = i;
                    noReal_2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if ((i == noReal_1) || (i == noReal_2)) {
                continue;
            }
            stringBuilder.append(arr[i]).append("\n");
        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : Brute Force]

[for문 7개로 해도되는 안좋은 방법도 있지만 전체에서 2개를 빼는 방법이 더 쉬울거같다]
*/