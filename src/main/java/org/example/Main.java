package org.example;

//motivation 앱 만들기
// 추가 -> 생성 C / 보기 -> 읽기 R / 수정 -> 수정 U / 삭제 -> 삭제 D
// 속성과 기능 중심




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== motivation 실행 ==");


        Scanner sc = new Scanner(System.in);

        int id = 1;

        String cmd;
        while (true) {
            System.out.print("명령어) ");
            cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                System.out.println("== motivaiton 종료 ==");
                break;
            } else if (cmd.length() == 0) {
                System.out.println("명령어를 입력하시오.");
            }

            if (cmd.equals("add")) {
                System.out.print("motivation : ");
                String motivation = sc.nextLine().trim();
                System.out.print("source : ");
                String source = sc.nextLine().trim();
                System.out.printf("%d번 motivation이 출력되었습니다.\n", id);
                id++;
            }else if(cmd.equals("list")) {
                System.out.println("=".repeat(40));
                System.out.printf("   번호    /     source      /      motivation        \n");
            }
        }
    }
}
class Moti {
    int id;
    String motivation;
    String source;

}
