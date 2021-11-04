package com.personapi.entity;

import com.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data // inserts automatically getter and setters
@Builder // design pattern object construction
@AllArgsConstructor // insert constructors
@NoArgsConstructor // insert constructors
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id generate auto
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
