class Main {
  public static void main(String[] args) {
    Point p1 = new Point("Point 1", 1, 2);
    Point p2 = new Point("Point 2", 3, 4);

    swapObj(p1, p2);
    System.out.println("Inside the calling program!");
    p1.print();
    p2.print();

    swapVal(p1, p2);
    System.out.println("Inside the calling program!");
    p1.print();
    p2.print();
  }

  public static void swapObj(Point p1, Point p2) {
    Point temp = p1;
    p1 = p2;
    p2 = temp;

    System.out.println("Inside the object swap function!");
    p1.print();
    p2.print();
  }

  public static void swapVal(Point p1, Point p2) {
    int tempX = p1.x;
    int tempY = p1.y;
    p1.x = p2.x;
    p1.y = p2.y;

    p2.x = tempX;
    p2.y = tempY;

    System.out.println("Inside the value swap function!");
    p1.print();
    p2.print();
  }
}