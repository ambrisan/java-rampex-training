package Day_16.Home_Task;

import java.util.Objects;

public class Restaurant {
    private int id;
    private String name;
    private String location;
    private double rating;

    // No-Argument Constructor
    public Restaurant() {}

    // Parameterized Constructor
    public Restaurant(int id, String name, String location, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    // Override toString()
    @Override
    public String toString() {
        return "Restaurant{id=" + id + ", name='" + name + "', location='" + location + "', rating=" + rating + "}";
    }

    // Override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id && Double.compare(that.rating, rating) == 0 && Objects.equals(name, that.name) && Objects.equals(location, that.location);
    }
}
