import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(bufferedReader.readLine());
        //계산 진행중 어떤 수 까지 push했었는지 저장하기 위해서 0으로 초기화하면 처음부터 실행 가능
        int lastNum = 0;

        //스택에 순서대로 넣는식
        for (int i = 0; i < n; i++) {
            int inputSeqNum = Integer.parseInt(bufferedReader.readLine());

            //들어오는 값과 마지막 값을 비교해가며 stack안에 없고 순서대로 가능할 시 stack에 저장 및 stringBuilder에 저장
            if (inputSeqNum > lastNum) {
                for (int j = lastNum + 1; j <= inputSeqNum; j++) {
                    stack.push(j);
                    stringBuilder.append("+").append("\n");
                }
                lastNum = inputSeqNum;
            }
            if (stack.peek() != inputSeqNum) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            stringBuilder.append("-").append("\n");

        }

        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}

/*
[사용한 알고리즘 : Stack]
*/