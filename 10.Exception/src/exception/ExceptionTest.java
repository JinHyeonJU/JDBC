package exception;

/*Exception �� Error(�ذ� ����-��ǻ�ʹٿ�...)
 * 
 * 
 * Exception(����)
 * ������ ���� - �ڵ��� �� ��Ŭ�������� �ٷ� �˷���
 * ��Ÿ�� ���� - ������ �� ��Ÿ���� ���ܻ���
 */
public class ExceptionTest {

	public static void main(String[] args) {
		//������ ����
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(); => �����κ� ���
			System.out.println("�Է°��� Ȯ���� �ּ���");
		}
	}
}
