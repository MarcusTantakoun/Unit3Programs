package Lesson8.SamplePrograms;

import java.util.Scanner;

public class ParallelSearch {

    public static void main(String args[]) {
        String name[] = {"Bob", "Sue", "Joe", "Andy", "Kim"};
        //ages are in same order as names
            int age[] = {45,     17,     21,    35,     57};

        Scanner s = new Scanner(System.in);
        System.out.print("Enter name to search for age > ");
        String searchName = s.nextLine();
        
        //search for name
        int location = -1;
        for (int i = 0; i < name.length; i++) {
            if(name[i].equals(searchName))
                location = i;
        }
        if(location==-1) System.out.println(searchName + " not found");
        else System.out.println(searchName + "'s age is " + age[location]);
    }
}
