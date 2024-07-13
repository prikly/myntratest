package com.apm.insight.l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public class e extends PrintWriter {

    /* renamed from: a  reason: collision with root package name */
    private MessageDigest f10743a = null;

    /* renamed from: b  reason: collision with root package name */
    private Charset f10744b = null;

    /* renamed from: c  reason: collision with root package name */
    private a f10745c = null;

    public static class a {
        public boolean a(String str) {
            return true;
        }
    }

    public e(OutputStream outputStream, MessageDigest messageDigest, a aVar) {
        super(outputStream);
        this.f10743a = messageDigest;
        this.f10745c = aVar;
        if (messageDigest != null) {
            this.f10744b = Charset.defaultCharset();
        }
    }

    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f10743a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f10743a != null) {
            a aVar = this.f10745c;
            if (aVar == null || aVar.a(str)) {
                this.f10743a.update(this.f10744b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f10743a;
        if (messageDigest != null) {
            messageDigest.update(this.f10744b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
