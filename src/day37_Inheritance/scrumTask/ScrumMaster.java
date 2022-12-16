package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);  //because scrum master is only static  job title we can delete from upper line and add here as a static
    }

}