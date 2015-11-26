package excise.day.six;

public class PersonTest {

    public static void main(String [] args){

        Person[] pepole = new Person[2];

        pepole[0] = new Employee("Harry Hacker", 5000, 2015, 2, 15);
        pepole[1] = new Student("Maria Morris", "computer science");

        for(Person e : pepole){
            System.out.println("name = " + e.getName() + " , " + e.getDescription());
        }
    }
}
