package chap05array;

import java.util.Random;
import java.util.Scanner;

import APIUtil.ScanerTest;

//������������ �迭 �����
public class ArrayTest02 {
	public static void main(String[] args) 
	{
		//1. �迭�� ����
		String[] strArr = new String[3];
		Random[] ranArr = new Random[5];
		Scanner[] keyArr = new Scanner[100];
		
		System.out.println(strArr[0]);
		System.out.println(ranArr[0]);
		System.out.println(keyArr[0]);
		//�� ��� �ʱⰪ�� null�̴�. ������ ���� �ƹ��͵� �����ϰ� ���� �ʱ� ������.
		System.out.println("------------------");
		
		//������ �迭�� ����� ������ ��ȭ
		String[] arr = new String[3];
		arr[0] = new String("Java");// �ڹٶ�� �����Ͱ� �� ��ġ�� ����Ǿ� ����
		arr[1] = new String("JDBC");
		arr[2] = new String("HTML5");
		System.out.println(arr[0]);
		
		//ranArr�� �ʱ�ȭ �۾�
		ranArr[0] = new Random(); //ctrl+alt+������Ű����
		ranArr[1] = new Random(); //�����
				
		for(int i=0; i<ranArr.length; i++)
		{
			System.out.println(ranArr[i]);
		}
		
		
		/*for(int e : ranArr)
		{
			System.out.println();
		}*/
		
		
	}
}