class Point {
  int x, y;
  private String name;

  Point() {
    x = 0;
    y = 0;
    name = "fizzbuzz";
  }

  Point(String name, int x, int y) {
    this.name = name;
    this.x = x;
    this.y = y;
  }

  public void print() {
    System.out.println(name);
    System.out.println("X: " + x);
    System.out.println("Y: " + y);
    System.out.println("");
  }
}