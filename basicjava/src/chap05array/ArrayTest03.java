package chap05array;
//�迭 �������ϱ�
import java.util.Random;
import java.util.Scanner;

import APIUtil.ScanerTest;

public class ArrayTest03 {
	public static void main(String[] args) 
	{
		int[] myarr = new int[5];
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
		// int �ʱⰪ ��� 0
		// �迭�� ��ġ�� 1�� �����ϹǷ�, for���� �������� �ִ�.
		//�迭�� ����� ũ��� ����غ���
		System.out.println("�迭�� ����ǰ���:"+myarr.length);
		//length�� �迭�� ����� �����ش�.
		System.out.println("--------------------");
		
		for(int i=0; i<myarr.length;i++) 
			//�迭�� ��Ҹ�ŭ�� ������. 5��. �迭 ũ�Կ� ���ƾ� �Ѵ�.
			//�׷��� ������ �� �ִ�.
		{
			System.out.println(myarr[i]);
		}
				
	}
}
