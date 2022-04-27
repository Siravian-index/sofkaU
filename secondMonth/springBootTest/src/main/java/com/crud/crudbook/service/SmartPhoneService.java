package com.crud.crudbook.service;

import com.crud.crudbook.entity.SmartPhone;
import com.crud.crudbook.repository.SmartPhoneRepository;
import com.crud.crudbook.service.interfaces.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmartPhoneService implements ISmartPhoneService {

    @Autowired
    private SmartPhoneRepository smartPhoneRepository;
    @Override
    public List<SmartPhone> getAllSmartPhones() {
        return smartPhoneRepository.findAll();
    }

    @Override
    public SmartPhone saveSmartPhone(SmartPhone smartPhone) {
        return smartPhoneRepository.save(smartPhone);
    }

    @Override
    public SmartPhone updateSmartPhone(SmartPhone smartPhone) {
        Boolean phoneExistence = checkSmartPhoneExistence(smartPhone.getId());
        if (phoneExistence) {
            return smartPhoneRepository.save(smartPhone);
        }
        System.out.println("SmartPhone with id of " + smartPhone.getId() + " does not exist!");
        return null;
    }

    @Override
    public Boolean deleteSmartPhone(Long id) {
        Boolean phoneExistence = checkSmartPhoneExistence(id);
        if (phoneExistence) {
            smartPhoneRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private Boolean checkSmartPhoneExistence(Long id) {
        Optional<SmartPhone> smartPhone = smartPhoneRepository.findById(id);
        return smartPhone.isPresent();
    }
}
