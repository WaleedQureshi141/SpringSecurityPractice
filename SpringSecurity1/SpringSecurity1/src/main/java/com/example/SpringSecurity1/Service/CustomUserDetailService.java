package com.example.SpringSecurity1.Service;

import com.example.SpringSecurity1.Repository.UserRepository;
import com.example.SpringSecurity1.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService
{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        CustomUserDetail userDetails = null;
        if (user != null)
        {
            userDetails = new CustomUserDetail();
            userDetails.setUser(user);
        }
        else
        {
            throw new UsernameNotFoundException(username + " user not found");
        }

        return userDetails;
    }
}
