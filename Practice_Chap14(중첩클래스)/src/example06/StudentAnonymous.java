package example06;

public class StudentAnonymous {
	
	//�ʵ��� �ʱⰪ 
	Student student1 = new Student("ȫ�浿") {
		//�͸� �ڼ� ��ü�� ��� �޼��� --> {}};
		public void goSchool() {
			System.out.println(this.name + "�� ��մϴ�.");
		}
		@Override
		public void wake() {
			System.out.println("------------------------------");
			System.out.println("�ʵ��� �ʱⰪ ���·� ������� �͸��ڼհ�ü");
			System.out.println(this.name + "�� �Ͼ�ϴ�.");
			this.goSchool();
			System.out.println("------------------------------");
		}
	};
	
	//���� ������ �ʱⰪ ����
	public void method1() {
		Student lstudent = new Student("�迬��") {
			public void goSkate() {
				System.out.println(this.name + "�� �����Ϸ� ���ϴ�");
			}
			@Override
			public void wake() {
				System.out.println("------------------------------");
				System.out.println("�ʵ��� �ʱⰪ ���·� ������� �͸��ڼհ�ü");
				System.out.println(this.name + "�� �Ͼ�ϴ�.");
				this.goSkate();
				System.out.println("------------------------------");
			}
		};
		lstudent.wake();
	}
	
	//�޼����� �Ű����� ��
	public void method2(Student student) {
		student.wake();
	}
}
