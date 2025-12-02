package creational.builder.solution;


/*
* Without Director: Use when object creation is simple or can be done directly without extra orchestration.
* */
public class ClientWithOutDirector {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new EngineeringStudentBuilder();
        Student student1 = studentBuilder.setName("Khairuddin")
                .setRollNumber(1234)
                .setAge(25).build();
        System.out.println(student1);

        Student student2 = studentBuilder.setName("Mahammad")
                .setRollNumber(1235)
                .setAge(25)
                .setEmailId("test@yopmail.com")
                .setBranch("EEE")
                .setSubjects()
                .setMobileNo("987676723")
                .build();
        System.out.println(student2);

    }
}
