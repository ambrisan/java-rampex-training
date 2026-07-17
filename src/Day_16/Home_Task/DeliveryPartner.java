package Day_16.Home_Task;

import java.util.Objects;

public class DeliveryPartner {
    private int id;
    private String name;
    private String vehicleType;
    private double rating;

    public DeliveryPartner() {}

    public DeliveryPartner(int id, String name, String vehicleType, double rating) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.rating = rating;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    @Override
    public String toString() {
        return "DeliveryPartner{id=" + id + ", name='" + name + "', rating=" + rating + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryPartner partner = (DeliveryPartner) o;
        return id == partner.id && Double.compare(partner.rating, rating) == 0 && Objects.equals(name, partner.name) && Objects.equals(vehicleType, partner.vehicleType);
    }
}