package com.restapisp.restapispringboot.v1.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Data
@Document(collection = "Clients")

public class ClientModel {

    @Id
    private String id;
    @NonNull
    private String name;
    private Long zipcode;
    @JsonFormat(pattern = "YYYY-MM-dd HH-mm-ss")
    @Builder.Default
    private LocalDateTime date = LocalDateTime.now();

    public ClientModel() {
    }
}
