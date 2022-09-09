package com.Doctor_Appointment.Services;

import java.util.Set;

import com.Doctor_Appointment.Model.User;

public interface userServices {

    public User createUser(User user);

    public User updateUser(User user);

    public User getUser(String username);

    public void deleteUser(int id);

    public Set<User> getAllUser();


}
