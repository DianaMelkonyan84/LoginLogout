package com.webdemo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class PasswordValidationFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        String password = servletRequest.getParameter("password");
//        if (password.length() < 8) {
//            filterChain.doFilter(servletRequest, servletResponse);
//        } else {
//            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//            httpServletResponse.sendRedirect("/error");
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
