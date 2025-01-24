package main.models;

public class Device {
    public String model;
    public String brand;

    public Device(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Device device)) return false;

        return model.equals(device.model) && brand.equals(device.brand);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + brand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Device{");
        sb.append("model='").append(model).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
