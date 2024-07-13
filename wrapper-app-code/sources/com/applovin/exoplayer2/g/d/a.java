package com.applovin.exoplayer2.g.d;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f12603a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: b  reason: collision with root package name */
    private final CharsetDecoder f12604b = Charsets.UTF_8.newDecoder();

    /* renamed from: c  reason: collision with root package name */
    private final CharsetDecoder f12605c = Charsets.ISO_8859_1.newDecoder();

    private String a(ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        try {
            str = this.f12604b.decode(byteBuffer).toString();
            charsetDecoder = this.f12604b;
        } catch (CharacterCodingException unused) {
            this.f12604b.reset();
            byteBuffer.rewind();
            try {
                str = this.f12605c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
            } catch (Throwable th) {
                this.f12605c.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f12605c;
        } catch (Throwable th2) {
            this.f12604b.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return str;
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.g.a a(d dVar, ByteBuffer byteBuffer) {
        String a2 = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (a2 == null) {
            return new com.applovin.exoplayer2.g.a(new c(bArr, (String) null, (String) null));
        }
        Matcher matcher = f12603a.matcher(a2);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String lowerCase = Ascii.toLowerCase(group);
                char c2 = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -315603473) {
                    if (hashCode == 1646559960 && lowerCase.equals("streamtitle")) {
                        c2 = 0;
                    }
                } else if (lowerCase.equals("streamurl")) {
                    c2 = 1;
                }
                if (c2 == 0) {
                    str = group2;
                } else if (c2 == 1) {
                    str2 = group2;
                }
            }
        }
        return new com.applovin.exoplayer2.g.a(new c(bArr, str, str2));
    }
}
