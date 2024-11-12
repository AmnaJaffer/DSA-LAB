package com.mycompany.colorequality;

import java.util.Objects;

class Color {
    int red;
    int green;
    int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Color)) return false;
        Color color = (Color) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    @Override
    public String toString() {
        return "Color{red=" + red + ", green=" + green + ", blue=" + blue + '}';
    }
}

public class ColorEquality {
    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 0);
        Color color2 = new Color(255, 0, 0);
        System.out.println("Are the colors equal? " + color1.equals(color2));
    }
}
