
public class Circle extends Geometry {
	private int radius; //������
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	public void draw() {
		System.out.printf("������ : (%d, %d, %d)\n", x, y, radius);
	}
}
