package main.java;

import java.util.ArrayList;

public class cafeClass {

    String _id;
    String name;
    int stars;
    ArrayList<String> categories;


    public cafeClass(String _id, String name, int stars) {
        this._id = _id;
        this.name = name;
        this.stars = stars;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
