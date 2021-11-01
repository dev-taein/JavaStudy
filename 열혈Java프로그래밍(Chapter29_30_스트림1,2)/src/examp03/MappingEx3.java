package examp03;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ReportCard{
	private int kor; //����
	private int eng; //����
	private int math;//����
	public ReportCard(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
}
public class MappingEx3 {

	public static void main(String[] args) {
//		�߰����� 
//		����(Mapping) ����3:
		
		ReportCard[] cards = {
				new ReportCard(70, 80, 90),
				new ReportCard(90, 80, 70),
				new ReportCard(80, 90, 80)
		};
		
		//ReportCard�ν��Ͻ��� �̷��� ��Ʈ�� ����
		Stream<ReportCard> sr = Arrays.stream(cards);
		//���⼱ ������ 3���� ��Ʈ���� �����Ǹ�, 3���� ReportCard1, ReportCard2, ReportCard3 �̷��� �� 3���� ��Ÿ����
		//������ ReportCard�� ������ 3����(��,��,��) ������ �ȴ�. 1:3
		
		
		//�л����� ���� ������ �̷��� ��Ʈ�� ����
		IntStream si = sr.flatMapToInt(
				r-> IntStream.of(r.getKor(), r.getEng(), r.getMath()));
		//r�� ReportCard1,2,3�� ������ �ν��Ͻ��� ����Ű��, 
		//������ ReportCard1,2,3�� ���� ����, ��������, ���������� �̷���� ��Ʈ���� ���ٽ��� �ۼ��ߴ�.
		
		//����� ���ϱ� ���� ���� ���� average ����
		double avg = si.average().getAsDouble();
		System.out.println("avg : " + avg);

//		OptionalDouble average()�� �������̽� IntStream, LongStream, DoubleStream�� �����ϴ� �޼ҵ�
		
	}

}
