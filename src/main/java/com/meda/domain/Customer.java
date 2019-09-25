package com.meda.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer_table")
public class Customer {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;

    private Customer() {

    }

    private Customer(Builder builder) {
        this.id = (builder.id);
        this.firstName = Objects.requireNonNull(builder.firstName, "firstName");
        this.lastName = Objects.requireNonNull(builder.lastName, "lastName");
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private Long id;
        private String firstName;
        private String lastName;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }
}
