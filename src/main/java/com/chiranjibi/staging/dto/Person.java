package com.chiranjibi.staging.dto;

/**
 * Simple immutable DTO representing a person/customer.
 */
public record Person(Long id, String firstName, String lastName, String email, int age) {
}

