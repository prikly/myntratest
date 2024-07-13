package io.bidmachine.utils;

public enum Gender {
    Female("F", 1),
    Male("M", 2),
    Omitted("O", 0);
    
    private final String ortbValue;
    private final int serverValue;

    private Gender(String str, int i) {
        this.ortbValue = str;
        this.serverValue = i;
    }

    public String getOrtbValue() {
        return this.ortbValue;
    }

    public int getServerValue() {
        return this.serverValue;
    }

    public static Gender fromInt(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return Omitted;
        }
        if (intValue == 1) {
            return Female;
        }
        if (intValue != 2) {
            return null;
        }
        return Male;
    }
}
