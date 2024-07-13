package com.unity3d.services.identifiers.installationid;

import android.content.Context;
import android.content.SharedPreferences;
import com.onesignal.outcomes.OSOutcomeConstants;
import kotlin.jvm.internal.Intrinsics;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9647a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9648b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9649c;

    public c(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "settingsFile");
        Intrinsics.checkNotNullParameter(str2, "key");
        this.f9647a = context;
        this.f9648b = str;
        this.f9649c = str2;
    }

    public final String a() {
        String string = this.f9647a.getSharedPreferences(this.f9648b, 0).getString(this.f9649c, "");
        return string == null ? "" : string;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, OSOutcomeConstants.OUTCOME_ID);
        SharedPreferences.Editor edit = this.f9647a.getSharedPreferences(this.f9648b, 0).edit();
        edit.putString(this.f9649c, str);
        edit.apply();
    }
}
