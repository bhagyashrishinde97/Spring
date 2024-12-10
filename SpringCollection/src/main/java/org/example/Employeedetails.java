package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employeedetails {
    private String name;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> cources;

    public Employeedetails() {
        super();
    }

    public Employeedetails(String name, Set<String> address, List<String> phones, Map<String, String> cources) {
        this.name = name;
        this.address = address;
        this.phones = phones;
        this.cources = cources;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public void setCources(Map<String, String> cources) {
        this.cources = cources;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public Map<String, String> getCources() {
        return cources;
    }

    // toString Method for Debugging
    @Override
    public String toString() {
        return "Employeedetails{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", address=" + address +
                ", cources=" + cources +
                '}';
    }
}
