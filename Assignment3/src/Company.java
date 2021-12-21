import java.util.ArrayList;

public class Company {
    private int sartingYear;
    private String name;
    private ArrayList<Employeea2> employeeList = new ArrayList<>();
    private ArrayList<Manager> managerList = new ArrayList<>();

    public Company(int sartingYear, String name) {
        this.sartingYear = sartingYear;
        this.name = name;
    }


    public void addEmployee(Employeea2 input)
    {
        employeeList.add(input);
    }
    public void addManager(Manager input)
    {
        managerList.add(input);
    }
    public void removeEmployee(Employeea2 input)
    {
        for (int i=0;i<employeeList.size();i++)
        {
            if(employeeList.get(i).equals(input))
            {
                employeeList.remove(i);
                return;
            }
        }
        System.out.println("Not found");
        return;
    }

    public void removeManager(Manager input)
    {
        for (int i=0;i<managerList.size();i++)
        {
            if(managerList.get(i).equals(input))
            {
                managerList.remove(i);
                return;
            }
        }
        System.out.println("Not found");
        return;
    }

    public int getSartingYear() {
        return sartingYear;
    }

    public void setSartingYear(int sartingYear) {
        this.sartingYear = sartingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employeea2> getEmployeeList() {
        return employeeList;
    }


    public ArrayList<Manager> getManagerList() {
        return managerList;
    }

    public int getnumOfman()
    {
        return managerList.size();
    }
    public int getnumofemp()
    {
        return employeeList.size();
    }

    @Override
    public String toString() {
        return "Company Name: "  + this.name+"\n"+
                "Starting Year: " + this.sartingYear+"\n"+
                "Number of Managers: " + this.getnumOfman()+"\n"+
                "Number of Employee: "+this.getnumofemp()+"\n";
    }
}