import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //줄마다 0,1,2로 1,2,3번째 줄 생성
        for(int i = 0; i < n; i++){
            //1,2,3개 씩 하나씩 늘려가며 그 줄에서 *를 생성
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            //그 줄을 print한 후 줄 바꾸기
            System.out.println();
        }
    }
}