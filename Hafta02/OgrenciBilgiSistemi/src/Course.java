public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;
    int oralNote;
    int examNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note=0;
        this.oralNote=0;
        this.examNote=0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    public void average(){
        this.note = (this.oralNote*0.2)+(this.examNote*0.8);
    }
}