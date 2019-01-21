public class Doctor {

    private String name, speciality;
    private Double salary, fee;

    public String toString(){
        String n = "name: "+getName()+" salary: "+getSalary()+
                " specialization: "+getSpeciality()+" fees: "+getFee();
        return n;

    }
    public Doctor(){

        this("undefined name","undefined speciality",0.0,0.0 );

    }
    public Doctor(String name, String speciality, Double salary, Double fee){

        this.name = name;
        this.speciality = speciality;
        this.salary = salary;
        this.fee = fee;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
}
