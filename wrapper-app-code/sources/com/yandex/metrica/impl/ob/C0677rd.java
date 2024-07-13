package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.coreutils.network.UserAgent;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.rd  reason: case insensitive filesystem */
public final class C0677rd {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<C0654qd, ExponentialBackoffDataHolder> f6696a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final String f6697b = UserAgent.getFor("com.yandex.mobile.metrica.sdk", "5.3.0", "45003240");

    /* renamed from: c  reason: collision with root package name */
    public static final C0677rd f6698c = new C0677rd();

    private C0677rd() {
    }

    private final synchronized ExponentialBackoffDataHolder a(C0654qd qdVar) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder;
        Map<C0654qd, ExponentialBackoffDataHolder> map = f6696a;
        exponentialBackoffDataHolder = map.get(qdVar);
        if (exponentialBackoffDataHolder == null) {
            F0 g2 = F0.g();
            Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
            C0352e9 s = g2.s();
            Intrinsics.checkNotNullExpressionValue(s, "GlobalServiceLocator.get…ance().servicePreferences");
            exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C0630pd(s, qdVar));
            map.put(qdVar, exponentialBackoffDataHolder);
        }
        return exponentialBackoffDataHolder;
    }

    public static final NetworkTask a(Context context, ConfigProvider<D4> configProvider, C0293c0 c0Var, E4 e4, C0276b8 b8Var) {
        FullUrlFormer fullUrlFormer = new FullUrlFormer(new Og(), configProvider);
        Gm gm = new Gm();
        Context context2 = context;
        C0605od odVar = new C0605od(context);
        C0530ld ldVar = new C0530ld(f6698c.a(C0654qd.DIAGNOSTIC));
        B4 b4 = new B4(configProvider, c0Var, e4, b8Var, new DefaultNetworkResponseHandler(), new RequestDataHolder(), new ResponseDataHolder(new C0580nd()), fullUrlFormer);
        return new NetworkTask(gm, odVar, ldVar, b4, CollectionsKt.listOf(A2.a()), f6697b);
    }

    public static final NetworkTask a(Context context, C0406gd gdVar, C0690s2 s2Var, Fc fc) {
        C0878zm zmVar = new C0878zm();
        Pg pg = new Pg(zmVar);
        C0 c0 = new C0(gdVar);
        Context context2 = context;
        return new NetworkTask(new Gm(), new C0605od(context2), new C0530ld(f6698c.a(C0654qd.LOCATION)), new C0306cd(context2, s2Var, fc, pg, c0, new RequestDataHolder(), new ResponseDataHolder(new C0580nd()), new FullUrlFormer(pg, c0), zmVar), CollectionsKt.listOf(A2.a()), f6697b);
    }

    public static final NetworkTask a(L3 l3) {
        C0878zm zmVar = new C0878zm();
        Qg qg = new Qg(zmVar);
        L3 l32 = l3;
        C0319d1 d1Var = new C0319d1(l32);
        return new NetworkTask(new Gm(), new C0605od(l3.g()), new C0530ld(f6698c.a(C0654qd.REPORT)), new P1(l32, qg, d1Var, new FullUrlFormer(qg, d1Var), new RequestDataHolder(), new ResponseDataHolder(new C0580nd()), zmVar), CollectionsKt.listOf(A2.a()), f6697b);
    }

    public static final NetworkTask a(C0682ri riVar, Mg mg) {
        Kg kg = new Kg();
        F0 g2 = F0.g();
        Intrinsics.checkNotNullExpressionValue(g2, "GlobalServiceLocator.getInstance()");
        Rg rg = new Rg(kg, g2.j());
        C0 c0 = new C0(mg);
        Qm qm = new Qm();
        C0605od odVar = new C0605od(riVar.b());
        C0530ld ldVar = new C0530ld(f6698c.a(C0654qd.STARTUP));
        C0643q2 q2Var = new C0643q2(riVar, new FullUrlFormer(rg, c0), new RequestDataHolder(), new ResponseDataHolder(new C0580nd()), c0);
        return new NetworkTask(qm, odVar, ldVar, q2Var, CollectionsKt.emptyList(), f6697b);
    }
}
