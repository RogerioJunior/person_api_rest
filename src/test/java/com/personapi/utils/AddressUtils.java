package com.personapi.utils;

import com.personapi.dto.request.AddressDTO;
import com.personapi.entity.Address;

public class AddressUtils {

    private static final String STREET = "Olavo franca paz";
    private static final String CITY = "Sorocaba";
    private static final String STATE = "SAO PAULO";
    private static final String ZIP_CODE = "SAO PAULO";
    private static final String COUNTRY = "BRAZIL";
    private static final long ADDRESS_ID = 1L;

    public static AddressDTO createFakeDTO() {
        return AddressDTO.builder()
                .street(STREET)
                .city(CITY)
                .state(STATE)
                .zipCode(ZIP_CODE)
                .country(COUNTRY)
                .build();
    }

    public static Address createFakeEntity() {
        return Address.builder()
                .id(ADDRESS_ID)
                .street(STREET)
                .city(CITY)
                .state(STATE)
                .zipCode(ZIP_CODE)
                .country(COUNTRY)
                .build();
    }

}
