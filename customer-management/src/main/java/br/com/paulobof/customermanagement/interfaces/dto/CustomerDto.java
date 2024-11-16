package br.com.paulobof.customermanagement.interfaces.dto;


import lombok.Builder;

@Builder
public record CustomerDto (

    Long customerCode,
    String name,
    String number,
    String email,
    String phone,
    String address

) {}
