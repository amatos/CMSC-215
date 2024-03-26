public abstract class Color {
    int red;
    int green;
    int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String toString() {
        return "#(" + this.red + "," + this.green + "," + this.blue + ")";
    }


}
