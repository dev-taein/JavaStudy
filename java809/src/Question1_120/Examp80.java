package Question1_120;

import java.io.BufferedReader;
import java.io.FileReader;

public class Examp80 {

	public static void main(String[] args) throws Exception {
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader (new FileReader("D:\\employee.txt"))) { // line n1 
			br.lines().forEach(c -> System.out.println(c)); brCopy = br; //line n2
			}
		brCopy.ready();//line n3;  �̹����� try{}�� �ȿ� �־���Ѵ�.
		}
	}

//D. The code prints the content of the employee.txt file and throws an exception at line n3.
//��: D.�� �ڵ�� employee.txt ������ ������ �μ��ϰ� n3 �࿡�� ���ܸ� �߻���ŵ�ϴ�.