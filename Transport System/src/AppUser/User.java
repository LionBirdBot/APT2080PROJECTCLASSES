package AppUser;

public class User implements Notification {
    private String userId;
    private String name;
    private String email;

    private String phoneNumber;

    private String location;

    private String userPassword;

    private String trip;

    private boolean bookTrip;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }
    public String getTrip() {
        return trip;
    }

    public void setBookTrip(boolean bookTrip) {
        this.bookTrip = bookTrip;
    }

    public boolean isBookTrip() {
        return bookTrip;
    }


    @Override
    public void createNotification() {

    }

    @Override
    public void sendNotification() {

    }

    @Override
    public void deleteNotification() {

    }
}
