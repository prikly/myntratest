package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.jf  reason: case insensitive filesystem */
public final class C0482jf extends MessageNano {

    /* renamed from: g  reason: collision with root package name */
    private static volatile C0482jf[] f6072g;

    /* renamed from: a  reason: collision with root package name */
    public String f6073a;

    /* renamed from: b  reason: collision with root package name */
    public String f6074b;

    /* renamed from: c  reason: collision with root package name */
    public int f6075c;

    /* renamed from: d  reason: collision with root package name */
    public String f6076d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6077e;

    /* renamed from: f  reason: collision with root package name */
    public int f6078f;

    public C0482jf() {
        a();
    }

    public static C0482jf[] b() {
        if (f6072g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f6072g == null) {
                    f6072g = new C0482jf[0];
                }
            }
        }
        return f6072g;
    }

    public C0482jf a() {
        this.f6073a = "";
        this.f6074b = "";
        this.f6075c = -1;
        this.f6076d = "";
        this.f6077e = false;
        this.f6078f = -1;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6073a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6073a);
        }
        if (!this.f6074b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6074b);
        }
        int i = this.f6075c;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i);
        }
        if (!this.f6076d.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f6076d);
        }
        boolean z = this.f6077e;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i2 = this.f6078f;
        return i2 != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i2) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f6073a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f6074b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                this.f6075c = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 34) {
                this.f6076d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f6077e = codedInputByteBufferNano.readBool();
            } else if (readTag == 48) {
                this.f6078f = codedInputByteBufferNano.readSInt32();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6073a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6073a);
        }
        if (!this.f6074b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6074b);
        }
        int i = this.f6075c;
        if (i != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i);
        }
        if (!this.f6076d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6076d);
        }
        boolean z = this.f6077e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i2 = this.f6078f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
