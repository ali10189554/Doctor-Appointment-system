package com.Doctor_Appointment.Repository;

import com.Doctor_Appointment.Model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin,Integer>{

    public Admin findByUsername(String username);

}
