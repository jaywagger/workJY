package chap05array;

public class ArrayCopyTest02 {

	public static void main(String[] args) 
	{
		int[] firstArr	= new int [5];
		for(int i=0; i<firstArr.length; i++)
		{firstArr[i] = 10+i;
		}

		//firstArr�� ������ �迭�� ����
		
		int[] secondArr = new int[firstArr.length*2];
		//				(firstArr 3������, secondArr�� 2������ 2���� �� ī��)
		System.arraycopy(firstArr, 3, secondArr, 2, 2);
		for (int i=0; i<secondArr.length; i++)
		{
			System.out.println(secondArr[i]+" ");
		}
		System.out.println();
	}

}