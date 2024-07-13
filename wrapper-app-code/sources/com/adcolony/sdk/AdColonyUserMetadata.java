package com.adcolony.sdk;

import android.location.Location;

@Deprecated
public class AdColonyUserMetadata {
    public static final String USER_EDUCATION_ASSOCIATES_DEGREE = "associates_degree";
    public static final String USER_EDUCATION_BACHELORS_DEGREE = "bachelors_degree";
    public static final String USER_EDUCATION_GRADE_SCHOOL = "grade_school";
    public static final String USER_EDUCATION_GRADUATE_DEGREE = "graduate_degree";
    public static final String USER_EDUCATION_HIGH_SCHOOL_DIPLOMA = "high_school_diploma";
    public static final String USER_EDUCATION_SOME_COLLEGE = "some_college";
    public static final String USER_EDUCATION_SOME_HIGH_SCHOOL = "some_high_school";
    public static final String USER_FEMALE = "female";
    public static final String USER_MALE = "male";
    public static final String USER_MARRIED = "married";
    public static final String USER_SINGLE = "single";

    /* renamed from: a  reason: collision with root package name */
    e1 f9861a = c0.a();

    /* renamed from: b  reason: collision with root package name */
    f1 f9862b = c0.b();

    /* renamed from: c  reason: collision with root package name */
    Location f9863c;

    public AdColonyUserMetadata addUserInterest(String str) {
        if (z0.e(str)) {
            c0.a(this.f9861a, str);
            c0.a(this.f9862b, "adc_interests", this.f9861a);
        }
        return this;
    }

    public AdColonyUserMetadata clearUserInterests() {
        e1 a2 = c0.a();
        this.f9861a = a2;
        c0.a(this.f9862b, "adc_interests", a2);
        return this;
    }

    public Object getMetadata(String str) {
        return c0.g(this.f9862b, str);
    }

    public int getUserAge() {
        return c0.d(this.f9862b, "adc_age");
    }

    public int getUserAnnualHouseholdIncome() {
        return c0.d(this.f9862b, "adc_household_income");
    }

    public String getUserEducation() {
        return c0.h(this.f9862b, "adc_education");
    }

    public String getUserGender() {
        return c0.h(this.f9862b, "adc_gender");
    }

    public String[] getUserInterests() {
        return this.f9861a.d();
    }

    public Location getUserLocation() {
        return this.f9863c;
    }

    public String getUserMaritalStatus() {
        return c0.h(this.f9862b, "adc_marital_status");
    }

    public String getUserZipCode() {
        return c0.h(this.f9862b, "adc_zip");
    }

    public AdColonyUserMetadata setMetadata(String str, boolean z) {
        if (z0.e(str)) {
            c0.b(this.f9862b, str, z);
        }
        return this;
    }

    public AdColonyUserMetadata setUserAge(int i) {
        setMetadata("adc_age", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserAnnualHouseholdIncome(int i) {
        setMetadata("adc_household_income", (double) i);
        return this;
    }

    public AdColonyUserMetadata setUserEducation(String str) {
        if (z0.e(str)) {
            setMetadata("adc_education", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserGender(String str) {
        if (z0.e(str)) {
            setMetadata("adc_gender", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserLocation(Location location) {
        this.f9863c = location;
        setMetadata("adc_longitude", location.getLongitude());
        setMetadata("adc_latitude", location.getLatitude());
        setMetadata("adc_speed", (double) location.getSpeed());
        setMetadata("adc_altitude", location.getAltitude());
        setMetadata("adc_time", (double) location.getTime());
        setMetadata("adc_accuracy", (double) location.getAccuracy());
        return this;
    }

    public AdColonyUserMetadata setUserMaritalStatus(String str) {
        if (z0.e(str)) {
            setMetadata("adc_marital_status", str);
        }
        return this;
    }

    public AdColonyUserMetadata setUserZipCode(String str) {
        if (z0.e(str)) {
            setMetadata("adc_zip", str);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, double d2) {
        if (z0.e(str)) {
            c0.a(this.f9862b, str, d2);
        }
        return this;
    }

    public AdColonyUserMetadata setMetadata(String str, String str2) {
        if (z0.e(str2) && z0.e(str)) {
            c0.a(this.f9862b, str, str2);
        }
        return this;
    }
}
