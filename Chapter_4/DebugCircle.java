class DebugCircle {
  private int radius;
  private int diameter;
  private final double PI = 3.14159;
  private double area;

  public DebugCircle(int r) {
    radius = r;
    diameter = 2 * r;
    area = PI * r * r;
  }
  //Problem 1: Method header ends with a semicolon (not allowed in normal methods).
  //Problem 2: Inside, it returns "radiuss" (typo — should be "radius").
  public int getRadius() {
    return radius;
  }
  //Problem 3: Declared as "void" (which means no return value),
  //Problem 4: Instead of "void", it should be int for it to have a return value.
  public int getDiameter() {
    return diameter;
  }
  public double getArea() {
    return area;
  }
}


