package creational.builder.solution;

/*
* With Director: Use when you want a central class to manage the creation of complex objects step by step (Builder pattern).
* */
public class ClientWithDirector {
    public static void main(String[] args) {

        System.out.println("===== Builder Pattern =====");

        StudentRegistrationDirector enggDirector =
                new StudentRegistrationDirector(new EngineeringStudentBuilder());

        StudentRegistrationDirector mbaDirector =
                new StudentRegistrationDirector(new MBAStudentBuilder());

        Student engineer = enggDirector.createStudent();
        Student mba = mbaDirector.createStudent();

        System.out.println(engineer);
        System.out.println(mba);
    }
}
