package chap09APILang;
//String 과 Stringbuffer의 성능비교
public class StringStringbufferTest {
	//String의 작업을 체크하는 메서드
	public static void stringCheck(int count) {
		//시작할 때 시간을 측정 -nano초
		long start = System.nanoTime();//10 억분의 1초		
		String str = new String("자바");
		for(int i=0; i<=count;i++) {
			str = str+"java";
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str=str+java");
		System.out.println("걸린시간:" +time);
		System.out.println();
	}
	//Stringbuffer의 작업을 체크하는 메서드
	public static void stringBufferCheck(int count) {
		//시작할 때 시간을 측정 -nano초
		long start = System.nanoTime();//10 억분의 1초		
		StringBuffer sb = new StringBuffer("자바");
		for(int i=0; i<=count;i++) {
			sb.append("java");
		}
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append(\"java\")");
		System.out.println("걸린시간:" +time);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("실행횟수: "+count);
		System.out.println();
		stringCheck(count);
		stringBufferCheck(count);
	}
//질문: 일단 변수가 아닌 참조 변수로 활용하는 이유.
	//String 클래스와 Stringbuffer 클래스를 비교하므로 참조형 변수를 쓴다. 
}
