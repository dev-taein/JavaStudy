package sec02.example04;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class PopulationEx {

	public static ArrayList<Population> populations = new ArrayList<Population>();
			
			
			
	public static void main(String[] args) {
		//Population��ü �߰�
		populations.add(new Population("���� ������", 156800));
		populations.add(new Population("���� ������", 10800));
		populations.add(new Population("���� ���α�", 78800));
		populations.add(new Population("���� ��������", 126800));
		
		
		
		
		Function<Population, String> function = t -> t.getRegion();
		regionPrint(function);
		
		System.out.println("-----------------------------------------");
		
		
		ToDoubleFunction<Population> toDoubleFunction = t -> t.getPopulation();
		avgPrint(toDoubleFunction);
	}

	//������ ����ϴ� �޼���
	public static void regionPrint(Function<Population, String>function) {
		for(Population population: populations) {
			String region = function.apply(population);
			System.out.println("���� : " + region + "\t");
		}
		
	}
		public static void avgPrint(ToDoubleFunction<Population> toDoubleFunction) {
			double sum = 0.0;
			for(Population population: populations) {
				double value = toDoubleFunction.applyAsDouble(population);
				System.out.println("�α� �� : " + value + "\t");
				sum+=value;
			}	
			System.out.println();
			System.out.println("���� ��� �α��� : " + (sum/populations.size()));
	}
	
}
