import java.util.Scanner;

public class TestCat {
    public static void main(String[] args)
    {
     Cat cat1 = new Cat();
     cat1.displayCatInfo();
     cat1.furColor = "brown";
     cat1.eyeColor = "Hazel";
     cat1.age = 2;
     cat1.gender = "Female";
     cat1.displayCatInfo();
    }
}
