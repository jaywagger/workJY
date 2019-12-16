package workbook.P75;
//��ũ�� 77������ 7������
//�߻�Ŭ����
public abstract class Car {
	private String name;
	private String engine;
	private int oilTank;
	private int oilSize;
	private int distance;
	//�⺻������
	public Car() {
	}
	//������
	public Car(String name, String engine, 
			int oilTank, int oilSize, int distance) {
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	//����޼���
	public void go(int distance) {
		this.distance += distance;
	}; 
	
	//�����ż���
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
	//����Ʈ �޼���
	public static void show() {
		System.out.println("vehicleName\tengineSize\toilTank\toilSize\tdistance\ttemperature");
		System.out.println("---------------------------------------------------------------------------");
	}
	
}
