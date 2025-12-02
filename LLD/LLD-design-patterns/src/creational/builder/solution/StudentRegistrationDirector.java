package creational.builder.solution;

public class StudentRegistrationDirector {

    StudentBuilder studentBuilder;

    public StudentRegistrationDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {

        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();

        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }

        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder
                .setRollNumber(1)
                .setAge(22)
                .setName("John")
                .setFatherName("Paul")
                .setMotherName("Jane")
                .setBranch("CSE")
                .setSubjects()
                .build();
    }

    private Student createMBAStudent() {
        return studentBuilder
                .setRollNumber(2)
                .setAge(24)
                .setName("Sarah")
                .setFatherName("Gabriel")
                .setMotherName("Taylor")
                .setBranch("Business Administration")
                .setSubjects()
                .setMobileNo("9876543210")
                .setEmailId("sarah@gmail.com")
                .build();
    }
}

