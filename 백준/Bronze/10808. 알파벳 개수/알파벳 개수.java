import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char alphabet = str.charAt(i);
            arr[alphabet - 97]++;
        }

        for (int j = 0; j < 26; j++) {
            System.out.print(arr[j] + " ");
        }

        bufferedReader.close();

    }
}
