class Employee:
    def __init__(self, name, position, hours_worked, hours_absent, experience):
        self.name = name
        self.position = position
        self.hours_worked = hours_worked
        self.hours_absent = hours_absent
        self.experience = experience
        
        if experience < 8:
            self.base_salary = 10
            self.bonus_eligible = False
        elif experience >= 15:
            self.base_salary = 15
            self.bonus_eligible = True
        else:
            self.base_salary = 10
            self.bonus_eligible = False
            
    def calculate_salary(self):
        total_hours = self.hours_worked - self.hours_absent
        monthly_salary = self.base_salary * total_hours * 20 #assuming 20 working days
        tax_deduction = monthly_salary * 0.13
        net_monthly_salary = monthly_salary - tax_deduction
        bonus = 0
        
        if self.bonus_eligible:
            bonus = 200
            net_monthly_salary += bonus
        
        print("Summary:")
        print("Employee Name:", self.name)
        print("Position:", self.position)
        print("Total Hours Worked in a Month:", total_hours)
        print("Gross Monthly Salary: $", monthly_salary)
        print("Bonus: $", bonus)
        print("Tax Deduction: $", tax_deduction)
        print("Net Monthly Salary: $", net_monthly_salary)

name = input("Enter Employee Name: ")
position = input("Enter Current Position: ")
hours_worked = int(input("Enter Number of Hours Worked Daily: "))
hours_absent = int(input("Enter Number of Hours Absent: "))
experience = int(input("Enter Years of Experience: "))

employee = Employee(name, position, hours_worked, hours_absent, experience)
employee.calculate_salary()
