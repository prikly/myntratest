package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/yandex/metrica/impl/ob/Vj;", "", "Landroid/content/Context;", "context", "", "Lcom/yandex/metrica/impl/ob/Tj;", "a", "(Landroid/content/Context;)Ljava/util/List;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k = 1, mv = {1, 1, 15})
public final class Vj {

    /* renamed from: a  reason: collision with root package name */
    public static final Vj f5234a = new Vj();

    static final class a<T, R> implements C0614om<SubscriptionManager, List<? extends SubscriptionInfo>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5235a = new a();

        a() {
        }

        public Object a(Object obj) {
            return ((SubscriptionManager) obj).getActiveSubscriptionInfoList();
        }
    }

    private Vj() {
    }

    public static final List<Tj> a(Context context) {
        Integer num;
        Integer num2;
        List<SubscriptionInfo> list = (List) A2.a(a.f5235a, context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager");
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            if (A2.a(29)) {
                num = Wj.a(subscriptionInfo);
            } else {
                num = Integer.valueOf(subscriptionInfo.getMcc());
            }
            if (A2.a(29)) {
                num2 = Wj.b(subscriptionInfo);
            } else {
                num2 = Integer.valueOf(subscriptionInfo.getMnc());
            }
            boolean z = true;
            if (subscriptionInfo.getDataRoaming() != 1) {
                z = false;
            }
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new Tj(num, num2, z, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}
