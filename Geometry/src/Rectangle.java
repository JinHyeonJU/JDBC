
public class Rectangle extends Geometry {
	private int width;	//����
	private int height; //����
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.printf("�簢���� : (%d, %d) (%d, %d)\n", x, y, width, height);
	}
}
