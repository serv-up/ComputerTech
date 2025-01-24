package main.models;

public class Disk {
    private int capacity;
    private String type;

    public Disk(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Disk disk)) return false;

        return capacity == disk.capacity && type.equals(disk.type);
    }

    @Override
    public int hashCode() {
        int result = capacity;
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Disk{");
        sb.append("capacity=").append(capacity);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
