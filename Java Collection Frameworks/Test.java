import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test{
    public static void main(String[] args) {
    //     LinkedList<Integer> l = new LinkedList<>();

    //     l.add(1230);
    //     l.add(20);
    //     l.add(33320);
    //     l.add(4320);
    //     l.add(52330);
    //     l.add(6320);
    //     l.add(730);
    //     l.add(8220);
    //     l.add(90);

    // List<Integer> s = new Stack<>();
    // s.addAll(l);

    // Stack<Integer> temp = (Stack) s;

    // System.out.println(temp.pop());
    // System.out.println(s+"--------------");

    // Collections.sort(s);
    // System.out.println(s);
//     LinkedList<String> employeeNames = new LinkedList<>();
//  employeeNames.addLast("Dick");
//  employeeNames.addLast("Harry");
//  employeeNames.addLast("Romeo");
//  employeeNames.addLast("Tom");
//  ListUtil.reverse(employeeNames);
//  System.out.println(employeeNames);
//  System.out.println("Expected: [Tom, Romeo, Harry, Dick]");


//  String num = "123455";
//  int[] n = new int[num.length()];

//  try{
//      if(num.length()>5)
//      {
//          throw new Exception("Too big number");
//      }
     
    
//     for(int i =0 ; i<num.length();i++)
//  {
//      n[i] = Character.getNumericValue(num.charAt(i));
//  }


// }
//  catch(Exception e)
//  {
//      System.out.println(e.getMessage());
//  }
// Student s1 = new Student("shubham",19);

// Course c1 = new Course("name","123334");
// Course c2 = new Course("name","123324");
// Course c3 = new Course("name","123444");
// Course c4 = new Course("name","1233234");
// Course c5 = new Course("name","123423");

// Map<Student,Set<Course>> school = new HashMap<>();
// school.put(s1,new HashSet<>());

// school.get(s1).add(c1);
// school.get(s1).add(c5);
// school.get(s1).add(c1);


// ArrayList<Course>temp= school.get(s1);

// for(int i =0;i<temp.size();i++)
// {
//     System.out.println(temp.get(i).toString());
// }
    // System.out.println(Collections.singletonList(school));

//     Polynomial p = new Polynomial(new Term(0,5));
//     p.add(new Term(1, 6));

//     Polynomial p2 = new Polynomial(new Term(0,2));
//     p2.add(new Term(1,7));


//   Polynomial temp = p.multiplication(p2);

// //   temp.simplyfy();

//   System.out.println(temp);

    


//     p.display();



Poly p1 = new Poly(12, 1);
Poly p2 = new Poly(3, 2);
Poly p3 = new Poly(4, 3);
Poly p4 = new Poly(5, 4);


System.out.println(p1.addPoly(p2));





 
    
        
        
    }
}