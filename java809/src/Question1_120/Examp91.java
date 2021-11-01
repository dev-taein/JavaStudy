package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import javax.sound.sampled.Line;

//Given the content of the employee.txt file:
//Every worker is a master.
//Given that the employee.txt file is accessible and the file allemp.txt does NOT exist, and the code fragment:
//employee.txt ���Ͽ� �׼��� �� �� �ְ� allemp.txt ������ �������� �ʰ� �ڵ� ������ �����ϴ� ��� 
public class Examp91 {

	public static void main(String[] args) {
		try {
			List<String> content = Files.readAllLines(Paths.get("D:/employee.txt"));
			content.stream().forEach(line ->{
				try {
					Files.write(
							Paths.get("D:/allemp.txt"), 
							line.getBytes(), 
							StandardOpenOption.APPEND);//APPEND�� �ƴ� CREATE�����Ѵ�.
				} catch (IOException e) {System.out.println("Exception 1");}
				});
			}catch (IOException e) {System.out.println("Exception 2");}
		}
	}
				// APPEND �ΰ�� ��----  Exception 1
/*
StandardOpenOption.APPEND ��� StandardOpenOption.CREATE �� ���  -- 
�׷� ���� allemp.txt ������ ����� employee.txt���� �����͸� �����մϴ�.
D. allemp.txt is created and the content of employee.txt is copied to it. �̰� ���� ��
*/