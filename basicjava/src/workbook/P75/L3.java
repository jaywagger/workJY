package workbook.P75;

public class L3 extends Car implements Temp{
	public L3() {
	}
	//������
	public L3(String name, String engine, 
				int oilTank, int oilSize, int distance) {
		super(name,engine,oilTank,oilSize,distance);
	}
	public void go(int distance) {
		super.go(distance); //�ٸ� Ŭ������ �޼ҵ�� super��
		setOilSize(getOilSize()-(distance/10));
	}
	@Override //������
	public void setOil(int oilSize) {
		setOilSize(getOilSize()+oilSize);
	}
	@Override //�����µ�
	public int getTempGage() {
		int getTempGage = 0;
			getTempGage = getDistance()/10;
		return getTempGage;
	}
	
	

	
}
