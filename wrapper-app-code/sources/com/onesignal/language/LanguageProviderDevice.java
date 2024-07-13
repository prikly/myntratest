package com.onesignal.language;

public class LanguageProviderDevice implements LanguageProvider {
    private static final String CHINESE = "zh";
    private static final String HEBREW_CORRECTED = "he";
    private static final String HEBREW_INCORRECT = "iw";
    private static final String INDONESIAN_CORRECTED = "id";
    private static final String INDONESIAN_INCORRECT = "in";
    private static final String YIDDISH_CORRECTED = "yi";
    private static final String YIDDISH_INCORRECT = "ji";

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getLanguage() {
        /*
            r6 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            int r1 = r0.hashCode()
            r2 = 3365(0xd25, float:4.715E-42)
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == r2) goto L_0x003e
            r2 = 3374(0xd2e, float:4.728E-42)
            if (r1 == r2) goto L_0x0034
            r2 = 3391(0xd3f, float:4.752E-42)
            if (r1 == r2) goto L_0x002a
            r2 = 3886(0xf2e, float:5.445E-42)
            if (r1 == r2) goto L_0x0020
            goto L_0x0048
        L_0x0020:
            java.lang.String r1 = "zh"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0048
            r1 = 3
            goto L_0x0049
        L_0x002a:
            java.lang.String r1 = "ji"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0048
            r1 = 2
            goto L_0x0049
        L_0x0034:
            java.lang.String r1 = "iw"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0048
            r1 = 0
            goto L_0x0049
        L_0x003e:
            java.lang.String r1 = "in"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0048
            r1 = 1
            goto L_0x0049
        L_0x0048:
            r1 = -1
        L_0x0049:
            if (r1 == 0) goto L_0x0075
            if (r1 == r5) goto L_0x0072
            if (r1 == r4) goto L_0x006f
            if (r1 == r3) goto L_0x0052
            return r0
        L_0x0052:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x006f:
            java.lang.String r0 = "yi"
            return r0
        L_0x0072:
            java.lang.String r0 = "id"
            return r0
        L_0x0075:
            java.lang.String r0 = "he"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.language.LanguageProviderDevice.getLanguage():java.lang.String");
    }
}
