package io.gabrielaloho.cars;

import java.util.ArrayList;

public class Cars {
    private String id;
    private String avatar;
    private String fullName;
    private String createdAt;
    private Gender gender;
    private ArrayList<Color> colors;
    private ArrayList<Country> countries;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ArrayList<Color> getColors() {
        return colors;
    }

    public void setColors(ArrayList<Color> colors) {
        this.colors = colors;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public Cars(String id, String avatar, String fullName, String createdAt, Gender gender, ArrayList<Color> colors, ArrayList<Country> countries) {
        this.id = id;
        this.avatar = avatar;
        this.fullName = fullName;
        this.createdAt = createdAt;
        this.gender = gender;
        this.colors = colors;
        this.countries = countries;
    }
}

enum Gender {
    Female,
    Male
}

enum Color {
    Aquamarine,
    Blue,
    Green,
    Maroon,
    Mauv,
    Orange,
    Red,
    Teal,
    Violet,
    Yellow
}

enum Country {
    China,
    Colombia,
    Estonia,
    France,
    Japan,
    Mexico,
    SouthAfrica
}

class CarsResponse extends ArrayList<Cars> {
    public CarsResponse(){

    }
}
