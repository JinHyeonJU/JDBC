package exam;

import java.util.ArrayList;
import java.util.List;

/* �� �����͸� ��� ���� ���ΰ�? �⺻��Ÿ��, Ŭ����(��ü) Ÿ��
 *
 * �⺻�� : int, float, double, char
 * ��ü : Integer, Float, Double, String....
 * 
 * �� �����Ͱ� �������� : �迭, Collection(List, Set), Map
 * 
 * List : ArrayList(�ַ� ����), LinkedList
 * 
 */


public class ArrayListTest1 {
	public static void main(String[] args) {
		//List��ü ���� < > ���� ���׸�Ÿ��
		List<String> list = new ArrayList<String>();
		
		//������ list�� ��� �߰�
		list.add("Java0");
		list.add("JDBC1");
		list.add("oracle2");
		list.add("html3");
		
		//��� Ȯ��
		
		//��ü ��� Ȯ��
		for(String str:list) {
			System.out.println(str);
		}
		
		System.out.println("");
		//Ư�� ��� Ȯ��
		System.out.println(list.get(1));
		
		
	}
}







