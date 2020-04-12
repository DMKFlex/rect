public class Rectangle {
    String color;
    int width;
    int length;

    public Rectangle(String color, int width, int length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width && length == rectangle.length && (color == rectangle.color
                || (color != null && color.equals(rectangle.color)));

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + width;
        result = prime * result + length;
        return result;
        }
    }

