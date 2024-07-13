package com.explorestack.iab.bridge;

import android.util.Base64;
import java.util.Arrays;
import java.util.List;

public final class NativeStorageJsBridge implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final List<String> f2936c = Arrays.asList(new String[]{"readFile", "writeFile", "readDefaults", "writeDefaults"});

    /* renamed from: a  reason: collision with root package name */
    public final com.explorestack.iab.mraid.a f2937a = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f2938b;

    public class a implements com.explorestack.iab.mraid.a {
        public a() {
        }

        public String a(String str) {
            return str.substring(16);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            /*
                r5 = this;
                r6.hashCode()
                int r0 = r6.hashCode()
                r1 = 3
                r2 = 2
                r3 = 0
                r4 = 1
                switch(r0) {
                    case -1406748165: goto L_0x0030;
                    case -1202102447: goto L_0x0025;
                    case -867956686: goto L_0x001a;
                    case -802768376: goto L_0x000f;
                    default: goto L_0x000e;
                }
            L_0x000e:
                goto L_0x003b
            L_0x000f:
                java.lang.String r0 = "readDefaults"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L_0x0018
                goto L_0x003b
            L_0x0018:
                r6 = 3
                goto L_0x003c
            L_0x001a:
                java.lang.String r0 = "readFile"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L_0x0023
                goto L_0x003b
            L_0x0023:
                r6 = 2
                goto L_0x003c
            L_0x0025:
                java.lang.String r0 = "writeDefaults"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L_0x002e
                goto L_0x003b
            L_0x002e:
                r6 = 1
                goto L_0x003c
            L_0x0030:
                java.lang.String r0 = "writeFile"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L_0x0039
                goto L_0x003b
            L_0x0039:
                r6 = 0
                goto L_0x003c
            L_0x003b:
                r6 = -1
            L_0x003c:
                java.lang.String r0 = "path"
                if (r6 == 0) goto L_0x004c
                if (r6 == r4) goto L_0x004c
                if (r6 == r2) goto L_0x0047
                if (r6 == r1) goto L_0x0047
                return r4
            L_0x0047:
                boolean r6 = r7.containsKey(r0)
                return r6
            L_0x004c:
                boolean r6 = r7.containsKey(r0)
                if (r6 == 0) goto L_0x005b
                java.lang.String r6 = "data"
                boolean r6 = r7.containsKey(r6)
                if (r6 == 0) goto L_0x005b
                r3 = 1
            L_0x005b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.bridge.NativeStorageJsBridge.a.a(java.lang.String, java.util.Map):boolean");
        }

        public boolean b(String str) {
            return NativeStorageJsBridge.f2936c.contains(str);
        }
    }

    public com.explorestack.iab.mraid.a a() {
        return this.f2937a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.explorestack.iab.mraid.i r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r5 = this;
            r7.hashCode()
            int r0 = r7.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1406748165: goto L_0x002f;
                case -1202102447: goto L_0x0024;
                case -867956686: goto L_0x0019;
                case -802768376: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003a
        L_0x000e:
            java.lang.String r0 = "readDefaults"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            r7 = 3
            goto L_0x003b
        L_0x0019:
            java.lang.String r0 = "readFile"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0022
            goto L_0x003a
        L_0x0022:
            r7 = 2
            goto L_0x003b
        L_0x0024:
            java.lang.String r0 = "writeDefaults"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            r7 = 1
            goto L_0x003b
        L_0x002f:
            java.lang.String r0 = "writeFile"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r7 = 0
            goto L_0x003b
        L_0x003a:
            r7 = -1
        L_0x003b:
            java.lang.String r0 = "data"
            java.lang.String r4 = "path"
            if (r7 == 0) goto L_0x006c
            if (r7 == r3) goto L_0x005c
            if (r7 == r2) goto L_0x0052
            if (r7 == r1) goto L_0x0048
            goto L_0x007b
        L_0x0048:
            java.lang.Object r7 = r8.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            com.explorestack.iab.bridge.b.a((com.explorestack.iab.mraid.i) r6, (java.lang.String) r7)
            goto L_0x007b
        L_0x0052:
            java.lang.Object r7 = r8.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            com.explorestack.iab.bridge.b.b(r6, r7)
            goto L_0x007b
        L_0x005c:
            java.lang.Object r7 = r8.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            com.explorestack.iab.bridge.b.a(r6, r7, r8)
            goto L_0x007b
        L_0x006c:
            java.lang.Object r7 = r8.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r8.get(r0)
            java.lang.String r8 = (java.lang.String) r8
            com.explorestack.iab.bridge.b.b(r6, r7, r8)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.bridge.NativeStorageJsBridge.a(com.explorestack.iab.mraid.i, java.lang.String, java.util.Map):void");
    }

    public boolean a(String str) {
        return str.startsWith("nativestorage://");
    }

    public String b() {
        if (this.f2938b == null) {
            this.f2938b = new String(Base64.decode("KGZ1bmN0aW9uKGMsZCl7dmFyIHI9YixlPWMoKTt3aGlsZSghIVtdKXt0cnl7dmFyIGY9cGFyc2VJbnQocigweDEyZCkpLzB4MSooLXBhcnNlSW50KHIoMHgxMmMpKS8weDIpKy1wYXJzZUludChyKDB4MTJhKSkvMHgzK3BhcnNlSW50KHIoMHgxM2MpKS8weDQqKHBhcnNlSW50KHIoMHgxNDcpKS8weDUpK3BhcnNlSW50KHIoMHgxMzYpKS8weDYrcGFyc2VJbnQocigweDEyOCkpLzB4NytwYXJzZUludChyKDB4MTNmKSkvMHg4Ky1wYXJzZUludChyKDB4MTJlKSkvMHg5O2lmKGY9PT1kKWJyZWFrO2Vsc2UgZVsncHVzaCddKGVbJ3NoaWZ0J10oKSk7fWNhdGNoKGcpe2VbJ3B1c2gnXShlWydzaGlmdCddKCkpO319fShhLDB4NWQ3NzcpLGZ1bmN0aW9uKCl7dmFyIHM9YixjPXdpbmRvd1snbmF0aXZlU3RvcmFnZSddPXt9LGQ9Y1tzKDB4MTQ1KV09eydSRUFEX0ZJTEVfU1VDQ0VTU19FVkVOVCc6cygweDEzYSksJ1JFQURfREVGQVVMVFNfU1VDQ0VTU19FVkVOVCc6cygweDEzYiksJ0VSUk9SX0VWRU5UJzpzKDB4MTM3KX0sZT17fTtjWydhZGRFdmVudExpc3RlbmVyJ109ZnVuY3Rpb24oaixrKXt2YXIgdD1zO2lmKCFqfHwha3x8IWYoaixkKSlyZXR1cm47dmFyIGw9ZVtqXT1lW2pdfHxbXTtmb3IodmFyIG09MHgwO208bFt0KDB4MTMzKV07bSsrKXt2YXIgbj1TdHJpbmcoayksbz1TdHJpbmcobFttXSk7aWYoaz09PWxbbV18fG49PT1vKXJldHVybjt9bFt0KDB4MTNkKV0oayk7fSxjWydyZW1vdmVFdmVudExpc3RlbmVyJ109ZnVuY3Rpb24oaixrKXt2YXIgdT1zO2lmKCFqfHwhZihqLGQpKXJldHVybjtpZihlW3UoMHgxMzApXShqKSl7aWYoayl7dmFyIGw9ZVtqXSxtPWxbdSgweDEzMyldO2Zvcih2YXIgbj0weDA7bjxtO24rKyl7dmFyIG89bFtuXSxwPVN0cmluZyhrKSxxPVN0cmluZyhvKTtpZihrPT09b3x8cD09PXEpe2xbJ3NwbGljZSddKG4sMHgxKTticmVhazt9fWxbdSgweDEzMyldPT09MHgwJiZkZWxldGUgZVtqXTt9ZWxzZSBkZWxldGUgZVtqXTt9fSxjW3MoMHgxNDEpXT1mdW5jdGlvbihpKXt2YXIgdj1zLGo9digweDEzNSkrZW5jb2RlVVJJQ29tcG9uZW50KGkpO2codigweDEzOCkraik7fSxjW3MoMHgxNDApXT1mdW5jdGlvbihpLGope3ZhciB3PXMsaz13KDB4MTM1KStlbmNvZGVVUklDb21wb25lbnQoaSkrJyZkYXRhPScrZW5jb2RlVVJJQ29tcG9uZW50KGopO2codygweDEyZikrayk7fSxjW3MoMHgxMzQpXT1mdW5jdGlvbihpKXt2YXIgeD1zLGo9eCgweDEzNSkrZW5jb2RlVVJJQ29tcG9uZW50KGkpO2coeCgweDE0Mykraik7fSxjW3MoMHgxNDQpXT1mdW5jdGlvbihpLGope3ZhciB5PXMsaz15KDB4MTM1KStlbmNvZGVVUklDb21wb25lbnQoaSkrJyZkYXRhPScrZW5jb2RlVVJJQ29tcG9uZW50KGopO2coeSgweDEyOSkrayk7fSxjW3MoMHgxMmIpXT1mdW5jdGlvbihpLGope3ZhciB6PXM7aChjW3ooMHgxNDUpXVt6KDB4MTMxKV0saSxqKTt9LGNbJ2ZpcmVSZWFkRGVmYXVsdHNTdWNjZXNzRXZlbnQnXT1mdW5jdGlvbihpLGope3ZhciBBPXM7aChjWydFVkVOVFMnXVtBKDB4MTNlKV0saSxqKTt9LGNbJ2ZpcmVFcnJvckV2ZW50J109ZnVuY3Rpb24oaSl7dmFyIEI9cztoKGNbQigweDE0NSldWydFUlJPUl9FVkVOVCddLGkpO307dmFyIGY9ZnVuY3Rpb24oaixrKXtmb3IodmFyIGwgaW4gayl7aWYoa1tsXT09PWopcmV0dXJuISFbXTt9cmV0dXJuIVtdO30sZz1mdW5jdGlvbihpKXt2YXIgQz1zO3dpbmRvd1tDKDB4MTQ5KV09QygweDE0MikraTt9LGg9ZnVuY3Rpb24oail7dmFyIEQ9cyxrPUFycmF5Wydwcm90b3R5cGUnXVtEKDB4MTQ2KV1bRCgweDE0OCldKGFyZ3VtZW50cyk7a1tEKDB4MTM5KV0oKTt2YXIgbD1lW2pdO2lmKGwpe3ZhciBtPWxbRCgweDE0NildKCksbj1tW0QoMHgxMzMpXTtmb3IodmFyIG89MHgwO288bjtvKyspe21bb11bRCgweDEzMildKG51bGwsayk7fX19O30oKSk7ZnVuY3Rpb24gYihjLGQpe3ZhciBlPWEoKTtyZXR1cm4gYj1mdW5jdGlvbihmLGcpe2Y9Zi0weDEyODt2YXIgaD1lW2ZdO3JldHVybiBoO30sYihjLGQpO31mdW5jdGlvbiBhKCl7dmFyIEU9WydzbGljZScsJzVubGtBS0onLCdjYWxsJywnbG9jYXRpb24nLCc0MDE0MjY5RFRYS1RVJywnd3JpdGVEZWZhdWx0cz8nLCc4ODE2NThvQVlkWnYnLCdmaXJlUmVhZEZpbGVTdWNjZXNzRXZlbnQnLCc0MjQ5MjhaTkxIUHAnLCcyWGZJbWpnJywnOTgyNjQ5N2NZYXFVQicsJ3dyaXRlRmlsZT8nLCdoYXNPd25Qcm9wZXJ0eScsJ1JFQURfRklMRV9TVUNDRVNTX0VWRU5UJywnYXBwbHknLCdsZW5ndGgnLCdyZWFkRGVmYXVsdHMnLCdwYXRoPScsJzE5NzQwOTBZem9kd1knLCdlcnJvcicsJ3JlYWRGaWxlPycsJ3NoaWZ0JywncmVhZEZpbGVTdWNjZXNzJywncmVhZERlZmF1bHRzU3VjY2VzcycsJzI3NDExODhSeW5pUGsnLCdwdXNoJywnUkVBRF9ERUZBVUxUU19TVUNDRVNTX0VWRU5UJywnNDg0NTY1Nk5na3NERicsJ3dyaXRlRmlsZScsJ3JlYWRGaWxlJywnbmF0aXZlc3RvcmFnZTovLycsJ3JlYWREZWZhdWx0cz8nLCd3cml0ZURlZmF1bHRzJywnRVZFTlRTJ107YT1mdW5jdGlvbigpe3JldHVybiBFO307cmV0dXJuIGEoKTt9", 0));
        }
        return this.f2938b;
    }
}
