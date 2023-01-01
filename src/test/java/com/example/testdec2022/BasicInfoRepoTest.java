package com.example.testdec2022;

import com.example.testdec2022.config.ContainersEnvironment;
import com.example.testdec2022.entities.BasicInfo;
import com.example.testdec2022.repositories.BasicInfoRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = TestDec2022Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BasicInfoRepoTest extends ContainersEnvironment {

    @Autowired
    private BasicInfoRepo basicInfoRepo;

    @Test
    public void When_GetProducts_Expect_EmptyList() {
        List<BasicInfo> list = basicInfoRepo.findAll();
        assertEquals(0, list.size());
    }

}
