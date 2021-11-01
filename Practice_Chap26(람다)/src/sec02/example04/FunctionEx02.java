package sec02.example04;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class FunctionEx02 {
	
	public static ArrayList<Student2> arrayList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		
		arrayList.add(new Student2("ȫ�浿", "�뱸", 100, 80));
		arrayList.add(new Student2("������", "����", 90, 88));
		arrayList.add(new Student2("�迬��", "����", 77, 100));
		
		
		
		//���ٽ��� �Ű����� t�� Student2�� ����Ų��.
		ToIntFunction<Student2> toIntFunction = t -> {return t.getEngscore();};
		average(toIntFunction, "����");
		
		System.out.println("----------------------------------");
		
		//return�� ���������ϰ� return�� �����ϸ� {}�� ������ �����ϴ�.
		ToIntFunction<Student2> toIntFunction2 = t -> t.getMatscore();
		average(toIntFunction2, "����");
		
		
		
	}
	
	
	//Student2��ü�� �޾Ƽ� Int��ü�� �����.
	public static void average(ToIntFunction<Student2> function, String str) {
		int sum = 0;
		double avg = 0.0;
		
		for(Student2 student2 : arrayList) {
			int score = function.applyAsInt(student2);
			sum+=score;
		}
		avg = (double) sum / arrayList.size();
		System.out.println(str + "���� ��� : " + avg);
	}
	

}
