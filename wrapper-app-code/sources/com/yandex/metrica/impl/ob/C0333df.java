package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.df  reason: case insensitive filesystem */
public final class C0333df extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public C0507kf f5661a;

    /* renamed from: b  reason: collision with root package name */
    public C0507kf[] f5662b;

    /* renamed from: c  reason: collision with root package name */
    public String f5663c;

    public C0333df() {
        a();
    }

    public C0333df a() {
        this.f5661a = null;
        this.f5662b = C0507kf.b();
        this.f5663c = "";
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0507kf kfVar = this.f5661a;
        if (kfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, kfVar);
        }
        C0507kf[] kfVarArr = this.f5662b;
        if (kfVarArr != null && kfVarArr.length > 0) {
            int i = 0;
            while (true) {
                C0507kf[] kfVarArr2 = this.f5662b;
                if (i >= kfVarArr2.length) {
                    break;
                }
                C0507kf kfVar2 = kfVarArr2[i];
                if (kfVar2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, kfVar2);
                }
                i++;
            }
        }
        return !this.f5663c.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f5663c) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                if (this.f5661a == null) {
                    this.f5661a = new C0507kf();
                }
                codedInputByteBufferNano.readMessage(this.f5661a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C0507kf[] kfVarArr = this.f5662b;
                int length = kfVarArr == null ? 0 : kfVarArr.length;
                int i = repeatedFieldArrayLength + length;
                C0507kf[] kfVarArr2 = new C0507kf[i];
                if (length != 0) {
                    System.arraycopy(kfVarArr, 0, kfVarArr2, 0, length);
                }
                while (length < i - 1) {
                    kfVarArr2[length] = new C0507kf();
                    codedInputByteBufferNano.readMessage(kfVarArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                kfVarArr2[length] = new C0507kf();
                codedInputByteBufferNano.readMessage(kfVarArr2[length]);
                this.f5662b = kfVarArr2;
            } else if (readTag == 26) {
                this.f5663c = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0507kf kfVar = this.f5661a;
        if (kfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, kfVar);
        }
        C0507kf[] kfVarArr = this.f5662b;
        if (kfVarArr != null && kfVarArr.length > 0) {
            int i = 0;
            while (true) {
                C0507kf[] kfVarArr2 = this.f5662b;
                if (i >= kfVarArr2.length) {
                    break;
                }
                C0507kf kfVar2 = kfVarArr2[i];
                if (kfVar2 != null) {
                    codedOutputByteBufferNano.writeMessage(2, kfVar2);
                }
                i++;
            }
        }
        if (!this.f5663c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f5663c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
