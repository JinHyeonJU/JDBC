	//���ι� ��ǰ ���Ǹ� ���� �߻� Ŭ����,
	//�پ��� ��ǰ ������ �����Ϸ��� �⺻ ���� ������ ��¸� �߻� Ŭ�������� �����ϰ�
	//�߰� ������ ���� Ŭ�������� Ȯ�屸���ϵ��� ����.

public abstract class Product {
	//��ǰ �̸��� ���� ����
	protected String pname;
	protected int price;
	
	//��ǰ �̸��� ������ ����ϴ� �⺻ ���� ��� �޼ҵ�
public void printDetail() {
	System.out.println("��ǰ��: " + pname + " , ");
	System.out.println("��ǰ���� : " + price + " , ");
	printExtra();
}

public abstract void printExtra();
}
