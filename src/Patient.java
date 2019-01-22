public class Patient extends Person{

    private String physician;
    private String speciality;
    private String name;
    private Double fee;

    public Patient(){
        super();
    }

    public Patient(Person person, Doctor doctor){

        setName(person.getName());
        setPhysician(doctor.getName());
        setSpeciality(doctor.getSpeciality());
        setFee(doctor.getFee());

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

    private void setPhysician(String physician) {
        this.physician = physician;
    }

    public String getSpeciality() {
        return speciality;
    }

    private void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Double getFee() {
        return fee;
    }

    private void setFee(Double fee) {
        this.fee = fee;
    }

    public boolean equals(Patient other)
    {

        return other == this;

    }



}
