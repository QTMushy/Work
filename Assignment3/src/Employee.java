public class Employee {
    protected String name;
    protected String empNumber;
    protected String hireDate;


    public Employee(String name, String empNumber, String hireDate) {
        this.name = name;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }

    public Employee(Employee emp)
    {
        this.name=emp.name;
        this.empNumber=emp.empNumber;
        this.hireDate=emp.hireDate;
    }

    public Employee() {
        this.empNumber="";
        this.name="";
        this.hireDate="";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        if(Character.isDigit(empNumber.charAt(0))&&Character.isDigit(empNumber.charAt(1))&&Character.isDigit(empNumber.charAt(2))&&empNumber.charAt(3)=='-'&&(empNumber.charAt(4)>='A'&&empNumber.charAt(4)<='M'))
        {
            this.empNumber=empNumber;
        }
        else
        {
            System.out.println("Invalid Employee Number");
            this.empNumber="";
        }
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object obj) {
        Employee ob = (Employee) obj;
        if (this.name.compareToIgnoreCase(ob.name)==0)
        {
            if(this.empNumber.compareToIgnoreCase(ob.empNumber)==0)
            {
                if (this.hireDate.compareToIgnoreCase(ob.hireDate)==0)
                {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\n"+
                "Employee Number: "+this.empNumber+"\n"+
                "Hire Date: "+this.hireDate+"\n";
    }
}
