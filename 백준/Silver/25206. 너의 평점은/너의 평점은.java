import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //BufferReader객체를 생성해서 텍스트를 읽어올 것이다.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //for문안에서 20개 그대로 받아서 계산할거기때문에 객체 생성만 하고 뒤에서 선언된 값을 read한다
        StringTokenizer stringTokenizer;

        double getSumOfScore = 0;
        double sumOfScore = 0;

        for (int i = 0; i < 20; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            //과목 이름
            String objectName = stringTokenizer.nextToken();
            //학점
            double objectScore = Double.parseDouble(stringTokenizer.nextToken());
            //과목의 획득 학점(알파벳)
            String objectAlphabet = stringTokenizer.nextToken();

            double score = 0;

            //P이면 예외처리로 학점도 포함이 안되기 때문에 exception situation 하나 제외
            if (!(objectAlphabet.equals("P"))) {

                switch (objectAlphabet) {
                    case "A+":
                        score = 4.5;
                        break;
                    case "A0":
                        score = 4.0;
                        break;
                    case "B+":
                        score = 3.5;
                        break;
                    case "B0":
                        score = 3.0;
                        break;
                    case "C+":
                        score = 2.5;
                        break;
                    case "C0":
                        score = 2.0;
                        break;
                    case "D+":
                        score = 1.5;
                        break;
                    case "D0":
                        score = 1.0;
                        break;
                    case "F":
                        score = 0.0;
                        break;
                    default:    //알맞은 학점 기호가 들어오지 않았을 때
                        break;
                }

                //전체 총합 학점 계산(나눠질 총합)
                sumOfScore += (objectScore * score);
                //전체 획득 학점 계산(나눌 총합)
                getSumOfScore += objectScore;
            }
        }

        System.out.printf("%.6f", (sumOfScore / getSumOfScore));
    }
}
