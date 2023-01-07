package com.example.oop.springboot.bean;

import com.example.oop.springboot.business.dto.ProductDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class veriBean {
    @Bean
    public ProductDTO productDTO(){
        return ProductDTO
                .builder()
                .id(1L)
                .urunAdı("Computer")
                .urunFiat("35.000")
                .build();
    }
    public static void main(String[] args) {
        veriBean reVeriBean = new veriBean();
        System.out.println(reVeriBean.productDTO());

    }
}
