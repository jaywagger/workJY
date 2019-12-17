package chap08Exception;
/*API 메소드를 호출하는 경우
 1. API의 메소드를 사용할 떄 선언부에 throws가 추가되어 있는면 반드시
 try~catch로 처리해야 한다.
 2. 메소드가 RuntimeException의  하위 Exception을 throws 하는 경우에는
 	문법적으로 Exception에 대한 처리를 하도록 제한하지 않는다.
 	=> 문법적으로 제한하지 않지만 Exception를 throws하고 있으면 처리 해야한다.
 
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//API의 메소드를 호출하는 경우
public class ExceptionTest05 {
	public static void main(String[] args) {
		//FileInputStream fs = new FileInputStream("test.txt"); 
		//파일을 불러와서 준비하는 클래스. 첮어서 여는 작업
		//파일은 JVM이 아닌 OS 소속.
		//우린 파일에 엑세스에서 읽어보려고 하는 목적
	/*	public FileInputStream(File file)
				throws FileNotFoundException
		
		FileInputStream파일은 오류가 나올 법한 코드이다. 그래서 예외처리를 처리하고 실행해야 한다.
				*/
		try {
			FileInputStream fs = new FileInputStream("test.txt"); //오류처리
			System.out.println(fs.read()); //이것도 오류처리
			System.out.println(Integer.parseInt("1234"));
			System.out.println(Integer.parseInt("문자열"));//문법okay but 
		}/*catch(NumberFormatException e) {
			System.out.println("오류류.");// parseInt 오류처리
		}*/
		catch(FileNotFoundException e){ //이 오류가 IOE보다 앞으로 와야함
			System.out.println("파일을 찾을 수 없습니다.");
			//파일을 다시 선택할 수 있도록 처리
		}catch(IOException e) {
			System.out.println("파일을 읽을 떄 오류가 발생했습니다.");
		}
	
	}

}
