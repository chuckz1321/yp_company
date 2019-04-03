package com.example.yp_company.service;

import com.example.yp_company.Entity.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getCompanyListByMultipleValues(String city ,String state,  String founded);
}
