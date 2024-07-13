package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.ext.JsonObjectBuilderKt;
import com.appodeal.ads.networking.binders.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class f4 {
    public static final void a(JSONObject jSONObject, b bVar) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "data");
        if (bVar instanceof b.a) {
            function1 = new k3(bVar);
        } else if (bVar instanceof b.j) {
            function1 = new n3(bVar);
        } else if (bVar instanceof b.c) {
            function1 = new r3(bVar);
        } else if (bVar instanceof b.d) {
            function1 = new s3(bVar);
        } else if (bVar instanceof b.f) {
            function1 = new t3(bVar);
        } else if (bVar instanceof b.h) {
            function1 = new u3(bVar);
        } else if (bVar instanceof b.n) {
            function1 = new v3(bVar);
        } else if (bVar instanceof b.i) {
            function1 = new w3(bVar);
        } else if (bVar instanceof b.k) {
            function1 = new e4(bVar);
        } else if (bVar instanceof b.l) {
            function1 = new e3(bVar);
        } else if (bVar instanceof b.m) {
            function1 = new f3(bVar);
        } else if (bVar instanceof b.C0192b) {
            function1 = new h3(bVar);
        } else if (bVar instanceof b.g) {
            function1 = new i3(bVar);
        } else if (bVar instanceof b.e) {
            function1 = new j3(bVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        JsonObjectBuilderKt.jsonObject(jSONObject, function1);
    }
}
