package rec2;

public class Department {
	// the variables are declared without access modifiers (default access)
	// they can be accessed from the classes in the same package
	// this is done to allow access to immutable fields from the JUnit test 
    protected String name; 			//immutable object
    protected int id; 				//primitive
    protected StringBuilder motto;	//mutable object - danger!
 
    public Department(String name, int id, StringBuilder motto) {
        this.name = name; 
        this.id = id; 
        this.motto = motto;
    }  
    
    public Department(Department other) {
    	//TODO -- implement a deep copy constructor
    	
    }
    
    public void setName (String newName) {
    	this.name = newName;
    }
    
    public String getName() {
    	return this.name;
    }
    
    public StringBuilder getMotto() {
    	return this.motto;
    }
    
    public void setMotto(StringBuilder newMotto) {
    	this.motto = newMotto;
    }
    
    public String toString() {
    	return "Department: " + this.id + " '" + this.name + "' motto:'" + this.motto +"'";
    }
}
