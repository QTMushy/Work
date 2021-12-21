public class ShipDemo {

    public static void main(String[] args) {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Lolipop","1960");
        ships[1] = new CruiseShip("Disney Magic","1960",2400);
        ships[2] = new CargoShip("Black Pearl","1999",50000);

        for(int i =0;i< ships.length;i++)
        {
            System.out.println(ships[i]);
            System.out.println("--------------------------------");
        }

    }
}
