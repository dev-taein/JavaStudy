package Question201_248;
class FuelNotAvailException extends Exception { }
class Vehiclee {
void ride() throws FuelNotAvailException { //line n1
System.out.println("Happy Journey!");
}
}
class SolarVehicle extends Vehiclee {
public void ride() throws Exception { //line n2
super.ride ();
}
}
public class Examp240 {

	public static void main(String[] args)throws FuelNotAvailException, Exception {
		Vehiclee v = new SolarVehicle();
		v.ride();
		
//		Happy Journey!? 
	}

}
//https://www.briefmenow.org/oracle/which-modification-enables-the-code-fragment-to-print-h/

//�� : A. Replace line n1 with protected void ride() throws Exception {

//A. Replace line n1 with protected void ride() throws Exception { // ����
//B. Replace line n2 with void ride() throws Exception { // �Ұ���
//C. Replace line n2 with private void ride() throws FuelNotAvailException { // �Ұ���
//D. Replace line n1 with public void ride() throws FuelNotAvailException { // �Ұ���