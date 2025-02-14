package Day7.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        College college = new College();
        College newCollege = college.getCollegeDetails();
        System.out.println(newCollege.toString());
    }

}
