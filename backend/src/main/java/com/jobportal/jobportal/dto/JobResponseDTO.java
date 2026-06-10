package com.jobportal.jobportal.dto;

public class JobResponseDTO {

    private String title;
    private String company;

    public JobResponseDTO(String title, String company) {
        this.title = title;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }
}