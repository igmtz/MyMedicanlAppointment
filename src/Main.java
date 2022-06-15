import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        // Constructor de objeto con parámetros obligatorios
        Doctor myDoctor = new Doctor("Gonzalo Martínez", "Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("58749125");
        System.out.println(patient.getPhoneNumber());
    }

}
