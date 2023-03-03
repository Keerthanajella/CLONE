package Student_IMP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainClass
{
    public static void main(String[] args)
    {
        FeeDetails feeDetails1=new FeeDetails(60000,"15-06-2020");
        FeeDetails feeDetails2=new FeeDetails(35000,"16-08-2023");
        FeeDetails feeDetails3=new FeeDetails(65000,"20-06-2023");

        Subject subject1=new Subject("301","FluidMechanics",95);
        Subject subject2=new Subject("302","Kinematics",89);
        Subject subject3=new Subject("303","Mechanics",90);

        List<Subject>subjectsList1=new ArrayList<>();
        subjectsList1.add(subject1);
        subjectsList1.add(subject2);
        subjectsList1.add(subject3);


        Student student1=new Student(10,"Bhargavi","Mechanical","3",feeDetails1,subjectsList1);
        //=============================================================================================

        Subject subject1_2=new Subject("101","Drawing",80);
        Subject subject2_2=new Subject("102","Physics",85);
        Subject subject3_2=new Subject("103","Mathematics",90);


        List<Subject>subjectsList2=new ArrayList<>();
        subjectsList2.add(subject1_2);
        subjectsList2.add(subject2_2);
        subjectsList2.add(subject3_2);

        Student student2=new Student(24,"Anshu","EEE","1",feeDetails3,subjectsList2);
        //=======================================================================================


        Subject subject1_3=new Subject("101-CS","English",98);
        Subject subject2_3=new Subject("102-CS","Drawing",84);
        Subject subject3_3=new Subject("103-CS","Physics",82);

        List<Subject>subjectsList3=new ArrayList<>();
        subjectsList3.add(subject1_3);
        subjectsList3.add(subject2_3);
        subjectsList3.add(subject3_3);

        Student student3=new Student(15,"karishma","CSE","1",feeDetails2,subjectsList3);
        //==========================================================================================

        Subject subject1_4=new Subject("201","English",90);
        Subject subject2_4=new Subject("202","Mathematics2",95);
        Subject subject3_4=new Subject("203","BEE",91);


        List<Subject>subjectsList4=new ArrayList<>();
        subjectsList4.add(subject1_4);
        subjectsList4.add(subject2_4);
        subjectsList4.add(subject3_4);


        Student student4=new Student(16,"Ruchitha","Mechanical","2",feeDetails3,subjectsList4);
        //================================================================

        Subject subject1_5=new Subject("401","Hydraulics",75);
        Subject subject2_5=new Subject("402","CAD",89);
        Subject subject3_5=new Subject("403","Mechanics",84);

        List<Subject>subjectsList5=new ArrayList<>();
        subjectsList5.add(subject1_5);
        subjectsList5.add(subject2_5);
        subjectsList5.add(subject3_5);



        Student student5=new Student(1,"RajKumar","Mechanical","4",feeDetails3,subjectsList5);

        //List to add students
        List<Student>studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        //============================================================
        //Task 1: Print student rno, name, branch of 1st year students

        System.out.println("***** Student rno, name, branch of 1st year students *****");
        StringBuffer a=new StringBuffer();
        studentList.stream().filter(a1->a1.getYear().equals("1")).forEach(a1->{
            a.append("Student RollNo:"+a1.getRollNo()+" ").append("Name:"+a1.getName()+" ").append("Branch:"+a1.getBranch()+"\n");
        });
        System.out.println(a);
        System.out.println("---------------------------------------------------------------------------");

        //=============================================================
        //Task 2: Print all students rno, name, branch, amount, date
        System.out.println("***** Print all students rno, name, branch, amount, date *****");
        StringBuffer b=new StringBuffer();
        studentList.stream().forEach(b1->{
            b.append("Student rollNo:"+b1.getRollNo()+" ").append("Name:"+b1.getName()+" ").
                    append("Branch:"+b1.getBranch()+" ").append("Amount:"+b1.getFeeDetails().getFee()+" ").
                    append("Date:"+b1.getFeeDetails().getDate()+"\n");
        });
        System.out.println(b);
        System.out.println("------------------------------------------------------------------------------");

        //=============================================================
        //Task 3: Print all students rno, name, subjectName, marks
        System.out.println("***** Task 3: Print all students rno, name, subjectName, marks *****");
        StringBuffer c=new StringBuffer();
        studentList.stream().forEach(c1->{c.append("RollNo: "+c1.getRollNo()+" ").append("Name: "+c1.getName()+"\n");
            c1.getSubject().stream().
                    forEach(c3->{c.
                            append("SubjectName: "+c3.getSubjectName()+" ").append("Marks: "+c3.getMarks()+" \n ");

                    });
            });
        System.out.println(c);
        System.out.println("--------------------------------------------------------------------------------------");
        //==============================================================
        //Task 4: Print all students rno, name, subjectName, marks order by year
        System.out.println("*****  Task 4: All students rno, name, subjectName, marks order by year  *****");
        StringBuffer d=new StringBuffer();
        studentList.stream().sorted(Comparator.comparing(Student::getYear)).
                forEach(d1->{d.append("RollNo: "+d1.getRollNo()+" ").append("Year: "+d1.getYear()+" ").append("Name: "+d1.getName()+"\n");
                    d1.getSubject().stream().forEach(d2->{
                            d.append("SubjectName: "+d2.getSubjectName()+" ").append("Marks: "+d2.getMarks()+"\n");
                        });
                    });
        System.out.println(d);
        System.out.println("-------------------------------------------------------------------------------------");
        //==========================================================



    }
}
