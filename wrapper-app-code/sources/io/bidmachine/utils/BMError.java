package io.bidmachine.utils;

public class BMError {
    public static final BMError AlreadyShown = new BMError(-1, "Ads was already shown, load new one please");
    public static final int BAD_CONTENT = 101;
    public static final BMError BMServerNoFill = new BMError(103, "No bid", false);
    public static final int DESTROYED = 106;
    public static final int DUPLICATED = 111;
    public static final BMError Destroyed = new BMError(106, "Ads destroyed, load new one please");
    public static final int EXPIRED = 107;
    public static final BMError Expired = new BMError(107, "Ads was expired, load new one please");
    public static final int HB_NETWORK = 200;
    public static final int HTTP_BAD_REQUEST = 110;
    public static final int INTERNAL = 108;
    public static final int NOT_SET = -1;
    public static final int NO_CONNECTION = 100;
    public static final int NO_CONTENT = 103;
    public static final BMError NoConnection = new BMError(100, "Can't connect to server");
    public static final int PLACEHOLDER_TIMEOUT = 201;
    public static final BMError PlaceholderTimeout = new BMError(201, "Placeholder timeout error");
    public static final BMError Request = new BMError(110, "Request contains bad syntax or cannot be fulfilled");
    public static final BMError RequestDestroyed = new BMError(106, "AdRequest destroyed, create new one please");
    public static final BMError RequestExpired = new BMError(107, "AdRequest expired, load new one please");
    public static final BMError ResponseDuplicated = new BMError(111, "AdResponse already was shown");
    public static final BMError ResponseExpired = new BMError(107, "AdResponse expired, load new one please");
    public static final int SERVER = 109;
    public static final BMError Server = new BMError(109, "Server failed to fulfil an apparently valid request");
    public static final int TIMEOUT = 102;
    public static final BMError TimeoutError = new BMError(102, "Timeout reached");
    private final int code;
    private final String message;
    private final boolean trackError;

    public static BMError noFill() {
        return new BMError(103, "No ads fill");
    }

    public static BMError notFound(String str) {
        return new BMError(103, String.format("%s not found", new Object[]{str}));
    }

    public static BMError incorrectContent(String str) {
        return new BMError(101, str);
    }

    public static BMError adapter(String str) {
        return new BMError(200, str);
    }

    public static BMError adapterNotInitialized() {
        return adapter("Adapter SDK not initialized");
    }

    public static BMError adapterInitialization(String str) {
        return adapter(String.format("Adapter SDK initialization error: %s", new Object[]{str}));
    }

    public static BMError adapterGetsParameter(String str) {
        return adapter(String.format("%s not found", new Object[]{str}));
    }

    public static BMError internal(String str) {
        return new BMError(108, str);
    }

    private BMError(int i, String str) {
        this(i, str, true);
    }

    private BMError(int i, String str, boolean z) {
        this.code = i;
        this.message = str;
        this.trackError = z;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean isTrackError() {
        return this.trackError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BMError bMError = (BMError) obj;
        if (this.code != bMError.code) {
            return false;
        }
        return this.message.equals(bMError.message);
    }

    public int hashCode() {
        return (this.code * 31) + this.message.hashCode();
    }

    public String toString() {
        return String.format("(%s) %s", new Object[]{Integer.valueOf(this.code), this.message});
    }
}
