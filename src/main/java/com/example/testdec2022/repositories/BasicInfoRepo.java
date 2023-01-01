package com.example.testdec2022.repositories;

import com.example.testdec2022.entities.BasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicInfoRepo extends JpaRepository<BasicInfo, Long> {

}
