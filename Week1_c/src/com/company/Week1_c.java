package com.company;
import java.util.*;
class ArrayListSorting {

    public static void main(String args[])
    {
        ArrayList<Week1_c> arraylist
                = new ArrayList<Week1_c>();
        arraylist.add(new Week1_c(05, "Rishabh", 21));
        arraylist.add(new Week1_c(01, "Vardhan", 23));
        arraylist.add(new Week1_c(24, "Aniket", 19));

        Collections.sort(arraylist);

        for (Week1_c str : arraylist) {
            System.out.println(str);
        }
    }
}

public class Week1_c implements Comparable<Week1_c> {
    private String Studentname;
    private int Rollno;
    private int Studentage;

    public Week1_c(int Rollno, String Studentname,
                   int Studentage)
    {
        this.Rollno = Rollno;
        this.Studentname = Studentname;
        this.Studentage = Studentage;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname)
    {
        this.Studentname = studentname;
    }

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno)
    {
        this.Rollno = rollno;
    }

    public int getStudentage() {
        return Studentage;
    }

    public void setStudentage(int studentage)
    {
        this.Studentage = studentage;
    }


    @Override public int compareTo(Week1_c comparestu)
    {
        int compareage
                = ((Week1_c)comparestu).getStudentage();

        return this.Studentage - compareage;


    }

    @Override public String toString()
    {
        return "[ Roll No.=" + Rollno + ", Name="
                + Studentname + ", Age=" + Studentage + "]";
    }
}
