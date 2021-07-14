package com.viniciusfinger.appconsulta.model.dto;

import com.viniciusfinger.appconsulta.model.Patient;
import lombok.Data;

@Data
public class PatientDTO {
    private Long id;
    private String username;
    private String password;
    private Integer totalAppointment;
    private StatusDTO statusDTO;

    public Patient toPatient(){
        return Patient.builder()
                .id(this.getId())
                .username(this.getUsername())
                .password(this.getPassword())
                .totalAppointment(this.getTotalAppointment())
                .status(this.statusDTO.toStatus())
                .build();
    }
}
