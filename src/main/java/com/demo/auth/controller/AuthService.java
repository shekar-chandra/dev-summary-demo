package com.demo.auth.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean validateSession(Object session) {
        return session != null;
    }
}
