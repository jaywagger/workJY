package chap02.variable;
//������ ���� �����ϴ� ����
//Sout�� Ȱ���Ͽ� printf�� �����ִ� ����
public class VarEx1 {

	public static void main(String[] args) 
	{
		int year = 2019; 
		int age = 26;
		
		System.out.println(year);
		System.out.println(age);
		System.out.println("You are "+age+" years old in "+year);
		
		year = year+1; //�ʱⰪ���� 1�� �÷��ش�.
		age += 1; // age = age+1; ���� ��
		
		System.out.println("You will be "+age+" years old in "+year);
			
		
		
	}

}
