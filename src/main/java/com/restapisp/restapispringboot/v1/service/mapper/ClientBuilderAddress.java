package com.restapisp.restapispringboot.v1.service.mapper;

import com.restapisp.restapispringboot.v1.entity.Address;
import com.restapisp.restapispringboot.v1.entity.Client;
import com.restapisp.restapispringboot.v1.service.model.ClientRequestService;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface ClientBuilderAddress {

    static Client mapAddress(ClientRequestService client, Address address){
        return Mappers.getMapper(ClientBuilderAddress.class).toCepServiceResponse(client, address);
    }

    @Mapping(target = "Address", ignore = true)
    Client toCepServiceResponse(ClientRequestService client, Address address);

    @AfterMapping
    default void mapAddress(@MappingTarget Client.ClientBuilder client, Address address)  {
        Address addressClient = Address.builder()
                .address(address.getAddress())
                .uf(address.getUf())
                .cidade(address.getCidade())
                .bairro(address.getBairro())
                .complemento(address.getComplemento())
                .build();

        client.address(addressClient);
    }
}
