package task2and3;

public class test {
    public static void main(String[] args) {

        int year = 1;
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4;
        Course c1 = new Course();

        s1.setYear(1);
        s1.setName("BigBoss");
        s4 = s1;

        s2.setYear(2);
        s2.setName("Base");

        s3.setYear(1);
        s3.setName("Ion");

        Student[] studentList= new Student[4];
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = s4;

        c1.setStudents(studentList);

        System.out.println(s2.getYear());
        System.out.println(s2.getName());
        studentList = c1.filterYear(year);

        System.out.println("\nElevi din anul " + year +":");

        for (Student student : studentList) System.out.println(student.getName());

        System.out.println("\nTest de egalitate (task 3): " + s1.equals(s4));
    }
}
