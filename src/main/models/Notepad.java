package main.models;

public class Notepad {
    private int pages;
    private String size;

    public Notepad(int pages, String size) {
        this.pages = pages;
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Notepad notepad)) return false;

        return pages == notepad.pages && size.equals(notepad.size);
    }

    @Override
    public int hashCode() {
        int result = pages;
        result = 31 * result + size.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Notepad{");
        sb.append("pages=").append(pages);
        sb.append(", size='").append(size).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
