package com.javaspring.javajrinterview.company;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository  extends JpaRepository<CompanyEntity, UUID> {

}
