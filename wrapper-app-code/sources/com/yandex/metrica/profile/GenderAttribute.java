package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C0283bf;
import com.yandex.metrica.impl.ob.Dn;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import com.yandex.metrica.impl.ob.Xe;
import com.yandex.metrica.impl.ob.Ye;
import com.yandex.metrica.impl.ob.Ym;

public class GenderAttribute {

    /* renamed from: a  reason: collision with root package name */
    private final Pe f7379a = new Pe("appmetrica_gender", new Dn(), new Xe());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");
        
        private final String mStringValue;

        private Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }

    GenderAttribute() {
    }

    public UserProfileUpdate<? extends C0283bf> withValue(Gender gender) {
        return new UserProfileUpdate<>(new Ye(this.f7379a.a(), gender.getStringValue(), new Ym(), this.f7379a.b(), new Me(this.f7379a.c())));
    }

    public UserProfileUpdate<? extends C0283bf> withValueIfUndefined(Gender gender) {
        return new UserProfileUpdate<>(new Ye(this.f7379a.a(), gender.getStringValue(), new Ym(), this.f7379a.b(), new We(this.f7379a.c())));
    }

    public UserProfileUpdate<? extends C0283bf> withValueReset() {
        return new UserProfileUpdate<>(new Ve(0, this.f7379a.a(), this.f7379a.b(), this.f7379a.c()));
    }
}
