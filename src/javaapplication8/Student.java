/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author THINKPAD
 */
public class Student {
    private String studentID, name, major;
       private float mark;
       public Student()
       {
           
       }
        public Student(String studentID, String name, String major, float mark) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.mark = mark;
         }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
     public String getCapacity()
     {
         String message="";
         if(mark>=9)
         {
             message= "Xuất sắc";
         }
         else if(mark>=8&&mark<9)
         {
            message= "Giỏi";
         }
         else if(mark>=6&&mark<8)
         {
             message= "Khá";
         }
         else if(mark<6)
         {
             message= "Trung bình";
         }
         return message;
     }
     public boolean getGift()
     {
         return mark>=7.5;
     }
       
}
