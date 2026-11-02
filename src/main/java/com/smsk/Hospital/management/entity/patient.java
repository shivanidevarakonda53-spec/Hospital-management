package com.smsk.Hospital.management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false,unique = true)
    private String patientCode;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String lastName;

    @Column(nullable = false,length = 20)
    private int age;

    @Column(nullable = true,unique = true)
    private String Email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String bloodGroup;

    @Column(nullable = false,unique = true)
    private Long aadhaar;

    @Column(nullable = false,unique = true)
    private Long number;
}
