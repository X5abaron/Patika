package SalaryCalculation;

public class Worker {
    String name;
    float salary;
    int workHours;
    int hireYear;

    Worker(String name, float salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void taxCalculation() {
        if (salary >= 1000) {
            float tax = this.salary - (this.salary * 3) / 100;
            System.out.println("VERGİLERLE MAAŞINIZ: " + tax);
        }

    }

    void workOvertime() {
        if (workHours > 40) {
            float workHour = this.salary + 30 * (this.workHours - 40);
            System.out.println("EKSTRA MESAİ ÜCRETİ: " + workHour);
        }
    }

    void workedYears() {
        float currentSalary;
        int yearsWorked = 2021 - this.hireYear;
        if (yearsWorked < 9) {
            currentSalary = this.salary + (this.salary * 5) / 100;
            System.out.println("YENİ MAAŞI: " +currentSalary );

        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            currentSalary = this.salary + (this.salary * 10) / 100;
            System.out.println("YENİ MAAŞI: " +currentSalary );

        } else if (yearsWorked >= 20) {
            currentSalary = this.salary + (this.salary * 15) / 100;
            System.out.println("YENİ MAAŞI: " +currentSalary );
        }
    }

    void informations() {
        System.out.println("ADI: " + this.name);
        System.out.println("MAAŞI: " + this.salary);
        System.out.println("MESAİ SAATİ: " + this.workHours);
        System.out.println("İŞE GİRİŞ TARİHİ: " + this.hireYear);
        taxCalculation();
        workedYears();
        workOvertime();
    }
}


