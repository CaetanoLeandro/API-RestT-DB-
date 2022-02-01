package com.restapisp.restapispringboot.v1.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "Clients")

public class Client {

    @Id
    private String id;
    @NonNull
    private String name;
    private Address address;
    private LocalDate date;
}
