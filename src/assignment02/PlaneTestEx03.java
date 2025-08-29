package assignment02;

class Plane {
	//필드 선언
	private String productor;
	private String model;
	private int maxPassanger;
	private static int planes;
	
	//접근자와  설정자 정의
	public String getProductor() {
		return productor;
	}
	public void setProductor(String productor) {
		this.productor = productor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxPassanger() {
		return maxPassanger;
	}
	public void setMaxPassanger(int maxPassanger) {
		this.maxPassanger = maxPassanger;
	}
	
	//생성자 정의
	//public Plane() {}
	public Plane(String productor, String model, int maxPassanger) {
		super();
		this.productor = productor;
		this.model = model;
		this.maxPassanger = maxPassanger;
	}
	public Plane() {
		planes++;
	}
	
	//정적 메소드 getPlane() 정의
	static void getPlanes() {
		System.out.println(planes);
	}
	
	
	
}

public class PlaneTestEx03 {

	public static void main(String[] args) {
		Plane p1 = new Plane();
		Plane p2 = new Plane();
		
		p1.setProductor("Airbus");
		p1.setModel("A380");
		p1.setMaxPassanger(500);
		System.out.println(p1.getProductor() + "\t" + p1.getModel() + "\t" + p1.getMaxPassanger());
		
		p2.setProductor("Flysky");
		p2.setModel("G7A");
		p2.setMaxPassanger(700);
		System.out.println(p2.getProductor() + "\t" + p2.getModel() + "\t" + p2.getMaxPassanger());
		
		p1.getPlanes();
	}

}
