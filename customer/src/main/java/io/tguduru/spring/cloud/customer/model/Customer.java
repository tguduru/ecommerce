package io.tguduru.spring.cloud.customer.model;

/**
 * Customer Model
 * @author Guduru, Thirupathi Reddy
 * @modified 4/2/16
 */
public class Customer {
    private long id;
    private String name;
    private String email;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private String zip;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", streetName='").append(streetName).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", zip='").append(zip).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
