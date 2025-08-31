package rec2;

public class Employee {
    protected int id; 
    protected String name;
    protected int age;
    protected Department dept;    
    
    public static int empCount;
    
    public Employee(int id, String name, int age, Department dept) {
        this.id = id; 
        this.name = name;
        this.age = age;
        this.dept = dept;
       
    } 
    
    public Employee(int id, String name, int age) {
        this.id = id; 
        this.name = name;
        this.age = age;       
       
    } 
    
    public void setDepartment(Department dept) {
    	this.dept = dept;    	
    }
    
    public Department getDepartment() {
    	return this.dept;
    }
    
    public void setName (String name) {
    	this.name = name;
    }
    
    public String getName () {
    	return this.name;
    }
    
    public void setAge(int newAge) {
    	//TODO put defense against invalid arguments
    	// ignore invalid arguments: new age cannot be < this.age, newAge > 0    	
    	
    	this.age = newAge;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public Employee (Employee other) {
    	//TODO LATER-- implement a deep copy constructor    	
    } 
    
    public boolean equals(Employee another) {
    	//TODO -- employees are considered equal if their name and id are the same		
		return false;
	}
	
	//static methods for Employee manipulation
    
    //an employee is getting one year older
	public static void birthday(Employee e) {
		// TODO increment age of employee e by 1
				
	}
	
	//two employees are swapped
	public static void swap (Employee best, Employee secondBest) {	
		System.out.println("INSIDE swap() Before swap: best = "+ best + " second best = " + secondBest);
		// TODO swap two employees
		
		System.out.println("INSIDE swap() After swap: best = "+ best + " second best = " + secondBest);
	}
	
    public String toString() {
    	if (dept == null)
    		return "Employee "+ this.name + ", id:" + this.id + ", age: " + this.age;
    	return "Employee "+ this.name + ", id:" + this.id + ", dept: " + this.dept;
    }
}