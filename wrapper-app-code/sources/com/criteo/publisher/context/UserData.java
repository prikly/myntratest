package com.criteo.publisher.context;

public class UserData extends AbstractContextData<UserData> {
    public static final String DEV_USER_ID = "data.devUserId";
    public static final String HASHED_EMAIL = "data.hashedEmail";

    public boolean equals(Object obj) {
        if (!(obj instanceof UserData)) {
            return false;
        }
        return super.equals(obj);
    }
}
