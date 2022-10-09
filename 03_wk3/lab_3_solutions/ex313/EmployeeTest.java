public class EmployeeTest {
    public static void main(String[] args) {
        
        // create employee objects
        Employee e1 = new Employee("Lawrence", "Milley", 2000.25);
        Employee e2 = new Employee("Marianne", "Milley", 3500.95);

        System.out.println("---- Output ----\n");
        
        
        
        // Employee 1 Test
        double yearlySalary = e1.getMonthlySalary() * 12;

        System.out.printf("%s %s's yearly salary: $%.2f%n", e1.getFirstName(), e1.getLastName(), yearlySalary);
        
        double salaryWithRaise = yearlySalary * 1.10;
        System.out.printf("Yearly salary with 10 percent raise: $%.2f%n", salaryWithRaise);

        System.out.println();
        
        // Employee 2 Test
        yearlySalary = e2.getMonthlySalary() * 12;
        
        System.out.printf("%s %s's yearly salary: $%.2f%n", e2.getFirstName(), e2.getLastName(), yearlySalary);
        
        salaryWithRaise = yearlySalary * 1.10;
        System.out.printf("Yearly salary with 10 percent raise: $%.2f%n", salaryWithRaise);
        
        System.out.println("\n---- End Output ----\n");

    }
}
