package com.example.yp_company.service.impl;

import com.example.yp_company.Entity.Company;
import com.example.yp_company.dao.CompanyDao;
import com.example.yp_company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> getCompanyListByMultipleValues(String city ,String state,  String founded) {
        return companyDao.getCompanyListByMultipleValues(city,state,founded);
    }
}
