public abstract class Figure {
    public abstract double square();
    public abstract double perimeter();
}

class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
}

class Rect extends Figure {
    private double height, width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rect() {
        this.height = 1;
        this.width = 1;
    }

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    @Override
    public double square() {
        return height * width;
    }
}

class Square extends Rect {
    public Square() {
        super(1, 1);
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (exist(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
    }

    static public boolean exist(double a, double b, double c) {
        boolean res = (a + b) > c;
        res = res && (b + c) > a;
        return res && (a + c) > b;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double square() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
