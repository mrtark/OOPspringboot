package com.example.oop.springboot.bean;

import com.example.oop.springboot.business.dto.ProductDTO;

public class veriBean {
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
