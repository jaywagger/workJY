package chap07OOP;
//Workbook page60 Problem No.5
public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	//기본 생성자
	public Mobile() {
	}
	public Mobile(String mobileName,int batterySize,String osType) {
		this.mobileName = mobileName;
		this.osType = osType;
		this.batterySize = batterySize;
	}
	
	//operate: 사용을 통해 배터리 감소 구현
	//1분 사용 시 밧데리 10 감소
	//잔여 배터리 리턴
	public int Operate(int timeUsed) {
		this.batterySize = batterySize-(timeUsed*10);
		return batterySize;
	}
	
	//charge
	public int Charge(int timeCharged) {
		this.batterySize = batterySize+(timeCharged*10);
		return batterySize;
	}
	
	//display method
		public void display1() {
			System.out.println("Mobile"+"\t\t"+"Battery"+"\t\t"+"OS");
			System.out.println("-------------------------------------");
		}
	//display method
	public void display2() {
		System.out.println(getMobileName()+"\t\t"+
				getBatterySize()+"\t\t"+getOsType());
	}
	
	//Setter&Getter
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
	

}
