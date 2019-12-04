package Other;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex_One_Sol_Java_Seven {
    public static void main(String[] args) {
        List<Person> personsList=Arrays.asList(
                new Person("Emrul", "Hasan", 25),
                new Person("Kamrul", "Ovi", 26),
                new Person("Debashis", "Datta", 27),
                new Person("Faruq", "Khan", 25),
                new Person("Pritam", "Hasan", 25)
        );

        // Step1: Sort list by lastname
        Collections.sort(personsList, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
        // Step2: Print all the elements
        System.out.println("Printing all persons");
        System.out.println(personsList);

        // Step3: Print Persons who's lastname starts with H
       printAllThePerson(personsList, (Person person) -> person.getLastName().startsWith("H"));
    }

    public static void printAllThePerson(List<Person> personsList, Condition condition){
        for(Person person:personsList){
           if(condition.test(person)){
               System.out.println(person);
           }
        }
    }
}