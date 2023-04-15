/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.reynalarcos.learnjava;

/**
 *
 * @author lucifer
 */

    class Employee {

        private int empno;
        private String name;
        private double salary;

        public int getempno() {
            return empno;
        }

        public String getname() {
            return name;
        }

        public double getsalary() {
            return salary;
        }

        public void setempno(int a) {
            empno = a;
        }

        public void setname(String b) {
            name = b;
        }

        public void setsalary(double c) {
            this.salary = c;
        }
    }

class Information {
    private String city;
    private String country;

    public Information(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setempno(52145);
        emp1.setname("john");
        emp1.setsalary(50000);
        Information info = new Information("Montreal", "Canada");
        System.out.println("Employee No: " + emp1.getempno() + " Employee Name: " + emp1.getname() + " Employee salary: " + emp1.getsalary() + "City: " + info.getCity() + " Country: " + info.getCountry());

        Employee emp2 = new Employee();
        emp2.setempno(65214);
        emp2.setname("David");
        emp2.setsalary(2500000);
        System.out.println("Employee No: " + emp2.getempno() + " Employee Name: " + emp2.getname() + " Employee salary: " + emp2.getsalary() + "City: " + info.getCity() + " Country: " + info.getCountry());
    }
}
