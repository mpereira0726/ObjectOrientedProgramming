public class Kid {
    //Three instances given with a static instance variable equalling to 0
    private String name;
    private String gender;
    private int age;
    public static int numberOfKids = 0;

    //No args constructor
    public Kid()
    {
        gender = "male";
        name = "Jean-Marc";
        age = 18;
        numberOfKids++;
    }

    //Overloaded constructor
    public Kid(String name, String gender, int age)
    {
        this.gender = "male";
        this.name = "Jean-Marc";
        this.age = 18;
        numberOfKids++;
    }

    //Getter methods
    public String getGender()
    {
        return this.gender;
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    //Setter methods
    public void setGender()
    {
        this.gender = "male";
    }

    public void setName()
    {
        this.name = "Jean-Marc";
    }

    public void setAge()
    {
        this.age = 18;
    }

    //toString Method
    public String toString()
    {
     return this.name + "Jean-Marc" + "\n" + this.gender + "Male" + "\n" + this.age + "18";
    }

    //boolean Method
    public boolean areTheyTwins(Kid kid)
    {
        if(this.gender == this.gender)
            return true;
        else
            return false;
    }


}
