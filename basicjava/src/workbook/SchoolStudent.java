package workbook;

public class SchoolStudent {
	String name;
	int age;
	int height;
	int weight;


	
		
	//������
	public SchoolStudent(String name, int age, int height, 
												int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public void show() {
			System.out.println(name+"\t"+age+"\t"+height+"\t"+weight);
	}
		
		public double AgeAve() {
			int ageAve = age;
			
			for(int i=0; i<3;i++) { //�迭 �ʱ�ȭ
				studentArray[i].show();
			}
			return ageAve;
		}
		
		public double HeightAverage() {
			int heightAve = height;
			return heightAve;
		}
		public double WeightAve() {
			int weightAve = weight;
			return weightAve;
		
}


		

	
	
	
	
	
	
	
		

