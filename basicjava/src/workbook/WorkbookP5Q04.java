package workbook;
// ��ũ�� 5������ 4�� ����
// ������ ���� ch�� ������ (�빮�� �Ǵ� �ҹ���)�� ���� ���� b�� ���� true�� �ǵ���
// ���α׷��� �ϼ� �Ͻÿ�.
public class WorkbookP5Q04 {
	public static void main(String[] args) {
		char ch = 'z';
		if (ch =='z' || ch=='Z')
		{boolean b = true;
		System.out.println(b);}
		System.out.println("=============================");
		boolean b = ('a'<=ch&&ch<='z' || 'A'<=ch&&ch<='Z');
		System.out.println(b);
	}

}
