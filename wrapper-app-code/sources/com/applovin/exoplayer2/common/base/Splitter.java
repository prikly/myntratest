package com.applovin.exoplayer2.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Splitter {
    /* access modifiers changed from: private */
    public final int limit;
    /* access modifiers changed from: private */
    public final boolean omitEmptyStrings;
    private final b strategy;
    /* access modifiers changed from: private */
    public final CharMatcher trimmer;

    private static abstract class a extends b<String> {

        /* renamed from: b  reason: collision with root package name */
        final CharSequence f11692b;

        /* renamed from: c  reason: collision with root package name */
        final CharMatcher f11693c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f11694d;

        /* renamed from: e  reason: collision with root package name */
        int f11695e = 0;

        /* renamed from: f  reason: collision with root package name */
        int f11696f;

        protected a(Splitter splitter, CharSequence charSequence) {
            this.f11693c = splitter.trimmer;
            this.f11694d = splitter.omitEmptyStrings;
            this.f11696f = splitter.limit;
            this.f11692b = charSequence;
        }

        /* access modifiers changed from: package-private */
        public abstract int a(int i);

        /* access modifiers changed from: package-private */
        public abstract int b(int i);

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
            if (r0 >= r1) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
            if (r6.f11693c.matches(r6.f11692b.charAt(r0)) == false) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
            if (r1 <= r0) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            if (r6.f11693c.matches(r6.f11692b.charAt(r1 - 1)) == false) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
            r1 = r1 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
            if (r6.f11694d == false) goto L_0x005e;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String a() {
            /*
                r6 = this;
            L_0x0000:
                int r0 = r6.f11695e
            L_0x0002:
                int r1 = r6.f11695e
                r2 = -1
                if (r1 == r2) goto L_0x008e
                int r1 = r6.a(r1)
                if (r1 != r2) goto L_0x0016
                java.lang.CharSequence r1 = r6.f11692b
                int r1 = r1.length()
                r6.f11695e = r2
                goto L_0x001c
            L_0x0016:
                int r3 = r6.b(r1)
                r6.f11695e = r3
            L_0x001c:
                int r3 = r6.f11695e
                if (r3 != r0) goto L_0x002f
                int r3 = r3 + 1
                r6.f11695e = r3
                java.lang.CharSequence r1 = r6.f11692b
                int r1 = r1.length()
                if (r3 <= r1) goto L_0x0002
                r6.f11695e = r2
                goto L_0x0002
            L_0x002f:
                if (r0 >= r1) goto L_0x0042
                com.applovin.exoplayer2.common.base.CharMatcher r3 = r6.f11693c
                java.lang.CharSequence r4 = r6.f11692b
                char r4 = r4.charAt(r0)
                boolean r3 = r3.matches(r4)
                if (r3 == 0) goto L_0x0042
                int r0 = r0 + 1
                goto L_0x002f
            L_0x0042:
                if (r1 <= r0) goto L_0x0057
                com.applovin.exoplayer2.common.base.CharMatcher r3 = r6.f11693c
                java.lang.CharSequence r4 = r6.f11692b
                int r5 = r1 + -1
                char r4 = r4.charAt(r5)
                boolean r3 = r3.matches(r4)
                if (r3 == 0) goto L_0x0057
                int r1 = r1 + -1
                goto L_0x0042
            L_0x0057:
                boolean r3 = r6.f11694d
                if (r3 == 0) goto L_0x005e
                if (r0 != r1) goto L_0x005e
                goto L_0x0000
            L_0x005e:
                int r3 = r6.f11696f
                r4 = 1
                if (r3 != r4) goto L_0x0080
                java.lang.CharSequence r1 = r6.f11692b
                int r1 = r1.length()
                r6.f11695e = r2
            L_0x006b:
                if (r1 <= r0) goto L_0x0083
                com.applovin.exoplayer2.common.base.CharMatcher r2 = r6.f11693c
                java.lang.CharSequence r3 = r6.f11692b
                int r4 = r1 + -1
                char r3 = r3.charAt(r4)
                boolean r2 = r2.matches(r3)
                if (r2 == 0) goto L_0x0083
                int r1 = r1 + -1
                goto L_0x006b
            L_0x0080:
                int r3 = r3 - r4
                r6.f11696f = r3
            L_0x0083:
                java.lang.CharSequence r2 = r6.f11692b
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L_0x008e:
                java.lang.Object r0 = r6.b()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Splitter.a.a():java.lang.String");
        }
    }

    private interface b {
        Iterator<String> b(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(b bVar) {
        this(bVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(b bVar, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = bVar;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    public static Splitter fixedLength(final int i) {
        Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new Splitter(new b() {
            /* renamed from: a */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) {
                    public int a(int i) {
                        int i2 = i + i;
                        if (i2 < this.f11692b.length()) {
                            return i2;
                        }
                        return -1;
                    }

                    public int b(int i) {
                        return i;
                    }
                };
            }
        });
    }

    public static Splitter on(char c2) {
        return on(CharMatcher.is(c2));
    }

    public static Splitter on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new b() {
            /* renamed from: a */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) {
                    /* access modifiers changed from: package-private */
                    public int a(int i) {
                        return CharMatcher.this.indexIn(this.f11692b, i);
                    }

                    /* access modifiers changed from: package-private */
                    public int b(int i) {
                        return i + 1;
                    }
                };
            }
        });
    }

    public static Splitter on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? on(str.charAt(0)) : new Splitter(new b() {
            /* renamed from: a */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) {
                    public int a(int i) {
                        int length = str.length();
                        int length2 = this.f11692b.length() - length;
                        while (i <= length2) {
                            int i2 = 0;
                            while (i2 < length) {
                                if (this.f11692b.charAt(i2 + i) != str.charAt(i2)) {
                                    i++;
                                } else {
                                    i2++;
                                }
                            }
                            return i;
                        }
                        return -1;
                    }

                    public int b(int i) {
                        return i + str.length();
                    }
                };
            }
        });
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.b(this, charSequence);
    }

    public Splitter limit(int i) {
        Preconditions.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }
}
