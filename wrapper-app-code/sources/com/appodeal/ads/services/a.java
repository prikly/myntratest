package com.appodeal.ads.services;

import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.log.InternalLogKt;
import com.appodeal.ads.modules.common.internal.service.Service;
import com.appodeal.ads.modules.common.internal.service.ServiceInfo;
import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import com.appodeal.ads.modules.common.internal.service.ServicesRegistry;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

public final class a implements ServicesRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f17289a = new EnumMap(ServiceVariant.class);

    @DebugMetadata(c = "com.appodeal.ads.services.ServicesRegistryImpl", f = "ServicesRegistryImpl.kt", l = {48}, m = "initService-0E7RQCE")
    /* renamed from: com.appodeal.ads.services.a$a  reason: collision with other inner class name */
    public static final class C0202a extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public Service f17290a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f17291b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a f17292c;

        /* renamed from: d  reason: collision with root package name */
        public int f17293d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0202a(a aVar, Continuation<? super C0202a> continuation) {
            super(continuation);
            this.f17292c = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17291b = obj;
            this.f17293d |= RecyclerView.UNDEFINED_DURATION;
            Object a2 = this.f17292c.a((ServiceVariant) null, (ServiceOptions) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m43boximpl(a2);
        }
    }

    @DebugMetadata(c = "com.appodeal.ads.services.ServicesRegistryImpl", f = "ServicesRegistryImpl.kt", l = {17, 18, 19, 20, 21, 22}, m = "initialize-gIAlu-s")
    public static final class b extends ContinuationImpl {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17294a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f17295b;

        /* renamed from: c  reason: collision with root package name */
        public int f17296c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f17295b = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17294a = obj;
            this.f17296c |= RecyclerView.UNDEFINED_DURATION;
            Object r2 = this.f17295b.m152initializegIAlus((ServiceOptions) null, this);
            return r2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r2 : Result.m43boximpl(r2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal("ServicesRegistry", kotlin.jvm.internal.Intrinsics.stringPlus("service error: ", r7), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b7, code lost:
        r8 = kotlin.Result.Companion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        return kotlin.Result.m44constructorimpl(kotlin.ResultKt.createFailure(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asFailure(r8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0029, B:16:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a A[Catch:{ Exception -> 0x0033, all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3 A[Catch:{ Exception -> 0x0033, all -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.appodeal.ads.modules.common.internal.service.ServiceVariant r7, com.appodeal.ads.modules.common.internal.service.ServiceOptions r8, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.appodeal.ads.modules.common.internal.service.Service<? extends com.appodeal.ads.modules.common.internal.service.ServiceOptions>>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.appodeal.ads.services.a.C0202a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.appodeal.ads.services.a$a r0 = (com.appodeal.ads.services.a.C0202a) r0
            int r1 = r0.f17293d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17293d = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.services.a$a r0 = new com.appodeal.ads.services.a$a
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f17291b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17293d
            java.lang.String r3 = "ServicesRegistry"
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            com.appodeal.ads.modules.common.internal.service.Service r7 = r0.f17290a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ Exception -> 0x0033 }
            kotlin.Result r9 = (kotlin.Result) r9     // Catch:{ Exception -> 0x0033 }
            java.lang.Object r8 = r9.m51unboximpl()     // Catch:{ Exception -> 0x0033 }
            goto L_0x0094
        L_0x0033:
            r8 = move-exception
            goto L_0x00a8
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ all -> 0x00b6 }
            java.util.EnumMap r9 = r6.f17289a     // Catch:{ all -> 0x00b6 }
            java.lang.Object r9 = r9.remove(r7)     // Catch:{ all -> 0x00b6 }
            boolean r2 = r9 instanceof com.appodeal.ads.modules.common.internal.service.Service     // Catch:{ all -> 0x00b6 }
            r5 = 0
            if (r2 == 0) goto L_0x0051
            com.appodeal.ads.modules.common.internal.service.Service r9 = (com.appodeal.ads.modules.common.internal.service.Service) r9     // Catch:{ all -> 0x00b6 }
            goto L_0x0052
        L_0x0051:
            r9 = r5
        L_0x0052:
            if (r9 != 0) goto L_0x007e
            java.lang.String r7 = r7.getClassName()     // Catch:{ all -> 0x00b6 }
            java.lang.Class<com.appodeal.ads.services.a> r9 = com.appodeal.ads.services.a.class
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ all -> 0x00b6 }
            r2 = 0
            java.lang.Class r7 = java.lang.Class.forName(r7, r2, r9)     // Catch:{ all -> 0x00b6 }
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r7.newInstance()     // Catch:{ all -> 0x00b6 }
            if (r7 == 0) goto L_0x006e
            com.appodeal.ads.modules.common.internal.service.Service r7 = (com.appodeal.ads.modules.common.internal.service.Service) r7     // Catch:{ all -> 0x00b6 }
            goto L_0x007f
        L_0x006e:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = "null cannot be cast to non-null type com.appodeal.ads.modules.common.internal.service.Service<com.appodeal.ads.modules.common.internal.service.ServiceOptions>"
            r7.<init>(r8)     // Catch:{ all -> 0x00b6 }
            throw r7     // Catch:{ all -> 0x00b6 }
        L_0x0076:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.Class<com.appodeal.ads.modules.common.internal.service.Service<Options of com.appodeal.ads.services.ServicesRegistryImpl.obtainServiceClass>>"
            r7.<init>(r8)     // Catch:{ all -> 0x00b6 }
            throw r7     // Catch:{ all -> 0x00b6 }
        L_0x007e:
            r7 = r9
        L_0x007f:
            java.lang.String r9 = "service: "
            java.lang.String r9 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r7)     // Catch:{ all -> 0x00b6 }
            r2 = 4
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal$default(r3, r9, r5, r2, r5)     // Catch:{ all -> 0x00b6 }
            r0.f17290a = r7     // Catch:{ Exception -> 0x0033 }
            r0.f17293d = r4     // Catch:{ Exception -> 0x0033 }
            java.lang.Object r8 = r7.m143initializegIAlus(r8, r0)     // Catch:{ Exception -> 0x0033 }
            if (r8 != r1) goto L_0x0094
            return r1
        L_0x0094:
            boolean r9 = kotlin.Result.m49isSuccessimpl(r8)     // Catch:{ Exception -> 0x0033 }
            if (r9 == 0) goto L_0x00a3
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ Exception -> 0x0033 }
            kotlin.Unit r8 = (kotlin.Unit) r8     // Catch:{ Exception -> 0x0033 }
            java.lang.Object r7 = kotlin.Result.m44constructorimpl(r7)     // Catch:{ Exception -> 0x0033 }
            goto L_0x00b5
        L_0x00a3:
            java.lang.Object r7 = kotlin.Result.m44constructorimpl(r8)     // Catch:{ Exception -> 0x0033 }
            goto L_0x00b5
        L_0x00a8:
            java.lang.String r9 = "service error: "
            java.lang.String r7 = kotlin.jvm.internal.Intrinsics.stringPlus(r9, r7)     // Catch:{ all -> 0x00b6 }
            com.appodeal.ads.modules.common.internal.log.InternalLogKt.logInternal(r3, r7, r8)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r7 = com.appodeal.ads.modules.common.internal.ext.ResultExtKt.asFailure(r8)     // Catch:{ all -> 0x00b6 }
        L_0x00b5:
            return r7
        L_0x00b6:
            r7 = move-exception
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r7 = kotlin.ResultKt.createFailure(r7)
            java.lang.Object r7 = kotlin.Result.m44constructorimpl(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.a.a(com.appodeal.ads.modules.common.internal.service.ServiceVariant, com.appodeal.ads.modules.common.internal.service.ServiceOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final List<ServiceInfo> getAvailableServicesInfo() {
        Service service;
        ServiceVariant[] values = ServiceVariant.values();
        ArrayList arrayList = new ArrayList();
        int length = values.length;
        int i = 0;
        while (i < length) {
            ServiceVariant serviceVariant = values[i];
            i++;
            try {
                Class<?> cls = Class.forName(serviceVariant.getClassName(), false, a.class.getClassLoader());
                if (cls != null) {
                    Object newInstance = cls.newInstance();
                    if (newInstance != null) {
                        service = (Service) newInstance;
                        this.f17289a.put(serviceVariant, service);
                        if (service != null) {
                            arrayList.add(service);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.appodeal.ads.modules.common.internal.service.Service<com.appodeal.ads.modules.common.internal.service.ServiceOptions>");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<com.appodeal.ads.modules.common.internal.service.Service<Options of com.appodeal.ads.services.ServicesRegistryImpl.obtainServiceClass>>");
                }
            } catch (Exception e2) {
                InternalLogKt.logInternal("ServicesRegistry", "service error:", e2);
                service = null;
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Service) it.next()).getInfo());
        }
        return arrayList2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: initialize-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m152initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions r5, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.appodeal.ads.modules.common.internal.service.Service<? extends com.appodeal.ads.modules.common.internal.service.ServiceOptions>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.services.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.appodeal.ads.services.a$b r0 = (com.appodeal.ads.services.a.b) r0
            int r1 = r0.f17296c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17296c = r1
            goto L_0x0018
        L_0x0013:
            com.appodeal.ads.services.a$b r0 = new com.appodeal.ads.services.a$b
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f17294a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f17296c
            switch(r2) {
                case 0: goto L_0x0069;
                case 1: goto L_0x005f;
                case 2: goto L_0x0055;
                case 3: goto L_0x004b;
                case 4: goto L_0x0041;
                case 5: goto L_0x0036;
                case 6: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.m51unboximpl()
            goto L_0x00d1
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.m51unboximpl()
            goto L_0x00c0
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.m51unboximpl()
            goto L_0x00af
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.m51unboximpl()
            goto L_0x009e
        L_0x0055:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.m51unboximpl()
            goto L_0x008d
        L_0x005f:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.m51unboximpl()
            goto L_0x007c
        L_0x0069:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5 instanceof com.appodeal.ads.modules.common.internal.service.ServiceOptions.Adjust
            if (r6 == 0) goto L_0x007d
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r6 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.Adjust
            r2 = 1
            r0.f17296c = r2
            java.lang.Object r5 = r4.a(r6, r5, r0)
            if (r5 != r1) goto L_0x007c
            return r1
        L_0x007c:
            return r5
        L_0x007d:
            boolean r6 = r5 instanceof com.appodeal.ads.modules.common.internal.service.ServiceOptions.Appsflyer
            if (r6 == 0) goto L_0x008e
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r6 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.Appsflyer
            r2 = 2
            r0.f17296c = r2
            java.lang.Object r5 = r4.a(r6, r5, r0)
            if (r5 != r1) goto L_0x008d
            return r1
        L_0x008d:
            return r5
        L_0x008e:
            boolean r6 = r5 instanceof com.appodeal.ads.modules.common.internal.service.ServiceOptions.FacebookAnalytics
            if (r6 == 0) goto L_0x009f
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r6 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.FacebookAnalytics
            r2 = 3
            r0.f17296c = r2
            java.lang.Object r5 = r4.a(r6, r5, r0)
            if (r5 != r1) goto L_0x009e
            return r1
        L_0x009e:
            return r5
        L_0x009f:
            boolean r6 = r5 instanceof com.appodeal.ads.modules.common.internal.service.ServiceOptions.Firebase
            if (r6 == 0) goto L_0x00b0
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r6 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.Firebase
            r2 = 4
            r0.f17296c = r2
            java.lang.Object r5 = r4.a(r6, r5, r0)
            if (r5 != r1) goto L_0x00af
            return r1
        L_0x00af:
            return r5
        L_0x00b0:
            boolean r6 = r5 instanceof com.appodeal.ads.modules.common.internal.service.ServiceOptions.StackAnalytics
            if (r6 == 0) goto L_0x00c1
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r6 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.StackAnalytics
            r2 = 5
            r0.f17296c = r2
            java.lang.Object r5 = r4.a(r6, r5, r0)
            if (r5 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            return r5
        L_0x00c1:
            boolean r6 = r5 instanceof com.appodeal.ads.modules.common.internal.service.ServiceOptions.SentryAnalytics
            if (r6 == 0) goto L_0x00d2
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r6 = com.appodeal.ads.modules.common.internal.service.ServiceVariant.SentryAnalytics
            r2 = 6
            r0.f17296c = r2
            java.lang.Object r5 = r4.a(r6, r5, r0)
            if (r5 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            return r5
        L_0x00d2:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.a.m152initializegIAlus(com.appodeal.ads.modules.common.internal.service.ServiceOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
