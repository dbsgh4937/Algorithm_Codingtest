import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader 사용
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];

        while (true) {
            //계속해서 입력된 내용들을 잘라야 하기 때문
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            //분리된 token들을 arr배열에 저장
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            if ((arr[0] == 0) && (arr[1] == 0) && (arr[2] == 0)) {
                break;
            }

            Arrays.sort(arr);   //Scalene쪽과 Invalid 쪽에서 값 비교할 때 필요할 듯 이쪽 조건에서만

            if ((arr[0] == arr[1]) && (arr[1] == arr[2])) {
                System.out.println("Equilateral");
            } else if (arr[2] >= (arr[1] + arr[0])) {
                System.out.println("Invalid");
            } else if ((arr[0] == arr[1]) || (arr[1] == arr[2]) || (arr[0] == arr[2])) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

    }
}
