class Developer extends Employee {
    private final double base_salary;
    private final double bonus;

    public Developer(String emp_id, String name, double base_salary, double bonus) {
        super(emp_id, name);
        this.base_salary = base_salary;
        this.bonus = bonus;
        this.role = "Developer";
    }

    @Override
    double calculateSalary() {
        return base_salary + bonus;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        String role = "Developer";
        System.out.println("Job Role: " + role);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("Developer");
    }
}