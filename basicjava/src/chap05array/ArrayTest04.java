package chap05array;

import java.util.Random;

//�迭�� ����, ����, �� �ʱ�ȭ�� �ѹ��� ó���ϴ� ���
public class ArrayTest04 {

	public static void main(String[] args) 
	{
		//�ٸ� ���� ������ ������� �����ϴ� ���
		int[] myarry = {10,20,30,40,50};
		System.out.println("�迭 ����� ����: "+myarry.length);
				
		for(int i=0; i<myarry.length; i++)
		{
			System.out.println(myarry[i]);
		}
		System.out.println("----------------------------------");
		
		//�ڹ��� �������� ����,����,�ʱ�ȭ�ϴ� ���
		int[] myarry2 = new int [] {10,20,30,40,50};
		System.out.println("�迭 ����� ���� "+myarry2.length);
		
		for(int i=0; i<myarry2.length; i++)
		{
			System.out.println(myarry2[i]);
		}
		System.out.println("----------------------------------");
		//������ �迭�� ����,����, �� �ʱ�ȭ�� �Ѳ�����
		
		String[] strArr = {new String ("java"),new String ("servlet"),new String ("spring")};
		System.out.println("������ �迭�� ����: "+strArr.length);
		for(int i=0; i<strArr.length; i++)
		{//������ �迭�̱⶧���� ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� �ϳ� String�� ����
			System.out.println("�迭���=>"+strArr[i]);
		}
		System.out.println("----------------------------------");
		
		Random[] ranArr = {new Random (),new Random (),new Random ()};
		System.out.println("������ �迭�� ����: "+ranArr.length);
		for(int i=0; i<ranArr.length; i++)
		{//������ �迭�̱⶧���� ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� �ϳ� String�� ����
			System.out.println("�迭���=>"+ranArr[i]);
		}
		//������ �ּҰ� �����°� �⺻. ������ String�� ����
		System.out.println("----------------------------------");
		
		//String Ŭ������ �⺻��ó�� ����� �� �ִ�. ���� ���� ���̴� �������̹Ƿ�
		String[] strArr2 = {new String ("java"),new String ("servlet"),new String ("spring")};
		System.out.println("������ �迭�� ����: "+strArr2.length);
		for(int i=0; i<strArr2.length; i++)
		{//������ �迭�̱⶧���� ��ü�� �Ҵ�� ���� �ּҰ��� ��µǾ�� �ϳ� String�� ����
			System.out.println("�迭���=>"+strArr2[i]);
		}
		System.out.println("----------------------------------");
	}

}
