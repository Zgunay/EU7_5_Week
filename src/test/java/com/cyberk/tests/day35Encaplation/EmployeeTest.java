package day35Encaplation;

public class EmployeeTest {

	public static void main(String[] args) {

Employee e1= new Employee();
Employee e2= new Employee("Mark Jones",39119);
Employee e3= new Employee("Tedd",81775,"sales","sales person");
System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getPosition() + "|" + e1.getDepartment());
System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getPosition() + "|" + e2.getDepartment());
System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getPosition() + "|" + e3.getDepartment());

e1.setName("Mike");
e1.setIdNumber(47466);
e1.setDepartment("Account");
e1.setPosition("Vp");
System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getPosition() + "|" + e1.getDepartment());

System.out.println(e2.toString());
		
	}

}
