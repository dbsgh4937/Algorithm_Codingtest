import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        int resultLength = 0;

        //세 길이를 오름차순으로 정렬하기 위해 배열 생성
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if ((arr[0] + arr[1]) > arr[2]) {
            resultLength = arr[0] + arr[1] + arr[2];
        } else {
            resultLength = ((arr[0] + arr[1]) * 2) - 1;
        }

        System.out.println(resultLength);
    }

}
