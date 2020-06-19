package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;

    public static void main(String[] args) {
        double a = 3*2.1;
        double b = 3*2.1f;
        float  c = 3*2.1f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

    }
}
