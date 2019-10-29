package Lesson8.Assignments.studentbrowser;

public class Student {

    private String name;
    private int marks[];

    //constructor methods - 3 ways you can make a student
    public Student() {
        this("", new int[]{0, 0, 0});
    }

    public Student(String n, int m[]) {
        name = n;
        marks = m;
    }

    public Student(Student s) {
        this(s.name, s.marks);
    }
    
    public void setName(String nm) {
        name = nm;
    }

    public void setMark(int which, int num) {
        //must subtract one bc in array 0=1,1=2 etc
        num = marks[which - 1]; //must subtract one bc in array 0=1,1=2 etc
    }

    public int getAverage() {
        int average = (marks[0] + marks[1] + marks[2]) / 3;
        return average;
    }

    public int getMark(int whichmark) {
        return marks[whichmark - 1];
    }

    public int getHighscore() {
        int high = marks[0];
        if (marks[1] > high) {
            high = marks[1];
        }
        if (marks[2] > high) {
            high = marks[2];
        }
        return high;
    }

    public String toString() {
        String result = "Name: " + name;
        for (int i = 0; i < marks.length; i++) {
            result += "\nMark " + (i + 1) + ":\t" + marks[i];
        }
        result += "\n~~~~~~~~~~~~~~~~~~";
        result += "\nAverage:\t" + getAverage();
        return result;
    }

    public String getName() {
        return name;
    }

    //validate data
    public String validateData() {
        String message = null;
        //check if name is entered
        if (name.equals("")) {
            message += "\nName is required\nPlease re-enter all data";
        }

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                message += "\nAt least one mark is out of range, please re-enter all data";
                break;
            }//leave for loop right away 
        }

        return message;
    }
}
