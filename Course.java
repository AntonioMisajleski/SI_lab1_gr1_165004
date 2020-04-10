public class Course {
    List<Student> list;

    public Course(List<Student> list) {
        this.list = list;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }
    public void addStudent(Student student)
    {
        list.add(student);
    }

    public void removeStudent(Student student)
    {
        if(list.indexOf(student) != -1)
            list.remove(list.indexOf(student));
    }
    public int potpisi()
    {
        int potpis = 0;

        for (Student student : list)
        {
            if (student.getLabPoints().length > 8)
                potpis++;
        }

        return potpis;
    }
}

