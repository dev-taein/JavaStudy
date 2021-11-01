package Question121_150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Block {
	String color;
	int size;
	public Block(int size,String color) {
		this.color = color;
		this.size = size;
	}
	@Override
	public String toString() {
		return this.size + " : " + this.color;
	}
	
}
//Which definition of the ColorSorter class sorts the blocks list?
//ColorSorter Ŭ������ � ���ǰ� ��� ����� �����մϱ�?
//����
class ColorSorter implements Comparator<Block>{
	public int compare(Block o1, Block o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);  // public int compareTo(String anotherString)
	}
}


//Comparator�� public int compare(�Ű������� 2��)  -- Comparable�� public int compareTo(�Ű������� 1��)

//���� ������ Ŭ����(Comparable �������̽��� ������ Ŭ����)���� �⺻ ���� ���ذ� �ٸ��� ���� �ϰ� ���� �� ����ϴ� �������̽�
//package: java.util.Comparator
//�ַ� �͸� Ŭ������ ���ȴ�.
//�⺻���� ���� ����� �������� ������ ������������ ������ �� ���� ����Ѵ�.

public class Examp142 {

	public static void main(String[] args) {
		List<Block> blocks = new ArrayList<>();
		blocks.add(new Block(10, "Green"));
		blocks.add(new Block(7, "Red"));
		blocks.add(new Block(12, "Blue"));
		Collections.sort(blocks, new ColorSorter());
		System.out.println(blocks);
	}

}
