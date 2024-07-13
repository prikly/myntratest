package com.appodeal.consent.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appodeal.consent.internal.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/appodeal/consent/view/ConsentActivity;", "Landroid/app/Activity;", "<init>", "()V", "a", "apd_consent"}, k = 1, mv = {1, 6, 0})
public final class ConsentActivity extends Activity {

    /* renamed from: b  reason: collision with root package name */
    public static Function1<? super Activity, Unit> f17883b;

    /* renamed from: c  reason: collision with root package name */
    public static Function1<? super Activity, Unit> f17884c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f17885d;

    /* renamed from: e  reason: collision with root package name */
    public static b f17886e;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f17887a;

    public static final class a {
        public static boolean a() {
            return ConsentActivity.f17885d;
        }

        public static void b() {
            ConsentActivity.f17885d = false;
        }

        public static void a(d.f.b bVar) {
            ConsentActivity.f17884c = bVar;
        }

        public static void a(d.f.a aVar) {
            ConsentActivity.f17883b = aVar;
        }

        public static void a(b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "consentWebView");
            ConsentActivity.f17886e = bVar;
            Context applicationContext = bVar.getContext().getApplicationContext();
            if (!ConsentActivity.f17885d) {
                ConsentActivity.f17885d = true;
                Intent intent = new Intent(applicationContext, ConsentActivity.class);
                intent.addFlags(276824064);
                applicationContext.startActivity(intent);
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        b bVar = f17886e;
        if (bVar == null) {
            Function1<? super Activity, Unit> function1 = f17884c;
            if (function1 != null) {
                function1.invoke(this);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(bVar);
        relativeLayout.addView(bVar.getCloseButton());
        this.f17887a = relativeLayout;
        setContentView(relativeLayout, layoutParams);
        getWindow().setLayout(-1, -1);
        Function1<? super Activity, Unit> function12 = f17883b;
        if (function12 != null) {
            function12.invoke(this);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        f17885d = false;
        RelativeLayout relativeLayout = this.f17887a;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
        Function1<? super Activity, Unit> function1 = f17884c;
        if (function1 != null) {
            function1.invoke(this);
        }
    }
}
