package com.restapisp.restapispringboot.v1.controller.contract.v1;

import com.restapisp.restapispringboot.v1.controller.contract.facade.ClientFacadeController;
import com.restapisp.restapispringboot.v1.controller.contract.model.ClientRequestController;
import com.restapisp.restapispringboot.v1.controller.contract.model.ClientResponseController;
import com.restapisp.restapispringboot.v1.model.ClientModel;
import com.restapisp.restapispringboot.v1.service.v1.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/clientes")

public class ClientController {

    private final ClientFacadeController clientFacadeController;


    //POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientResponseController save(@RequestBody @Valid ClientRequestController client){
        return clientFacadeController.save(client);
    }

    //PUT
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ClientResponseController save(@RequestBody @Valid ClientRequestController client,
                                                 @PathVariable String id){
        return clientFacadeController.save(client, id);
    }

    //PATCH
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ClientResponseController update(@RequestBody @Valid ClientRequestController client,
                                                 @PathVariable String id){
        return clientFacadeController.update(client, id);
    }

    //GET
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClientResponseController findById(@RequestBody @Valid @PathVariable String id){
        return clientFacadeController.findById(id);
    }

    //GET ALL
    @GetMapping("/findAll")
    @ResponseStatus(HttpStatus.OK)
    public List<ClientResponseController> finAll (){
        return  clientFacadeController.findAll();
    }

    //DELETE
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestParam(required = false) List<String> id){
        clientFacadeController.delete(id);
    }
}
