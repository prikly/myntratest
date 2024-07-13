package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CollectSpliterators;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

final class CollectSpliterators {
    static <T> Spliterator<T> indexed(int i, int i2, IntFunction<T> intFunction) {
        return indexed(i, i2, intFunction, (Comparator) null);
    }

    static <T> Spliterator<T> indexed(int i, int i2, IntFunction<T> intFunction, Comparator<? super T> comparator) {
        if (comparator != null) {
            Preconditions.checkArgument((i2 & 4) != 0);
        }
        return new AnonymousClass1WithCharacteristics(IntStream.range(0, i).spliterator(), intFunction, i2, comparator);
    }

    /* renamed from: com.google.common.collect.CollectSpliterators$1WithCharacteristics  reason: invalid class name */
    class AnonymousClass1WithCharacteristics implements Spliterator<T> {
        private final Spliterator.OfInt delegate;
        final /* synthetic */ Comparator val$comparator;
        final /* synthetic */ int val$extraCharacteristics;
        final /* synthetic */ IntFunction val$function;

        {
            this.val$function = r2;
            this.val$extraCharacteristics = r3;
            this.val$comparator = r4;
            this.delegate = r1;
        }

        public boolean tryAdvance(Consumer<? super T> consumer) {
            return this.delegate.tryAdvance(new IntConsumer(consumer, this.val$function) {
                public final /* synthetic */ Consumer f$0;
                public final /* synthetic */ IntFunction f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(int i) {
                    this.f$0.accept(this.f$1.apply(i));
                }
            });
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            this.delegate.forEachRemaining(new IntConsumer(consumer, this.val$function) {
                public final /* synthetic */ Consumer f$0;
                public final /* synthetic */ IntFunction f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(int i) {
                    this.f$0.accept(this.f$1.apply(i));
                }
            });
        }

        public Spliterator<T> trySplit() {
            Spliterator.OfInt trySplit = this.delegate.trySplit();
            if (trySplit == null) {
                return null;
            }
            return new AnonymousClass1WithCharacteristics(trySplit, this.val$function, this.val$extraCharacteristics, this.val$comparator);
        }

        public long estimateSize() {
            return this.delegate.estimateSize();
        }

        public int characteristics() {
            return this.val$extraCharacteristics | 16464;
        }

        public Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return this.val$comparator;
            }
            throw new IllegalStateException();
        }
    }

    static <InElementT, OutElementT> Spliterator<OutElementT> flatMap(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
        boolean z = true;
        Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        if ((i & 4) != 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "flatMap does not support SORTED characteristic");
        Preconditions.checkNotNull(spliterator);
        Preconditions.checkNotNull(function);
        return new FlatMapSpliteratorOfObject((Spliterator) null, spliterator, function, i, j);
    }

    static abstract class FlatMapSpliterator<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>> implements Spliterator<OutElementT> {
        int characteristics;
        long estimatedSize;
        final Factory<InElementT, OutSpliteratorT> factory;
        final Spliterator<InElementT> from;
        final Function<? super InElementT, OutSpliteratorT> function;
        OutSpliteratorT prefix;

        @FunctionalInterface
        interface Factory<InElementT, OutSpliteratorT extends Spliterator<?>> {
            OutSpliteratorT newFlatMapSpliterator(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, int i, long j);
        }

        FlatMapSpliterator(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function2, Factory<InElementT, OutSpliteratorT> factory2, int i, long j) {
            this.prefix = outspliteratort;
            this.from = spliterator;
            this.function = function2;
            this.factory = factory2;
            this.characteristics = i;
            this.estimatedSize = j;
        }

        public final boolean tryAdvance(Consumer<? super OutElementT> consumer) {
            do {
                OutSpliteratorT outspliteratort = this.prefix;
                if (outspliteratort == null || !outspliteratort.tryAdvance(consumer)) {
                    this.prefix = null;
                } else {
                    long j = this.estimatedSize;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.estimatedSize = j - 1;
                    return true;
                }
            } while (this.from.tryAdvance(new Consumer() {
                public final void accept(Object obj) {
                    CollectSpliterators.FlatMapSpliterator.this.lambda$tryAdvance$0$CollectSpliterators$FlatMapSpliterator(obj);
                }
            }));
            return false;
        }

        public /* synthetic */ void lambda$tryAdvance$0$CollectSpliterators$FlatMapSpliterator(Object obj) {
            this.prefix = (Spliterator) this.function.apply(obj);
        }

        public final void forEachRemaining(Consumer<? super OutElementT> consumer) {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                outspliteratort.forEachRemaining(consumer);
                this.prefix = null;
            }
            this.from.forEachRemaining(new Consumer(consumer) {
                public final /* synthetic */ Consumer f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    CollectSpliterators.FlatMapSpliterator.this.lambda$forEachRemaining$1$CollectSpliterators$FlatMapSpliterator(this.f$1, obj);
                }
            });
            this.estimatedSize = 0;
        }

        public /* synthetic */ void lambda$forEachRemaining$1$CollectSpliterators$FlatMapSpliterator(Consumer consumer, Object obj) {
            Spliterator spliterator = (Spliterator) this.function.apply(obj);
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
            }
        }

        public final OutSpliteratorT trySplit() {
            Spliterator<InElementT> trySplit = this.from.trySplit();
            if (trySplit != null) {
                int i = this.characteristics & -65;
                long estimateSize = estimateSize();
                if (estimateSize < Long.MAX_VALUE) {
                    estimateSize /= 2;
                    this.estimatedSize -= estimateSize;
                    this.characteristics = i;
                }
                OutSpliteratorT newFlatMapSpliterator = this.factory.newFlatMapSpliterator(this.prefix, trySplit, this.function, i, estimateSize);
                this.prefix = null;
                return newFlatMapSpliterator;
            }
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort == null) {
                return null;
            }
            this.prefix = null;
            return outspliteratort;
        }

        public final long estimateSize() {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                this.estimatedSize = Math.max(this.estimatedSize, outspliteratort.estimateSize());
            }
            return Math.max(this.estimatedSize, 0);
        }

        public final int characteristics() {
            return this.characteristics;
        }
    }

    static final class FlatMapSpliteratorOfObject<InElementT, OutElementT> extends FlatMapSpliterator<InElementT, OutElementT, Spliterator<OutElementT>> {
        FlatMapSpliteratorOfObject(Spliterator<OutElementT> spliterator, Spliterator<InElementT> spliterator2, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
            super(spliterator, spliterator2, function, $$Lambda$u770MGGi4iyXdk4TaX9TQ3v79y4.INSTANCE, i, j);
        }
    }
}
