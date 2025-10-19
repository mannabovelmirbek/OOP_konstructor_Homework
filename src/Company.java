import java.lang.module.Configuration;

public class Company {
    String companyName;
    String country;
    int yearOfFoundation;
    String founder;
    Group[] groups;

    public Company(){

    }
    public Company(String companyName,String country,int yearOfFoundation,String founder,Group[]groups){
        this.companyName = companyName;
        this.country=country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups=groups;

    }

}
