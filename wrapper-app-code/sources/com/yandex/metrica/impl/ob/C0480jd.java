package com.yandex.metrica.impl.ob;

import com.yandex.metrica.modules.api.ModuleEntryPoint;
import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* renamed from: com.yandex.metrica.impl.ob.jd  reason: case insensitive filesystem */
public final class C0480jd implements C0505kd, C0510ki {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<ModuleEntryPoint> f6070a = new CopyOnWriteArrayList<>();

    public Map<String, Integer> a() {
        List list;
        Map blocks;
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f6070a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint remoteConfigExtensionConfiguration : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration2 = remoteConfigExtensionConfiguration.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration2 == null || (blocks = remoteConfigExtensionConfiguration2.getBlocks()) == null || (list = MapsKt.toList(blocks)) == null) {
                list = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, list);
        }
        return MapsKt.toMap(arrayList);
    }

    public void a(C0411gi giVar, C0635pi piVar) {
    }

    public List<String> b() {
        List list;
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f6070a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint remoteConfigExtensionConfiguration : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration2 = remoteConfigExtensionConfiguration.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration2 == null || (list = remoteConfigExtensionConfiguration2.getFeatures()) == null) {
                list = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, list);
        }
        return arrayList;
    }

    public Map<String, C0431hd> c() {
        CopyOnWriteArrayList<ModuleEntryPoint> copyOnWriteArrayList = this.f6070a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint moduleEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleEntryPoint.getRemoteConfigExtensionConfiguration();
            Pair pair = remoteConfigExtensionConfiguration != null ? TuplesKt.to(moduleEntryPoint.getIdentifier(), new C0431hd(remoteConfigExtensionConfiguration)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return MapsKt.toMap(arrayList);
    }

    public void a(C0635pi piVar) {
        C0456id idVar = new C0456id(piVar);
        for (ModuleEntryPoint moduleEntryPoint : this.f6070a) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(idVar.a(moduleEntryPoint.getIdentifier()));
            }
        }
    }
}
