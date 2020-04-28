package com.example.componentscan.scannedbeans;

import org.springframework.stereotype.Service;

@Service
public class DependencyBean {
    public void hello() {
        System.out.println(" --- hello from : " + this.getClass());
    }
}
