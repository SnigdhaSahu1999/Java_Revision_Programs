import java.util.*;
class Student implements Comparable<Student>{ //To add user-defined objects in TreeSet, we need to implement the Comparable interface. 
    int roll;
    String name;
    int marks;
    Student(int roll,String name,int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student s){  // implementing the abstract method  of Comparable interface.
        if(marks < s.marks)
            return -1;
        else if(marks > s.marks)
            return 1;
        else
            return 0;
    }
}
public class TreeSetExample
{
	public static void main(String[] args) {
	    Student s1 = new Student(23,"Amit",90);
	    Student s2 = new Student(2,"Sohail",91);
	    Student s3 = new Student(21,"Vineet",11);
	    
	    Set<Student> ts = new TreeSet<Student>();
	    ts.add(s1);
	    ts.add(s2);
	    ts.add(s3);
	    for(Student s : ts)
		System.out.println(s.roll+" "+s.name+" "+s.marks);
	}
}
