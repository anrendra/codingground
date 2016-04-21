package today21;
//If local variables(formal arguments) and instance variables are different,
//there is no need to use this keyword like in the following program
public class Student {
	int rno;
	String name;
	public Student(int r, String n) {
	rno = r;
    name = n;
	}
    
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
    public static void main(String[] args) {
		Student s=new Student(12,"raja");
		System.out.println(s);
	}


}
