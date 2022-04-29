package com.example.sboot.business;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReservationNumber {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String lastName;
    private Date date;
}
