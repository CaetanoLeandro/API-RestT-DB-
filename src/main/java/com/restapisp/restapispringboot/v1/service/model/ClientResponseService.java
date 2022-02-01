package com.restapisp.restapispringboot.v1.service.model;


import com.restapisp.restapispringboot.v1.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class ClientResponseService {

    private String id;
    private String name;
    private Address address;
    private LocalDate date;
}
