package java_multithreading.level_5.lesson_16.refactoring.user;

/**
 * @author Ivan Korol on 8/1/2018
 */
public class Address {
    private String country;
    private String city;
    private String house;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getAddress() {
        return country + " " + city + " " + house;
    }
}
