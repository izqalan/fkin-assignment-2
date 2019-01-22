public class main {

    public static void main(String[] args) {

        Person[] person = new Person[2];
        person[0] = new Person("Ali thunder kat");
        person[1] = new Person("Pink ranger");

        Patient[] patients = new Patient[2];
        Doctor[] doctors = new Doctor[2];

        doctors[0] = new Doctor("Jamal", "Physiologist",
                9000.21, 500.50 );

        doctors[1] = new Doctor("butter's bum", "Cardiologist",
                11300.21, 673.0 );

        for (int i = 0; i< 2; i++){

//            doctors[i] = new Doctor();
            // attaching a person to a designated physician
            patients[i] = new Patient(person[i], doctors[i]);

        }

        Billing[] billings = new Billing[2];
        for (int i = 0; i< 2; i++){

            billings[i] = new Billing(patients[i], doctors[i]);
            System.out.println(billings[i].getPatientName()+" Bills: "+ billings[i].getAmount()  +
                    " Doctor: "+ billings[i].getphysicianName() );
        }

        System.out.println(patients[0].getName()+patients[0].getPhysician());

        System.out.println(patients[0].equals(patients[0]));

    }

}
