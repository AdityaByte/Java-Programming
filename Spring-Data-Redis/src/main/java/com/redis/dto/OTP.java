package com.redis.dto;

public class OTP {
    private String otp;
    private String targetIdentifier;

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getOtp() {
        return otp;
    }

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }

    @Override
    public String toString() {
        return "OTP{" +
                "otp='" + otp + '\'' +
                ", targetIdentifier='" + targetIdentifier + '\'' +
                '}';
    }
}
