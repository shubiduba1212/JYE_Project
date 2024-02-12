package polymorphism.alcoholtherapy;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {

    /*
    Project Title : Alcohol Theraphy에 오신 것을 환영합니다.

    summary : Alcohol Theraphy Bar 바 의 바텐더(Bartender)가 고객에게 몇가지 질문을 통해 어울리는 음료를 추천해주는 프로그램
    고객의 답변을 바탕으로 음료를 추천한다.
    질문의 종류 : 1. 오늘의 기분, 2. 건강 상태, 3. 좋아하는 맛 또는 원하는 맛
    음료의 종류 : 와인(화이트/레드), 위스키(싱글몰트, 버번, 스카치), 칵테일 등등 갯수 다양하게 설정 가능

    시스템 요구사항
    [고객의 행위]
    고객은 바에 입장하기, 음료 추천 요청하기, 바텐더의 질문에 답하기, 다시 추천받기, (다시)주문하기, 계산하기, 나가기

    [바텐더의 행위]
    바텐더는 고객에게 인사하기, 고객에게 질문하기, 음료 추천하기, 다시 추천하기, (다시)주문받기, 계산하기, 인사하기

     1. 고객은 바에 입장한다. 고객이 바에 입장하지 않으면 프로그램은 시작하지 않는다.
     2. 고객은 주문전까지는 바를 자유롭게 나갈 수 있으나, 식음료 주문 후, 계산하기전에는 바를 나갈 수 없다.
     3. 바텐더는 처음에 고객에게 인삿말과 함께 주류 추천을 받을 것인지 묻는다.
     4. 고객은 주류추천을 받을 경우, 바텐더의 질문에 답한다. 이때, 질문에 답을 하고 다음 질문으로 넘어갔다면 이전 질문으로 돌아갈 수 없다.
     5. 고객은 다시 추천받기를 통해 처음 질문으로 돌아갈 수 있다.
     6. 고객은 바텐더가 메뉴를 추천한 이후에만, 다시 추천을 요청할 수 있다.
     7. 고객은 바텐더의 추천메뉴가 맘에 드는 경우, 주문완료를 한다. 이때, 고객은 음료를 주문한 후에는 음료 추천을 (재)요청할 수 없다.
     8. 고객은 주문한 음료를 재주문할 수 있다.
     9. 바텐더는 고객에게 질문하고 고객의 답변을 통해 추천할 음료를 정한다. (각 질문에 대한 답변에 따라 추천 메뉴는 달라진다. - 랜덤 설정)
    10. 바텐더는 고객이 재추천을 요청시에 다시 질문을 한다.
    11. 바텐더는 주문완료된 음료를 제공한다.
    12. 바텐더는 고객이 주문하지 않은 채 bar를 나가거나, 계산을 한 후에는 배웅인사한다.
    13. 고객은 결제완료시, 자동으로 bar를 나가게 되며, 이때 고객이 bar를 나가면 프로그램은 종료한다.
    */

    //Customer - 고객 객체 생성
    Customer customer = new Customer();


    Scanner scanner = new Scanner(System.in); // 스캐너 생성

    //while문으로 시작
    while (true) {
      System.out.println("============= Alcohol Theraphy =============");
      System.out.println(" 1. Bar에 들어가기 ");
      System.out.println(" 2. Bar에서 나가기 ");
      System.out.println();
      System.out.print(" 고객님의 선택 : ");
      int selectNum = scanner.nextInt(); // 입력한 메뉴 번호 저장

      if (selectNum == 1) {//고객이 Bar에 들어가는 경우
        customer.enterBar(); //Bar에 들어가기
        //음료추천을 받을것인지 물어보기
        startTherapy("1. Alcohol Therapy 진행하기", "2. Bar에서 나가기", customer, scanner);
        break;
      } else if (selectNum == 2) { //고객이 Bar에서 나가는 경우
        customer.leaveBar(); //Bar에서 나가기
        break;
      } else { // 1, 2번을 제외한 다른 번호를 입력한 경우
        System.out.println("❌고객님의 요청을 받아들일 수 없습니다.👉다시 선택해주세요.");
      }
    }
  } //main 메소드 끝나는 부분


  //main메소드 안에 내용이 너무 길어지는 것을 방지하기 위해 따로 method 선언
  public static void startTherapy(String str1, String str2, Customer customer, Scanner scanner) {
    while (true) {
      System.out.println("============= Alcohol Theraphy =============");
      System.out.println(str1); //음료 추천 요청하기
      System.out.println(str2); //Bar에서 나가기
      System.out.println();
      System.out.print(" 고객님의 선택 : ");
      int selectNum = scanner.nextInt(); // 입력한 선택 번호 저장

      //if 조건문으로 selectNum와 일치하는 번호의 프로그램 동작
      if (selectNum == 1) {
        //3가지 질문 진행 메소드 호출
        haveQuestions(customer, scanner, "처음");


        //추천한 후 고객의 행위 선택사항 제시
        while (true) {
          System.out.println("============= Alcohol Theraphy =============");
          System.out.println(" 1. 주문하기 ");
          System.out.println(" 2. 다시 추천받기 ");
          System.out.println(" 3. Bar에서 나가기 ");
          System.out.println();
          System.out.print(" 고객님의 선택 : ");
          int selectNum1 = scanner.nextInt();

          if (selectNum1 == 1) { // 고객이 주문하면
            customer.orderDrinks(); // 음료 주문하기 메소드 호출

            //고객이 주문한 후 다시 행위 선택사항 제시
            while (true) {
              System.out.println("============= Alcohol Theraphy =============");
              System.out.println(" 1. 음료 재주문하기 ");
              System.out.println(" 2. 결제하기 ");
              System.out.println();
              System.out.print(" 고객님의 선택 : ");
              int selectNum2 = scanner.nextInt();

              switch (selectNum2) {
                case 1 :
                  customer.orderDrinks(); // 음료 주문하기 메소드 호출
                  break;
                case 2 :
                  customer.payment(); // 결제하기 메소드 호출
                  break;
                default : // 입력한 숫자가 범위를 벗어난 경우
                  System.out.println("❌고객님의 요청을 받아들일 수 없습니다.👉다시 선택해주세요.");
                  break;
              }

              if (selectNum2 == 2) { //만약 결제하기를 진행했다면
                customer.leaveBar(); // 결제 후 고객은 bar를 나간다.
                break; // 재주문 관련 while문 벗어나기
              }
            }
            break;
          } else if (selectNum1 == 2) { // 고객이 다시 추천받기를 하면
            haveQuestions(customer, scanner, "다시");
          } else if (selectNum1 == 3) { // 고객이 Bar에서 나간다면
            customer.leaveBar(); //Bar에서 나가기
            break;
          } else { // 입력한 숫자가 범위를 벗어났다면
            System.out.println("❌고객님의 요청을 받아들일 수 없습니다.👉다시 선택해주세요.");
          }
        }
        break;
      } else if (selectNum == 2) {
        customer.leaveBar(); //Bar에서 나가기
        break;
      } else {
        System.out.println("❌고객님의 요청을 받아들일 수 없습니다.👉다시 선택해주세요.");

      }
    }

  }

  //질문 3가지 하는 메소드
  public static void haveQuestions(Customer customer, Scanner scanner, String str) {
    customer.requestTherapy(str);

    while (true) {
      //질문 3개 차례대로 진행
      customer.answerTherapy1(); // 첫번째 질문 시작
      int selectNum1 = scanner.nextInt(); // 입력한 선택 번호 저장
      if (selectNum1 <= 0 || selectNum1 > 4) { // 입력한 숫자가 1~4의 범위를 벗어난 경우
        System.out.println("❌고객님의 요청을 받아들일 수 없습니다.👉다시 선택해주세요.");
        // 해당 질문에 대한 답변 재선택으로 돌아감
      } else { // 입력한 숫자가 1~4의 범위 내인 경우
        //입력한 번호에 해당하는 답변을 setter로 필드값 변경 저장
        customer.bartender.setAnswer1(selectNum1);
        break; // while문 벗어나서 다음 질문으로 이동
      }
    }

    while (true) {
      //질문 3개 차례대로 진행
      customer.answerTherapy2(); // 두번째 질문 시작
      int selectNum1 = scanner.nextInt(); // 입력한 선택 번호 저장
      if (selectNum1 <= 0 || selectNum1 > 4) { // 입력한 숫자가 1~4의 범위를 벗어난 경우
        System.out.println("❌고객님의 요청을 받아들일 수 없습니다.👉다시 선택해주세요.");
        // 해당 질문에 대한 답변 재선택으로 돌아감
      } else {  // 입력한 숫자가 1~4의 범위 내인 경우
        //입력한 번호에 해당하는 답변을 setter로 필드값 변경 저장
        customer.bartender.setAnswer2(selectNum1);
        break; // while문 벗어나서 다음 질문으로 이동
      }
    }

    while (true) {
      //질문 3개 차례대로 진행
      customer.answerTherapy3(); // 세번째 질문 시작
      int selectNum1 = scanner.nextInt(); // 입력한 선택 번호 저장
      if (selectNum1 <= 0 || selectNum1 > 4) { // 입력한 숫자가 1~4의 범위를 벗어난 경우
        System.out.println("❌고객님의 요청을 받아들일 수 없습니다.👉다시 선택해주세요.");
        // 해당 질문에 대한 답변 재선택으로 돌아감
      } else { // 입력한 숫자가 1~4의 범위 내인 경우
        //입력한 번호에 해당하는 답변을 setter로 필드값 변경 저장
        customer.bartender.setAnswer3(selectNum1);
        break;  // while문 벗어나서 다음 질문으로 이동
      }
    }

    //추천할 음료 알려주기
    customer.bartender.recommendsWords(customer.bartender.getAnswer1(), customer.bartender.getAnswer2(), customer.bartender.getAnswer3(), 3);
  }
}
