package chap07OOP;

public class Otab extends Mobile{

	public Otab() {
	}
	public Otab(String mobileName,int batterySize,String osType) {
		super(mobileName,batterySize,osType);
	}
	public int Operate(int timeUsed) {
		setBatterySize(getBatterySize()-(timeUsed*12));
		return getBatterySize();
	}
	
	//charge
	public int Charge(int timeCharged) {
		setBatterySize(getBatterySize()+(timeCharged*8));
		return getBatterySize();
	}
	
	
}