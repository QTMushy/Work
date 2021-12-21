import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iter {
	public static void main(String[] args) {
		
		HashMap<Student,LinkedList<Course>> list  = new HashMap<>();

		Student s1 = new Student("S1",1);
		Student s2 = new Student("S2",2);
		Student s3 = new Student("S3",3);

		Course c1 = new Course("C1","12313");
		Course c2 = new Course("C2","12312");
		Course c3 = new Course("C3","12311");


		addCourse(list, c1, s1);
		addCourse(list, c2, s1);
		addCourse(list, c3, s1);


		System.out.println(Collections.singletonList(list));





	}

	public static void addCourse(HashMap<Student,LinkedList<Course>> list,Course c,Student t)
	{
		if(list.containsKey(t))
		{
			list.get(t).add(c);
		}
		else
		{
			list.put(t, new LinkedList<>());
			list.get(t).add(c);
		}
	}
	
}
