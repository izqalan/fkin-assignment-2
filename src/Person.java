public class Person{

    protected String name;

    public Person(){  }

    public Person(String theName) { setName(theName); }

    public Person(Person thePerson) {

        thePerson.setName(getName());

    }

    public String getName() { return name; }

    public void setName(String theName) { name = theName; }

    public String toString() { return getName(); }

    public boolean equals(Person other)
    {
        if (other == null)return false;
        if (other == this) return true;

        return false;

    }
}
