public class Aufruf {
    public static void main(String[] args)
    {
        Vehicle myFirstObject = new Vehicle();
        Vehicle.doors = 5;
        Vehicle.ps = 250;
        Vehicle.color = "schwarz wie Jins Seele.";

        System.out.println(Vehicle.doors +" "+ Vehicle.ps +" "+ Vehicle.color);
    }

}