package hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        HospitalEmployee[] employees = new HospitalEmployee[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter type (1 = Doctor, 2 = Nurse): ");
            int type = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Dept: ");
            String dept = sc.nextLine();
            if (type == 1) {
                System.out.print("Enter Patient Count: ");
                int patients = sc.nextInt();
                employees[i] = new Doctor(id, name, dept, patients);
            } else {
                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();
                employees[i] = new Nurse(id, name, dept, hours);
            }
        }

        System.out.println("\n--- Payroll Report ---");

        // Dynamic Method Dispatch
        for (HospitalEmployee emp : employees) {
            System.out.println(emp.getDetails());
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println();
        }

        sc.close();
    }
}