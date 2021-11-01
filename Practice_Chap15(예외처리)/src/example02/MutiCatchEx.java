package example02;

import java.util.Arrays;

public class MutiCatchEx {

	public static void main(String[] args) {
		//���� Catch
		try {
			
			int[] arr = new int[3];
			System.out.println(Arrays.toString(arr));
//			arr[3] = 100; //���� �߻�-���� �����ϴϱ�  -> arr[0], 1, 2 ���� ���� ���� -ArrayIndexOutOfBoundsException
			//������ ���ܰ� �߻��ϸ� �Ʒ��� �����ϵ��� �ʴ´�.!
			int result = 10/0; //���� �߻�-Arithmetic
			System.out.println(result);
			
			//Catch�������� �׻� ExceptionŬ������ �� �������� �;� �Ѵ�.!!
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� �ʰ��Ͽ����ϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}  catch (Exception e) { //�ְ� ����Ŭ���� Exception�� ���� ���� �� ���� - ������ �Ʒ��� �־����!
			System.out.println("���� �߻�");
		} finally {
			System.out.println("����");
		}

	}

}
