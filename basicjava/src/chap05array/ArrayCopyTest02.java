package chap05array;

public class ArrayCopyTest02 {

	public static void main(String[] args) 
	{
		int[] firstArr	= new int [5];
		for(int i=0; i<firstArr.length; i++)
		{firstArr[i] = 10+i;
		}

		//firstArr를 복사할 배열을 선언
		
		int[] secondArr = new int[firstArr.length*2];
		//				(firstArr 3번부터, secondArr에 2번부터 2까지 다 카피)
		System.arraycopy(firstArr, 3, secondArr, 2, 2);
		for (int i=0; i<secondArr.length; i++)
		{
			System.out.println(secondArr[i]+" ");
		}
		System.out.println();
	}

}
