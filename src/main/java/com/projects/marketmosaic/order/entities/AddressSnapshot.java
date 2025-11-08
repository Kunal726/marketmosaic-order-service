package com.projects.marketmosaic.order.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AddressSnapshot {
    private String name;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pincode;
    private String phoneNumber;
}
