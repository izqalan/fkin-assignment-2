public class Patient extends Person{

    private String physician;
    private String name;

    public Patient(){

    }

    public Patient(Person person, Doctor doctor){

        setName(person.getName());
        setPhysician(doctor.getName());

    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician;
    }
}
