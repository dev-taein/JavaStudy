package examp02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2CharStream {

	public static void main(String[] args) {
		String ks = "���Τ̿� �־...";
		String es = "Life is long if .. . ";
		Path fp = Paths.get("String.txt");
		//����
		try(BufferedWriter bw = Files.newBufferedWriter(fp)){ //(BufferedWriter bw = Files.newBufferedWriter(fp))��Ʈ���� �ѹ��� �������
			bw.write(ks, 0, ks.length());
			bw.newLine();
			bw.write(es, 0, es.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//�б�
		try(BufferedReader br = Files.newBufferedReader(fp)){ //BufferedReader br = Files.newBufferedReader(fp) ������ ������
			String str;
			while(true) {
				str = br.readLine();
				if(str ==null)
					break;
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
