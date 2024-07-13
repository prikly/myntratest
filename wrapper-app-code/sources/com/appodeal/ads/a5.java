package com.appodeal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public final class a5 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f16175a = {"appodeal", AppodealNetworks.BIDMACHINE, "mraid", "vast", "nast"};

    /* renamed from: b  reason: collision with root package name */
    public static boolean f16176b = false;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16177a;

        public a(Context context) {
            this.f16177a = context;
        }

        public final void run() {
            boolean z;
            String[] strArr = new String[0];
            try {
                strArr = this.f16177a.getAssets().list("apd_adapters");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            HashSet hashSet = null;
            if (strArr == null || strArr.length == 0) {
                hashSet = new HashSet();
                hashSet.addAll(Arrays.asList(a5.f16175a));
            } else {
                String[] strArr2 = a5.f16175a;
                for (int i = 0; i < 5; i++) {
                    String str = strArr2[i];
                    String format = String.format("%s.apdnetwork", new Object[]{str});
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        } else if (Objects.equals(strArr[i2], format)) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(str.toUpperCase());
                    }
                }
            }
            if (hashSet != null) {
                Log.e("Appodeal", String.format(" \n\nATTENTION:\n\tAdapters are not registered in you app: \n\t\t%s.\n\tPlease add the dependencies for them to improve your fill rates and increase revenue.\n\tIf you are sure that you do not need these adapters, skip this warning.\n ", new Object[]{TextUtils.join(", ", hashSet)}));
            }
        }
    }

    public static void a(Context context) {
        if (!f16176b) {
            f16176b = true;
            new Thread(new a(context)).start();
        }
    }
}
