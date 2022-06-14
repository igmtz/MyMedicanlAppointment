import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        // Constructor de objeto con parámetros obligatorios
        Doctor myDoctor = new Doctor("Gonzalo Martínez", "Pediatría");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }

}
