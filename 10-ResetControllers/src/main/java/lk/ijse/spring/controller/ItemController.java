package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

    //Exact Mapping
@GetMapping("test")
    public String test(){
        return "Get Mapping Invoked Test";
    }

    @GetMapping("testtwo")
    public String testTwo(){
        return "Get Mapping Invoked TestTwo";
    }
}
