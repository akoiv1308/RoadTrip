public class RoadTripTester
{
    public static void main(String[] args)
    {
        RoadTrip rt = new RoadTrip();
        rt.addStop("Estonia", 59.4370, 24.7535);
        rt.addStop("New York", 40.7143, -74.0060);
        // rt.addStop("Las Vegas", 36.114647, -115.172813);

        
        System.out.println(rt);
        
        System.out.println("Stops: " + rt.getNumberOfStops());
        System.out.println("Total Miles: " + rt.getTripLength());
    }
}
