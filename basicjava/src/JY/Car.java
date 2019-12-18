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
	//Setter&Getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getOilTank() {
		return oilTank;
	}
	public void setOilTank(int oilTank) {
		this.oilTank = oilTank;
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	//프린트 메서드
	public static void show() {
		System.out.println("vehicleName" + "\t" + "engineSize" + "\t" + "oilTank" + "\t" + "\t" + "oilSize" + "\t"
				+ "\t" + "distance" + "\t" + "temperature");
		System.out.println(
				"---------------------------------------------" + "----------------------------------------------");
	}
	
}
