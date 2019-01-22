public class Person{

    protected String name;

    public Person(){  }

    public Person(String theName) { setName(theName); }

    public Person(Person thePerson) {

        // what the fuck this constructor supposed to do ?!
        thePerson.setName(getName());

    }

    public String getName() { return name; }

    public void setName(String theName) { name = theName; }

    public String toString() { return getName(); }

    public boolean equals(Person other)
    {
        return other == this;

    }
}
