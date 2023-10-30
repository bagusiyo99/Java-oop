package Programmer.bagus.iyo.application;

import Programmer.bagus.iyo.data.Company;

public class CompanyApp {

    public static void main(String[] args) {

        Company company = new Company();
        company.setName("project yai");

        Company.Employee employee = company.new Employee();
        employee.setName("Bagus");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());


    }
}
