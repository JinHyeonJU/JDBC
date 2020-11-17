package ui;


import java.util.List;
import java.util.Scanner;

import action.Action;
import action.UserAddAction;
import action.UserListAction;
import action.UserRemoveAction;
import action.UserRowAction;
import action.UserUpdateAction;
import controller.UserController;

public class UserMain {

   

   public static void main(String[] args) {
      boolean isStop = false;
      Scanner sc = new Scanner(System.in);
      UserController userController = new UserController();
      do {
         System.out.println("=====사용자 메뉴======");
          System.out.println("1. 전체조회");
          System.out.println("2. 삭제");
          System.out.println("3. 수정");
          System.out.println("4. 삽입");
          System.out.println("5. 개별조회");
          System.out.println("6. 프로그램 종료");
          System.out.println("===================");
          
          System.out.print("번호 입력 : ");          
          int menu = sc.nextInt();
          
          Action action = null;
          
          switch (menu) {
         case 1:
        	 action = new UserListAction();
            break;
         case 2:
            action = new UserRemoveAction();
            break;
         case 3:
            action = new UserUpdateAction();
            break;
         case 4:
            action = new UserAddAction();
            break;
         case 5:
             action = new UserRowAction();
             break;
         case 6:
             System.out.println("프로그램 종료");
             isStop = true;//반복문 종료
             break;

         default:
            
            break;
         } //빠져나와서 if문에 걸림
          if(action != null) { //null이 아니라면 AND 왜 DEADCODE라 뜨는지 알고 갔으면 좋겠다
             userController.processRequset(action, sc);
          }
      } while(!isStop);
   }
}
