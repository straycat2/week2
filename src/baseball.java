import java.util.Scanner;
import java.util.Random;

public class baseball{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] Ai = new int[3]; // 3개의 숫자처리
        boolean[] user = new boolean[10]; // 0~9 까지 만들기

        for (int i = 1; i < 3; i++) {
            int num;
            do {
                num = random.nextInt(10); // 숫자랜덤 생성
            } while (user[num]);
            Ai[i] = num; // 랜덤숫자는 ai에 저장
            user[num] = true;

        }

        boolean game = false;
        int count = 0;

        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");

        while (!game)  {
            String userInput = scanner.nextLine();

            if (userInput.length() != 3) {
                continue;
            }

            int[] userN = new int[3];
            for (int i = 0; i < 3; i++) {
                userN[i] = Integer.parseInt(String.valueOf(userInput.charAt(i)));
            }

            int strikes = 0;
            int balls = 0;

            for (int i = 0; i < 3; i++) {
                if(userN[i] == Ai[i]){
                    strikes++;
                } else {
                    for (int j = 0; j < 3; j++) {
                        if (userN[i] == Ai[j]){
                            balls++;
                        }
                    }


                }

            }
            count++;
            if (strikes == 0 && balls == 0)  {
                System.out.println(strikes + "S" + balls + "B");
            } else if (strikes == 0) {
                System.out.println(balls + "B");
            } else if (balls == 0) {
                System.out.println(strikes + "S");
            } else {
                System.out.println(strikes + "S" + balls + "B");
            }


            if (strikes == 3) {
                game = true;
                System.out.println(count + "번만에 맞히셨습니다");
                System.out.println("게임을 종료합니다.");
                System.out.println("성공했습니다");
            }

        }

        scanner.close();

    }
}