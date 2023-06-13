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

    double tax() {
        double tax;
        if (this.salary > 1000) {
            return tax = (salary * 0.03);
        }
        return tax = 0;
    }

    double bonus() {
        double bonus;
        if (workHours > 40) {
            return bonus = (workHours - 40) * 30;
        }
        return bonus = 0;

    }

    double raiseSalary() {
        double raise;
        int currentYear = 2021;
        int totalWorkYear = currentYear - hireYear;
        if (totalWorkYear < 10) {
            return raise = this.salary * 0.05;
        } else if (totalWorkYear > 9 && totalWorkYear < 20) {
            return raise = this.salary * 0.10;
        } else if (totalWorkYear > 19) {
            return raise = this.salary * 0.15;
        }
        return 0;
    }

    void employeeInformation() {
        System.out.println("Name : " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Raise salary: " + raiseSalary());
        System.out.println("Salary with tax and bonus: " + (salary + bonus() - tax()));
        System.out.println("Total Salary: " + (salary + raiseSalary()));
        System.out.println("=================");

    }

}
