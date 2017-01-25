package io.tguduru.netflix.cloud.customer.model;

/**
 * Customer Model
 *
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

    public Customer(final long id, final String name, final String email, final String streetName, final String city, final String state, final String country, final String zip) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(final String zip) {
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
