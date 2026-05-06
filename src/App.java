import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas = {
            new Person ("juan", 25),
            new Person ("Ana", 19),
            new Person ("Carlos", 30),
            new Person ("Maria", 22),
            new Person ("Fiego", 15),
        };

        // Imprimir
        // Ordenar
        //Imprimir
        for (Person person : personas) {
            System.out.println(person);

        }

        PersonController pelson=new PersonController();
        pelson.sortPersonByAge(personas);
        System.out.println(personas);



        
    }
}
