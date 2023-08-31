package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class Search {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public Search(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }
    public List<Company> findCompanyByPartOfName(String namePart) {
        String queryText = "%" + namePart + "%";
        return companyDao.findByPartOfName(queryText);
    }
    public List<Employee> findEmployeeByPartOfName(String namePart) {
        String queryText = "%" + namePart + "%";
        List<Employee> firstnameList = employeeDao.searchByPartOfFirstname(queryText);
        List<Employee> lastnameList =employeeDao.searchByPartOfLastname(queryText);
        Set<Employee> mergeSet = new HashSet<>();
        firstnameList.stream().forEach(e-> mergeSet.add(e));
        lastnameList.stream().forEach(e-> mergeSet.add(e));
        return mergeSet.stream().toList();
    }
}