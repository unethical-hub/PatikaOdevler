public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (this.salary > 1000)
            tax += (salary * 3) / 100;
        else
            tax = 0;
        return tax;
    }

    public double bonus() {
        double bonusFee;
        if (this.workHours > 40)
            bonusFee = (this.workHours - 40) * 30;
        else
            bonusFee = 0;
        return bonusFee;
    }

    public double raiseSalary() {
        double raisedSalary = 0;
        if ((2021 - this.hireYear) < 10)
            raisedSalary += (this.salary) * 0.05;
        else if ((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20)
            raisedSalary += (this.salary) * 0.10;
        else
            raisedSalary += (this.salary) * 0.15;

        return raisedSalary;
    }


    public String toString() {
        double finalSalary = this.salary + this.bonus() -this.tax();
        System.out.println("\nAdı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + finalSalary);
        System.out.println("Toplam Maaş : "+ (this.salary + raiseSalary()));
        return null;
    }

}
