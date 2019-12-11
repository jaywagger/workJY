package workbook;
//Account01의 테스트 클래스
public class Account01Test {

	public static void main(String[] args) {
		Account account  = new Account(); //인스턴스 생성
		account.setAccount("441-0290-1203"); //정보입력
		account.setBalance(500000); //정보입력
		account.setInterateRate(7.3); //정보입력
		
		//getter를 이용하여 정보 출력
		System.out.println("계좌정보: "+account.getAccount() 
		+" 현재잔액: "+account.getBalance());
		
		account.Deposit(20000); //deposit 메소드를 활용하여 2만원 넣으라는 정보를 구현
		System.out.println("계좌정보: "+account.getAccount() 
		+" 현재잔액: "+account.getBalance());
		System.out.println("이자:"+account.CalculateInterest());
		
		
		
	}

}
