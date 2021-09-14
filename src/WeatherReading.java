import java.util.Date;

public class WeatherReading {
//    ================================= WARM UP
//
//    Create a class called, WeatherReading, with the following members:
//
//    private instance variables:
//
//    double latitude
//    double longitude
//    Date (from java.util.Date) recordedAt
//    double tempInCelsius
    private double latitude;
    private double longitude;
    private Date recordedAt;
    private double tempInCelsius;
//
//    public static method:
//
    public static double kelvinToCelsius(double k){
        return k - 273.15;
    }
//    kelvinToCelsius - takes in a double and returns a double, converting temp from Kelvin to Celsius
//
//    public instance methods:
//
//    getters and setters

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public Date getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(Date recordedAt) {
        this.recordedAt = recordedAt;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getTempInCelsius() {
        return tempInCelsius;
    }

    public void setTempInCelsius(double tempInCelsius) {
        this.tempInCelsius = kelvinToCelsius(tempInCelsius);
    }

    //
//        for the setter for tempInCelsius, pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//
//    add a constructor that sets all fields
//
    public WeatherReading(double lon, double lat, Date record, double temp){
        this.longitude = lon;
        this.latitude = lat;
        this.recordedAt = record;
        this.tempInCelsius = kelvinToCelsius(temp);
    }
//    when setting the tempInCelsius pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//
//    Add the following main method to test it out:
//
    public static void main(String[] args) {

        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.println(wr.getTempInCelsius());

    }
}
