public class TeamLeaderDemo {
    public static void main(String[] args) {
        TeamLeader tl1 = new TeamLeader("John Smith","123-A","11-15-2005",1,16.50,500,5.0,2.5);
        TeamLeader tl2 = new TeamLeader("Joan Jones","222-L","12-12-2005",2,18.50,600,7.0,3.5);

        System.out.println("Here's the first production worker.\n"+tl1);
        System.out.println("Here's the second production worker.\n"+tl2);
    }
}
