import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            String command = stringTokenizer.nextToken();

            switch (command) {
                case "push_front":
                    deque.offerFirst(Integer.parseInt(stringTokenizer.nextToken()));
                    break;

                case "push_back":
                    deque.offerLast(Integer.parseInt(stringTokenizer.nextToken()));
                    break;

                case "pop_front":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollFirst());
                    }
                    break;

                case "pop_back":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.pollLast());
                    }
                    break;

                case "size":
                    System.out.println(deque.size());
                    break;

                case "empty":
                    if (deque.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekFirst());
                    }
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.peekLast());
                    }
                    break;
            }
        }

        bufferedReader.close();

    }
}
