package io.bidmachine.models;

public interface IUserRestrictionsParams<SelfType> {
    SelfType setConsentConfig(boolean z, String str);

    SelfType setCoppa(Boolean bool);

    SelfType setSubjectToGDPR(Boolean bool);

    SelfType setUSPrivacyString(String str);
}
