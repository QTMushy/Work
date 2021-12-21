public class MyCompany {

        public static void main(String[] args) {


            Persona2 p1 = new Persona2("ryan","reynolds");
            Persona2 p2 = new Persona2("Bob", "West");
            Employeea2 e1 = new Employeea2("Ryan", "Reynolds", "2020", 200000);
            Employeea2 e2 = new Employeea2("Tom", "Cruise");
            Manager m = new Manager("Jeff", "Bezos", "2001", 100000,1222);
            Company c = new Company(1997, "Amazon");


            m.addEmployee(e1);
            m.addEmployee(e2);
            c.addEmployee(e1);
            c.addEmployee(e2);
            c.addManager(m);

            System.out.println(c);


        }
    }

