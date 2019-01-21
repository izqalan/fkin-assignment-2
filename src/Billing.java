import org.jetbrains.annotations.NotNull;

public class Billing {


    private Patient patient = new Patient();
    private Doctor doctor = new Doctor();
    private Double amount;
    private String physicianName;
    private String patientName;

    public Billing(Patient patient, @NotNull Doctor doctor){

        setPatientName(patient.getName());
        setAmount(doctor.getFee());
        setphysicianName(doctor.getName());

    }

    public Double getAmount() {
        return amount;
    }


    public String getphysicianName() {
        return physicianName;
    }

    public void setphysicianName(String physicianName) {
        this.physicianName = physicianName;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }


}
