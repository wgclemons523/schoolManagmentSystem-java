
public class Teacher {
 private int id;
 private String name;
 private double salary;
 private double salaryEarned;
 
 //creates a new teacher object
 public Teacher(int id, String name, double salary) {
	 this.id = id;
	 this.name = name;
	 this.salary = salary;
	 this.salaryEarned = 0;
 }
 
 public int getID() {
	 return this.id;
 }
 public String getName() {
	 return this.name;
 }
 public double getSalary() {
	 return this.salary;
 }
 public void setSalary(double salary) {
	 this.salary = salary;
 }
 public void recieveSalary(double salary) {
	 salaryEarned += salary;
	 School.updateTotalMoneySpent(salary);
 }
 @Override
	public String toString() {
		return "Teachers name " + name + " Total salary earned so far $" + salaryEarned;
	}
}
