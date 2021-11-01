package Question1_120;





//https://vceguide.com/which-statement-is-true-112/ ����
final class IceCream {
public void prepare() {}
}
class Cake {  
public final void bake(int min, int temp) {}  //���⼭ final�� ���� �Ǿ
public void mix() {}
}
class Shop {    
private Cake c = new Cake ();
private final double discount = 0.25;
public void makeReady () { c.bake(10, 120); }
}

class Bread extends Cake {      //Cake�� ������� ������ �������̵��ؼ� ����Ҽ��ִ�
public void bake(int minutes, int temperature) {}   // Cake�� ����ϴ� Bread�� bake()�� ����Ҽ� ����.
													//����ҷ��� CakeŬ������ bake()�� final�������Ѵ�.

//�̰� �� //D. A compilation error occurs in Bread
//CakeŬ������ bake�޼���� final�� ����Ǿ ����� �Ұ����մϴ�.



///////////////////////////////////////////////////////////////////////
//https://www.examtopics.com/exams/oracle/1z0-809/view/4/    47������

final class Cream {   // final�� �����
public void prepare() {}
}
class Cake extends Cream {    // final�� ����� Ŭ������ ����� �� ����   //Cake ������ ����
public void bake(int min, int temp) {}  
public void mix() {}
}
class Shop {    
private Cake c = new Cake ();
private final double discount = 0.25;
public void makeReady () { c.bake(10, 120); }
}

class Bread extends Cake {      
public void bake(int minutes, int temperature) {}   

// �� : B. A compilation error occurs in Cake.





