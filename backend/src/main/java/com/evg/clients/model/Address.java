package com.evg.clients.model;

import com.evg.clients.dict.AddressType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Address {
    @Id
    @GenericGenerator(
            name = "customers-sequence-generator",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "address_sequence"),
                    @org.hibernate.annotations.Parameter(name = "initial_value", value = "10"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            })
    @GeneratedValue(generator = "customers-sequence-generator")
    @Column(nullable = false)
    private Long id;
    @Column(length = 300)
    private String fullAddress;
    @Enumerated(EnumType.STRING)
    private AddressType addressType;
}
