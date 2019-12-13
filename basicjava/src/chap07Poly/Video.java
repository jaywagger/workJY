package chap07Poly;
//������ ����: Videoshop, content, video
public class Video extends Content{
	String genre;
	
	//������: ������    title �� genre �� �Ű������� �޴� ������
	//�߻�Ŭ������ ��ӹ޾ƿ԰�, �� �ȿ� abstract �޼ҵ尡 �����Ƿ�
	//������ ����, �ذ��ϱ� ���� �������̵��Ѵ�.
	public Video() {
		
	}
	public Video(String Title, String genre){
		//Content�� �⺻�����ڸ� ������ ������ ������ ���.
		super(Title);
		this.genre = genre;
	}
	//�������̵��� �ʿ��� �޼ҵ�.
	/*- totalPrice()����  genre �� ���� ���� ������ ���� price ������ ������ �����ϼ���.  
    ��new���� ��� : 2000  
    ��comic���� ��� : 1500 
    ��child���� ��� : 1000*/

	public void totalPrice(){
		if(genre.equals("new")){ 
			setPrice(2000);
		} else if(genre.equals("comic")) {
			setPrice(1500);
		} else if(genre.equals("child")) {
			setPrice(1000);
		} else {
			setPrice(500);
		}
	} 
	
	//Setter&Getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
