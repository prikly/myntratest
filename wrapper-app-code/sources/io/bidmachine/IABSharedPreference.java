package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

class IABSharedPreference {
    static final String IAB_CONSENT_STRING = "IABConsent_ConsentString";
    static final String IAB_SUBJECT_TO_GDPR = "IABConsent_SubjectToGDPR";
    static final String IAB_TCF_GDPR_APPLIES = "IABTCF_gdprApplies";
    static final String IAB_TCF_TC_STRING = "IABTCF_TCString";
    static final String IAB_US_PRIVACY_STRING = "IABUSPrivacy_String";
    private String iabGDPRConsentString;
    private Boolean iabSubjectToGDPR;
    private Boolean iabTcfGdprApplies;
    private String iabTcfTcString;
    private String iabUSPrivacyString;
    private final SharedPreferences.OnSharedPreferenceChangeListener sharedPreferenceListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (!TextUtils.isEmpty(str)) {
                char c2 = 65535;
                switch (str.hashCode()) {
                    case 83641339:
                        if (str.equals(IABSharedPreference.IAB_TCF_GDPR_APPLIES)) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 743443760:
                        if (str.equals(IABSharedPreference.IAB_US_PRIVACY_STRING)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 969191740:
                        if (str.equals(IABSharedPreference.IAB_CONSENT_STRING)) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1218895378:
                        if (str.equals(IABSharedPreference.IAB_TCF_TC_STRING)) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1233058135:
                        if (str.equals(IABSharedPreference.IAB_SUBJECT_TO_GDPR)) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    IABSharedPreference.this.updateConsentString(sharedPreferences);
                } else if (c2 == 1) {
                    IABSharedPreference.this.updateGDPRSubject(sharedPreferences);
                } else if (c2 == 2) {
                    IABSharedPreference.this.updateUSPrivacyString(sharedPreferences);
                } else if (c2 == 3) {
                    IABSharedPreference.this.updateTcfTcString(sharedPreferences);
                } else if (c2 == 4) {
                    IABSharedPreference.this.updateTcfGdprApplies(sharedPreferences);
                }
            }
        }
    };

    IABSharedPreference() {
    }

    /* access modifiers changed from: package-private */
    public void initialize(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.sharedPreferenceListener);
        updateConsentString(defaultSharedPreferences);
        updateGDPRSubject(defaultSharedPreferences);
        updateUSPrivacyString(defaultSharedPreferences);
        updateTcfTcString(defaultSharedPreferences);
        updateTcfGdprApplies(defaultSharedPreferences);
    }

    /* access modifiers changed from: package-private */
    public String getGDPRConsentString() {
        return this.iabGDPRConsentString;
    }

    /* access modifiers changed from: private */
    public void updateConsentString(SharedPreferences sharedPreferences) {
        this.iabGDPRConsentString = readString(sharedPreferences, IAB_CONSENT_STRING, (String) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean getSubjectToGDPR() {
        return this.iabSubjectToGDPR;
    }

    /* access modifiers changed from: private */
    public void updateGDPRSubject(SharedPreferences sharedPreferences) {
        Boolean bool = null;
        String readString = readString(sharedPreferences, IAB_SUBJECT_TO_GDPR, (String) null);
        if (readString != null) {
            bool = Boolean.valueOf(readString.equals("1"));
        }
        this.iabSubjectToGDPR = bool;
    }

    /* access modifiers changed from: package-private */
    public String getUSPrivacyString() {
        return this.iabUSPrivacyString;
    }

    /* access modifiers changed from: private */
    public void updateUSPrivacyString(SharedPreferences sharedPreferences) {
        this.iabUSPrivacyString = readString(sharedPreferences, IAB_US_PRIVACY_STRING, (String) null);
    }

    /* access modifiers changed from: package-private */
    public String getTcfTcString() {
        return this.iabTcfTcString;
    }

    /* access modifiers changed from: private */
    public void updateTcfTcString(SharedPreferences sharedPreferences) {
        this.iabTcfTcString = readString(sharedPreferences, IAB_TCF_TC_STRING, (String) null);
    }

    /* access modifiers changed from: package-private */
    public Boolean getTcfGdprApplies() {
        return this.iabTcfGdprApplies;
    }

    /* access modifiers changed from: private */
    public void updateTcfGdprApplies(SharedPreferences sharedPreferences) {
        int readInt = readInt(sharedPreferences, IAB_TCF_GDPR_APPLIES, -1);
        if (readInt == 1) {
            this.iabTcfGdprApplies = true;
        } else if (readInt == 0) {
            this.iabTcfGdprApplies = false;
        } else {
            this.iabTcfGdprApplies = null;
        }
    }

    /* access modifiers changed from: package-private */
    public String readString(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            String string = sharedPreferences.getString(str, str2);
            return string != null ? string : str2;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public int readInt(SharedPreferences sharedPreferences, String str, int i) {
        try {
            if (sharedPreferences.contains(str)) {
                return sharedPreferences.getInt(str, i);
            }
        } catch (Exception unused) {
        }
        return i;
    }
}
