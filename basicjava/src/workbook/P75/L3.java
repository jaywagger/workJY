package workbook.P75;

public class L3 extends Car implements Temp{
	public L3() {
	}
	//생성자
	public L3(String name, String engine, 
				int oilTank, int oilSize, int distance) {
		super(name,engine,oilTank,oilSize,distance);
	}
	public void go(int distance) {
		super.go(distance); //다른 클래스의 메소드는 super로
		setOilSize(getOilSize()-(distance/10));
	}
	@Override //주유량
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
	@Override //엔진온도
	public int getTempGage() {
		int getTempGage = 0;
			getTempGage = getDistance()/10;
		return getTempGage;
	}
	
	

	
}
