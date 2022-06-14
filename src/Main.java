import static ui.UIMenu.*;

public class Main {
    public static void main (String[] args){
        Doctor myDoctor = new Doctor(); // Creación del objeto
        myDoctor.name = "Alejandro Rodríguez"; // Asignando atributo
        myDoctor.showName(); // Utilizando método
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        showMenu();
    }

}
