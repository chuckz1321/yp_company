package com.example.yp_company.dao;

import com.example.yp_company.Entity.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CompanyDao {

    List<Company> getCompanyListByMultipleValues(@Param("city")String city ,@Param("state")String state, @Param("founded") String founded);
}
