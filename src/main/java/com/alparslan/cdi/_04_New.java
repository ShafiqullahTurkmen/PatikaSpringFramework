package com.alparslan.cdi;


import com.alparslan.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    // Üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto) {
        studentDto = StudentDto.builder().
                studentId(0L)
                .studentName("student Adi")
                .build();
        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String tuketilenData;
}
