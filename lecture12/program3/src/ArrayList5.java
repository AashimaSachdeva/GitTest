import java.util.*;
class ArrayList5{
	public static void main(String args[])
	{
	Student s1=new Student(101,"sonoo",23);
	Student s2=new Student(102,"ravi",21);
	Student s3=new Student(103,"hanumat",25);
	ArrayList<Student> a1=new ArrayList<Student>();
	a1.add(s1);
	a1.add(s2);
	a1.add(s3);
	Iterator itr=a1.iterator();
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.rollno+st.name+st.age);
	}
}
}