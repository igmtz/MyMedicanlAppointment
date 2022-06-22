import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos
    private static int id=0; //Autoincrement
    private String name;
    private String email;
    private String speciality;




    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    // Métodos
    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del Doctor asignado es: "+name);
        this.name = name;
        this.speciality = speciality;
    }
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }

    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointment.add(new Doctor.AvailableAppointment(date, time));
    }

    public  ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
