package JY;
//워크북 77페이지 7번 문제
public abstract class Car {
	private String name; //이름
	private String engine; //엔진사이즈
	private int oilTank; //오일탱크 사이즈
	private int oilSize; //현재 주유량
	private int distance; // 주행거리
	//기본생성자
	public Car() {
	}public Car(String name, String engine, int oilTank, 
								int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	//주행
	public abstract void go(int distance); 
	//주유
	public abstract void setOil(int oilSize);
	
}
