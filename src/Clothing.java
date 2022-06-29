public class Clothing {
    public double price;
    public String type;
    public String size;

    // constructor that sets the price to 29.9, the type to “t-Shirt” and the size to “Medium
    public Clothing() {
        price = 29.9;
        type = "T-Shirt";
        size = "Medium";
    }

    // overloaded constructor that takes 3 parameters and sets the instance variables.
    public Clothing(double cost, String t, String measurements) {
        price = cost;
        type = t;
        size = measurements;
    }

    // Method named increasePrice with no parameters and returns no value, increases price by 5.
    public void increasePrice() {
        price = price + 5;
    }

    // Overloaded method increasePrice that takes double parameter x and returns no value
    // method increases instance variable price by value of parameter x.
    public void increasePrice(double x)
    {
        price = price + x;
    }
    // Method named details takes no parameters
    // no values
    // Method prints Clothing item details in format shown in sample output
    public void details()
    {
        System.out.println("item: "+ type);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + price);
        System.out.println(   );
    }
}
