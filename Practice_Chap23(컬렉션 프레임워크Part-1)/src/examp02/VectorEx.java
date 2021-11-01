package examp02;

import java.util.Iterator;
import java.util.Vector;

import javax.swing.border.Border;

public class VectorEx {

	public static void main(String[] args) {
		
		//�뷮�� 5�� ���͸� �����Ѵ�. �������� �Ű����� ���� �ƴ��ϸ�, �⺻������
		//10���� �뷮�� ���� ���Ͱ� �����ȴ�. 
		Vector<Board> vector = new Vector<>(5);
		System.out.println("�뷮 : " + vector.capacity());
		System.out.println("������ : " + vector.size());
		System.out.println("-------------------------------------------------");
		//��ü �߰�
		vector.add(new Board("���� 1", "����1", "�۾���1"));
		vector.add(new Board("���� 2", "����2", "�۾���2"));
		vector.add(new Board("���� 3", "����3", "�۾���3"));
		vector.add(new Board("���� 4", "����4", "�۾���4"));
		vector.add(new Board("���� 5", "����5", "�۾���5"));
		System.out.println("�뷮 : " + vector.capacity());
		System.out.println("������ : " + vector.size());
		System.out.println("-------------------------------------------------");
		//��ü ����
		vector.remove(2);  //�迭����
		vector.remove(3);  //�迭����
		System.out.println("�뷮 : " + vector.capacity());
		System.out.println("������ : " + vector.size());
		System.out.println("-------------------------------------------------");
		//�뷮�� Ȯ��
		vector.ensureCapacity(20); //�迭 ����
		System.out.println("�뷮 : " + vector.capacity());
		System.out.println("������ : " + vector.size());
		System.out.println("-------------------------------------------------");
		//null�� �����Ͽ� size��(�뷮) ����
		vector.setSize(7); //�迭����
		System.out.println("�뷮 : " + vector.capacity());
		System.out.println("������ : " + vector.size());
		System.out.println("-------------------------------------------------");
		//null���� �� �����ϴ� ���
		vector.trimToSize(); //size�� ������ ���� null���� �� ������ �Ѵ�.  //�迭����
		System.out.println("�뷮 : " + vector.capacity());
		System.out.println("������ : " + vector.size());
		System.out.println("-------------------------------------------------");
		//null�����Ϳ��� �����ϱ�
		vector.setSize(3); //�迭 ����
		//���� for���� ����ص� ��
		for(Board board : vector) {
			System.out.println(board.subject + board.content + board.writer);
		}
		System.out.println("-------------------------------------------------");
		//�ݺ��ڷ� ����ϱ�
		Iterator<Board> iterator = vector.iterator();
		while(iterator.hasNext()) { //hasNext()�� �����ð� �ִ��� ����� �� ������ ������ true ������ �Ȱ����� false
			Board board = iterator.next(); //������ �����Ͷ�
			System.out.println(board.subject + board.content + board.writer);
		}
	}

}
