package com.example.springbootDocker.Service;

import com.example.springbootDocker.Entity.Organization;
import com.example.springbootDocker.dao.OrganizationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService{

    @Autowired
    private OrganizationDao organizationService;

    @Override
    public List<Organization> getOrganizations() {
        return organizationService.findAll();
    }

}
