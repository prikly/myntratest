package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.ff  reason: case insensitive filesystem */
public final class C0383ff extends MessageNano {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C0383ff[] f5814c;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f5815a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f5816b;

    public C0383ff() {
        a();
    }

    public static C0383ff[] b() {
        if (f5814c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f5814c == null) {
                    f5814c = new C0383ff[0];
                }
            }
        }
        return f5814c;
    }

    public C0383ff a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5815a = bArr;
        this.f5816b = bArr;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f5815a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5815a);
        }
        return !Arrays.equals(this.f5816b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5816b) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f5815a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f5816b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f5815a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5815a);
        }
        if (!Arrays.equals(this.f5816b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5816b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
