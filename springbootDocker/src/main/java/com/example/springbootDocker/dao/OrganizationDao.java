package com.example.springbootDocker.dao;

import com.example.springbootDocker.Entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationDao extends JpaRepository<Organization, Integer> {
}
