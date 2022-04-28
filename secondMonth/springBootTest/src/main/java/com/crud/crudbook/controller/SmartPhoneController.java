package com.crud.crudbook.controller;

import com.crud.crudbook.entity.SmartPhone;
import com.crud.crudbook.service.SmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("api/v1/smartphones")
public class SmartPhoneController {

    @Autowired
    private SmartPhoneService service;

    @GetMapping
    public List<SmartPhone> getAll() {
        return service.getAllSmartPhones();
    }

    @PostMapping
    public SmartPhone saveSmartPhone(@RequestBody SmartPhone smartPhone) {
        return service.saveSmartPhone(smartPhone);
    }

    @PutMapping
    public SmartPhone updateSmartPhone(@RequestBody SmartPhone smartPhone) {
        return service.updateSmartPhone(smartPhone);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteSmartPhone(@PathVariable Long id) {
        return service.deleteSmartPhone(id);
    }
}
