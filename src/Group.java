import java.time.LocalDate;

public class Group {
    String groupName;
    LocalDate startDate;
    String mentor;
    Person[] people;

    public Group(){

    }
    public Group(String groupName,LocalDate startDate,String mentor,Person[]people){
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.people = people;
    }
}

