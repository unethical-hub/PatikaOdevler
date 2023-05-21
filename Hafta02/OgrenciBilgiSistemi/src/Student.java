public class Student {
    String name,stuNo;
    int classes;
    Course math;
    Course phy;
    Course chemical;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course math,Course phy,Course chemical) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.math = math;
        this.phy = phy;
        this.chemical = chemical;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkOralNote(int mathOral, int phyOral, int chemicalOral) {

        if (mathOral >= 0 && mathOral <= 100) {
            this.math.oralNote = mathOral;
        }

        if (phyOral >= 0 && phyOral <= 100) {
            this.phy.oralNote = phyOral;
        }

        if (chemicalOral >= 0 && chemicalOral <= 100) {
            this.chemical.oralNote = chemicalOral;
        }

    }
    public void addBulkExamNote(int mathExam, int phyExam, int chemicalExam) {

        if (mathExam >= 0 && mathExam <= 100) {
            this.math.examNote = mathExam;
        }
        if (phyExam >= 0 && phyExam <= 100) {
            this.phy.examNote = phyExam;
        }
        if (chemicalExam >= 0 && chemicalExam <= 100) {
            this.chemical.examNote = chemicalExam;
        }
    }

    //Course sınıfından ortalama hesaplatıp not değerlerinin güncellenmesini sağlıyoruz.
    public void calcAverage() {
        this.math.average();
        this.chemical.average();
        this.phy.average();
        this.average = (this.phy.note + this.chemical.note + this.math.note) / 3;
    }


    //Ortalama not değerinin 0 olup olmadığını kontrol edebilmek için not değerlerinin güncellenmesi
    // gerekiyor. Bu yüzden fonk içinde calcAverage fonksiyonunu ilk olarak çağırıyoruz.
    public void isPass() {
        this.calcAverage();
        if (this.math.note == 0 || this.phy.note == 0 || this.chemical.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("++++++ Sınıfı Geçti. ++++++ ");
            } else {
                System.out.println("----- Sınıfta Kaldı. -----");
            }
        }
    }

    public boolean isCheckPass() {
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("\n=========================\n");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.math.note);
        System.out.println("Fizik Notu : " + this.phy.note);
        System.out.println("Kimya Notu : " + this.chemical.note);
    }

}