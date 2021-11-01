package examp03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx03 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\test.txt");
		char[] cArr = new char[4];
		
		//cArr배열에 1번째 인덱스부터 3개를 읽어서 저장해주세요
		int readData = reader.read(cArr, 1, 3);
		System.out.println("읽은 문자 수 : " + readData);
		
		//출력 결과는 0인덱에스는 공백이 출력되며, 1,2,3인덱스에 있는 것만 읽어서 출력함.
		for(int i=0; i<cArr.length; i++) {
			System.out.println(i + " 번째 문자 : " + cArr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		reader.close();
		
	}

}
