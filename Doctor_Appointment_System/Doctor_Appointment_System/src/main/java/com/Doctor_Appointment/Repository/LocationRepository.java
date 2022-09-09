package com.Doctor_Appointment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Doctor_Appointment.Model.Location;

import java.util.Set;

public interface LocationRepository  extends MongoRepository<Location , Integer>{


}
