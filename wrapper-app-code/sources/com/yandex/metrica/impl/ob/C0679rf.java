package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rf  reason: case insensitive filesystem */
public final class C0679rf extends MessageNano {

    /* renamed from: f  reason: collision with root package name */
    private static volatile C0679rf[] f6714f;

    /* renamed from: a  reason: collision with root package name */
    public String f6715a;

    /* renamed from: b  reason: collision with root package name */
    public int f6716b;

    /* renamed from: c  reason: collision with root package name */
    public String f6717c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6718d;

    /* renamed from: e  reason: collision with root package name */
    public long f6719e;

    public C0679rf() {
        a();
    }

    public static C0679rf[] b() {
        if (f6714f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f6714f == null) {
                    f6714f = new C0679rf[0];
                }
            }
        }
        return f6714f;
    }

    public C0679rf a() {
        this.f6715a = "";
        this.f6716b = 0;
        this.f6717c = "";
        this.f6718d = false;
        this.f6719e = 0;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeStringSize(1, this.f6715a);
        int i = this.f6716b;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(2, i);
        }
        if (!this.f6717c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f6717c);
        }
        boolean z = this.f6718d;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z);
        }
        long j = this.f6719e;
        return j != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f6715a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f6716b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 26) {
                this.f6717c = codedInputByteBufferNano.readString();
            } else if (readTag == 32) {
                this.f6718d = codedInputByteBufferNano.readBool();
            } else if (readTag == 40) {
                this.f6719e = codedInputByteBufferNano.readUInt64();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f6715a);
        int i = this.f6716b;
        if (i != 0) {
            codedOutputByteBufferNano.writeSInt32(2, i);
        }
        if (!this.f6717c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f6717c);
        }
        boolean z = this.f6718d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        long j = this.f6719e;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
