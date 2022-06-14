public class Doctor {
    // Atributos
    static int id=0; //Autoincrement
    String name;
    String speciality;

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
}
