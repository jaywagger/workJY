package JY;
//��ũ�� 77������ 7�� ����
public abstract class Car {
	private String name; //�̸�
	private String engine; //����������
	private int oilTank; //������ũ ������
	private int oilSize; //���� ������
	private int distance; // ����Ÿ�
	//�⺻������
	public Car() {
	}public Car(String name, String engine, int oilTank, 
								int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		this.oilTank = oilTank;
		this.oilSize = oilSize;
		this.distance = distance;
	}
	//����
	public abstract void go(int distance); 
	//����
	public abstract void setOil(int oilSize);
	
}