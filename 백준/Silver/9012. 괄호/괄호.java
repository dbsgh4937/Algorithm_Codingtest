import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //횟수 저장
        int T = Integer.parseInt(bufferedReader.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            //괄호 문장 저장
            String PS = bufferedReader.readLine();

            for (int j = 0; j < PS.length(); j++) {
                //각각 괄호 파악하기 위해 하나씩 저장
                char eachString = PS.charAt(j);

                if (eachString == '(') {
                    stack.push(eachString);
                } else {
                    if (stack.empty()) {
                        stack.push(eachString);
                        break;
                    }

                    stack.pop();
                }

            }

            if (stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            //stack을 반복문 밖에서 설정했으니까 return해서 다음 연산전에 비워놔야된다.
            stack.clear();
        }

        bufferedReader.close();
    }
}
