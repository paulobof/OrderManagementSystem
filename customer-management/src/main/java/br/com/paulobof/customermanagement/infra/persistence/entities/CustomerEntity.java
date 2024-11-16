package br.com.paulobof.customermanagement.infra.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerCode;

    private  String name;

    private String number;

    private String email;

    private String phone;

    private String address;

    public CustomerEntity(String name, String number, String email, String phone, String address) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
