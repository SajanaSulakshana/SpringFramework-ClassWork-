package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")//Handler Mapping
public class CustomerController {

    @GetMapping
    public String getAllCustomer(){return "Get All Customer Invoked and Get Method Invoked";//Handler Methods
    }

    @GetMapping(path = "search")
    public String searchCustomer(){
        return "Search Customer Invoked and Get method Invoked";
    }

    @GetMapping(path = "newid")
    public String generateNewID(){
        return "New Customer ID Invoked and Get method Invoked";
    }


    @PostMapping
    public String saveCustomer(){
        return "Customer Save and Post Method Invoked";
    }//Handler Methods

    @DeleteMapping
    public String deleteCustomer(){
        return "Customer Delete and Method Invoked";//Handler Methods
    }

    @PutMapping
    public String updateCustomer(){
        return "Update Customer and Method Invoked";//Handler Methods
    }
}
