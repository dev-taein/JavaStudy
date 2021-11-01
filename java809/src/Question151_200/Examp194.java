package Question151_200;

import java.util.Optional;

class Employee {
Optional<Address> address;
Employee (Optional<Address> address) {
this.address = address;
}
public Optional<Address> getAddress() { return address; }
}
class Address {
String city = "New York";  //�̰��� null�̸� null�� �����
public String getCity() { return city; }
public String toString() {
return city;
}
}

public class Examp194 {

	public static void main(String[] args) {
		Address address = new Address();
//		Address address = null; ---------null�Ͻ� ���� "City Not available"
		Optional<Address> addrs1 = Optional.ofNullable (address);
		Employee e1 = new Employee (addrs1);
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		System.out.println(eAddress);
		//�� : New York
		
		//30�� ����

//		A. New York  -->Address address = new Address();�̰� String city = "New York";�ϋ�
//		B. City Not available   -->Address address = null; �϶�
//		String city = null; �϶��� �� : C. null
//		D. A NoSuchElementException is thrown at run time.
		
		
		//https://www.briefmenow.org/oracle/what-is-the-result-945/  ����
		//ofNullable = null���� �����
				//of = null ��� ����
	}

}
