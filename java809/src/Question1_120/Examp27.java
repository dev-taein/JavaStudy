package Question1_120;
enum USCurrency {
PENNY (1),
NICKLE(5),
DIME (10),
QUARTER(25);
private int value;
USCurrency(int value) {  //private USCurrency(int value) 
this.value = value;
}
public int getValue() {return value;}
}
public class Examp27 {
	public static void main(String[] args) {
		USCurrency usCoin =new USCurrency.DIME;  //USCurrency usCoin = USCurrency.DIME;  
		System.out.println(usCoin.getValue());
		}
		
	}

//Examtopic ����Ʈ�� C�� �´µ� B�� public�� �ƴ� private�� �Ǿ�� �ϴµ� ���� �̻���
//B. Make the USCurrency enumeration constructor public.
//C. Remove the new keyword from the instantion of usCoin.


//�̰� ����
//B.Make the USCurrency enumeration constructor private.  ---- B. USCurrency ���� �����ڸ� private ���� ����ϴ�.
//C.Remove the new keyword from the instantion of usCoin. ---- C. usCoin �ν��Ͻ����� new Ű���带 ����
// 
