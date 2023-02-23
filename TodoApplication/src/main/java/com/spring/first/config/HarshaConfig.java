package com.spring.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "harsha.config")
@Component
public class HarshaConfig {
    private String name;
    private String password;
    private String email;
    private int emailExpTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmailExpTime() {
        return emailExpTime;
    }

    public void setEmailExpTime(int emailExpTime) {
        this.emailExpTime = emailExpTime;
    }

    @Override
    public String toString() {
        return "HarshaConfig{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailExpTime=" + emailExpTime +
                '}';
    }
}
