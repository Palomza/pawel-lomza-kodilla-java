package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SearchTestSuite {
    @Autowired
    private Search search;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSearchCompany() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> findByPart = search.findCompanyByPartOfName("Ma");

        //Then
        assertEquals(3, findByPart.size());

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
        }
    }

    @Test
    void testSearchEmployee() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        Employee mendyMendy = new Employee("Mendy", "Mendy");


        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stepanieId = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaId= lindaKovalsky.getId();
        employeeDao.save(mendyMendy);
        int mendyId = mendyMendy.getId();

        //When
        List<Employee> findByPartMendy = search.findEmployeeByPartOfName("men");
        List<Employee> findByPartOther = search.findEmployeeByPartOfName("arc");

        //Then
        assertEquals(1, findByPartMendy.size());
        assertEquals(1, findByPartOther.size());

        //CleanUp
        try {
            employeeDao.deleteById(johnSmithId);
            employeeDao.deleteById(lindaId);
            employeeDao.deleteById(stepanieId);
            employeeDao.deleteById(mendyId);
        } catch (Exception e) {
        }
    }

}