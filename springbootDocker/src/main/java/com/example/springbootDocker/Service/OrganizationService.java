package com.example.springbootDocker.Service;

import com.example.springbootDocker.Entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganizationService {
    public List<Organization> getOrganizations();
}
