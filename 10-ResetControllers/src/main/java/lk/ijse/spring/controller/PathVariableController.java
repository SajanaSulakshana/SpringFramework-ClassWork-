package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("variable")
public class PathVariableController {

    @GetMapping("{id:[I][0-9]{3}}")
    public String test(@PathVariable String id){
        return id;
    }

    @GetMapping("{id:[C][0-9]{3}}")
    public String test3(@PathVariable String id){
        return id;
    }

    @GetMapping("{customerID}/{customerName}")
    public String test2(@PathVariable("CustomerID")String id,@PathVariable("CustomerName")String name){
        return id+""+name;
    }
}
