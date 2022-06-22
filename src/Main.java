import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        // Constructor de objeto con parámetros obligatorios
        Doctor myDoctor = new Doctor("Gonzalo Martínez", "Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 am");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");

        System.out.println(myDoctor.getAvailableAppointment()); // Genera la lista de las direcciones de los objetos Appointments

        for(Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointment()){
            System.out.println(availableAppointment.getDate()+" "+availableAppointment.getTime());
        } // Imprime los datos de cada cita

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("58749125");
        System.out.println(patient.getPhoneNumber());
    }

}
