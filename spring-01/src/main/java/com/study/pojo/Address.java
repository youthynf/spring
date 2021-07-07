package com.study.pojo;

public class Address {
    private String Country;
    private String Province;
    private String town;

    public Address() {
    }

    public Address(String country, String province, String town) {
        Country = country;
        Province = province;
        this.town = town;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", Province='" + Province + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
