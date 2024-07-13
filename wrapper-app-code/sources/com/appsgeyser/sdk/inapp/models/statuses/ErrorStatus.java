package com.appsgeyser.sdk.inapp.models.statuses;

public class ErrorStatus implements Status {
    private String errorMessage;

    public ErrorStatus(String str) {
        this.errorMessage = str;
    }

    public static class BillingErrorStatus extends ErrorStatus {
        public BillingErrorStatus(String str) {
            super(str);
        }
    }

    public static class ConfigErrorStatus extends ErrorStatus {
        public ConfigErrorStatus(String str) {
            super(str);
        }
    }
}
