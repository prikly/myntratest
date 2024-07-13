package com.appodeal.ads.segments;

import com.appodeal.ads.m;
import com.appodeal.ads.utils.Version;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONArray;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f17260a;

    /* renamed from: b  reason: collision with root package name */
    public final b f17261b;

    /* renamed from: c  reason: collision with root package name */
    public Object f17262c;

    /* renamed from: d  reason: collision with root package name */
    public int f17263d;

    public i(JSONObject jSONObject) {
        String string = jSONObject.getString("name");
        this.f17260a = string;
        this.f17261b = b.a(jSONObject.getString("op"));
        this.f17263d = a(string);
        this.f17262c = a(jSONObject);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r9) {
        /*
            r9.getClass()
            int r0 = r9.hashCode()
            r1 = 9
            r2 = 8
            r3 = 7
            r4 = 6
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r0) {
                case -1561358613: goto L_0x00c5;
                case -1542869117: goto L_0x00ba;
                case -1249512767: goto L_0x00af;
                case -901870406: goto L_0x00a4;
                case -686246186: goto L_0x0099;
                case -376724013: goto L_0x008e;
                case 96511: goto L_0x0083;
                case 96801: goto L_0x0078;
                case 185691686: goto L_0x006a;
                case 672836989: goto L_0x005c;
                case 731866107: goto L_0x004e;
                case 957831062: goto L_0x0040;
                case 1335099163: goto L_0x0032;
                case 1660689696: goto L_0x0024;
                case 1818604305: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x00d0
        L_0x0016:
            java.lang.String r0 = "average_session_length"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0020
            goto L_0x00d0
        L_0x0020:
            r9 = 14
            goto L_0x00d1
        L_0x0024:
            java.lang.String r0 = "part_of_audience"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x002e
            goto L_0x00d0
        L_0x002e:
            r9 = 13
            goto L_0x00d1
        L_0x0032:
            java.lang.String r0 = "inapp_amount"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x003c
            goto L_0x00d0
        L_0x003c:
            r9 = 12
            goto L_0x00d1
        L_0x0040:
            java.lang.String r0 = "country"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x004a
            goto L_0x00d0
        L_0x004a:
            r9 = 11
            goto L_0x00d1
        L_0x004e:
            java.lang.String r0 = "connection_type"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0058
            goto L_0x00d0
        L_0x0058:
            r9 = 10
            goto L_0x00d1
        L_0x005c:
            java.lang.String r0 = "os_version"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0066
            goto L_0x00d0
        L_0x0066:
            r9 = 9
            goto L_0x00d1
        L_0x006a:
            java.lang.String r0 = "session_count"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0074
            goto L_0x00d0
        L_0x0074:
            r9 = 8
            goto L_0x00d1
        L_0x0078:
            java.lang.String r0 = "app"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0081
            goto L_0x00d0
        L_0x0081:
            r9 = 7
            goto L_0x00d1
        L_0x0083:
            java.lang.String r0 = "age"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x008c
            goto L_0x00d0
        L_0x008c:
            r9 = 6
            goto L_0x00d1
        L_0x008e:
            java.lang.String r0 = "sdk_version"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0097
            goto L_0x00d0
        L_0x0097:
            r9 = 5
            goto L_0x00d1
        L_0x0099:
            java.lang.String r0 = "session_time"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00a2
            goto L_0x00d0
        L_0x00a2:
            r9 = 4
            goto L_0x00d1
        L_0x00a4:
            java.lang.String r0 = "app_version"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00ad
            goto L_0x00d0
        L_0x00ad:
            r9 = 3
            goto L_0x00d1
        L_0x00af:
            java.lang.String r0 = "gender"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00b8
            goto L_0x00d0
        L_0x00b8:
            r9 = 2
            goto L_0x00d1
        L_0x00ba:
            java.lang.String r0 = "device_type"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00c3
            goto L_0x00d0
        L_0x00c3:
            r9 = 1
            goto L_0x00d1
        L_0x00c5:
            java.lang.String r0 = "bought_inapps"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r9 = 0
            goto L_0x00d1
        L_0x00d0:
            r9 = -1
        L_0x00d1:
            switch(r9) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00da;
                case 2: goto L_0x00d9;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00d7;
                case 5: goto L_0x00d8;
                case 6: goto L_0x00d6;
                case 7: goto L_0x00d9;
                case 8: goto L_0x00d6;
                case 9: goto L_0x00d8;
                case 10: goto L_0x00d9;
                case 11: goto L_0x00d9;
                case 12: goto L_0x00d5;
                case 13: goto L_0x00d6;
                case 14: goto L_0x00d6;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            return r1
        L_0x00d5:
            return r4
        L_0x00d6:
            return r5
        L_0x00d7:
            return r2
        L_0x00d8:
            return r8
        L_0x00d9:
            return r6
        L_0x00da:
            return r7
        L_0x00db:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.segments.i.a(java.lang.String):int");
    }

    public final Object a(JSONObject jSONObject) {
        int i = 0;
        switch (m.a(this.f17263d)) {
            case 0:
                return new Version(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            case 1:
            case 7:
            case 8:
                return jSONObject.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            case 2:
                JSONArray optJSONArray = jSONObject.optJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                String[] strArr = new String[optJSONArray.length()];
                while (i < optJSONArray.length()) {
                    strArr[i] = optJSONArray.getString(i);
                    i++;
                }
                return strArr;
            case 3:
                return Integer.valueOf(jSONObject.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            case 4:
                JSONArray optJSONArray2 = jSONObject.optJSONArray(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                Integer[] numArr = new Integer[optJSONArray2.length()];
                while (i < optJSONArray2.length()) {
                    numArr[i] = Integer.valueOf(optJSONArray2.getString(i));
                    i++;
                }
                return numArr;
            case 5:
                return Float.valueOf(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            case 6:
                return Boolean.valueOf(jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            default:
                return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r8) {
        /*
            r7 = this;
            com.appodeal.ads.segments.j r0 = com.appodeal.ads.segments.j.b()
            java.lang.String r1 = r7.f17260a
            r0.getClass()
            r2 = 0
            if (r1 != 0) goto L_0x000e
        L_0x000c:
            r8 = r2
            goto L_0x0032
        L_0x000e:
            java.util.HashMap r3 = com.appodeal.ads.segments.j.f17268g     // Catch:{ all -> 0x002d }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x002d }
            com.appodeal.ads.segments.j$b r3 = (com.appodeal.ads.segments.j.b) r3     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x001d
            java.lang.Object r8 = r3.a(r8, r0)     // Catch:{ all -> 0x002d }
            goto L_0x001e
        L_0x001d:
            r8 = r2
        L_0x001e:
            if (r8 != 0) goto L_0x0032
            java.util.HashMap r0 = com.appodeal.ads.segments.j.f17265d     // Catch:{ all -> 0x002d }
            boolean r3 = r0.containsKey(r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0032
            java.lang.Object r8 = r0.get(r1)     // Catch:{ all -> 0x002d }
            goto L_0x0032
        L_0x002d:
            r8 = move-exception
            com.appodeal.ads.utils.Log.log(r8)
            goto L_0x000c
        L_0x0032:
            r0 = 0
            if (r8 != 0) goto L_0x0036
            return r0
        L_0x0036:
            int r1 = r7.f17263d
            r3 = 9
            if (r1 != r3) goto L_0x00b0
            boolean r1 = r8 instanceof java.lang.Integer
            r4 = 7
            r5 = 6
            r6 = 4
            if (r1 == 0) goto L_0x0045
            r1 = 4
            goto L_0x0059
        L_0x0045:
            boolean r1 = r8 instanceof java.lang.Float
            if (r1 == 0) goto L_0x004b
            r1 = 6
            goto L_0x0059
        L_0x004b:
            boolean r1 = r8 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x0051
            r1 = 7
            goto L_0x0059
        L_0x0051:
            boolean r1 = r8 instanceof java.lang.String
            if (r1 == 0) goto L_0x0057
            r1 = 2
            goto L_0x0059
        L_0x0057:
            r1 = 9
        L_0x0059:
            r7.f17263d = r1
            if (r1 != r6) goto L_0x0072
            java.lang.Object r1 = r7.f17262c
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L_0x006a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x00ae
        L_0x006a:
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x00ae
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x00ae
        L_0x0072:
            if (r1 != r5) goto L_0x0098
            java.lang.Object r1 = r7.f17262c
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L_0x0081
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            goto L_0x00ae
        L_0x0081:
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x0090
            java.lang.Integer r1 = (java.lang.Integer) r1
            float r1 = r1.floatValue()
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
            goto L_0x00ae
        L_0x0090:
            boolean r4 = r1 instanceof java.lang.Float
            if (r4 == 0) goto L_0x00ae
            r2 = r1
            java.lang.Float r2 = (java.lang.Float) r2
            goto L_0x00ae
        L_0x0098:
            if (r1 != r4) goto L_0x00b0
            java.lang.Object r1 = r7.f17262c
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L_0x00a7
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            goto L_0x00ae
        L_0x00a7:
            boolean r4 = r1 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x00ae
            r2 = r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x00ae:
            r7.f17262c = r2
        L_0x00b0:
            int r1 = r7.f17263d
            if (r1 != r3) goto L_0x00b5
            return r0
        L_0x00b5:
            com.appodeal.ads.segments.b r1 = r7.f17261b
            if (r1 == 0) goto L_0x00c0
            com.appodeal.ads.segments.c r0 = r1.f17243b
            boolean r8 = r0.a(r7, r8)
            return r8
        L_0x00c0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.segments.i.a(android.content.Context):boolean");
    }
}
