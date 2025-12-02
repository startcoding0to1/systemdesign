package creational.builder.solution;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("Operating Systems");
        subjects.add("Computer Architecture");
        subjects.add("Data Structures");
        subjects.add("DBMS");

        this.subjects = subjects;
        return this;
    }
}

