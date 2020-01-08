package com.foomix;

import java.util.Objects;

public class Address {
    private String cityName;
    private String province;
    private String country;

    public Address(String cityName, String province, String country) {
        this.cityName = cityName;
        this.province = province;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "cityName='" + cityName + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return cityName.equals(address.cityName) &&
                province.equals(address.province) &&
                country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, province, country);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
