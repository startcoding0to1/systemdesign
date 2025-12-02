package utility;

public class Marker {
    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    // Getters
    public String getName() { return name; }
    public String getColor() { return color; }
    public int getPrice() { return price; }
    public int getYear() { return year; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(int price) { this.price = price; }
    public void setYear(int year) { this.year = year; }
}
