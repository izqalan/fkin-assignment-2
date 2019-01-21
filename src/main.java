public class main {

    public static void main(String[] args) {

        Person[] person = new Person[2];
        person[0] = new Person("Ali");
        person[1] = new Person("Babi bin fuckface");

        Patient[] patients = new Patient[2];
        Doctor[] doctors = new Doctor[2];

        doctors[0] = new Doctor("fuck face", "unfuck yourself",
                9000.21, 500.50 );

        doctors[1] = new Doctor("butter's bum", "mind control",
                3300.21, 100.0 );

        for (int i = 0; i< 2; i++){

//            doctors[i] = new Doctor();
            patients[i] = new Patient(person[i], doctors[i]);

        }




        Billing[] billings = new Billing[2];
        for (int i = 0; i< 2; i++){

            billings[i] = new Billing(patients[i], doctors[i]);
            System.out.println(billings[i].getPatientName()+" Bills: "+ billings[i].getAmount()  +
                    " Doctor: "+ billings[i].getphysicianName() );
        }

        System.out.println(patients[0].getName()+patients[0].getPhysician());

    }

}
