package com.example.yp_company.controller;

import com.example.yp_company.Entity.Company;
import com.example.yp_company.service.CompanyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @CrossOrigin(origins={"*"})
    @ApiOperation(value="search", notes="search company information ")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public List<Company> processQuery(@RequestParam String query){
        if(query == null || query =="") return new ArrayList<Company>();
        String[] subqueries = query.split("&");
        String state = "";
        String city = "";
        String founded = "";
        for(String subquery:subqueries){
            String[] queryParts = subquery.split("=");
            switch(queryParts[0]){
                case "state":
                    if( !queryParts[1].equals("") ) {
                        state = queryParts[1];
                    }
                    break;
                case "city":
                    if( !queryParts[1].equals("") ){
                        city = queryParts[1];
                    }
                    break;
                case "founded":
                    if( !queryParts[1].equals("") ){
                        founded = queryParts[1];
                    }
                    break;
            }
        }
        if(state=="" && city =="" && founded == "") return new ArrayList<Company>();
        return companyService.getCompanyListByMultipleValues(city, state,founded);
    }
}
