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
         System.out.println("=====����� �޴�======");
          System.out.println("1. ��ü��ȸ");
          System.out.println("2. ����");
          System.out.println("3. ����");
          System.out.println("4. ����");
          System.out.println("5. ������ȸ");
          System.out.println("6. ���α׷� ����");
          System.out.println("===================");
          
          System.out.print("��ȣ �Է� : ");          
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
             System.out.println("���α׷� ����");
             isStop = true;//�ݺ��� ����
             break;

         default:
            
            break;
         } //�������ͼ� if���� �ɸ�
          if(action != null) { //null�� �ƴ϶�� AND �� DEADCODE�� �ߴ��� �˰� ������ ���ڴ�
             userController.processRequset(action, sc);
          }
      } while(!isStop);
   }
}
