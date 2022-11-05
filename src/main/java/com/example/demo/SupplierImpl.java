package com.example.demo;

import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SupplierImpl implements Supplier<String> {
    public String name = "かきくけこ";

    SupplierImpl(String name) {
        this.name = name;
    }
    SupplierImpl() {
    }

    @Override
    public String get() {
        return name;
    }

    public String sasisuseso() {
        return "さしすせそ";
    }

    @Qualifier("hoge")
    @Autowired
    // Qualifierの引数で名前を指定しておけば、変数名とBean名を合わせなくても大丈夫
    public Supplier<String> hogehoge;

    public void tatituteto() {
        System.out.println(hogehoge.get());
    }
}
