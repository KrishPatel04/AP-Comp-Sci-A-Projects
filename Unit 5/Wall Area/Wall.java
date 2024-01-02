public class Wall {
    private double width;
    private double height;

    public Wall() {
        width = 0;
        height = 0;
    }

    public Wall(double width, double height) {
        if (width < 0) {
            width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double newWidth) {
        if (newWidth < 0) {
            width = 0;
            return;
        }
        this.width = newWidth;
    }

    public void setHeight(double newHeight) {
        if (newHeight < 0) {
            height = 0;
            return;
        }
        this.height = newHeight;
    }

    public double getArea() {
        return width * height;
    }
}
