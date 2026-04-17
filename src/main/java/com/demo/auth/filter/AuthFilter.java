package com.demo.auth.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        Object user = req.getSession().getAttribute("user");

        if (!user.toString().isEmpty()) {
            chain.doFilter(request, response);
        } else {
            throw new RuntimeException("Unauthorized");
        }
    }
}
