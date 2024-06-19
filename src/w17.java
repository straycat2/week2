import java.util.Scanner;

public class w17 {
    public static void main(String[] args) {
        // 선택적 구구단 생성기

        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력제외할 구구단수 값
        for (int i = 2; i <= 9; i++) {
            if (i != passNum) {
                continue;
            }
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다.");
            }
        }
    }
}