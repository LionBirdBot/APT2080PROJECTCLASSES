package TripData;



public class Trip {
    private String tripId;

    private String tripDriver;

    private String tripClient;

    private String tripFare;

    private String tripDuration;

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripClient(String tripClient) {
        this.tripClient = tripClient;
    }

    public String getTripClient() {
        return tripClient;
    }

    public void setTripDriver(String tripDriver) {
        this.tripDriver = tripDriver;
    }

    public String getTripDriver() {
        return tripDriver;
    }

    public void setTripFare(String tripFare) {
        this.tripFare = tripFare;
    }

    public String getTripFare() {
        return tripFare;
    }

    public void setTripDuration(String tripDuration) {
        this.tripDuration = tripDuration;
    }

    public String getTripDuration() {
        return tripDuration;
    }
}



