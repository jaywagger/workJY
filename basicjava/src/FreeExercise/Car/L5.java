package FreeExercise.Car;

public class L5 extends Car implements Temp {
	//�⺻������
	public L5() {
	}public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}
	@Override
	public int getTempGage() {
		int tempGage = 0;
		tempGage = getDistance()/5;
		return tempGage;
	}
	@Override
	public void go(int distance) {
		setDistance(getDistance()+distance);
		setOilSize(getOilSize()-distance/8); //���⼭���� �ٽ�
		
	}
	@Override
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize); 
	}
}

