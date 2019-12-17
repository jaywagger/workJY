package chap09APILang;

public class Person {
		String name;
		int age;
		String addr;
		//기본생성자
		public Person() {
		}
		public Person(String name, int age, String addr) {
			super();
			this.name = name;
			this.age = age;
			this.addr = addr;
		}
		/*//오버라이딩
		public String toString() {
			return this.name+","+this.age+","+this.addr;
		}*/
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
		}//개발자가 작성하는 모든 클래스에서 오버라이딩해야 한다. print하면 객체의 주소가 아닌 위와 같은 주소가 나온다.
		
		//Setter&Getter
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		
}


