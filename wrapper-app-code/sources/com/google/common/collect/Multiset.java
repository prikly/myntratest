package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import java.util.Collection;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        int getCount();

        E getElement();
    }

    Set<Entry<E>> entrySet();

    void forEach(Consumer<? super E> consumer);

    int size();

    Spliterator<E> spliterator();

    /* renamed from: com.google.common.collect.Multiset$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$forEach(Multiset _this, Consumer consumer) {
            Preconditions.checkNotNull(consumer);
            _this.entrySet().forEach(new Consumer(consumer) {
                public final /* synthetic */ Consumer f$0;

                {
                    this.f$0 = r1;
                }

                public final void accept(Object obj) {
                    Multiset.CC.lambda$forEach$1(this.f$0, (Multiset.Entry) obj);
                }
            });
        }

        public static /* synthetic */ void lambda$forEach$1(Consumer consumer, Entry entry) {
            Object element = entry.getElement();
            int count = entry.getCount();
            for (int i = 0; i < count; i++) {
                consumer.accept(element);
            }
        }

        public static Spliterator $default$spliterator(Multiset _this) {
            return Multisets.spliteratorImpl(_this);
        }
    }
}
