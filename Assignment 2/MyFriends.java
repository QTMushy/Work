

import java.util.ArrayList;

public class MyFriends {

    public static void main(String[] args) {
        Person p1 = new Person("Shubham","Malhotra","6836236489","November",9);
        Person p2 = new Person("Bob","Builder","5575537272","December",2);
        Person p3 = new Person("Ryan","Holding","6836236489","July",9);
        Person p4 = new Person("Shane","long","9796539329","November",7);
        Person p5 = new Person("Bob","Marley","7876325992","November",12);
        Person p6 = new Person("Shane","young","3213425992","November",12);


        FriendList myfriends = new FriendList();
        myfriends.addFriend(p1);
        myfriends.addFriend(p2);
        myfriends.addFriend(p3);
        myfriends.addFriend(p4);
        myfriends.addFriend(p5);
        myfriends.addFriend(p6);


        ArrayList<Person> sorted = myfriends.lastNameSorted();

        for (int i=0;i<sorted.size();i++)
        {
            System.out.println(sorted.get(i).getFullName());
        }

        //Friends with same month sorted by the day
        ArrayList<Person> month = myfriends.sameMonth("November");
        for (int i=0;i<month.size();i++)
        {
            System.out.println(month.get(i).toString());
        }
        System.out.println("---------------------------------------");

        //Copy of friends list
        FriendList copy = myfriends.copy();

        //removing shane from the copy list
        copy.removebyfirstname("shane");

        copy.displayFriends();
        System.out.println("---------------------------------");
        myfriends.displayFriends();
        myfriends.numberofFriends();
        System.out.println("------------------------------------");
        ArrayList<Person> date = myfriends.sameDate(9);
        for (int i=0;i<date.size();i++)
        {
            System.out.println(date.get(i).toString());
        }

        System.out.println("----------------------------------------");
        String cell = "6836236489";
        myfriends.removeFriend(p5);

        System.out.println(myfriends.numberofFriends());
        System.out.println( myfriends.cellNum("Shubham","Malhotra"));
        







    }
}