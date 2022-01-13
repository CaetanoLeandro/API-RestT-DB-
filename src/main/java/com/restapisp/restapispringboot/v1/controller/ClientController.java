package com.restapisp.restapispringboot.v1.controller;

import com.restapisp.restapispringboot.v1.model.ClientModel;
import com.restapisp.restapispringboot.v1.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/clientes")

public class ClientController {

    private final ClientService service;


    //POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientModel saveCliente (@RequestBody @Valid ClientModel clientModel){
        return service.saveClient(clientModel);
    }

    //PUT
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ClientModel createClient(@RequestBody @Valid ClientModel clientModel, @PathVariable String id){
        return service.createClient(clientModel, id);
    }

    //PATCH
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ClientModel toEditClient(@RequestBody @Valid ClientModel clientModel, @PathVariable String id){
        return service.toEditClient(clientModel,id);

    }

    //GET
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClientModel findClient(@RequestBody @Valid @PathVariable String id){
        return service.findClient(id);
    }

    //GET ALL
    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public List<ClientModel> listClient (){
        return  service.listAll();
    }

    //DELETE
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClient(@RequestParam(required = false) List<String> id){
        service.deleteClient(id);

    }
}
