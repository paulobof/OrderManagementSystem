package br.com.paulobof.customermanagement.domain.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer {
    
    private Long customerCode;
    private String name;
    private String number;
    private String email;
    private String phone;
    private String address;

    public Customer(Long customerCode, String name, String number, String email, String phone, String address) {
        this.customerCode = customerCode;
        this.name = name;
        this.number = number;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Customer(String name, String number, String email, String phone, String address) {
        this.customerCode = customerCode;
        this.name = name;
        this.number = number;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
