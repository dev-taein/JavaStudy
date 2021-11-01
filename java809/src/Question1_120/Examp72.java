package Question1_120;

public class Examp72 {
	public static void main(String[] args) {
		int rateOfInterest = 0;
		String accountType = "LOAN";
		switch (accountType) {
		case "RD":
		rateOfInterest = 5;
		break;
		case "FD":
		rateOfInterest = 10;
		break;
		default:
		assert false: "No interest for this account"; //line n1
		}
		System.out.println ("Rate of interest:" + rateOfInterest);
//		and the command:
//		java -ea RateOfInterest
//		What is the result?
	}
}
//B. An AssertionError is thrown.



/*
-ea �ɼ��� ���� �ʰ� �������� ��� A. Rate of interest: 0

-ea �ɼ��� �־��� ��� An AssertionError is thrown.


Java�� assertion ���� �Ϲ������� �޼����� �Ű� ���� ������ ���޵Ǿ����� Ȯ���ϱ� ���� private �޼��� ������ ���˴ϴ�. 
assertion�� assertion ���� false�̸� AssertionError�� �߻��մϴ�.


*/