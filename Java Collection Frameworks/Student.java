public class Student implements Comparable<Student>{ 
    public String name;
    public int age;

    public Student(String name,int age)
    {
        this.name= name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return this.name.equals(((Student)obj).name);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.name.hashCode();
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.name.compareTo(o.name);
    }
    
}
