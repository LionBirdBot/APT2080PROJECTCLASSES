package AppUser;

public class Driver extends User implements Notification{
    private String vehicleType;

    private String vehicleSize;

   private String vehicleBrand;
   private String vehicleRegistration;

   private String DriversLicence;

   private boolean acceptTrip;
    @Override
    public void setUserId(String userId) {
        super.setUserId(userId);
    }

    @Override
    public String getUserId() {
        return super.getUserId();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setUserPassword(String userPassword) {
        super.setUserPassword(userPassword);
    }

    @Override
    public String getUserPassword() {
        return super.getUserPassword();
    }

    private String setVehicleBrand(){
        return this.vehicleBrand=vehicleBrand;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }
    public String setVehicleReg(){

        return this.vehicleRegistration=vehicleRegistration;
    }

    public String getDriversLicence() {
        return DriversLicence;
    }

    public void setDriversLicence(String driversLicence) {
        DriversLicence = driversLicence;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    @Override
    public String getTrip() {
        return super.getTrip();
    }

    public boolean isAcceptTrip() {
        return acceptTrip;
    }

    public void setVehicleSize(String vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public String getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public void createNotification() {
        super.createNotification();
    }

    @Override
    public void deleteNotification() {
        super.deleteNotification();
    }

    @Override
    public void sendNotification() {
        super.sendNotification();
    }
}

