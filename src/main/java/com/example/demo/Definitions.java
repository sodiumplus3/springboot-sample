package com.example.demo;

import java.util.function.Supplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Definitions {
    @Bean
    // Bean登録するメソッドに引数を持たせておくと、
    // その引数もDIによって注入される必要が出てくる
    // なので今回は引数なしのメソッド
    public Supplier<String> hoge() {
        return () -> "たちつてと";
    }

}
