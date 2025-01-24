package main.models;

public class Notebook {
    private Ram ram;
    private Disk disk;
    private String processor;

    public Notebook(Ram ram, Disk disk, String processor) {
        this.ram = ram;
        this.disk = disk;
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Notebook notebook)) return false;

        return ram.equals(notebook.ram) && disk.equals(notebook.disk) && processor.equals(notebook.processor);
    }

    @Override
    public int hashCode() {
        int result = ram.hashCode();
        result = 31 * result + disk.hashCode();
        result = 31 * result + processor.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notebook{");
        sb.append("ram=").append(ram);
        sb.append(", disk=").append(disk);
        sb.append(", processor='").append(processor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
