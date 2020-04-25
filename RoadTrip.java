import java.util.ArrayList;

public class RoadTrip
{
    private ArrayList<GeoLocation> locations;
    
    RoadTrip() {
        locations = new ArrayList<GeoLocation>();
    }
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude) {
        GeoLocation newLocation = new GeoLocation(name, latitude, longitude);
        locations.add(newLocation);
        
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops() {
        return this.locations.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength() {
        double length = 0;
        for(int i = 0; i < getNumberOfStops() - 1; i++) {
            length += locations.get(i).distanceFrom(locations.get(i+1));
            
        }
        return length;
    }
    
    // Return a formatted toString of the trip
    public String toString() {
       String trip = "";
       for(int i = 0; i < this.locations.size(); i++) {
           trip += i+1 + ". " + this.locations.get(i).toString()+"\n";
       }
       return trip;
    }
}
