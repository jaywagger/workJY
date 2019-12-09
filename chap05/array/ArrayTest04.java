package chap05.array;

import java.util.Random;

//배열의 선언, 생선, 및 초기화를 한번에 처리하는 방법
public class ArrayTest04 {

	public static void main(String[] args) 
	{
		//다른 언어와 동일한 방법으로 선언하는 방법
		int[] myarry = {10,20,30,40,50};
		System.out.println("배열 요소의 갯수: "+myarry.length);
				
		for(int i=0; i<myarry.length; i++)
		{
			System.out.println(myarry[i]);
		}
		System.out.println("----------------------------------");
		
		//자바의 문법으로 선언,생성,초기화하는 방법
		int[] myarry2 = new int [] {10,20,30,40,50};
		System.out.println("배열 요소의 갯수 "+myarry2.length);
		
		for(int i=0; i<myarry2.length; i++)
		{
			System.out.println(myarry2[i]);
		}
		System.out.println("----------------------------------");
		//참조형 배열의 선언,생성, 및 초기화를 한꺼번에
		
		String[] strArr = {new String ("java"),new String ("servlet"),new String ("spring")};
		System.out.println("참조형 배열의 갯수: "+strArr.length);
		for(int i=0; i<strArr.length; i++)
		{//참조형 배열이기때문에 객체가 할당된 곳의 주소값이 출력되어야 하나 String은 예외
			System.out.println("배열요소=>"+strArr[i]);
		}
		System.out.println("----------------------------------");
		
		Random[] ranArr = {new Random (),new Random (),new Random ()};
		System.out.println("참조형 배열의 갯수: "+ranArr.length);
		for(int i=0; i<ranArr.length; i++)
		{//참조형 배열이기때문에 객체가 할당된 곳의 주소값이 출력되어야 하나 String은 예외
			System.out.println("배열요소=>"+ranArr[i]);
		}
		//보통은 주소가 나오는게 기본. 하지만 String은 예외
		System.out.println("----------------------------------");
		
		//String 클래스는 기본형처럼 사용할 수 있다. 가장 많이 쓰이는 참조형이므로
		String[] strArr2 = {new String ("java"),new String ("servlet"),new String ("spring")};
		System.out.println("참조형 배열의 갯수: "+strArr2.length);
		for(int i=0; i<strArr2.length; i++)
		{//참조형 배열이기때문에 객체가 할당된 곳의 주소값이 출력되어야 하나 String은 예외
			System.out.println("배열요소=>"+strArr2[i]);
		}
		System.out.println("----------------------------------");
	}

}
