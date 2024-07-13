package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import java.util.BitSet;

public abstract class CharMatcher implements Predicate<Character> {

    private static final class a extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        final CharMatcher f11620a;

        /* renamed from: b  reason: collision with root package name */
        final CharMatcher f11621b;

        a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f11620a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f11621b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return this.f11620a.matches(c2) && this.f11621b.matches(c2);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f11620a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f11621b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        public String toString() {
            return "CharMatcher.and(" + this.f11620a + ", " + this.f11621b + ")";
        }
    }

    static final class aa extends t {

        /* renamed from: a  reason: collision with root package name */
        static final int f11622a = Integer.numberOfLeadingZeros(31);

        /* renamed from: b  reason: collision with root package name */
        static final aa f11623b = new aa();

        aa() {
            super("CharMatcher.whitespace()");
        }

        public boolean matches(char c2) {
            return " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt((48906 * c2) >>> f11622a) == c2;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(" 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　".charAt(i));
            }
        }
    }

    private static final class b extends t {

        /* renamed from: a  reason: collision with root package name */
        static final b f11624a = new b();

        private b() {
            super("CharMatcher.any()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public String collapseFrom(CharSequence charSequence, char c2) {
            return charSequence.length() == 0 ? "" : String.valueOf(c2);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        public boolean matches(char c2) {
            return true;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public CharMatcher negate() {
            return none();
        }

        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        public String replaceFrom(CharSequence charSequence, char c2) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c2);
            return new String(cArr);
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }
    }

    private static final class c extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        private final char[] f11625a;

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f11625a = charArray;
            Arrays.sort(charArray);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return Arrays.binarySearch(this.f11625a, c2) >= 0;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            for (char c2 : this.f11625a) {
                bitSet.set(c2);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char access$000 : this.f11625a) {
                sb.append(CharMatcher.showCharacter(access$000));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    private static final class d extends t {

        /* renamed from: a  reason: collision with root package name */
        static final d f11626a = new d();

        d() {
            super("CharMatcher.ascii()");
        }

        public boolean matches(char c2) {
            return c2 <= 127;
        }
    }

    private static final class e extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final CharMatcher f11627a = new e();

        private e() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            if (!(c2 == ' ' || c2 == 133 || c2 == 5760)) {
                if (c2 == 8199) {
                    return false;
                }
                if (!(c2 == 8287 || c2 == 12288 || c2 == 8232 || c2 == 8233)) {
                    switch (c2) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return c2 >= 8192 && c2 <= 8202;
                    }
                }
            }
            return true;
        }

        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    private static final class f extends y {

        /* renamed from: a  reason: collision with root package name */
        static final f f11628a = new f();

        private f() {
            super("CharMatcher.digit()", a(), b());
        }

        private static char[] a() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private static char[] b() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i) + 9);
            }
            return cArr;
        }
    }

    static abstract class g extends CharMatcher {
        g() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public CharMatcher negate() {
            return new v(this);
        }
    }

    private static final class h extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        private final Predicate<? super Character> f11629a;

        h(Predicate<? super Character> predicate) {
            this.f11629a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        public boolean apply(Character ch) {
            return this.f11629a.apply(Preconditions.checkNotNull(ch));
        }

        public boolean matches(char c2) {
            return this.f11629a.apply(Character.valueOf(c2));
        }

        public String toString() {
            return "CharMatcher.forPredicate(" + this.f11629a + ")";
        }
    }

    private static final class i extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f11630a;

        /* renamed from: b  reason: collision with root package name */
        private final char f11631b;

        i(char c2, char c3) {
            Preconditions.checkArgument(c3 >= c2);
            this.f11630a = c2;
            this.f11631b = c3;
        }

        public boolean matches(char c2) {
            return this.f11630a <= c2 && c2 <= this.f11631b;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f11630a, this.f11631b + 1);
        }

        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.f11630a) + "', '" + CharMatcher.showCharacter(this.f11631b) + "')";
        }
    }

    private static final class j extends y {

        /* renamed from: a  reason: collision with root package name */
        static final j f11632a = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000­؀؜۝܏࣢ ᠎   ⁦　?﻿￹".toCharArray(), "  ­؅؜۝܏࣢ ᠎‏ ⁤⁯　﻿￻".toCharArray());
        }
    }

    private static final class k extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f11633a;

        k(char c2) {
            this.f11633a = c2;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f11633a) ? this : none();
        }

        public boolean matches(char c2) {
            return c2 == this.f11633a;
        }

        public CharMatcher negate() {
            return isNot(this.f11633a);
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f11633a) ? charMatcher : super.or(charMatcher);
        }

        public String replaceFrom(CharSequence charSequence, char c2) {
            return charSequence.toString().replace(this.f11633a, c2);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f11633a);
        }

        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.f11633a) + "')";
        }
    }

    private static final class l extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f11634a;

        /* renamed from: b  reason: collision with root package name */
        private final char f11635b;

        l(char c2, char c3) {
            this.f11634a = c2;
            this.f11635b = c3;
        }

        public boolean matches(char c2) {
            return c2 == this.f11634a || c2 == this.f11635b;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f11634a);
            bitSet.set(this.f11635b);
        }

        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.f11634a) + CharMatcher.showCharacter(this.f11635b) + "\")";
        }
    }

    private static final class m extends g {

        /* renamed from: a  reason: collision with root package name */
        private final char f11636a;

        m(char c2) {
            this.f11636a = c2;
        }

        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f11636a) ? super.and(charMatcher) : charMatcher;
        }

        public boolean matches(char c2) {
            return c2 != this.f11636a;
        }

        public CharMatcher negate() {
            return is(this.f11636a);
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f11636a) ? any() : this;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.f11636a);
            bitSet.set(this.f11636a + 1, 65536);
        }

        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.f11636a) + "')";
        }
    }

    private static final class n extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final n f11637a = new n();

        private n() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return Character.isDigit(c2);
        }

        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    private static final class o extends t {

        /* renamed from: a  reason: collision with root package name */
        static final o f11638a = new o();

        private o() {
            super("CharMatcher.javaIsoControl()");
        }

        public boolean matches(char c2) {
            return c2 <= 31 || (c2 >= 127 && c2 <= 159);
        }
    }

    private static final class p extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final p f11639a = new p();

        private p() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return Character.isLetter(c2);
        }

        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    private static final class q extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final q f11640a = new q();

        private q() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return Character.isLetterOrDigit(c2);
        }

        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    private static final class r extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final r f11641a = new r();

        private r() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return Character.isLowerCase(c2);
        }

        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    private static final class s extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        static final s f11642a = new s();

        private s() {
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return Character.isUpperCase(c2);
        }

        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    static abstract class t extends g {

        /* renamed from: a  reason: collision with root package name */
        private final String f11643a;

        t(String str) {
            this.f11643a = (String) Preconditions.checkNotNull(str);
        }

        public final String toString() {
            return this.f11643a;
        }
    }

    private static class u extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        final CharMatcher f11644a;

        u(CharMatcher charMatcher) {
            this.f11644a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f11644a.countIn(charSequence);
        }

        public boolean matches(char c2) {
            return !this.f11644a.matches(c2);
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f11644a.matchesNoneOf(charSequence);
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f11644a.matchesAllOf(charSequence);
        }

        public CharMatcher negate() {
            return this.f11644a;
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f11644a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        public String toString() {
            return this.f11644a + ".negate()";
        }
    }

    static class v extends u {
        v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    private static final class w extends t {

        /* renamed from: a  reason: collision with root package name */
        static final w f11645a = new w();

        private w() {
            super("CharMatcher.none()");
        }

        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        public String collapseFrom(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }

        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        public boolean matches(char c2) {
            return false;
        }

        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        public CharMatcher negate() {
            return any();
        }

        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String replaceFrom(CharSequence charSequence, char c2) {
            return charSequence.toString();
        }

        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    private static final class x extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        final CharMatcher f11646a;

        /* renamed from: b  reason: collision with root package name */
        final CharMatcher f11647b;

        x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f11646a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f11647b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            return this.f11646a.matches(c2) || this.f11647b.matches(c2);
        }

        /* access modifiers changed from: package-private */
        public void setBits(BitSet bitSet) {
            this.f11646a.setBits(bitSet);
            this.f11647b.setBits(bitSet);
        }

        public String toString() {
            return "CharMatcher.or(" + this.f11646a + ", " + this.f11647b + ")";
        }
    }

    private static class y extends CharMatcher {

        /* renamed from: a  reason: collision with root package name */
        private final String f11648a;

        /* renamed from: b  reason: collision with root package name */
        private final char[] f11649b;

        /* renamed from: c  reason: collision with root package name */
        private final char[] f11650c;

        y(String str, char[] cArr, char[] cArr2) {
            this.f11648a = str;
            this.f11649b = cArr;
            this.f11650c = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                Preconditions.checkArgument(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return CharMatcher.super.apply((Character) obj);
        }

        public boolean matches(char c2) {
            int binarySearch = Arrays.binarySearch(this.f11649b, c2);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            return i >= 0 && c2 <= this.f11650c[i];
        }

        public String toString() {
            return this.f11648a;
        }
    }

    private static final class z extends y {

        /* renamed from: a  reason: collision with root package name */
        static final z f11651a = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());
        }
    }

    protected CharMatcher() {
    }

    public static CharMatcher any() {
        return b.f11624a;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new c(charSequence) : isEither(charSequence.charAt(0), charSequence.charAt(1)) : is(charSequence.charAt(0)) : none();
    }

    public static CharMatcher ascii() {
        return d.f11626a;
    }

    public static CharMatcher breakingWhitespace() {
        return e.f11627a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.f11628a;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i2, int i3, char c2, StringBuilder sb, boolean z2) {
        while (i2 < i3) {
            char charAt = charSequence.charAt(i2);
            if (!matches(charAt)) {
                sb.append(charAt);
                z2 = false;
            } else if (!z2) {
                sb.append(c2);
                z2 = true;
            }
            i2++;
        }
        return sb.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new h(predicate);
    }

    public static CharMatcher inRange(char c2, char c3) {
        return new i(c2, c3);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.f11632a;
    }

    public static CharMatcher is(char c2) {
        return new k(c2);
    }

    private static l isEither(char c2, char c3) {
        return new l(c2, c3);
    }

    public static CharMatcher isNot(char c2) {
        return new m(c2);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.f11637a;
    }

    public static CharMatcher javaIsoControl() {
        return o.f11638a;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.f11639a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.f11640a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.f11641a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.f11642a;
    }

    public static CharMatcher none() {
        return w.f11645a;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* access modifiers changed from: private */
    public static String showCharacter(char c2) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.f11651a;
    }

    public static CharMatcher whitespace() {
        return aa.f11623b;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public String collapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (matches(charAt)) {
                if (charAt != c2 || (i2 != length - 1 && matches(charSequence.charAt(i2 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i2);
                    sb.append(c2);
                    return finishCollapseFrom(charSequence, i2 + 1, length, c2, sb, true);
                }
                i2++;
            }
            i2++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (matches(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int indexIn(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i2, length);
        while (i2 < length) {
            if (matches(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c2);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new u(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new x(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i2 = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    i2++;
                } else {
                    charArray[indexIn - i2] = charArray[indexIn];
                    indexIn++;
                }
            }
            return new String(charArray, 0, indexIn - i2);
        }
    }

    public String replaceFrom(CharSequence charSequence, char c2) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c2;
        while (true) {
            indexIn++;
            if (indexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[indexIn])) {
                charArray[indexIn] = c2;
            }
        }
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i2 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append(charSequence3, i2, indexIn);
            sb.append(charSequence2);
            i2 = indexIn + 1;
            indexIn = indexIn(charSequence3, i2);
        } while (indexIn != -1);
        sb.append(charSequence3, i2, length2);
        return sb.toString();
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void setBits(BitSet bitSet) {
        for (int i2 = 65535; i2 >= 0; i2--) {
            if (matches((char) i2)) {
                bitSet.set(i2);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c2) {
        int length = charSequence.length();
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < length && matches(charSequence.charAt(i3))) {
            i3++;
        }
        int i4 = i2;
        while (i4 > i3 && matches(charSequence.charAt(i4))) {
            i4--;
        }
        if (i3 == 0 && i4 == i2) {
            return collapseFrom(charSequence, c2);
        }
        int i5 = i4 + 1;
        return finishCollapseFrom(charSequence, i3, i5, c2, new StringBuilder(i5 - i3), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = length - 1;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        return charSequence.subSequence(i2, i3 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!matches(charSequence.charAt(i2))) {
                return charSequence.subSequence(i2, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }
}
