package Question1_120;
interface Doable {
public void doSomething (String s);
}
//�� : C, E
abstract class Job implements Doable { public void doSomething(Integer i) { } 
}
//���� �߻� Ŭ�����̹Ƿ� �Ϲ� �޼��带 ������ �� �ְ�, Doable�� �޼��带 �������̵� �� �� ����.

class Do implements Doable { public void doSomething(Integer i) { } public void doSomething(String s) { } public void doThat (String s) { } }
//�� Ŭ������ Doable�� �޼��带 ������ �������̵��ؾ��ϰ� �ٸ� �߻�޼���� �������



//A. public class Task implements Doable { public void doSomethingElse(String s) { } }
// �޼��� �̸��� doSomethingElse�� ����

//B. public abstract class Work implements Doable { public abstract void doSomething(String s) { } public void doYourThing(Boolean b) { } }
//�߻� �޼���� ������ ���� �� �����Ƿ� B�� �ùٸ��� �ʽ��ϴ�.

//C. public abstract class Job implements Doable { public void doSomething(Integer i) { } }
//D. public class Action implements Doable { public void doSomething(Integer i) { } public String doThis(Integer j) { } }
//E. public class Do implements Doable { public void doSomething(Integer i) { } public void doSomething(String s) { } public void doThat (String s) { } }





//https://vceguide.com/which-two-class-definitions-compile/
// ������Ʈ�� ��






public class Examp78 {}
