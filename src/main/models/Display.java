package main.models;

public class Display {
    private double size;
    private String resolution;

    public Display(double size, String resolution) {
        this.size = size;
        this.resolution = resolution;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Display display)) return false;

        return Double.compare(size, display.size) == 0 && resolution.equals(display.resolution);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(size);
        result = 31 * result + resolution.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Display{");
        sb.append("size=").append(size);
        sb.append(", resolution='").append(resolution).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
