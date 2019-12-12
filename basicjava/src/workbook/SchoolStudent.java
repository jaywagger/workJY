package workbook;

public class SchoolStudent {
	private String name; //-의미는 private
	private int age;
	private int height;
	private int weight;

	//기본 생성자
	public SchoolStudent() {
	}
		
	//생성자
	public SchoolStudent(String name, int age, int height, 
												int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//원래는 책에 없는 메소드는 넣으면 안됌.
	public void show() {
			System.out.println(name+"\t"+age+"\t"+height+"\t"+weight);
	}
	
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
		
	
	
	/*	public double AgeAve() {
			int ageAve = age;
			
			for(int i=0; i<3;i++) { //배열 초기화
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
			return weightAve;*/
		
}


		

	
	
	
	
	
	
	
		

