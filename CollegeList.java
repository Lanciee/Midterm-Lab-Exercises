import java.util.Scanner;
public class CollegeList{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Press E for Employee, F for Faculty, S for Student: ");
	    String choice = sc.next();
	    if(choice.equalsIgnoreCase("e")){
	    	Employee emp = new Employee();
	    	System.out.println("Type employee's name, contact number, salary, department");
	    	String name = sc.next();
	    	emp.setName(name);
	    	String contact = sc.next();
	    	emp.setContactNum(contact);
	    	double salary = sc.nextDouble();
	    	emp.setSalary(salary);
	    	String department = sc.next();
	    	emp.setDepartment(department);
	    	
	    	System.out.println("-----------------------------");
	    	System.out.println("name: "+ emp.getName());
	    	System.out.println("contact number: "+ emp.getContactNum());
	    	System.out.println("salary: "+ emp.getSalary());
	    	System.out.println("department: "+ emp.getDepartment());
	    }
	    else if(choice.equalsIgnoreCase("f")){	
	    	System.out.println("");
	    }
	    else if(choice.equalsIgnoreCase("s")){
	    	System.out.println("");
	    }
	    else{
	    	System.out.println("Invali input!!!");
	    }
	}
}