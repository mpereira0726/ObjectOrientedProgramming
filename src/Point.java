public class Point
{
    // 3 instance variables given 2 private(-), and 1 public(+)
    private int x;
    private int y;
    public String coordinates;

    // No argument(arg) constructor given
    public Point()
    {
       this.x = 0;
       this.y = 0;
    }

    //This is an Overloaded constructor giving a new value to ints x and y
    public Point(int xVal, int yVal)
    {
        this.x = xVal;
        this.y = yVal;
    }

    //Using a getter and setter method to return a value of x and y
    public int getX()
    {
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }

    public void setX()
    {
        this.x = x;
    }

    public void setY()
    {
        this.y = y;
    }

    public void setPoint( int newX, int newY)
    {
        this.x = newX;
        this.y = newY;
    }

    public String toString()
    {
        return "(" + this.x + ", " + this.y + " )";
    }

    public double distance(Point point)
    {
        double s1 = this.x - point.x;
        double s2 = this.y - point.y;
        return Math.sqrt(Math.pow(s1,2) + Math.pow(s2,2));
    }
}
