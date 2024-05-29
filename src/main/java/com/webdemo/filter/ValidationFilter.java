package com.webdemo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class ValidationFilter implements Filter {
    private static final String USER_REGEX = "^(?=(?:.*[A-Z]){3})(?=(?:.*\\d){3})(?=(?:.*[\\W_]){3})(?=.*@).{10,}$";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            String password = servletRequest.getParameter("password");
        if (password != null) {
            Pattern pattern = Pattern.compile(USER_REGEX);
            Matcher matcher = pattern.matcher(password);

            if (password.length() > 8) {
                filterChain.doFilter(servletRequest, servletResponse);
            }
            if (matcher.matches()) {
                // Password is valid, proceed with the request
                filterChain.doFilter(servletRequest, servletResponse);
            }
        else {
                // Password is invalid, send an error response
                HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
               httpResponse.sendRedirect("/untitled2_war_exploded/error");
            }
        } else {
            // Password is missing, send an error response
            HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
            httpResponse.sendRedirect("/error");
        }

    }


    @Override
    public void destroy() {

    }
}
