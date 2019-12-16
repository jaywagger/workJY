package workbook.P75;

public class L5 extends Car implements Temp {
	// 奄沙持失切
	public L5() {
	}
	// 持失切
	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	public void go(int distance) {
		super.go(distance);
		setOilSize(getOilSize() - (distance / 8));
	}
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize() + oilSize);
	}
	@Override
	public int getTempGage() {
		int getTempGage = 0;
		getTempGage = getDistance() / 5;
		return getTempGage;
	}
}
