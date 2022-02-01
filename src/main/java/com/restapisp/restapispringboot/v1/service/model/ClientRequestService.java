package com.restapisp.restapispringboot.v1.service.model;


import com.restapisp.restapispringboot.v1.entity.Address;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class ClientRequestService {

    private String id;
    private String name;
    private Address address;
    private LocalDate date;
}
