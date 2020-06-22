import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1,"Lizzy",500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher carl = new Teacher(3, "Carl", 600);
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(carl);
		
		Student oscar = new Student(1, "Oscar", 5);
		Student weezy = new Student(2, "Weezy", 6);
		Student samantha = new Student(3, "Sammy", 4);
		List<Student> studentList = new ArrayList<>();
		studentList.add(oscar);
		studentList.add(weezy);
		studentList.add(samantha);
		
		School ghs = new School(teacherList, studentList);
		
		Teacher megan = new Teacher(6, "Megan", 900);
		
		ghs.addTeacher(megan);
		
		oscar.payFees(5000);
		weezy.payFees(6000);
		samantha.payFees(7000);
		
		System.out.println("GHS has earned: $ " + ghs.getTotalMoneyEarned());
		System.out.println("------------Making GHS PAY SALARY------------");
		lizzy.recieveSalary(lizzy.getSalary());
		System.out.println("GHS has paid " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned()
		);
		
		mellisa.recieveSalary(mellisa.getSalary());
		System.out.println("GHS has paid " + mellisa.getName() + " and now has $" + ghs.getTotalMoneyEarned());
		
		carl.recieveSalary(carl.getSalary());
		System.out.println("GHS has paid " + carl.getName() + " and now has $" + ghs.getTotalMoneyEarned());
		
		System.out.println(oscar);
		System.out.println(weezy);
		System.out.println(samantha);
		
		System.out.println(carl);
		System.out.println(mellisa);
		System.out.println(lizzy);
		
	}
	
}
