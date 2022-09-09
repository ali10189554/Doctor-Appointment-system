package com.Doctor_Appointment.ServiceImp;


import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Doctor_Appointment.Model.Booking;
import com.Doctor_Appointment.Repository.BookingRepository;
import com.Doctor_Appointment.Services.BookingService;

@Component
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepository bookRepo;

    @Override
    public Booking createBooking(Booking booking) {
        return this.bookRepo.save(booking);
    }

    @Override
    public Booking updateBooking(Booking booking) {
        return this.bookRepo.save(booking);
    }

    @Override
    public void deleteBooking(int id) {
        this.bookRepo.deleteById(id);
    }

    @Override
    public Set<Booking> getAllBooking() {
        return new LinkedHashSet<>(this.bookRepo.findAll());
    }

    @Override
    public Booking getBooking(int id) {
        return this.bookRepo.findById(id);
    }


}
