package example07;

import java.util.Vector;

public class BoardEx {

	public static void main(String[] args) {

		Vector vector = new Vector();
		System.out.println("����� ��ü �� : " + vector.size()); //vector�� size�� ����� ��ü ��
		System.out.println("�뷮 : " + vector.capacity()); //�⺻������ ������ �� �ִ� ������ 10����
		
		//�迭�� p[0] = new �ڼ��̳� �θ�Ŭ���� �̷��� �ؼ� �ߴٸ�
		//���ʹ� .add()�� ����Ѵ�.
		vector.add(new Board("����1", "����1", "�ۼ���1")); //0��° �ε���
		vector.add(new Board("����2", "����1", "�ۼ���1"));
		vector.add(new Board("����3", "����1", "�ۼ���1"));
		vector.add(new Board("����4", "����1", "�ۼ���1"));
		vector.add(new Board("����5", "����1", "�ۼ���1"));
		vector.add(new Board("����6", "����1", "�ۼ���1"));
		vector.add(new Board("����7", "����1", "�ۼ���1"));
		vector.add(new Board("����8", "����1", "�ۼ���1"));
		vector.add(new Board("����9", "����1", "�ۼ���1"));
		vector.add(new Board("����10", "����1", "�ۼ���1"));
		vector.add(new Board("����11", "����1", "�ۼ���1")); //10��° �ε���
		
		
		System.out.println("����� ��ü �� : " + vector.size()); 
		System.out.println("�뷮 : " + vector.capacity()); 
		
		vector.remove(2);  
		vector.remove(5);  
		vector.remove(8);  
		System.out.println("����� ��ü �� : " + vector.size()); 
		System.out.println("�뷮 : " + vector.capacity()); 
		
		System.out.println("-------------------------------------------------");
		
		
		for(int i=0; i<vector.size();i++) {
			if(vector.get(i) instanceof Board) { //vector.get(i) = ObjectŸ���̱� ������ BoardŬ������ ����Ŭ�����̹Ƿ� true�̴�
			Board board = (Board)vector.get(i);
			board.show();
			}

		}
	}

}
