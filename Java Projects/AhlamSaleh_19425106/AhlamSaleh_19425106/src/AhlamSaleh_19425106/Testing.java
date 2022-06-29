
package AhlamSaleh_19425106;

import java.util.*;

public class Testing {
    public static void Test(ArrayList<Section> sections) {
        Instructor S = new Instructor("Sally", 1122, 30, true, 130, true);
        Section sec1 = new Section(1301, "M130", S, 2);
        Section sec2 = new Section(1309, "M131", S, 3);
        Section sec3 = new Section(1303, "M131", S, 1);
        Section sec4 = new Section(1304, "M130", S, 1);
        Section sec5 = new Section(1308, "M131", S, 1);
        Section sec6 = new Section(1305, "M131", S, 1);

        Student s1 = new Student("S1", 145, 1301, 50, 20, true, 2019);
        Student s2 = new Student("S2", 146, 1301, 50, 20, true, 2019);
        Student s3 = new Student("S3", 147, 1301, 50, 20, true, 2019);
        Student s4 = new Student("S4", 148, 1301, 50, 20, true, 2019);
        Student s5 = new Student("S5", 149, 1301, 50, 20, true, 2019);
        Student s6 = new Student("S6", 150, 1306, 50, 20, true, 2019);
        sec1.getStudents().add(s1);
        sec1.getStudents().add(s2);
        sec1.getStudents().add(s3);
        sec1.getStudents().add(s4);
        sec1.getStudents().add(s5);
        sec1.getStudents().add(s6);

        sec2.getStudents().add(s1);
        sec2.getStudents().add(s2);
        sec2.getStudents().add(s3);
        sec2.getStudents().add(s4);
        sec2.getStudents().add(s5);
        sec2.getStudents().add(s6);

        sec3.getStudents().add(s1);
        sec3.getStudents().add(s2);
        sec3.getStudents().add(s3);
        sec3.getStudents().add(s4);
        sec3.getStudents().add(s5);
        sec3.getStudents().add(s6);

        sections.add(sec1);
        sections.add(sec2);
        sections.add(sec4);
        sections.add(sec6);
        sections.add(sec3);
        sections.add(sec5);

    }

    public static void main(String[] args) {
        ArrayList<Section> sections = new ArrayList<Section>();
        Test(sections);
        System.out.println(sections);
        Section.AverageStudent(sections, "M133", 1301);
        Section.DisplaySection(sections);
        Data.SaveText(sections);

        // int add=-1;
        // Section sec = new Section();
        // sec.setSection(1305);
        // sec.setCourseCode("M132");
        // sec.setLectureTime(3);
        // Instructor S = new Instructor();
        // S.setName("Sally");
        // S.setAge(25);
        // S.setId(22);
        // S.setIsEngineer(true);
        // S.setgender(true);
        // S.setheight(165);
        // sec.setInst(S);
        // Section sec2 = new Section(1305, "M251", S, 2);
        // Student s =null;
        // do
        // {
        // Section.addStudentSection(sec);
        // System.out.println("In order to add another student press 0");
        // add=Data.input.nextInt();
        // } while (add==0);
        // s=sec.getStudents().get(0);
        // System.out.println(s);
        // System.out.println("----------------------------------------------------");
        // Section.removeStudent(sec.getStudents().get(0), sec);
        // System.out.println(sec.toString());
        // System.out.println("----------------------------------------------------");
        //
        // sections.add(sec);
        // sections.add(sec2);
        // System.out.println("----------------------------------------------------");
        // System.out.println(sections);
        // System.out.println("----------------------------------------------------");
        // Section.addSection(sections);
        // System.out.println("----------------------------------------------------");
        // System.out.println("\n"+sections);

    }
}
