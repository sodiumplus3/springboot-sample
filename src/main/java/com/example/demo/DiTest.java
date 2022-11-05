package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiTest {
    @Autowired
    SupplierImpl supplierImpl;

    public void sayTagyou() {
        supplierImpl.tatituteto();
    }

}
