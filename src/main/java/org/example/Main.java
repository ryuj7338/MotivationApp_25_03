package org.example;

//motivation 앱 만들기
// 추가 -> 생성 C / 보기 -> 읽기 R / 수정 -> 수정 U / 삭제 -> 삭제 D
// 속성과 기능 중심




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== motivation 실행 ==");


        Scanner sc = new Scanner(System.in);

        int Id = 0;


        List<Motivation> motivations = new ArrayList<Motivation>();

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
                int id = Id + 1;
                System.out.print("body : ");
                String body = sc.nextLine();
                System.out.print("source : ");
                String source = sc.nextLine();

                Motivation motivation = new Motivation(id, body, source);

                motivations.add(motivation);


                System.out.printf("%d번 motivation이 등록되었습니다.\n", id);
                Id++;

            }else if(cmd.equals("list")) {
                System.out.println("=".repeat(40));
                System.out.printf("   번호    /     source      /      motivation        \n");
                for (int i = motivations.size() - 1; i >= 0; i--) {
                    Motivation motivation = motivations.get(i);
                    System.out.printf("   %d   /   %s   /   %s   \n", motivation.getId(), motivation.getBody(), motivation.getSource());

                }

                System.out.println("=".repeat(40));
            }
        }
    }
}
class Motivation {
    int id;
    String body;
    String source;

    public Motivation(int id, String body, String source) {
        this.id = id;
        this.body = body;
        this.source = source;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    @Override
    public String toString() {
        id++;
        return "     " + id + "   /  " + "     " +  body + "    /  "  +"     "+ source  ;
    }
}