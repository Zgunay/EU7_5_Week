package day15;
public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name +"working hard");
	}
	
	public void attendMeeting() {
		System.out.println(name +"is attanding a meeting" );
	}

	public void introduce() {
		
		System.out.println("Name" +name+ "Job Title" + jobTitle + "Salary:" + salary);
	}

}