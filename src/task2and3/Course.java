package task2and3;

public class Course {
    String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    Student[] students;
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }


    Student[] filterYear(int year){
        Student[] rez = new Student[2];

        int k = 0;
        for(int i=0; i< students.length; ++i)
            if(students[i].getYear() == year) {

                Student temp = new Student();
                temp.setName(students[i].getName());
                temp.setYear(students[i].getYear());

                if(k==rez.length){
                    Student[] tempL = new Student[k+1];
                    for(int j = 0; j< rez.length; ++j)
                        tempL[j] = rez[j];

                    rez = tempL;
                }

                rez[k++] = temp;}


        return rez;
    }

}
