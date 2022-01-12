package com.restapisp.restapispringboot.v1.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Data

@Entity
public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Long zipcode;
    @JsonFormat(pattern = "YYYY-MM-dd HH-mm-ss")
    @Builder.Default
    private LocalDateTime date = LocalDateTime.now();

    public ClientModel() {
    }
}
