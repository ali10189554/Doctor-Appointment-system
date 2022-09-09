package com.Doctor_Appointment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Doctor_Appointment.Model.Booking;

public interface BookingRepository  extends MongoRepository<Booking,Integer>{

    public Booking findById(int id);


    public Booking deleteById(int id);

}

