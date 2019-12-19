package FreeExercise.Car;
//况农合 77其捞瘤 7锅 巩力
public class L3 extends Car implements Temp{
	//扁夯积己磊
	public L3() {
	}
	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		int tempGage = 0;
		tempGage = getDistance()/10;
		return tempGage;
	}
	@Override
	public void go(int distance) {
		setDistance(getDistance()+distance);
		setOilSize(getOilSize()-distance/10);
	}
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize); 
	}
}
