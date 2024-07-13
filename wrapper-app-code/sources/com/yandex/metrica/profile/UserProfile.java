package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.C0283bf;
import java.util.LinkedList;
import java.util.List;

public class UserProfile {

    /* renamed from: a  reason: collision with root package name */
    private final List<UserProfileUpdate<? extends C0283bf>> f7383a;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedList<UserProfileUpdate<? extends C0283bf>> f7384a = new LinkedList<>();

        Builder() {
        }

        public Builder apply(UserProfileUpdate<? extends C0283bf> userProfileUpdate) {
            this.f7384a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f7384a);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<UserProfileUpdate<? extends C0283bf>> getUserProfileUpdates() {
        return this.f7383a;
    }

    private UserProfile(List<UserProfileUpdate<? extends C0283bf>> list) {
        this.f7383a = A2.c(list);
    }
}
