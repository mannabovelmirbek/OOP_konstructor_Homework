import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Elmirbek","Mannabov",LocalDate.of(2004,3,23));
        Person person2 = new Person("Askar","Almanov",LocalDate.of(2004,1,16));
        Person person3 = new Person("Erjan","Ulukbekov",LocalDate.of(2005,9,4));

        Person[] java20People ={person1};
        Person[] java19People ={person2};
        Person[] JSPeople ={person3};

        Group group1 = new Group("java-20",LocalDate.of(2025,9,8),"Aizat",java20People);
        Group group2 = new Group("java-19",LocalDate.of(2025,6,1),"Urmat",java19People);
        Group group3 = new Group("JS-20",LocalDate.of(2025,9,8),"Elizar",JSPeople);


        Group[]groups={group1,group2,group3};
        Company company = new Company("Peaksoft","Kyrgyzstan",2020,"Esen Niazov",groups);
        System.out.println("Company: " + company.companyName);
        System.out.println("Country: " + company.country);
        System.out.println("Year of foundation: " + company.yearOfFoundation);
        System.out.println("Founder: " + company.founder);
        System.out.println("Groups: ");
        for (Group g : company.groups) {
            System.out.println(g.groupName + ", Mentor: " + g.mentor + ", start: " + g.startDate);
            System.out.print("People: ");
            for (Person p : g.people){
                System.out.println("  "+p.firstName+" "+p.lastName+" "+p.dateOfBirth);
            }
        }
    }

}