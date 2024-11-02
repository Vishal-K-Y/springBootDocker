package com.example.springbootDocker.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mytable")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "organization_Id")
    private String organizationId;

    private String name;

    private String Website;

    private String country;

    private String description;

    private long founded;

    private String Industry;

    @Column(name = "Number_of_employees")
    private long numberOfEmployees;

    public Organization(int index, String organizationId, String name, String website, String country, String description, long founded, String industry, long numberOfEmployees) {
        this.index = index;
        this.organizationId = organizationId;
        this.name = name;
        Website = website;
        this.country = country;
        this.description = description;
        this.founded = founded;
        Industry = industry;
        this.numberOfEmployees = numberOfEmployees;
    }

    public Organization(){

    }

    public long getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getFounded() {
        return founded;
    }

    public void setFounded(long founded) {
        this.founded = founded;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public long getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(long numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "index=" + index +
                ", organizationId='" + organizationId + '\'' +
                ", name='" + name + '\'' +
                ", Website='" + Website + '\'' +
                ", country='" + country + '\'' +
                ", description='" + description + '\'' +
                ", founded=" + founded +
                ", Industry='" + Industry + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }
}
