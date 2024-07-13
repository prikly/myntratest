package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.AnyOrBuilder;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Request extends GeneratedMessageV3 implements RequestOrBuilder {
    public static final int AT_FIELD_NUMBER = 4;
    public static final int CDATA_FIELD_NUMBER = 8;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CUR_FIELD_NUMBER = 5;
    private static final Request DEFAULT_INSTANCE = new Request();
    public static final int EXT_FIELD_NUMBER = 14;
    public static final int EXT_PROTO_FIELD_NUMBER = 13;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 10;
    public static final int PACKAGE_FIELD_NUMBER = 11;
    /* access modifiers changed from: private */
    public static final Parser<Request> PARSER = new AbstractParser<Request>() {
        public Request parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Request(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SEAT_FIELD_NUMBER = 6;
    public static final int SOURCE_FIELD_NUMBER = 9;
    public static final int TEST_FIELD_NUMBER = 2;
    public static final int TMAX_FIELD_NUMBER = 3;
    public static final int WSEAT_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public int at_;
    /* access modifiers changed from: private */
    public volatile Object cdata_;
    /* access modifiers changed from: private */
    public Any context_;
    /* access modifiers changed from: private */
    public LazyStringList cur_;
    /* access modifiers changed from: private */
    public List<Any> extProto_;
    /* access modifiers changed from: private */
    public Struct ext_;
    /* access modifiers changed from: private */
    public volatile Object id_;
    /* access modifiers changed from: private */
    public List<Item> item_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int package_;
    /* access modifiers changed from: private */
    public LazyStringList seat_;
    /* access modifiers changed from: private */
    public Source source_;
    /* access modifiers changed from: private */
    public boolean test_;
    /* access modifiers changed from: private */
    public int tmax_;
    /* access modifiers changed from: private */
    public boolean wseat_;

    public interface ItemOrBuilder extends MessageOrBuilder {
        Item.Deal getDeal(int i);

        int getDealCount();

        List<Item.Deal> getDealList();

        Item.DealOrBuilder getDealOrBuilder(int i);

        List<? extends Item.DealOrBuilder> getDealOrBuilderList();

        int getDlvy();

        String getDt();

        ByteString getDtBytes();

        int getExp();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        double getFlr();

        String getFlrcur();

        ByteString getFlrcurBytes();

        String getId();

        ByteString getIdBytes();

        Item.Metric getMetric(int i);

        int getMetricCount();

        List<Item.Metric> getMetricList();

        Item.MetricOrBuilder getMetricOrBuilder(int i);

        List<? extends Item.MetricOrBuilder> getMetricOrBuilderList();

        boolean getPrivate();

        int getQty();

        int getSeq();

        Any getSpec();

        AnyOrBuilder getSpecOrBuilder();

        boolean hasExt();

        boolean hasSpec();
    }

    public interface SourceOrBuilder extends MessageOrBuilder {
        String getCert();

        ByteString getCertBytes();

        String getDigest();

        ByteString getDigestBytes();

        String getDs();

        ByteString getDsBytes();

        int getDsgver();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getPchain();

        ByteString getPchainBytes();

        String getTid();

        ByteString getTidBytes();

        boolean hasExt();
    }

    private Request(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Request() {
        this.memoizedIsInitialized = -1;
        this.id_ = "";
        this.cur_ = LazyStringArrayList.EMPTY;
        this.seat_ = LazyStringArrayList.EMPTY;
        this.cdata_ = "";
        this.item_ = Collections.emptyList();
        this.extProto_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Request();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Request(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    switch (readTag) {
                        case 0:
                            z = true;
                            break;
                        case 10:
                            this.id_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 16:
                            this.test_ = codedInputStream.readBool();
                            break;
                        case 24:
                            this.tmax_ = codedInputStream.readUInt32();
                            break;
                        case 32:
                            this.at_ = codedInputStream.readUInt32();
                            break;
                        case 42:
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.cur_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.cur_.add(readStringRequireUtf8);
                            break;
                        case 50:
                            String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.seat_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.seat_.add(readStringRequireUtf82);
                            break;
                        case 56:
                            this.wseat_ = codedInputStream.readBool();
                            break;
                        case 66:
                            this.cdata_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 74:
                            Source.Builder builder = this.source_ != null ? this.source_.toBuilder() : null;
                            Source source = (Source) codedInputStream.readMessage(Source.parser(), extensionRegistryLite);
                            this.source_ = source;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(source);
                                this.source_ = builder.buildPartial();
                                break;
                            }
                        case 82:
                            if (!z2 || !true) {
                                this.item_ = new ArrayList();
                                z2 |= true;
                            }
                            this.item_.add(codedInputStream.readMessage(Item.parser(), extensionRegistryLite));
                            break;
                        case 88:
                            this.package_ = codedInputStream.readUInt32();
                            break;
                        case 98:
                            Any.Builder builder2 = this.context_ != null ? this.context_.toBuilder() : null;
                            Any any = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                            this.context_ = any;
                            if (builder2 == null) {
                                break;
                            } else {
                                builder2.mergeFrom(any);
                                this.context_ = builder2.buildPartial();
                                break;
                            }
                        case 106:
                            if (!z2 || !true) {
                                this.extProto_ = new ArrayList();
                                z2 |= true;
                            }
                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            break;
                        case 114:
                            Struct.Builder builder3 = this.ext_ != null ? this.ext_.toBuilder() : null;
                            Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.ext_ = struct;
                            if (builder3 == null) {
                                break;
                            } else {
                                builder3.mergeFrom(struct);
                                this.ext_ = builder3.buildPartial();
                                break;
                            }
                        default:
                            if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                break;
                            }
                            z = true;
                            break;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.cur_ = this.cur_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.seat_ = this.seat_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.item_ = Collections.unmodifiableList(this.item_);
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.cur_ = this.cur_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.seat_ = this.seat_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.item_ = Collections.unmodifiableList(this.item_);
            }
            if (z2 && true) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
    }

    public static final class Source extends GeneratedMessageV3 implements SourceOrBuilder {
        public static final int CERT_FIELD_NUMBER = 5;
        private static final Source DEFAULT_INSTANCE = new Source();
        public static final int DIGEST_FIELD_NUMBER = 4;
        public static final int DSGVER_FIELD_NUMBER = 3;
        public static final int DS_FIELD_NUMBER = 2;
        public static final int EXT_FIELD_NUMBER = 8;
        public static final int EXT_PROTO_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final Parser<Source> PARSER = new AbstractParser<Source>() {
            public Source parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Source(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PCHAIN_FIELD_NUMBER = 6;
        public static final int TID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object cert_;
        /* access modifiers changed from: private */
        public volatile Object digest_;
        /* access modifiers changed from: private */
        public volatile Object ds_;
        /* access modifiers changed from: private */
        public int dsgver_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public volatile Object pchain_;
        /* access modifiers changed from: private */
        public volatile Object tid_;

        private Source(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Source() {
            this.memoizedIsInitialized = -1;
            this.tid_ = "";
            this.ds_ = "";
            this.digest_ = "";
            this.cert_ = "";
            this.pchain_ = "";
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Source();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Source(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.tid_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.ds_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.dsgver_ = codedInputStream.readUInt32();
                            } else if (readTag == 34) {
                                this.digest_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.cert_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.pchain_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 58) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 66) {
                                Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder != null) {
                                    builder.mergeFrom(struct);
                                    this.ext_ = builder.buildPartial();
                                }
                            } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Source_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Source_fieldAccessorTable.ensureFieldAccessorsInitialized(Source.class, Builder.class);
        }

        public String getTid() {
            Object obj = this.tid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTidBytes() {
            Object obj = this.tid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tid_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getDs() {
            Object obj = this.ds_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ds_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDsBytes() {
            Object obj = this.ds_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ds_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getDsgver() {
            return this.dsgver_;
        }

        public String getDigest() {
            Object obj = this.digest_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.digest_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDigestBytes() {
            Object obj = this.digest_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.digest_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCert() {
            Object obj = this.cert_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cert_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCertBytes() {
            Object obj = this.cert_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cert_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getPchain() {
            Object obj = this.pchain_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.pchain_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getPchainBytes() {
            Object obj = this.pchain_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pchain_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getTidBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.tid_);
            }
            if (!getDsBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.ds_);
            }
            int i = this.dsgver_;
            if (i != 0) {
                codedOutputStream.writeUInt32(3, i);
            }
            if (!getDigestBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.digest_);
            }
            if (!getCertBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.cert_);
            }
            if (!getPchainBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.pchain_);
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                codedOutputStream.writeMessage(7, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(8, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getTidBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.tid_) + 0 : 0;
            if (!getDsBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(2, this.ds_);
            }
            int i2 = this.dsgver_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(3, i2);
            }
            if (!getDigestBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(4, this.digest_);
            }
            if (!getCertBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(5, this.cert_);
            }
            if (!getPchainBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(6, this.pchain_);
            }
            for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                computeStringSize += CodedOutputStream.computeMessageSize(7, this.extProto_.get(i3));
            }
            if (this.ext_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(8, getExt());
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Source)) {
                return super.equals(obj);
            }
            Source source = (Source) obj;
            if (!getTid().equals(source.getTid()) || !getDs().equals(source.getDs()) || getDsgver() != source.getDsgver() || !getDigest().equals(source.getDigest()) || !getCert().equals(source.getCert()) || !getPchain().equals(source.getPchain()) || hasExt() != source.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(source.getExt())) && getExtProtoList().equals(source.getExtProtoList()) && this.unknownFields.equals(source.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTid().hashCode()) * 37) + 2) * 53) + getDs().hashCode()) * 37) + 3) * 53) + getDsgver()) * 37) + 4) * 53) + getDigest().hashCode()) * 37) + 5) * 53) + getCert().hashCode()) * 37) + 6) * 53) + getPchain().hashCode();
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 8) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode = (((hashCode * 37) + 7) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Source parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Source parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Source parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Source parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Source parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Source parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Source parseFrom(InputStream inputStream) throws IOException {
            return (Source) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Source parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Source) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Source parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Source) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Source parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Source) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Source parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Source) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Source parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Source) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Source source) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(source);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SourceOrBuilder {
            private int bitField0_;
            private Object cert_;
            private Object digest_;
            private Object ds_;
            private int dsgver_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private Object pchain_;
            private Object tid_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Source_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Source_fieldAccessorTable.ensureFieldAccessorsInitialized(Source.class, Builder.class);
            }

            private Builder() {
                this.tid_ = "";
                this.ds_ = "";
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.tid_ = "";
                this.ds_ = "";
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Source.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.tid_ = "";
                this.ds_ = "";
                this.dsgver_ = 0;
                this.digest_ = "";
                this.cert_ = "";
                this.pchain_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Source_descriptor;
            }

            public Source getDefaultInstanceForType() {
                return Source.getDefaultInstance();
            }

            public Source build() {
                Source buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Source buildPartial() {
                Source source = new Source((GeneratedMessageV3.Builder) this);
                Object unused = source.tid_ = this.tid_;
                Object unused2 = source.ds_ = this.ds_;
                int unused3 = source.dsgver_ = this.dsgver_;
                Object unused4 = source.digest_ = this.digest_;
                Object unused5 = source.cert_ = this.cert_;
                Object unused6 = source.pchain_ = this.pchain_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused7 = source.ext_ = this.ext_;
                } else {
                    Struct unused8 = source.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -2;
                    }
                    List unused9 = source.extProto_ = this.extProto_;
                } else {
                    List unused10 = source.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return source;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof Source) {
                    return mergeFrom((Source) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Source source) {
                if (source == Source.getDefaultInstance()) {
                    return this;
                }
                if (!source.getTid().isEmpty()) {
                    this.tid_ = source.tid_;
                    onChanged();
                }
                if (!source.getDs().isEmpty()) {
                    this.ds_ = source.ds_;
                    onChanged();
                }
                if (source.getDsgver() != 0) {
                    setDsgver(source.getDsgver());
                }
                if (!source.getDigest().isEmpty()) {
                    this.digest_ = source.digest_;
                    onChanged();
                }
                if (!source.getCert().isEmpty()) {
                    this.cert_ = source.cert_;
                    onChanged();
                }
                if (!source.getPchain().isEmpty()) {
                    this.pchain_ = source.pchain_;
                    onChanged();
                }
                if (source.hasExt()) {
                    mergeExt(source.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!source.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = source.extProto_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(source.extProto_);
                        }
                        onChanged();
                    }
                } else if (!source.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = source.extProto_;
                        this.bitField0_ &= -2;
                        if (Source.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(source.extProto_);
                    }
                }
                mergeUnknownFields(source.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.openrtb.Request.Source.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Request.Source.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.openrtb.Request$Source r3 = (com.explorestack.protobuf.openrtb.Request.Source) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Source) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.openrtb.Request$Source r4 = (com.explorestack.protobuf.openrtb.Request.Source) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Source) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Source.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Request$Source$Builder");
            }

            public String getTid() {
                Object obj = this.tid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tid_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTidBytes() {
                Object obj = this.tid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tid_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setTid(String str) {
                if (str != null) {
                    this.tid_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearTid() {
                this.tid_ = Source.getDefaultInstance().getTid();
                onChanged();
                return this;
            }

            public Builder setTidBytes(ByteString byteString) {
                if (byteString != null) {
                    Source.checkByteStringIsUtf8(byteString);
                    this.tid_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getDs() {
                Object obj = this.ds_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.ds_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDsBytes() {
                Object obj = this.ds_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ds_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDs(String str) {
                if (str != null) {
                    this.ds_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDs() {
                this.ds_ = Source.getDefaultInstance().getDs();
                onChanged();
                return this;
            }

            public Builder setDsBytes(ByteString byteString) {
                if (byteString != null) {
                    Source.checkByteStringIsUtf8(byteString);
                    this.ds_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getDsgver() {
                return this.dsgver_;
            }

            public Builder setDsgver(int i) {
                this.dsgver_ = i;
                onChanged();
                return this;
            }

            public Builder clearDsgver() {
                this.dsgver_ = 0;
                onChanged();
                return this;
            }

            public String getDigest() {
                Object obj = this.digest_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.digest_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDigestBytes() {
                Object obj = this.digest_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.digest_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDigest(String str) {
                if (str != null) {
                    this.digest_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDigest() {
                this.digest_ = Source.getDefaultInstance().getDigest();
                onChanged();
                return this;
            }

            public Builder setDigestBytes(ByteString byteString) {
                if (byteString != null) {
                    Source.checkByteStringIsUtf8(byteString);
                    this.digest_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCert() {
                Object obj = this.cert_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cert_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCertBytes() {
                Object obj = this.cert_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cert_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCert(String str) {
                if (str != null) {
                    this.cert_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCert() {
                this.cert_ = Source.getDefaultInstance().getCert();
                onChanged();
                return this;
            }

            public Builder setCertBytes(ByteString byteString) {
                if (byteString != null) {
                    Source.checkByteStringIsUtf8(byteString);
                    this.cert_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getPchain() {
                Object obj = this.pchain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.pchain_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getPchainBytes() {
                Object obj = this.pchain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pchain_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setPchain(String str) {
                if (str != null) {
                    this.pchain_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPchain() {
                this.pchain_ = Source.getDefaultInstance().getPchain();
                onChanged();
                return this;
            }

            public Builder setPchainBytes(ByteString byteString) {
                if (byteString != null) {
                    Source.checkByteStringIsUtf8(byteString);
                    this.pchain_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    List<Any> list = this.extProto_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Source getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Source> parser() {
            return PARSER;
        }

        public Parser<Source> getParserForType() {
            return PARSER;
        }

        public Source getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Item extends GeneratedMessageV3 implements ItemOrBuilder {
        public static final int DEAL_FIELD_NUMBER = 11;
        private static final Item DEFAULT_INSTANCE = new Item();
        public static final int DLVY_FIELD_NUMBER = 9;
        public static final int DT_FIELD_NUMBER = 8;
        public static final int EXP_FIELD_NUMBER = 7;
        public static final int EXT_FIELD_NUMBER = 15;
        public static final int EXT_PROTO_FIELD_NUMBER = 14;
        public static final int FLRCUR_FIELD_NUMBER = 6;
        public static final int FLR_FIELD_NUMBER = 4;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int METRIC_FIELD_NUMBER = 10;
        /* access modifiers changed from: private */
        public static final Parser<Item> PARSER = new AbstractParser<Item>() {
            public Item parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Item(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PRIVATE_FIELD_NUMBER = 12;
        public static final int QTY_FIELD_NUMBER = 2;
        public static final int SEQ_FIELD_NUMBER = 3;
        public static final int SPEC_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public List<Deal> deal_;
        /* access modifiers changed from: private */
        public int dlvy_;
        /* access modifiers changed from: private */
        public volatile Object dt_;
        /* access modifiers changed from: private */
        public int exp_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public double flr_;
        /* access modifiers changed from: private */
        public volatile Object flrcur_;
        /* access modifiers changed from: private */
        public volatile Object id_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public List<Metric> metric_;
        /* access modifiers changed from: private */
        public boolean private_;
        /* access modifiers changed from: private */
        public int qty_;
        /* access modifiers changed from: private */
        public int seq_;
        /* access modifiers changed from: private */
        public Any spec_;

        public interface DealOrBuilder extends MessageOrBuilder {
            int getAt();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            double getFlr();

            String getFlrcur();

            ByteString getFlrcurBytes();

            String getId();

            ByteString getIdBytes();

            String getWadomain(int i);

            ByteString getWadomainBytes(int i);

            int getWadomainCount();

            List<String> getWadomainList();

            String getWseat(int i);

            ByteString getWseatBytes(int i);

            int getWseatCount();

            List<String> getWseatList();

            boolean hasExt();
        }

        public interface MetricOrBuilder extends MessageOrBuilder {
            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getType();

            ByteString getTypeBytes();

            float getValue();

            String getVendor();

            ByteString getVendorBytes();

            boolean hasExt();
        }

        private Item(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Item() {
            this.memoizedIsInitialized = -1;
            this.id_ = "";
            this.flrcur_ = "";
            this.dt_ = "";
            this.metric_ = Collections.emptyList();
            this.deal_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Item();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Item(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.id_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 16:
                                this.qty_ = codedInputStream.readUInt32();
                                break;
                            case 24:
                                this.seq_ = codedInputStream.readUInt32();
                                break;
                            case 33:
                                this.flr_ = codedInputStream.readDouble();
                                break;
                            case 50:
                                this.flrcur_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 56:
                                this.exp_ = codedInputStream.readUInt32();
                                break;
                            case 66:
                                this.dt_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 72:
                                this.dlvy_ = codedInputStream.readUInt32();
                                break;
                            case 82:
                                if (!z2 || !true) {
                                    this.metric_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.metric_.add(codedInputStream.readMessage(Metric.parser(), extensionRegistryLite));
                                break;
                            case 90:
                                if (!z2 || !true) {
                                    this.deal_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.deal_.add(codedInputStream.readMessage(Deal.parser(), extensionRegistryLite));
                                break;
                            case 96:
                                this.private_ = codedInputStream.readBool();
                                break;
                            case 106:
                                Any.Builder builder = this.spec_ != null ? this.spec_.toBuilder() : null;
                                Any any = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                this.spec_ = any;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(any);
                                    this.spec_ = builder.buildPartial();
                                    break;
                                }
                            case 114:
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                break;
                            case 122:
                                Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(struct);
                                    this.ext_ = builder2.buildPartial();
                                    break;
                                }
                            default:
                                if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.setUnfinishedMessage(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 && true) {
                            this.metric_ = Collections.unmodifiableList(this.metric_);
                        }
                        if (z2 && true) {
                            this.deal_ = Collections.unmodifiableList(this.deal_);
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.metric_ = Collections.unmodifiableList(this.metric_);
                }
                if (z2 && true) {
                    this.deal_ = Collections.unmodifiableList(this.deal_);
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
        }

        public static final class Metric extends GeneratedMessageV3 implements MetricOrBuilder {
            private static final Metric DEFAULT_INSTANCE = new Metric();
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            /* access modifiers changed from: private */
            public static final Parser<Metric> PARSER = new AbstractParser<Metric>() {
                public Metric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Metric(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            public static final int VENDOR_FIELD_NUMBER = 3;
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public volatile Object type_;
            /* access modifiers changed from: private */
            public float value_;
            /* access modifiers changed from: private */
            public volatile Object vendor_;

            private Metric(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Metric() {
                this.memoizedIsInitialized = -1;
                this.type_ = "";
                this.vendor_ = "";
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Metric();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Metric(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.type_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 21) {
                                    this.value_ = codedInputStream.readFloat();
                                } else if (readTag == 26) {
                                    this.vendor_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 34) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 42) {
                                    Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder != null) {
                                        builder.mergeFrom(struct);
                                        this.ext_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                        } catch (Throwable th) {
                            if (z2 && true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Metric_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Metric_fieldAccessorTable.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
            }

            public String getType() {
                Object obj = this.type_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.type_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTypeBytes() {
                Object obj = this.type_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.type_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public float getValue() {
                return this.value_;
            }

            public String getVendor() {
                Object obj = this.vendor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.vendor_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getVendorBytes() {
                Object obj = this.vendor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.vendor_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public boolean hasExt() {
                return this.ext_ != null;
            }

            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getTypeBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.type_);
                }
                float f2 = this.value_;
                if (f2 != 0.0f) {
                    codedOutputStream.writeFloat(2, f2);
                }
                if (!getVendorBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.vendor_);
                }
                for (int i = 0; i < this.extProto_.size(); i++) {
                    codedOutputStream.writeMessage(4, this.extProto_.get(i));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(5, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getTypeBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.type_) + 0 : 0;
                float f2 = this.value_;
                if (f2 != 0.0f) {
                    computeStringSize += CodedOutputStream.computeFloatSize(2, f2);
                }
                if (!getVendorBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(3, this.vendor_);
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    computeStringSize += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    computeStringSize += CodedOutputStream.computeMessageSize(5, getExt());
                }
                int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Metric)) {
                    return super.equals(obj);
                }
                Metric metric = (Metric) obj;
                if (!getType().equals(metric.getType()) || Float.floatToIntBits(getValue()) != Float.floatToIntBits(metric.getValue()) || !getVendor().equals(metric.getVendor()) || hasExt() != metric.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(metric.getExt())) && getExtProtoList().equals(metric.getExtProtoList()) && this.unknownFields.equals(metric.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getType().hashCode()) * 37) + 2) * 53) + Float.floatToIntBits(getValue())) * 37) + 3) * 53) + getVendor().hashCode();
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 5) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static Metric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Metric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Metric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Metric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Metric parseFrom(InputStream inputStream) throws IOException {
                return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Metric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Metric) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Metric metric) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metric);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricOrBuilder {
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object type_;
                private float value_;
                private Object vendor_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Metric_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Metric_fieldAccessorTable.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
                }

                private Builder() {
                    this.type_ = "";
                    this.vendor_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.type_ = "";
                    this.vendor_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Metric.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.type_ = "";
                    this.value_ = 0.0f;
                    this.vendor_ = "";
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Metric_descriptor;
                }

                public Metric getDefaultInstanceForType() {
                    return Metric.getDefaultInstance();
                }

                public Metric build() {
                    Metric buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Metric buildPartial() {
                    Metric metric = new Metric((GeneratedMessageV3.Builder) this);
                    Object unused = metric.type_ = this.type_;
                    float unused2 = metric.value_ = this.value_;
                    Object unused3 = metric.vendor_ = this.vendor_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused4 = metric.ext_ = this.ext_;
                    } else {
                        Struct unused5 = metric.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        List unused6 = metric.extProto_ = this.extProto_;
                    } else {
                        List unused7 = metric.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return metric;
                }

                public Builder clone() {
                    return (Builder) super.clone();
                }

                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder mergeFrom(Message message) {
                    if (message instanceof Metric) {
                        return mergeFrom((Metric) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Metric metric) {
                    if (metric == Metric.getDefaultInstance()) {
                        return this;
                    }
                    if (!metric.getType().isEmpty()) {
                        this.type_ = metric.type_;
                        onChanged();
                    }
                    if (metric.getValue() != 0.0f) {
                        setValue(metric.getValue());
                    }
                    if (!metric.getVendor().isEmpty()) {
                        this.vendor_ = metric.vendor_;
                        onChanged();
                    }
                    if (metric.hasExt()) {
                        mergeExt(metric.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!metric.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = metric.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(metric.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!metric.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = metric.extProto_;
                            this.bitField0_ &= -2;
                            if (Metric.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(metric.extProto_);
                        }
                    }
                    mergeUnknownFields(metric.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.openrtb.Request.Item.Metric.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Request.Item.Metric.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.openrtb.Request$Item$Metric r3 = (com.explorestack.protobuf.openrtb.Request.Item.Metric) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Item.Metric) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.openrtb.Request$Item$Metric r4 = (com.explorestack.protobuf.openrtb.Request.Item.Metric) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Item.Metric) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Metric.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Request$Item$Metric$Builder");
                }

                public String getType() {
                    Object obj = this.type_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.type_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getTypeBytes() {
                    Object obj = this.type_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.type_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setType(String str) {
                    if (str != null) {
                        this.type_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearType() {
                    this.type_ = Metric.getDefaultInstance().getType();
                    onChanged();
                    return this;
                }

                public Builder setTypeBytes(ByteString byteString) {
                    if (byteString != null) {
                        Metric.checkByteStringIsUtf8(byteString);
                        this.type_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public float getValue() {
                    return this.value_;
                }

                public Builder setValue(float f2) {
                    this.value_ = f2;
                    onChanged();
                    return this;
                }

                public Builder clearValue() {
                    this.value_ = 0.0f;
                    onChanged();
                    return this;
                }

                public String getVendor() {
                    Object obj = this.vendor_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.vendor_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getVendorBytes() {
                    Object obj = this.vendor_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.vendor_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setVendor(String str) {
                    if (str != null) {
                        this.vendor_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearVendor() {
                    this.vendor_ = Metric.getDefaultInstance().getVendor();
                    onChanged();
                    return this;
                }

                public Builder setVendorBytes(ByteString byteString) {
                    if (byteString != null) {
                        Metric.checkByteStringIsUtf8(byteString);
                        this.vendor_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                public Struct getExt() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Builder setExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(struct);
                    } else if (struct != null) {
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(struct);
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return getExtFieldBuilder().getBuilder();
                }

                public StructOrBuilder getExtOrBuilder() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        List<Any> list = this.extProto_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static Metric getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Metric> parser() {
                return PARSER;
            }

            public Parser<Metric> getParserForType() {
                return PARSER;
            }

            public Metric getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public static final class Deal extends GeneratedMessageV3 implements DealOrBuilder {
            public static final int AT_FIELD_NUMBER = 4;
            private static final Deal DEFAULT_INSTANCE = new Deal();
            public static final int EXT_FIELD_NUMBER = 8;
            public static final int EXT_PROTO_FIELD_NUMBER = 7;
            public static final int FLRCUR_FIELD_NUMBER = 3;
            public static final int FLR_FIELD_NUMBER = 2;
            public static final int ID_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Parser<Deal> PARSER = new AbstractParser<Deal>() {
                public Deal parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Deal(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int WADOMAIN_FIELD_NUMBER = 6;
            public static final int WSEAT_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public int at_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public double flr_;
            /* access modifiers changed from: private */
            public volatile Object flrcur_;
            /* access modifiers changed from: private */
            public volatile Object id_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public LazyStringList wadomain_;
            /* access modifiers changed from: private */
            public LazyStringList wseat_;

            private Deal(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Deal() {
                this.memoizedIsInitialized = -1;
                this.id_ = "";
                this.flrcur_ = "";
                this.wseat_ = LazyStringArrayList.EMPTY;
                this.wadomain_ = LazyStringArrayList.EMPTY;
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Deal();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Deal(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            if (readTag != 0) {
                                if (readTag == 10) {
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 17) {
                                    this.flr_ = codedInputStream.readDouble();
                                } else if (readTag == 26) {
                                    this.flrcur_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 32) {
                                    this.at_ = codedInputStream.readUInt32();
                                } else if (readTag == 42) {
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!z2 || !true) {
                                        this.wseat_ = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.wseat_.add(readStringRequireUtf8);
                                } else if (readTag == 50) {
                                    String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                    if (!z2 || !true) {
                                        this.wadomain_ = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.wadomain_.add(readStringRequireUtf82);
                                } else if (readTag == 58) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 66) {
                                    Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder != null) {
                                        builder.mergeFrom(struct);
                                        this.ext_ = builder.buildPartial();
                                    }
                                } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                        } catch (Throwable th) {
                            if (z2 && true) {
                                this.wseat_ = this.wseat_.getUnmodifiableView();
                            }
                            if (z2 && true) {
                                this.wadomain_ = this.wadomain_.getUnmodifiableView();
                            }
                            if (z2 && true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 && true) {
                        this.wseat_ = this.wseat_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.wadomain_ = this.wadomain_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Deal_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Deal_fieldAccessorTable.ensureFieldAccessorsInitialized(Deal.class, Builder.class);
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public double getFlr() {
                return this.flr_;
            }

            public String getFlrcur() {
                Object obj = this.flrcur_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.flrcur_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFlrcurBytes() {
                Object obj = this.flrcur_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.flrcur_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public int getAt() {
                return this.at_;
            }

            public ProtocolStringList getWseatList() {
                return this.wseat_;
            }

            public int getWseatCount() {
                return this.wseat_.size();
            }

            public String getWseat(int i) {
                return (String) this.wseat_.get(i);
            }

            public ByteString getWseatBytes(int i) {
                return this.wseat_.getByteString(i);
            }

            public ProtocolStringList getWadomainList() {
                return this.wadomain_;
            }

            public int getWadomainCount() {
                return this.wadomain_.size();
            }

            public String getWadomain(int i) {
                return (String) this.wadomain_.get(i);
            }

            public ByteString getWadomainBytes(int i) {
                return this.wadomain_.getByteString(i);
            }

            public boolean hasExt() {
                return this.ext_ != null;
            }

            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
            }

            public final boolean isInitialized() {
                byte b2 = this.memoizedIsInitialized;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
                }
                double d2 = this.flr_;
                if (d2 != 0.0d) {
                    codedOutputStream.writeDouble(2, d2);
                }
                if (!getFlrcurBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.flrcur_);
                }
                int i = this.at_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(4, i);
                }
                for (int i2 = 0; i2 < this.wseat_.size(); i2++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 5, this.wseat_.getRaw(i2));
                }
                for (int i3 = 0; i3 < this.wadomain_.size(); i3++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.wadomain_.getRaw(i3));
                }
                for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                    codedOutputStream.writeMessage(7, this.extProto_.get(i4));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(8, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
                double d2 = this.flr_;
                if (d2 != 0.0d) {
                    computeStringSize += CodedOutputStream.computeDoubleSize(2, d2);
                }
                if (!getFlrcurBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(3, this.flrcur_);
                }
                int i2 = this.at_;
                if (i2 != 0) {
                    computeStringSize += CodedOutputStream.computeUInt32Size(4, i2);
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.wseat_.size(); i4++) {
                    i3 += computeStringSizeNoTag(this.wseat_.getRaw(i4));
                }
                int size = computeStringSize + i3 + (getWseatList().size() * 1);
                int i5 = 0;
                for (int i6 = 0; i6 < this.wadomain_.size(); i6++) {
                    i5 += computeStringSizeNoTag(this.wadomain_.getRaw(i6));
                }
                int size2 = size + i5 + (getWadomainList().size() * 1);
                for (int i7 = 0; i7 < this.extProto_.size(); i7++) {
                    size2 += CodedOutputStream.computeMessageSize(7, this.extProto_.get(i7));
                }
                if (this.ext_ != null) {
                    size2 += CodedOutputStream.computeMessageSize(8, getExt());
                }
                int serializedSize = size2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Deal)) {
                    return super.equals(obj);
                }
                Deal deal = (Deal) obj;
                if (!getId().equals(deal.getId()) || Double.doubleToLongBits(getFlr()) != Double.doubleToLongBits(deal.getFlr()) || !getFlrcur().equals(deal.getFlrcur()) || getAt() != deal.getAt() || !getWseatList().equals(deal.getWseatList()) || !getWadomainList().equals(deal.getWadomainList()) || hasExt() != deal.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(deal.getExt())) && getExtProtoList().equals(deal.getExtProtoList()) && this.unknownFields.equals(deal.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getFlr()))) * 37) + 3) * 53) + getFlrcur().hashCode()) * 37) + 4) * 53) + getAt();
                if (getWseatCount() > 0) {
                    hashCode = (((hashCode * 37) + 5) * 53) + getWseatList().hashCode();
                }
                if (getWadomainCount() > 0) {
                    hashCode = (((hashCode * 37) + 6) * 53) + getWadomainList().hashCode();
                }
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 8) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 7) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static Deal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Deal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Deal parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Deal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Deal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Deal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Deal parseFrom(InputStream inputStream) throws IOException {
                return (Deal) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Deal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Deal) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Deal parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Deal) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Deal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Deal) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Deal parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Deal) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Deal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Deal) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Deal deal) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(deal);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DealOrBuilder {
                private int at_;
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private double flr_;
                private Object flrcur_;
                private Object id_;
                private LazyStringList wadomain_;
                private LazyStringList wseat_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Deal_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Deal_fieldAccessorTable.ensureFieldAccessorsInitialized(Deal.class, Builder.class);
                }

                private Builder() {
                    this.id_ = "";
                    this.flrcur_ = "";
                    this.wseat_ = LazyStringArrayList.EMPTY;
                    this.wadomain_ = LazyStringArrayList.EMPTY;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.id_ = "";
                    this.flrcur_ = "";
                    this.wseat_ = LazyStringArrayList.EMPTY;
                    this.wadomain_ = LazyStringArrayList.EMPTY;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Deal.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.flr_ = 0.0d;
                    this.flrcur_ = "";
                    this.at_ = 0;
                    this.wseat_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -2;
                    this.wadomain_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -3;
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -5;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_Deal_descriptor;
                }

                public Deal getDefaultInstanceForType() {
                    return Deal.getDefaultInstance();
                }

                public Deal build() {
                    Deal buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Deal buildPartial() {
                    Deal deal = new Deal((GeneratedMessageV3.Builder) this);
                    Object unused = deal.id_ = this.id_;
                    double unused2 = deal.flr_ = this.flr_;
                    Object unused3 = deal.flrcur_ = this.flrcur_;
                    int unused4 = deal.at_ = this.at_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.wseat_ = this.wseat_.getUnmodifiableView();
                        this.bitField0_ &= -2;
                    }
                    LazyStringList unused5 = deal.wseat_ = this.wseat_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.wadomain_ = this.wadomain_.getUnmodifiableView();
                        this.bitField0_ &= -3;
                    }
                    LazyStringList unused6 = deal.wadomain_ = this.wadomain_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused7 = deal.ext_ = this.ext_;
                    } else {
                        Struct unused8 = deal.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 4) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -5;
                        }
                        List unused9 = deal.extProto_ = this.extProto_;
                    } else {
                        List unused10 = deal.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return deal;
                }

                public Builder clone() {
                    return (Builder) super.clone();
                }

                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
                }

                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder mergeFrom(Message message) {
                    if (message instanceof Deal) {
                        return mergeFrom((Deal) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Deal deal) {
                    if (deal == Deal.getDefaultInstance()) {
                        return this;
                    }
                    if (!deal.getId().isEmpty()) {
                        this.id_ = deal.id_;
                        onChanged();
                    }
                    if (deal.getFlr() != 0.0d) {
                        setFlr(deal.getFlr());
                    }
                    if (!deal.getFlrcur().isEmpty()) {
                        this.flrcur_ = deal.flrcur_;
                        onChanged();
                    }
                    if (deal.getAt() != 0) {
                        setAt(deal.getAt());
                    }
                    if (!deal.wseat_.isEmpty()) {
                        if (this.wseat_.isEmpty()) {
                            this.wseat_ = deal.wseat_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureWseatIsMutable();
                            this.wseat_.addAll(deal.wseat_);
                        }
                        onChanged();
                    }
                    if (!deal.wadomain_.isEmpty()) {
                        if (this.wadomain_.isEmpty()) {
                            this.wadomain_ = deal.wadomain_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureWadomainIsMutable();
                            this.wadomain_.addAll(deal.wadomain_);
                        }
                        onChanged();
                    }
                    if (deal.hasExt()) {
                        mergeExt(deal.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!deal.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = deal.extProto_;
                                this.bitField0_ &= -5;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(deal.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!deal.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = deal.extProto_;
                            this.bitField0_ &= -5;
                            if (Deal.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(deal.extProto_);
                        }
                    }
                    mergeUnknownFields(deal.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.openrtb.Request.Item.Deal.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Request.Item.Deal.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.openrtb.Request$Item$Deal r3 = (com.explorestack.protobuf.openrtb.Request.Item.Deal) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Item.Deal) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.openrtb.Request$Item$Deal r4 = (com.explorestack.protobuf.openrtb.Request.Item.Deal) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Item.Deal) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Deal.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Request$Item$Deal$Builder");
                }

                public String getId() {
                    Object obj = this.id_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.id_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getIdBytes() {
                    Object obj = this.id_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.id_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setId(String str) {
                    if (str != null) {
                        this.id_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearId() {
                    this.id_ = Deal.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    if (byteString != null) {
                        Deal.checkByteStringIsUtf8(byteString);
                        this.id_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public double getFlr() {
                    return this.flr_;
                }

                public Builder setFlr(double d2) {
                    this.flr_ = d2;
                    onChanged();
                    return this;
                }

                public Builder clearFlr() {
                    this.flr_ = 0.0d;
                    onChanged();
                    return this;
                }

                public String getFlrcur() {
                    Object obj = this.flrcur_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.flrcur_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getFlrcurBytes() {
                    Object obj = this.flrcur_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.flrcur_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setFlrcur(String str) {
                    if (str != null) {
                        this.flrcur_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearFlrcur() {
                    this.flrcur_ = Deal.getDefaultInstance().getFlrcur();
                    onChanged();
                    return this;
                }

                public Builder setFlrcurBytes(ByteString byteString) {
                    if (byteString != null) {
                        Deal.checkByteStringIsUtf8(byteString);
                        this.flrcur_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public int getAt() {
                    return this.at_;
                }

                public Builder setAt(int i) {
                    this.at_ = i;
                    onChanged();
                    return this;
                }

                public Builder clearAt() {
                    this.at_ = 0;
                    onChanged();
                    return this;
                }

                private void ensureWseatIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.wseat_ = new LazyStringArrayList(this.wseat_);
                        this.bitField0_ |= 1;
                    }
                }

                public ProtocolStringList getWseatList() {
                    return this.wseat_.getUnmodifiableView();
                }

                public int getWseatCount() {
                    return this.wseat_.size();
                }

                public String getWseat(int i) {
                    return (String) this.wseat_.get(i);
                }

                public ByteString getWseatBytes(int i) {
                    return this.wseat_.getByteString(i);
                }

                public Builder setWseat(int i, String str) {
                    if (str != null) {
                        ensureWseatIsMutable();
                        this.wseat_.set(i, str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addWseat(String str) {
                    if (str != null) {
                        ensureWseatIsMutable();
                        this.wseat_.add(str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllWseat(Iterable<String> iterable) {
                    ensureWseatIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.wseat_);
                    onChanged();
                    return this;
                }

                public Builder clearWseat() {
                    this.wseat_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder addWseatBytes(ByteString byteString) {
                    if (byteString != null) {
                        Deal.checkByteStringIsUtf8(byteString);
                        ensureWseatIsMutable();
                        this.wseat_.add(byteString);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                private void ensureWadomainIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.wadomain_ = new LazyStringArrayList(this.wadomain_);
                        this.bitField0_ |= 2;
                    }
                }

                public ProtocolStringList getWadomainList() {
                    return this.wadomain_.getUnmodifiableView();
                }

                public int getWadomainCount() {
                    return this.wadomain_.size();
                }

                public String getWadomain(int i) {
                    return (String) this.wadomain_.get(i);
                }

                public ByteString getWadomainBytes(int i) {
                    return this.wadomain_.getByteString(i);
                }

                public Builder setWadomain(int i, String str) {
                    if (str != null) {
                        ensureWadomainIsMutable();
                        this.wadomain_.set(i, str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addWadomain(String str) {
                    if (str != null) {
                        ensureWadomainIsMutable();
                        this.wadomain_.add(str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllWadomain(Iterable<String> iterable) {
                    ensureWadomainIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.wadomain_);
                    onChanged();
                    return this;
                }

                public Builder clearWadomain() {
                    this.wadomain_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder addWadomainBytes(ByteString byteString) {
                    if (byteString != null) {
                        Deal.checkByteStringIsUtf8(byteString);
                        ensureWadomainIsMutable();
                        this.wadomain_.add(byteString);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                public Struct getExt() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Builder setExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(struct);
                    } else if (struct != null) {
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(struct);
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return getExtFieldBuilder().getBuilder();
                }

                public StructOrBuilder getExtOrBuilder() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 4;
                    }
                }

                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -5;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static Deal getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Deal> parser() {
                return PARSER;
            }

            public Parser<Deal> getParserForType() {
                return PARSER;
            }

            public Deal getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getQty() {
            return this.qty_;
        }

        public int getSeq() {
            return this.seq_;
        }

        public double getFlr() {
            return this.flr_;
        }

        public String getFlrcur() {
            Object obj = this.flrcur_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.flrcur_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getFlrcurBytes() {
            Object obj = this.flrcur_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.flrcur_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getExp() {
            return this.exp_;
        }

        public String getDt() {
            Object obj = this.dt_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.dt_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getDtBytes() {
            Object obj = this.dt_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.dt_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public int getDlvy() {
            return this.dlvy_;
        }

        public List<Metric> getMetricList() {
            return this.metric_;
        }

        public List<? extends MetricOrBuilder> getMetricOrBuilderList() {
            return this.metric_;
        }

        public int getMetricCount() {
            return this.metric_.size();
        }

        public Metric getMetric(int i) {
            return this.metric_.get(i);
        }

        public MetricOrBuilder getMetricOrBuilder(int i) {
            return this.metric_.get(i);
        }

        public List<Deal> getDealList() {
            return this.deal_;
        }

        public List<? extends DealOrBuilder> getDealOrBuilderList() {
            return this.deal_;
        }

        public int getDealCount() {
            return this.deal_.size();
        }

        public Deal getDeal(int i) {
            return this.deal_.get(i);
        }

        public DealOrBuilder getDealOrBuilder(int i) {
            return this.deal_.get(i);
        }

        public boolean getPrivate() {
            return this.private_;
        }

        public boolean hasSpec() {
            return this.spec_ != null;
        }

        public Any getSpec() {
            Any any = this.spec_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public AnyOrBuilder getSpecOrBuilder() {
            return getSpec();
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
        }

        public final boolean isInitialized() {
            byte b2 = this.memoizedIsInitialized;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            int i = this.qty_;
            if (i != 0) {
                codedOutputStream.writeUInt32(2, i);
            }
            int i2 = this.seq_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(3, i2);
            }
            double d2 = this.flr_;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(4, d2);
            }
            if (!getFlrcurBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.flrcur_);
            }
            int i3 = this.exp_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(7, i3);
            }
            if (!getDtBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.dt_);
            }
            int i4 = this.dlvy_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(9, i4);
            }
            for (int i5 = 0; i5 < this.metric_.size(); i5++) {
                codedOutputStream.writeMessage(10, this.metric_.get(i5));
            }
            for (int i6 = 0; i6 < this.deal_.size(); i6++) {
                codedOutputStream.writeMessage(11, this.deal_.get(i6));
            }
            boolean z = this.private_;
            if (z) {
                codedOutputStream.writeBool(12, z);
            }
            if (this.spec_ != null) {
                codedOutputStream.writeMessage(13, getSpec());
            }
            for (int i7 = 0; i7 < this.extProto_.size(); i7++) {
                codedOutputStream.writeMessage(14, this.extProto_.get(i7));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(15, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
            int i2 = this.qty_;
            if (i2 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
            }
            int i3 = this.seq_;
            if (i3 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(3, i3);
            }
            double d2 = this.flr_;
            if (d2 != 0.0d) {
                computeStringSize += CodedOutputStream.computeDoubleSize(4, d2);
            }
            if (!getFlrcurBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(6, this.flrcur_);
            }
            int i4 = this.exp_;
            if (i4 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(7, i4);
            }
            if (!getDtBytes().isEmpty()) {
                computeStringSize += GeneratedMessageV3.computeStringSize(8, this.dt_);
            }
            int i5 = this.dlvy_;
            if (i5 != 0) {
                computeStringSize += CodedOutputStream.computeUInt32Size(9, i5);
            }
            for (int i6 = 0; i6 < this.metric_.size(); i6++) {
                computeStringSize += CodedOutputStream.computeMessageSize(10, this.metric_.get(i6));
            }
            for (int i7 = 0; i7 < this.deal_.size(); i7++) {
                computeStringSize += CodedOutputStream.computeMessageSize(11, this.deal_.get(i7));
            }
            boolean z = this.private_;
            if (z) {
                computeStringSize += CodedOutputStream.computeBoolSize(12, z);
            }
            if (this.spec_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(13, getSpec());
            }
            for (int i8 = 0; i8 < this.extProto_.size(); i8++) {
                computeStringSize += CodedOutputStream.computeMessageSize(14, this.extProto_.get(i8));
            }
            if (this.ext_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(15, getExt());
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return super.equals(obj);
            }
            Item item = (Item) obj;
            if (!getId().equals(item.getId()) || getQty() != item.getQty() || getSeq() != item.getSeq() || Double.doubleToLongBits(getFlr()) != Double.doubleToLongBits(item.getFlr()) || !getFlrcur().equals(item.getFlrcur()) || getExp() != item.getExp() || !getDt().equals(item.getDt()) || getDlvy() != item.getDlvy() || !getMetricList().equals(item.getMetricList()) || !getDealList().equals(item.getDealList()) || getPrivate() != item.getPrivate() || hasSpec() != item.hasSpec()) {
                return false;
            }
            if ((hasSpec() && !getSpec().equals(item.getSpec())) || hasExt() != item.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(item.getExt())) && getExtProtoList().equals(item.getExtProtoList()) && this.unknownFields.equals(item.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getQty()) * 37) + 3) * 53) + getSeq()) * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getFlr()))) * 37) + 6) * 53) + getFlrcur().hashCode()) * 37) + 7) * 53) + getExp()) * 37) + 8) * 53) + getDt().hashCode()) * 37) + 9) * 53) + getDlvy();
            if (getMetricCount() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + getMetricList().hashCode();
            }
            if (getDealCount() > 0) {
                hashCode = (((hashCode * 37) + 11) * 53) + getDealList().hashCode();
            }
            int hashBoolean = (((hashCode * 37) + 12) * 53) + Internal.hashBoolean(getPrivate());
            if (hasSpec()) {
                hashBoolean = (((hashBoolean * 37) + 13) * 53) + getSpec().hashCode();
            }
            if (hasExt()) {
                hashBoolean = (((hashBoolean * 37) + 15) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashBoolean = (((hashBoolean * 37) + 14) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashBoolean * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Item parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Item parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Item parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Item parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Item parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Item parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Item parseFrom(InputStream inputStream) throws IOException {
            return (Item) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Item parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Item) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Item parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Item) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Item parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Item) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Item parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Item) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Item parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Item) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Item item) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(item);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> dealBuilder_;
            private List<Deal> deal_;
            private int dlvy_;
            private Object dt_;
            private int exp_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private double flr_;
            private Object flrcur_;
            private Object id_;
            private RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> metricBuilder_;
            private List<Metric> metric_;
            private boolean private_;
            private int qty_;
            private int seq_;
            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> specBuilder_;
            private Any spec_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_fieldAccessorTable.ensureFieldAccessorsInitialized(Item.class, Builder.class);
            }

            private Builder() {
                this.id_ = "";
                this.flrcur_ = "";
                this.dt_ = "";
                this.metric_ = Collections.emptyList();
                this.deal_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.flrcur_ = "";
                this.dt_ = "";
                this.metric_ = Collections.emptyList();
                this.deal_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Item.alwaysUseFieldBuilders) {
                    getMetricFieldBuilder();
                    getDealFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.id_ = "";
                this.qty_ = 0;
                this.seq_ = 0;
                this.flr_ = 0.0d;
                this.flrcur_ = "";
                this.exp_ = 0;
                this.dt_ = "";
                this.dlvy_ = 0;
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.metric_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV32 = this.dealBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.deal_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                this.private_ = false;
                if (this.specBuilder_ == null) {
                    this.spec_ = null;
                } else {
                    this.spec_ = null;
                    this.specBuilder_ = null;
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV33 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV33 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                } else {
                    repeatedFieldBuilderV33.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_Item_descriptor;
            }

            public Item getDefaultInstanceForType() {
                return Item.getDefaultInstance();
            }

            public Item build() {
                Item buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Item buildPartial() {
                Item item = new Item((GeneratedMessageV3.Builder) this);
                Object unused = item.id_ = this.id_;
                int unused2 = item.qty_ = this.qty_;
                int unused3 = item.seq_ = this.seq_;
                double unused4 = item.flr_ = this.flr_;
                Object unused5 = item.flrcur_ = this.flrcur_;
                int unused6 = item.exp_ = this.exp_;
                Object unused7 = item.dt_ = this.dt_;
                int unused8 = item.dlvy_ = this.dlvy_;
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.metric_ = Collections.unmodifiableList(this.metric_);
                        this.bitField0_ &= -2;
                    }
                    List unused9 = item.metric_ = this.metric_;
                } else {
                    List unused10 = item.metric_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV32 = this.dealBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.deal_ = Collections.unmodifiableList(this.deal_);
                        this.bitField0_ &= -3;
                    }
                    List unused11 = item.deal_ = this.deal_;
                } else {
                    List unused12 = item.deal_ = repeatedFieldBuilderV32.build();
                }
                boolean unused13 = item.private_ = this.private_;
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.specBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Any unused14 = item.spec_ = this.spec_;
                } else {
                    Any unused15 = item.spec_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Struct unused16 = item.ext_ = this.ext_;
                } else {
                    Struct unused17 = item.ext_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV33 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    List unused18 = item.extProto_ = this.extProto_;
                } else {
                    List unused19 = item.extProto_ = repeatedFieldBuilderV33.build();
                }
                onBuilt();
                return item;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
            }

            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder mergeFrom(Message message) {
                if (message instanceof Item) {
                    return mergeFrom((Item) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Item item) {
                if (item == Item.getDefaultInstance()) {
                    return this;
                }
                if (!item.getId().isEmpty()) {
                    this.id_ = item.id_;
                    onChanged();
                }
                if (item.getQty() != 0) {
                    setQty(item.getQty());
                }
                if (item.getSeq() != 0) {
                    setSeq(item.getSeq());
                }
                if (item.getFlr() != 0.0d) {
                    setFlr(item.getFlr());
                }
                if (!item.getFlrcur().isEmpty()) {
                    this.flrcur_ = item.flrcur_;
                    onChanged();
                }
                if (item.getExp() != 0) {
                    setExp(item.getExp());
                }
                if (!item.getDt().isEmpty()) {
                    this.dt_ = item.dt_;
                    onChanged();
                }
                if (item.getDlvy() != 0) {
                    setDlvy(item.getDlvy());
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                if (this.metricBuilder_ == null) {
                    if (!item.metric_.isEmpty()) {
                        if (this.metric_.isEmpty()) {
                            this.metric_ = item.metric_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMetricIsMutable();
                            this.metric_.addAll(item.metric_);
                        }
                        onChanged();
                    }
                } else if (!item.metric_.isEmpty()) {
                    if (this.metricBuilder_.isEmpty()) {
                        this.metricBuilder_.dispose();
                        this.metricBuilder_ = null;
                        this.metric_ = item.metric_;
                        this.bitField0_ &= -2;
                        this.metricBuilder_ = Item.alwaysUseFieldBuilders ? getMetricFieldBuilder() : null;
                    } else {
                        this.metricBuilder_.addAllMessages(item.metric_);
                    }
                }
                if (this.dealBuilder_ == null) {
                    if (!item.deal_.isEmpty()) {
                        if (this.deal_.isEmpty()) {
                            this.deal_ = item.deal_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureDealIsMutable();
                            this.deal_.addAll(item.deal_);
                        }
                        onChanged();
                    }
                } else if (!item.deal_.isEmpty()) {
                    if (this.dealBuilder_.isEmpty()) {
                        this.dealBuilder_.dispose();
                        this.dealBuilder_ = null;
                        this.deal_ = item.deal_;
                        this.bitField0_ &= -3;
                        this.dealBuilder_ = Item.alwaysUseFieldBuilders ? getDealFieldBuilder() : null;
                    } else {
                        this.dealBuilder_.addAllMessages(item.deal_);
                    }
                }
                if (item.getPrivate()) {
                    setPrivate(item.getPrivate());
                }
                if (item.hasSpec()) {
                    mergeSpec(item.getSpec());
                }
                if (item.hasExt()) {
                    mergeExt(item.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!item.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = item.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(item.extProto_);
                        }
                        onChanged();
                    }
                } else if (!item.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = item.extProto_;
                        this.bitField0_ &= -5;
                        if (Item.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(item.extProto_);
                    }
                }
                mergeUnknownFields(item.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.openrtb.Request.Item.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Request.Item.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.openrtb.Request$Item r3 = (com.explorestack.protobuf.openrtb.Request.Item) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Item) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.openrtb.Request$Item r4 = (com.explorestack.protobuf.openrtb.Request.Item) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.openrtb.Request.Item) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Item.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Request$Item$Builder");
            }

            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.id_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setId(String str) {
                if (str != null) {
                    this.id_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearId() {
                this.id_ = Item.getDefaultInstance().getId();
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                if (byteString != null) {
                    Item.checkByteStringIsUtf8(byteString);
                    this.id_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getQty() {
                return this.qty_;
            }

            public Builder setQty(int i) {
                this.qty_ = i;
                onChanged();
                return this;
            }

            public Builder clearQty() {
                this.qty_ = 0;
                onChanged();
                return this;
            }

            public int getSeq() {
                return this.seq_;
            }

            public Builder setSeq(int i) {
                this.seq_ = i;
                onChanged();
                return this;
            }

            public Builder clearSeq() {
                this.seq_ = 0;
                onChanged();
                return this;
            }

            public double getFlr() {
                return this.flr_;
            }

            public Builder setFlr(double d2) {
                this.flr_ = d2;
                onChanged();
                return this;
            }

            public Builder clearFlr() {
                this.flr_ = 0.0d;
                onChanged();
                return this;
            }

            public String getFlrcur() {
                Object obj = this.flrcur_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.flrcur_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getFlrcurBytes() {
                Object obj = this.flrcur_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.flrcur_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setFlrcur(String str) {
                if (str != null) {
                    this.flrcur_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearFlrcur() {
                this.flrcur_ = Item.getDefaultInstance().getFlrcur();
                onChanged();
                return this;
            }

            public Builder setFlrcurBytes(ByteString byteString) {
                if (byteString != null) {
                    Item.checkByteStringIsUtf8(byteString);
                    this.flrcur_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getExp() {
                return this.exp_;
            }

            public Builder setExp(int i) {
                this.exp_ = i;
                onChanged();
                return this;
            }

            public Builder clearExp() {
                this.exp_ = 0;
                onChanged();
                return this;
            }

            public String getDt() {
                Object obj = this.dt_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.dt_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDtBytes() {
                Object obj = this.dt_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.dt_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setDt(String str) {
                if (str != null) {
                    this.dt_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearDt() {
                this.dt_ = Item.getDefaultInstance().getDt();
                onChanged();
                return this;
            }

            public Builder setDtBytes(ByteString byteString) {
                if (byteString != null) {
                    Item.checkByteStringIsUtf8(byteString);
                    this.dt_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getDlvy() {
                return this.dlvy_;
            }

            public Builder setDlvy(int i) {
                this.dlvy_ = i;
                onChanged();
                return this;
            }

            public Builder clearDlvy() {
                this.dlvy_ = 0;
                onChanged();
                return this;
            }

            private void ensureMetricIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.metric_ = new ArrayList(this.metric_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Metric> getMetricList() {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.metric_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getMetricCount() {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.metric_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Metric getMetric(int i) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.metric_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setMetric(int i, Metric metric) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, metric);
                } else if (metric != null) {
                    ensureMetricIsMutable();
                    this.metric_.set(i, metric);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setMetric(int i, Metric.Builder builder) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricIsMutable();
                    this.metric_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addMetric(Metric metric) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(metric);
                } else if (metric != null) {
                    ensureMetricIsMutable();
                    this.metric_.add(metric);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addMetric(int i, Metric metric) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, metric);
                } else if (metric != null) {
                    ensureMetricIsMutable();
                    this.metric_.add(i, metric);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addMetric(Metric.Builder builder) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricIsMutable();
                    this.metric_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addMetric(int i, Metric.Builder builder) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricIsMutable();
                    this.metric_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllMetric(Iterable<? extends Metric> iterable) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.metric_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearMetric() {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.metric_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeMetric(int i) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricIsMutable();
                    this.metric_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Metric.Builder getMetricBuilder(int i) {
                return getMetricFieldBuilder().getBuilder(i);
            }

            public MetricOrBuilder getMetricOrBuilder(int i) {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.metric_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends MetricOrBuilder> getMetricOrBuilderList() {
                RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.metric_);
            }

            public Metric.Builder addMetricBuilder() {
                return getMetricFieldBuilder().addBuilder(Metric.getDefaultInstance());
            }

            public Metric.Builder addMetricBuilder(int i) {
                return getMetricFieldBuilder().addBuilder(i, Metric.getDefaultInstance());
            }

            public List<Metric.Builder> getMetricBuilderList() {
                return getMetricFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> getMetricFieldBuilder() {
                if (this.metricBuilder_ == null) {
                    List<Metric> list = this.metric_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.metricBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.metric_ = null;
                }
                return this.metricBuilder_;
            }

            private void ensureDealIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.deal_ = new ArrayList(this.deal_);
                    this.bitField0_ |= 2;
                }
            }

            public List<Deal> getDealList() {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.deal_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getDealCount() {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.deal_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Deal getDeal(int i) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.deal_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setDeal(int i, Deal deal) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, deal);
                } else if (deal != null) {
                    ensureDealIsMutable();
                    this.deal_.set(i, deal);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setDeal(int i, Deal.Builder builder) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDealIsMutable();
                    this.deal_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addDeal(Deal deal) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(deal);
                } else if (deal != null) {
                    ensureDealIsMutable();
                    this.deal_.add(deal);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addDeal(int i, Deal deal) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, deal);
                } else if (deal != null) {
                    ensureDealIsMutable();
                    this.deal_.add(i, deal);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addDeal(Deal.Builder builder) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDealIsMutable();
                    this.deal_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addDeal(int i, Deal.Builder builder) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDealIsMutable();
                    this.deal_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllDeal(Iterable<? extends Deal> iterable) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDealIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.deal_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearDeal() {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.deal_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeDeal(int i) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDealIsMutable();
                    this.deal_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Deal.Builder getDealBuilder(int i) {
                return getDealFieldBuilder().getBuilder(i);
            }

            public DealOrBuilder getDealOrBuilder(int i) {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.deal_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends DealOrBuilder> getDealOrBuilderList() {
                RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> repeatedFieldBuilderV3 = this.dealBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.deal_);
            }

            public Deal.Builder addDealBuilder() {
                return getDealFieldBuilder().addBuilder(Deal.getDefaultInstance());
            }

            public Deal.Builder addDealBuilder(int i) {
                return getDealFieldBuilder().addBuilder(i, Deal.getDefaultInstance());
            }

            public List<Deal.Builder> getDealBuilderList() {
                return getDealFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Deal, Deal.Builder, DealOrBuilder> getDealFieldBuilder() {
                if (this.dealBuilder_ == null) {
                    this.dealBuilder_ = new RepeatedFieldBuilderV3<>(this.deal_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.deal_ = null;
                }
                return this.dealBuilder_;
            }

            public boolean getPrivate() {
                return this.private_;
            }

            public Builder setPrivate(boolean z) {
                this.private_ = z;
                onChanged();
                return this;
            }

            public Builder clearPrivate() {
                this.private_ = false;
                onChanged();
                return this;
            }

            public boolean hasSpec() {
                return (this.specBuilder_ == null && this.spec_ == null) ? false : true;
            }

            public Any getSpec() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.specBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Any any = this.spec_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public Builder setSpec(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.specBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(any);
                } else if (any != null) {
                    this.spec_ = any;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setSpec(Any.Builder builder) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.specBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.spec_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeSpec(Any any) {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.specBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Any any2 = this.spec_;
                    if (any2 != null) {
                        this.spec_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                    } else {
                        this.spec_ = any;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(any);
                }
                return this;
            }

            public Builder clearSpec() {
                if (this.specBuilder_ == null) {
                    this.spec_ = null;
                    onChanged();
                } else {
                    this.spec_ = null;
                    this.specBuilder_ = null;
                }
                return this;
            }

            public Any.Builder getSpecBuilder() {
                onChanged();
                return getSpecFieldBuilder().getBuilder();
            }

            public AnyOrBuilder getSpecOrBuilder() {
                SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.specBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Any any = this.spec_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getSpecFieldBuilder() {
                if (this.specBuilder_ == null) {
                    this.specBuilder_ = new SingleFieldBuilderV3<>(getSpec(), getParentForChildren(), isClean());
                    this.spec_ = null;
                }
                return this.specBuilder_;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 4;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -5;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Item getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Item> parser() {
            return PARSER;
        }

        public Parser<Item> getParserForType() {
            return PARSER;
        }

        public Item getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean getTest() {
        return this.test_;
    }

    public int getTmax() {
        return this.tmax_;
    }

    public int getAt() {
        return this.at_;
    }

    public ProtocolStringList getCurList() {
        return this.cur_;
    }

    public int getCurCount() {
        return this.cur_.size();
    }

    public String getCur(int i) {
        return (String) this.cur_.get(i);
    }

    public ByteString getCurBytes(int i) {
        return this.cur_.getByteString(i);
    }

    public ProtocolStringList getSeatList() {
        return this.seat_;
    }

    public int getSeatCount() {
        return this.seat_.size();
    }

    public String getSeat(int i) {
        return (String) this.seat_.get(i);
    }

    public ByteString getSeatBytes(int i) {
        return this.seat_.getByteString(i);
    }

    public boolean getWseat() {
        return this.wseat_;
    }

    public String getCdata() {
        Object obj = this.cdata_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cdata_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCdataBytes() {
        Object obj = this.cdata_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cdata_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasSource() {
        return this.source_ != null;
    }

    public Source getSource() {
        Source source = this.source_;
        return source == null ? Source.getDefaultInstance() : source;
    }

    public SourceOrBuilder getSourceOrBuilder() {
        return getSource();
    }

    public List<Item> getItemList() {
        return this.item_;
    }

    public List<? extends ItemOrBuilder> getItemOrBuilderList() {
        return this.item_;
    }

    public int getItemCount() {
        return this.item_.size();
    }

    public Item getItem(int i) {
        return this.item_.get(i);
    }

    public ItemOrBuilder getItemOrBuilder(int i) {
        return this.item_.get(i);
    }

    public int getPackage() {
        return this.package_;
    }

    public boolean hasContext() {
        return this.context_ != null;
    }

    public Any getContext() {
        Any any = this.context_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public AnyOrBuilder getContextOrBuilder() {
        return getContext();
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public StructOrBuilder getExtOrBuilder() {
        return getExt();
    }

    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    public Any getExtProto(int i) {
        return this.extProto_.get(i);
    }

    public AnyOrBuilder getExtProtoOrBuilder(int i) {
        return this.extProto_.get(i);
    }

    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
        }
        boolean z = this.test_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        int i = this.tmax_;
        if (i != 0) {
            codedOutputStream.writeUInt32(3, i);
        }
        int i2 = this.at_;
        if (i2 != 0) {
            codedOutputStream.writeUInt32(4, i2);
        }
        for (int i3 = 0; i3 < this.cur_.size(); i3++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.cur_.getRaw(i3));
        }
        for (int i4 = 0; i4 < this.seat_.size(); i4++) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.seat_.getRaw(i4));
        }
        boolean z2 = this.wseat_;
        if (z2) {
            codedOutputStream.writeBool(7, z2);
        }
        if (!getCdataBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.cdata_);
        }
        if (this.source_ != null) {
            codedOutputStream.writeMessage(9, getSource());
        }
        for (int i5 = 0; i5 < this.item_.size(); i5++) {
            codedOutputStream.writeMessage(10, this.item_.get(i5));
        }
        int i6 = this.package_;
        if (i6 != 0) {
            codedOutputStream.writeUInt32(11, i6);
        }
        if (this.context_ != null) {
            codedOutputStream.writeMessage(12, getContext());
        }
        for (int i7 = 0; i7 < this.extProto_.size(); i7++) {
            codedOutputStream.writeMessage(13, this.extProto_.get(i7));
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(14, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
        boolean z = this.test_;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(2, z);
        }
        int i2 = this.tmax_;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(3, i2);
        }
        int i3 = this.at_;
        if (i3 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(4, i3);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.cur_.size(); i5++) {
            i4 += computeStringSizeNoTag(this.cur_.getRaw(i5));
        }
        int size = computeStringSize + i4 + (getCurList().size() * 1);
        int i6 = 0;
        for (int i7 = 0; i7 < this.seat_.size(); i7++) {
            i6 += computeStringSizeNoTag(this.seat_.getRaw(i7));
        }
        int size2 = size + i6 + (getSeatList().size() * 1);
        boolean z2 = this.wseat_;
        if (z2) {
            size2 += CodedOutputStream.computeBoolSize(7, z2);
        }
        if (!getCdataBytes().isEmpty()) {
            size2 += GeneratedMessageV3.computeStringSize(8, this.cdata_);
        }
        if (this.source_ != null) {
            size2 += CodedOutputStream.computeMessageSize(9, getSource());
        }
        for (int i8 = 0; i8 < this.item_.size(); i8++) {
            size2 += CodedOutputStream.computeMessageSize(10, this.item_.get(i8));
        }
        int i9 = this.package_;
        if (i9 != 0) {
            size2 += CodedOutputStream.computeUInt32Size(11, i9);
        }
        if (this.context_ != null) {
            size2 += CodedOutputStream.computeMessageSize(12, getContext());
        }
        for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
            size2 += CodedOutputStream.computeMessageSize(13, this.extProto_.get(i10));
        }
        if (this.ext_ != null) {
            size2 += CodedOutputStream.computeMessageSize(14, getExt());
        }
        int serializedSize = size2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return super.equals(obj);
        }
        Request request = (Request) obj;
        if (!getId().equals(request.getId()) || getTest() != request.getTest() || getTmax() != request.getTmax() || getAt() != request.getAt() || !getCurList().equals(request.getCurList()) || !getSeatList().equals(request.getSeatList()) || getWseat() != request.getWseat() || !getCdata().equals(request.getCdata()) || hasSource() != request.hasSource()) {
            return false;
        }
        if ((hasSource() && !getSource().equals(request.getSource())) || !getItemList().equals(request.getItemList()) || getPackage() != request.getPackage() || hasContext() != request.hasContext()) {
            return false;
        }
        if ((hasContext() && !getContext().equals(request.getContext())) || hasExt() != request.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(request.getExt())) && getExtProtoList().equals(request.getExtProtoList()) && this.unknownFields.equals(request.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getTest())) * 37) + 3) * 53) + getTmax()) * 37) + 4) * 53) + getAt();
        if (getCurCount() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + getCurList().hashCode();
        }
        if (getSeatCount() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getSeatList().hashCode();
        }
        int hashBoolean = (((((((hashCode * 37) + 7) * 53) + Internal.hashBoolean(getWseat())) * 37) + 8) * 53) + getCdata().hashCode();
        if (hasSource()) {
            hashBoolean = (((hashBoolean * 37) + 9) * 53) + getSource().hashCode();
        }
        if (getItemCount() > 0) {
            hashBoolean = (((hashBoolean * 37) + 10) * 53) + getItemList().hashCode();
        }
        int i = (((hashBoolean * 37) + 11) * 53) + getPackage();
        if (hasContext()) {
            i = (((i * 37) + 12) * 53) + getContext().hashCode();
        }
        if (hasExt()) {
            i = (((i * 37) + 14) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            i = (((i * 37) + 13) * 53) + getExtProtoList().hashCode();
        }
        int hashCode2 = (i * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Request parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Request parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Request parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Request parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Request parseFrom(InputStream inputStream) throws IOException {
        return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Request) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Request parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Request) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Request parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Request) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Request request) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(request);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestOrBuilder {
        private int at_;
        private int bitField0_;
        private Object cdata_;
        private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> contextBuilder_;
        private Any context_;
        private LazyStringList cur_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> itemBuilder_;
        private List<Item> item_;
        private int package_;
        private LazyStringList seat_;
        private SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> sourceBuilder_;
        private Source source_;
        private boolean test_;
        private int tmax_;
        private boolean wseat_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_fieldAccessorTable.ensureFieldAccessorsInitialized(Request.class, Builder.class);
        }

        private Builder() {
            this.id_ = "";
            this.cur_ = LazyStringArrayList.EMPTY;
            this.seat_ = LazyStringArrayList.EMPTY;
            this.cdata_ = "";
            this.item_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.id_ = "";
            this.cur_ = LazyStringArrayList.EMPTY;
            this.seat_ = LazyStringArrayList.EMPTY;
            this.cdata_ = "";
            this.item_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Request.alwaysUseFieldBuilders) {
                getItemFieldBuilder();
                getExtProtoFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.id_ = "";
            this.test_ = false;
            this.tmax_ = 0;
            this.at_ = 0;
            this.cur_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.seat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.wseat_ = false;
            this.cdata_ = "";
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
            } else {
                this.source_ = null;
                this.sourceBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -5;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            this.package_ = 0;
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -9;
            } else {
                repeatedFieldBuilderV32.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Request_descriptor;
        }

        public Request getDefaultInstanceForType() {
            return Request.getDefaultInstance();
        }

        public Request build() {
            Request buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Request buildPartial() {
            Request request = new Request((GeneratedMessageV3.Builder) this);
            Object unused = request.id_ = this.id_;
            boolean unused2 = request.test_ = this.test_;
            int unused3 = request.tmax_ = this.tmax_;
            int unused4 = request.at_ = this.at_;
            if ((this.bitField0_ & 1) != 0) {
                this.cur_ = this.cur_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            LazyStringList unused5 = request.cur_ = this.cur_;
            if ((this.bitField0_ & 2) != 0) {
                this.seat_ = this.seat_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            LazyStringList unused6 = request.seat_ = this.seat_;
            boolean unused7 = request.wseat_ = this.wseat_;
            Object unused8 = request.cdata_ = this.cdata_;
            SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                Source unused9 = request.source_ = this.source_;
            } else {
                Source unused10 = request.source_ = singleFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 4) != 0) {
                    this.item_ = Collections.unmodifiableList(this.item_);
                    this.bitField0_ &= -5;
                }
                List unused11 = request.item_ = this.item_;
            } else {
                List unused12 = request.item_ = repeatedFieldBuilderV3.build();
            }
            int unused13 = request.package_ = this.package_;
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV32 = this.contextBuilder_;
            if (singleFieldBuilderV32 == null) {
                Any unused14 = request.context_ = this.context_;
            } else {
                Any unused15 = request.context_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV33 = this.extBuilder_;
            if (singleFieldBuilderV33 == null) {
                Struct unused16 = request.ext_ = this.ext_;
            } else {
                Struct unused17 = request.ext_ = singleFieldBuilderV33.build();
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                List unused18 = request.extProto_ = this.extProto_;
            } else {
                List unused19 = request.extProto_ = repeatedFieldBuilderV32.build();
            }
            onBuilt();
            return request;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof Request) {
                return mergeFrom((Request) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Request request) {
            if (request == Request.getDefaultInstance()) {
                return this;
            }
            if (!request.getId().isEmpty()) {
                this.id_ = request.id_;
                onChanged();
            }
            if (request.getTest()) {
                setTest(request.getTest());
            }
            if (request.getTmax() != 0) {
                setTmax(request.getTmax());
            }
            if (request.getAt() != 0) {
                setAt(request.getAt());
            }
            if (!request.cur_.isEmpty()) {
                if (this.cur_.isEmpty()) {
                    this.cur_ = request.cur_;
                    this.bitField0_ &= -2;
                } else {
                    ensureCurIsMutable();
                    this.cur_.addAll(request.cur_);
                }
                onChanged();
            }
            if (!request.seat_.isEmpty()) {
                if (this.seat_.isEmpty()) {
                    this.seat_ = request.seat_;
                    this.bitField0_ &= -3;
                } else {
                    ensureSeatIsMutable();
                    this.seat_.addAll(request.seat_);
                }
                onChanged();
            }
            if (request.getWseat()) {
                setWseat(request.getWseat());
            }
            if (!request.getCdata().isEmpty()) {
                this.cdata_ = request.cdata_;
                onChanged();
            }
            if (request.hasSource()) {
                mergeSource(request.getSource());
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
            if (this.itemBuilder_ == null) {
                if (!request.item_.isEmpty()) {
                    if (this.item_.isEmpty()) {
                        this.item_ = request.item_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureItemIsMutable();
                        this.item_.addAll(request.item_);
                    }
                    onChanged();
                }
            } else if (!request.item_.isEmpty()) {
                if (this.itemBuilder_.isEmpty()) {
                    this.itemBuilder_.dispose();
                    this.itemBuilder_ = null;
                    this.item_ = request.item_;
                    this.bitField0_ &= -5;
                    this.itemBuilder_ = Request.alwaysUseFieldBuilders ? getItemFieldBuilder() : null;
                } else {
                    this.itemBuilder_.addAllMessages(request.item_);
                }
            }
            if (request.getPackage() != 0) {
                setPackage(request.getPackage());
            }
            if (request.hasContext()) {
                mergeContext(request.getContext());
            }
            if (request.hasExt()) {
                mergeExt(request.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!request.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = request.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(request.extProto_);
                    }
                    onChanged();
                }
            } else if (!request.extProto_.isEmpty()) {
                if (this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = request.extProto_;
                    this.bitField0_ &= -9;
                    if (Request.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                    }
                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.extProtoBuilder_.addAllMessages(request.extProto_);
                }
            }
            mergeUnknownFields(request.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.explorestack.protobuf.openrtb.Request.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Request.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.explorestack.protobuf.openrtb.Request r3 = (com.explorestack.protobuf.openrtb.Request) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.explorestack.protobuf.openrtb.Request) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.explorestack.protobuf.openrtb.Request r4 = (com.explorestack.protobuf.openrtb.Request) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.explorestack.protobuf.openrtb.Request) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Request.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Request$Builder");
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setId(String str) {
            if (str != null) {
                this.id_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearId() {
            this.id_ = Request.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            if (byteString != null) {
                Request.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean getTest() {
            return this.test_;
        }

        public Builder setTest(boolean z) {
            this.test_ = z;
            onChanged();
            return this;
        }

        public Builder clearTest() {
            this.test_ = false;
            onChanged();
            return this;
        }

        public int getTmax() {
            return this.tmax_;
        }

        public Builder setTmax(int i) {
            this.tmax_ = i;
            onChanged();
            return this;
        }

        public Builder clearTmax() {
            this.tmax_ = 0;
            onChanged();
            return this;
        }

        public int getAt() {
            return this.at_;
        }

        public Builder setAt(int i) {
            this.at_ = i;
            onChanged();
            return this;
        }

        public Builder clearAt() {
            this.at_ = 0;
            onChanged();
            return this;
        }

        private void ensureCurIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.cur_ = new LazyStringArrayList(this.cur_);
                this.bitField0_ |= 1;
            }
        }

        public ProtocolStringList getCurList() {
            return this.cur_.getUnmodifiableView();
        }

        public int getCurCount() {
            return this.cur_.size();
        }

        public String getCur(int i) {
            return (String) this.cur_.get(i);
        }

        public ByteString getCurBytes(int i) {
            return this.cur_.getByteString(i);
        }

        public Builder setCur(int i, String str) {
            if (str != null) {
                ensureCurIsMutable();
                this.cur_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addCur(String str) {
            if (str != null) {
                ensureCurIsMutable();
                this.cur_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllCur(Iterable<String> iterable) {
            ensureCurIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.cur_);
            onChanged();
            return this;
        }

        public Builder clearCur() {
            this.cur_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder addCurBytes(ByteString byteString) {
            if (byteString != null) {
                Request.checkByteStringIsUtf8(byteString);
                ensureCurIsMutable();
                this.cur_.add(byteString);
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureSeatIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.seat_ = new LazyStringArrayList(this.seat_);
                this.bitField0_ |= 2;
            }
        }

        public ProtocolStringList getSeatList() {
            return this.seat_.getUnmodifiableView();
        }

        public int getSeatCount() {
            return this.seat_.size();
        }

        public String getSeat(int i) {
            return (String) this.seat_.get(i);
        }

        public ByteString getSeatBytes(int i) {
            return this.seat_.getByteString(i);
        }

        public Builder setSeat(int i, String str) {
            if (str != null) {
                ensureSeatIsMutable();
                this.seat_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addSeat(String str) {
            if (str != null) {
                ensureSeatIsMutable();
                this.seat_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllSeat(Iterable<String> iterable) {
            ensureSeatIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.seat_);
            onChanged();
            return this;
        }

        public Builder clearSeat() {
            this.seat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addSeatBytes(ByteString byteString) {
            if (byteString != null) {
                Request.checkByteStringIsUtf8(byteString);
                ensureSeatIsMutable();
                this.seat_.add(byteString);
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean getWseat() {
            return this.wseat_;
        }

        public Builder setWseat(boolean z) {
            this.wseat_ = z;
            onChanged();
            return this;
        }

        public Builder clearWseat() {
            this.wseat_ = false;
            onChanged();
            return this;
        }

        public String getCdata() {
            Object obj = this.cdata_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cdata_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCdataBytes() {
            Object obj = this.cdata_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cdata_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setCdata(String str) {
            if (str != null) {
                this.cdata_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearCdata() {
            this.cdata_ = Request.getDefaultInstance().getCdata();
            onChanged();
            return this;
        }

        public Builder setCdataBytes(ByteString byteString) {
            if (byteString != null) {
                Request.checkByteStringIsUtf8(byteString);
                this.cdata_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean hasSource() {
            return (this.sourceBuilder_ == null && this.source_ == null) ? false : true;
        }

        public Source getSource() {
            SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Source source = this.source_;
            return source == null ? Source.getDefaultInstance() : source;
        }

        public Builder setSource(Source source) {
            SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(source);
            } else if (source != null) {
                this.source_ = source;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setSource(Source.Builder builder) {
            SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.source_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeSource(Source source) {
            SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 == null) {
                Source source2 = this.source_;
                if (source2 != null) {
                    this.source_ = Source.newBuilder(source2).mergeFrom(source).buildPartial();
                } else {
                    this.source_ = source;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(source);
            }
            return this;
        }

        public Builder clearSource() {
            if (this.sourceBuilder_ == null) {
                this.source_ = null;
                onChanged();
            } else {
                this.source_ = null;
                this.sourceBuilder_ = null;
            }
            return this;
        }

        public Source.Builder getSourceBuilder() {
            onChanged();
            return getSourceFieldBuilder().getBuilder();
        }

        public SourceOrBuilder getSourceOrBuilder() {
            SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> singleFieldBuilderV3 = this.sourceBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Source source = this.source_;
            return source == null ? Source.getDefaultInstance() : source;
        }

        private SingleFieldBuilderV3<Source, Source.Builder, SourceOrBuilder> getSourceFieldBuilder() {
            if (this.sourceBuilder_ == null) {
                this.sourceBuilder_ = new SingleFieldBuilderV3<>(getSource(), getParentForChildren(), isClean());
                this.source_ = null;
            }
            return this.sourceBuilder_;
        }

        private void ensureItemIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.item_ = new ArrayList(this.item_);
                this.bitField0_ |= 4;
            }
        }

        public List<Item> getItemList() {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.item_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getItemCount() {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.item_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public Item getItem(int i) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.item_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setItem(int i, Item item) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, item);
            } else if (item != null) {
                ensureItemIsMutable();
                this.item_.set(i, item);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setItem(int i, Item.Builder builder) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemIsMutable();
                this.item_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addItem(Item item) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(item);
            } else if (item != null) {
                ensureItemIsMutable();
                this.item_.add(item);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addItem(int i, Item item) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, item);
            } else if (item != null) {
                ensureItemIsMutable();
                this.item_.add(i, item);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addItem(Item.Builder builder) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemIsMutable();
                this.item_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addItem(int i, Item.Builder builder) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemIsMutable();
                this.item_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllItem(Iterable<? extends Item> iterable) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.item_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearItem() {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.item_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeItem(int i) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureItemIsMutable();
                this.item_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Item.Builder getItemBuilder(int i) {
            return getItemFieldBuilder().getBuilder(i);
        }

        public ItemOrBuilder getItemOrBuilder(int i) {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.item_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends ItemOrBuilder> getItemOrBuilderList() {
            RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> repeatedFieldBuilderV3 = this.itemBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.item_);
        }

        public Item.Builder addItemBuilder() {
            return getItemFieldBuilder().addBuilder(Item.getDefaultInstance());
        }

        public Item.Builder addItemBuilder(int i) {
            return getItemFieldBuilder().addBuilder(i, Item.getDefaultInstance());
        }

        public List<Item.Builder> getItemBuilderList() {
            return getItemFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Item, Item.Builder, ItemOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
                this.itemBuilder_ = new RepeatedFieldBuilderV3<>(this.item_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                this.item_ = null;
            }
            return this.itemBuilder_;
        }

        public int getPackage() {
            return this.package_;
        }

        public Builder setPackage(int i) {
            this.package_ = i;
            onChanged();
            return this;
        }

        public Builder clearPackage() {
            this.package_ = 0;
            onChanged();
            return this;
        }

        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        public Any getContext() {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Any any = this.context_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        public Builder setContext(Any any) {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(any);
            } else if (any != null) {
                this.context_ = any;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setContext(Any.Builder builder) {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.context_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeContext(Any any) {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Any any2 = this.context_;
                if (any2 != null) {
                    this.context_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.context_ = any;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(any);
            }
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Any.Builder getContextBuilder() {
            onChanged();
            return getContextFieldBuilder().getBuilder();
        }

        public AnyOrBuilder getContextOrBuilder() {
            SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Any any = this.context_;
            return any == null ? Any.getDefaultInstance() : any;
        }

        private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public Struct getExt() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Builder setExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(struct);
            } else if (struct != null) {
                this.ext_ = struct;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ext_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return getExtFieldBuilder().getBuilder();
        }

        public StructOrBuilder getExtOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 8;
            }
        }

        public List<Any> getExtProtoList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.extProto_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getExtProtoCount() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public Any getExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i, any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addExtProto(Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addExtProto(Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearExtProto() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Any.Builder getExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().getBuilder(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.extProto_);
        }

        public Any.Builder addExtProtoBuilder() {
            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
        }

        public Any.Builder addExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Request getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Request> parser() {
        return PARSER;
    }

    public Parser<Request> getParserForType() {
        return PARSER;
    }

    public Request getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
