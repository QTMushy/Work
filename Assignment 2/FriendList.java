

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FriendList {
    private ArrayList<Person> Friends = new ArrayList<>();



    //Add friend
    public void addFriend(Person newPerson)
    {
        this.Friends.add(new Person(newPerson));
    }


    //Remove Friend
    public void removeFriend(Person remove)
    {
        for (int i=0;i<Friends.size();i++)
        {
            if(Friends.get(i).getCellNumber().equals(remove.getCellNumber()))
            {
                Friends.remove(i);
                return;
            }
        }
        System.out.println("Friend Not in List");
        return;
    }
    public void modifyFriendFirstName(Person p1, String name){
        for(int i = 0; i < Friends.size();i++){
            if(p1.getFullName().equals(Friends.get(i).getFullName())){
                Friends.get(i).setFirstName(name);
            }
        }
    }
    public void modifyFriendLastName(Person p1, String name){
        for(int i = 0; i < Friends.size();i++){
            if(p1.getFullName().equals(Friends.get(i).getFullName())){
                Friends.get(i).setLastName(name);
            }
        }
    }
    public void modifyFriendBday(Person p1, String month, int date){
        for(int i = 0; i < Friends.size();i++){
            if(p1.getFullName().equals(Friends.get(i).getFullName())){
                Friends.get(i).setDate(date);
                Friends.get(i).setMonth(month);
                //Set month and
            }
        }
    }
    public void modifyFriendNumber(Person p1, String num){
        for(int i = 0; i < Friends.size();i++){
            if(p1.getFullName().equals(Friends.get(i).getFullName())){
                Friends.get(i).setCellNumber(num);
            }
        }
    }

    //return list of sorted friends by last name
    public ArrayList<Person> lastNameSorted()
    {
        Collections.sort(Friends,new LastNameComparator());
        return Friends;
    }

    //Number of Friends
    public int numberofFriends()
    {
        return Friends.size();
    }

    //List of friends with same month and sorted by date
    public ArrayList<Person> sameMonth(String month)
    {
        ArrayList<Person> temp = new ArrayList<>();
        for (int i=0;i<Friends.size();i++)
        {
            if(Friends.get(i).getMonth().compareToIgnoreCase(month)==0)
            {
                temp.add(Friends.get(i));
            }
        }
        Collections.sort(temp,new DayofBirthComparator());
        return temp;
    }

    //Returning Cell Num from First and last name

    public String cellNum(String firstname,String lastname)
    {
        for (int i=0;i<Friends.size();i++)
        {
            if (firstname.compareToIgnoreCase(Friends.get(i).getFirstName())==0&&lastname.compareToIgnoreCase(Friends.get(i).getLastName())==0)
            {
                return Friends.get(i).getCellNumber();
            }
        }
        return "Sorry Friend not found";
    }

    public FriendList copy()
    {
        FriendList temp = new FriendList();
        for (int i=0;i< Friends.size();i++)
        {
            temp.addFriend(Friends.get(i));
        }
        return temp;
    }
    //Returning list of friends who were born on the same date sorted by their last name
    public ArrayList<Person> sameDate(int date)
    {
        ArrayList<Person> temp = new ArrayList<>();
        for (int i=0;i<Friends.size();i++)
        {
            if (Friends.get(i).getDate()==date)
            {
                temp.add(Friends.get(i));
            }

        }
        Collections.sort(temp,new LastNameComparator());
        return temp;
    }

    public ArrayList<Person> getFriends() {
        return Friends;
    }


    public void displayFriends()
    {
        for (int i=0;i<Friends.size();i++)
        {
            System.out.println(Friends.get(i).toString());
        }
    }

    public void removebyfirstname(String input)
    {
        for(int i=0;i< Friends.size();i++)
        {
            if (Friends.get(i).getFirstName().compareToIgnoreCase(input)==0)
            {
                Friends.remove(i);
            }
        }
        System.out.println("All "+input+" removed");
    }

    public String nameRet(String cell)
    {
        for (int i=0;i<Friends.size();i++)
        {
           if(Friends.get(i).getCellNumber().compareToIgnoreCase(cell)==0)
           {
               return Friends.get(i).getFullName();
           }
        }
        return "Not found";

    }
}
