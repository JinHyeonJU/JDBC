import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame() ;
		
		frame.setResizable(false); //GUIâ ũ�� ���� ��������
		frame.setVisible(true); //GUIâ�� ���̰��Ѵ�
		frame.setPreferredSize(new Dimension(840, 840/12*9)); //GUIâ ���� ����
		frame.setSize(840, 840/12*9); //GUIâ ũ�� ����
		frame.setLocationRelativeTo(null); //��𿡼� GUI�� �����ų������, null�ϸ� �߰����� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���α׷� ������ ���� ����
	}
}
