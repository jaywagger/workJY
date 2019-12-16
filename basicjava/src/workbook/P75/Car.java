package workbook.P75;
//워크북 77페이지 7번문제
//추상클래스
public abstract class Car {
	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distance;
	//기본생성자
	public Car() {
	}
	//생성자
	public Car(String name, String engine, 
			int oilTank, int oilSize, int distance) {
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	//주행메서드
	public void go(int distance) {
		this.distance += distance;
	}; 
	
	//주유매서드
	public abstract void setOil(int oil) ;
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
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		System.out.println("---------------------------------------------------------------------------");
	}
	
}
