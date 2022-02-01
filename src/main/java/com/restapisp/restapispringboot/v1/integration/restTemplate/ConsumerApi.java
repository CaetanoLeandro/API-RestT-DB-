package com.restapisp.restapispringboot.v1.integration.restTemplate;

import com.restapisp.restapispringboot.v1.entity.Address;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Component
public class ConsumerApi {

    private RestTemplate restTemplate;

    //@Bean
    public Address mapAddress(Address address){
        String uri = "https://viacep.com.br/ws/" + address + "/json/";
        return restTemplate.getForObject(uri, Address.class);
    }
}
