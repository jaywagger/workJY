package chap05.array;

public class ArgsTest {

	public static void main(String[] args) {
		/*
		 * 	args = new String[2]
		 * 	=====================	
		 * 	명령행 매개변수의 갯수만큼 설정
		 * 	args[0] = "100"
		 * 	args[1] = "200"
		 * 	
		 */
		
		System.out.println("명령행 매개변수=>"+args[0]);
		System.out.println("명령행 매개변수=>"+args[1]);
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}

}
