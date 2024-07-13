package io.bidmachine;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.core.Utils;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.IUserRestrictionsParams;
import io.bidmachine.protobuf.RegsCcpaExtension;
import io.bidmachine.protobuf.RequestTokenPayload;

final class UserRestrictionParams implements DataRestrictions, IUserRestrictionsParams<UserRestrictionParams> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String gdprConsentString;
    private Boolean hasConsent;
    private Boolean hasCoppa;
    private Boolean subjectToGDPR;
    private String usPrivacyString;

    UserRestrictionParams() {
    }

    /* access modifiers changed from: package-private */
    public void build(Context.Regs.Builder builder) {
        builder.setGdpr(subjectToGDPR());
        builder.setCoppa(hasCoppa());
        String uSPrivacyString = getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            builder.addExtProto(Any.pack(RegsCcpaExtension.newBuilder().setUsPrivacy(uSPrivacyString).build()));
        }
    }

    /* access modifiers changed from: package-private */
    public void build(Context.User.Builder builder) {
        builder.setConsent(getIABGDPRString());
    }

    /* access modifiers changed from: package-private */
    public void fill(RequestTokenPayload.UserData.Builder builder) {
        builder.setGdpr(subjectToGDPR());
        builder.setConsent(getIABGDPRString());
        String uSPrivacyString = getUSPrivacyString();
        if (!TextUtils.isEmpty(uSPrivacyString)) {
            builder.setCcpa(uSPrivacyString);
        }
    }

    public UserRestrictionParams setConsentConfig(boolean z, String str) {
        this.gdprConsentString = str;
        this.hasConsent = Boolean.valueOf(z);
        return this;
    }

    public UserRestrictionParams setSubjectToGDPR(Boolean bool) {
        this.subjectToGDPR = bool;
        return this;
    }

    public UserRestrictionParams setCoppa(Boolean bool) {
        this.hasCoppa = bool;
        return this;
    }

    public UserRestrictionParams setUSPrivacyString(String str) {
        this.usPrivacyString = str;
        return this;
    }

    private boolean subjectToGDPR() {
        IABSharedPreference iabSharedPreference = BidMachineImpl.get().getIabSharedPreference();
        Boolean bool = (Boolean) Utils.oneOf(this.subjectToGDPR, iabSharedPreference.getTcfGdprApplies(), iabSharedPreference.getSubjectToGDPR());
        return bool != null && bool.booleanValue();
    }

    private boolean hasConsent() {
        Boolean bool = this.hasConsent;
        return bool != null && bool.booleanValue();
    }

    private boolean hasCoppa() {
        Boolean bool = this.hasCoppa;
        return bool != null && bool.booleanValue();
    }

    public boolean canSendGeoPosition() {
        return !hasCoppa() && !isUserGdprProtected();
    }

    public boolean canSendUserInfo() {
        return !hasCoppa() && !isUserGdprProtected();
    }

    public boolean canSendDeviceInfo() {
        return !hasCoppa();
    }

    public boolean canSendIfa() {
        return !isUserGdprProtected();
    }

    public boolean isUserInGdprScope() {
        return subjectToGDPR();
    }

    public boolean isUserHasConsent() {
        return hasConsent();
    }

    public boolean isUserGdprProtected() {
        return subjectToGDPR() && !hasConsent();
    }

    public boolean isUserAgeRestricted() {
        return hasCoppa();
    }

    public String getUSPrivacyString() {
        return (String) Utils.oneOf(this.usPrivacyString, BidMachineImpl.get().getIabSharedPreference().getUSPrivacyString());
    }

    public boolean isUserInCcpaScope() {
        String uSPrivacyString = getUSPrivacyString();
        if (uSPrivacyString == null || uSPrivacyString.length() != 4 || uSPrivacyString.charAt(0) != '1' || uSPrivacyString.contains("---")) {
            return false;
        }
        return true;
    }

    public boolean isUserHasCcpaConsent() {
        String uSPrivacyString = getUSPrivacyString();
        if (uSPrivacyString == null || uSPrivacyString.length() != 4 || uSPrivacyString.charAt(0) != '1') {
            return false;
        }
        if (uSPrivacyString.charAt(2) == 'N' || uSPrivacyString.charAt(2) == 'n') {
            return true;
        }
        return false;
    }

    public String getIABGDPRString() {
        IABSharedPreference iabSharedPreference = BidMachineImpl.get().getIabSharedPreference();
        String str = (String) Utils.oneOf(this.gdprConsentString, iabSharedPreference.getTcfTcString(), iabSharedPreference.getGDPRConsentString());
        if (TextUtils.isEmpty(str)) {
            return hasConsent() ? "1" : BuildConfig.ADAPTER_VERSION;
        }
        return str;
    }
}
