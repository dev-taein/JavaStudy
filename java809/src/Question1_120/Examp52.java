package Question1_120;




//�̱��� ����
class ExampleClass {
    //Instance
    private static ExampleClass instance = new ExampleClass();

    //private construct
    private ExampleClass() {}

    public static ExampleClass getInstance() {
        return instance;
    }
}
public class Examp52 {public static void main(String[] args) {}}
/*
�̱� �� ������ ������ ����Ͽ� �̱� �� Ŭ������ �ۼ��Ϸ����մϴ�.
�������� ���� Ư���� �����ϴ� �� ������ �����Դϱ�? (2 �� ����)
You want to create a singleton class by using the Singleton design pattern.
Which two statements enforce the singleton nature of the design? (Choose two.)

A. Make the class static.
B. Make the constructor private.
C. Override equals() and hashCode() methods of the java.lang.Object class.
D. Use a public reference to point to the single instance.
E. Implement the Serializable interface.
F. Make the single instance created static and final.
 
A. Ŭ������ �������� ����ϴ�.
B. �����ڸ� ������� ����ϴ�.
C. java.lang.Object Ŭ������ equals () �� hashCode () �޼��带 �������մϴ�.
D. ���� ������ ����Ͽ� ���� �ν��Ͻ��� ���� ŵ�ϴ�.
E. Serializable �������̽��� �����մϴ�.
F. ���� �� ���� �ν��Ͻ��� �����̰� ���������� ����ϴ�.

�� : B, F

*/



