package com.crud.crudbook.service.interfaces;

import com.crud.crudbook.entity.SmartPhone;

import java.util.List;

public interface ISmartPhoneService {
  List<SmartPhone> getAllSmartPhones();
  SmartPhone saveSmartPhone(SmartPhone smartPhone);
  SmartPhone updateSmartPhone(SmartPhone smartPhone);
  Boolean deleteSmartPhone(Long id);

}
