package main.models;

public class Ram {
    private int size;
    private String type;

    public Ram(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Ram ram)) return false;

        return size == ram.size && type.equals(ram.type);
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ram{");
        sb.append("size=").append(size);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
