package com.Doctor_Appointment.Services;

import com.Doctor_Appointment.Model.Admin;

import java.util.Set;

public interface AdminServices {
    public Admin createAdmin(Admin admin);

    public Admin updateAdmin(Admin user);

    public Admin getUser(String username);

    public Set<Admin> getAllAdmin();

}
