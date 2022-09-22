package com.swapcat.swapcatback.data.entities.enums;

public enum UserType {

    FREE(0.9, 50, 100000),
    PREMIUM(0.95, 500, 500000);

    private final double commision;
    private final int rateLimitPerMinute;
    private final int rateLimitPerMonth;

    UserType(double commision, int rateLimitPerMinute, int rateLimitPerMonth) {
        this.commision = commision;
        this.rateLimitPerMinute = rateLimitPerMinute;
        this.rateLimitPerMonth = rateLimitPerMonth;
    }

    public double getCommision() {
        return commision;
    }

    public int getRateLimitPerMinute() {
        return rateLimitPerMinute;
    }

    public int getRateLimitPerMonth() {
        return rateLimitPerMonth;
    }

}
