package com.bowen.homepage;

import java.lang.constant.Constable;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import static com.bowen.homepage.EnglishToWelsh.getWelsh;

@RestController
public class EnglishToWelshController {

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "Welsh of " + id + " : " + getWelsh(id);
    }
//    <String> Constable getEmployees() {
//        return getWelsh("ok");
//    }
    // end::get-aggregate-root[]

//    @PostMapping("/employees")
//    Employee newEmployee(@RequestBody Employee newEmployee) {
//        return repository.save(newEmployee);
//    }
}