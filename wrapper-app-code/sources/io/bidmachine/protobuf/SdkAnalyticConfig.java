package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.LazyStringArrayList;
import com.explorestack.protobuf.LazyStringList;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SdkAnalyticConfig extends GeneratedMessageV3 implements SdkAnalyticConfigOrBuilder {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int COUNT_FIELD_NUMBER = 4;
    private static final SdkAnalyticConfig DEFAULT_INSTANCE = new SdkAnalyticConfig();
    public static final int INTERVAL_FIELD_NUMBER = 3;
    public static final int METRIC_CONFIGS_FIELD_NUMBER = 5;
    /* access modifiers changed from: private */
    public static final Parser<SdkAnalyticConfig> PARSER = new AbstractParser<SdkAnalyticConfig>() {
        public SdkAnalyticConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SdkAnalyticConfig(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int URL_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object context_;
    /* access modifiers changed from: private */
    public int count_;
    /* access modifiers changed from: private */
    public int interval_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public List<MetricConfig> metricConfigs_;
    /* access modifiers changed from: private */
    public volatile Object url_;

    public interface MetricConfigOrBuilder extends MessageOrBuilder {
        String getDimensions(int i);

        ByteString getDimensionsBytes(int i);

        int getDimensionsCount();

        List<String> getDimensionsList();

        String getMetrics(int i);

        ByteString getMetricsBytes(int i);

        int getMetricsCount();

        List<String> getMetricsList();

        String getName();

        ByteString getNameBytes();
    }

    private SdkAnalyticConfig(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private SdkAnalyticConfig() {
        this.memoizedIsInitialized = -1;
        this.url_ = "";
        this.context_ = "";
        this.metricConfigs_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SdkAnalyticConfig();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private SdkAnalyticConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.url_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.context_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 24) {
                            this.interval_ = codedInputStream.readInt32();
                        } else if (readTag == 32) {
                            this.count_ = codedInputStream.readInt32();
                        } else if (readTag == 42) {
                            if (!z2 || !true) {
                                this.metricConfigs_ = new ArrayList();
                                z2 |= true;
                            }
                            this.metricConfigs_.add(codedInputStream.readMessage(MetricConfig.parser(), extensionRegistryLite));
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
                        this.metricConfigs_ = Collections.unmodifiableList(this.metricConfigs_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.metricConfigs_ = Collections.unmodifiableList(this.metricConfigs_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SdkAnalyticConfig.class, Builder.class);
    }

    public static final class MetricConfig extends GeneratedMessageV3 implements MetricConfigOrBuilder {
        private static final MetricConfig DEFAULT_INSTANCE = new MetricConfig();
        public static final int DIMENSIONS_FIELD_NUMBER = 2;
        public static final int METRICS_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Parser<MetricConfig> PARSER = new AbstractParser<MetricConfig>() {
            public MetricConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MetricConfig(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public LazyStringList dimensions_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public LazyStringList metrics_;
        /* access modifiers changed from: private */
        public volatile Object name_;

        private MetricConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private MetricConfig() {
            this.memoizedIsInitialized = -1;
            this.name_ = "";
            this.dimensions_ = LazyStringArrayList.EMPTY;
            this.metrics_ = LazyStringArrayList.EMPTY;
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MetricConfig();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MetricConfig(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.name_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.dimensions_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.dimensions_.add(readStringRequireUtf8);
                            } else if (readTag == 26) {
                                String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.metrics_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.metrics_.add(readStringRequireUtf82);
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
                            this.dimensions_ = this.dimensions_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.metrics_ = this.metrics_.getUnmodifiableView();
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.dimensions_ = this.dimensions_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.metrics_ = this.metrics_.getUnmodifiableView();
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricConfig.class, Builder.class);
        }

        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public ProtocolStringList getDimensionsList() {
            return this.dimensions_;
        }

        public int getDimensionsCount() {
            return this.dimensions_.size();
        }

        public String getDimensions(int i) {
            return (String) this.dimensions_.get(i);
        }

        public ByteString getDimensionsBytes(int i) {
            return this.dimensions_.getByteString(i);
        }

        public ProtocolStringList getMetricsList() {
            return this.metrics_;
        }

        public int getMetricsCount() {
            return this.metrics_.size();
        }

        public String getMetrics(int i) {
            return (String) this.metrics_.get(i);
        }

        public ByteString getMetricsBytes(int i) {
            return this.metrics_.getByteString(i);
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
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            for (int i = 0; i < this.dimensions_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.dimensions_.getRaw(i));
            }
            for (int i2 = 0; i2 < this.metrics_.size(); i2++) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.metrics_.getRaw(i2));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getNameBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.name_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.dimensions_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.dimensions_.getRaw(i3));
            }
            int size = computeStringSize + i2 + (getDimensionsList().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.metrics_.size(); i5++) {
                i4 += computeStringSizeNoTag(this.metrics_.getRaw(i5));
            }
            int size2 = size + i4 + (getMetricsList().size() * 1) + this.unknownFields.getSerializedSize();
            this.memoizedSize = size2;
            return size2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricConfig)) {
                return super.equals(obj);
            }
            MetricConfig metricConfig = (MetricConfig) obj;
            if (getName().equals(metricConfig.getName()) && getDimensionsList().equals(metricConfig.getDimensionsList()) && getMetricsList().equals(metricConfig.getMetricsList()) && this.unknownFields.equals(metricConfig.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode();
            if (getDimensionsCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getDimensionsList().hashCode();
            }
            if (getMetricsCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getMetricsList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static MetricConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static MetricConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static MetricConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static MetricConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MetricConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static MetricConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MetricConfig parseFrom(InputStream inputStream) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MetricConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MetricConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MetricConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MetricConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MetricConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(MetricConfig metricConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricConfig);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricConfigOrBuilder {
            private int bitField0_;
            private LazyStringList dimensions_;
            private LazyStringList metrics_;
            private Object name_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricConfig.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.dimensions_ = LazyStringArrayList.EMPTY;
                this.metrics_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.dimensions_ = LazyStringArrayList.EMPTY;
                this.metrics_ = LazyStringArrayList.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = MetricConfig.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.name_ = "";
                this.dimensions_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.metrics_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
            }

            public MetricConfig getDefaultInstanceForType() {
                return MetricConfig.getDefaultInstance();
            }

            public MetricConfig build() {
                MetricConfig buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public MetricConfig buildPartial() {
                MetricConfig metricConfig = new MetricConfig((GeneratedMessageV3.Builder) this);
                Object unused = metricConfig.name_ = this.name_;
                if ((this.bitField0_ & 1) != 0) {
                    this.dimensions_ = this.dimensions_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused2 = metricConfig.dimensions_ = this.dimensions_;
                if ((this.bitField0_ & 2) != 0) {
                    this.metrics_ = this.metrics_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused3 = metricConfig.metrics_ = this.metrics_;
                onBuilt();
                return metricConfig;
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
                if (message instanceof MetricConfig) {
                    return mergeFrom((MetricConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MetricConfig metricConfig) {
                if (metricConfig == MetricConfig.getDefaultInstance()) {
                    return this;
                }
                if (!metricConfig.getName().isEmpty()) {
                    this.name_ = metricConfig.name_;
                    onChanged();
                }
                if (!metricConfig.dimensions_.isEmpty()) {
                    if (this.dimensions_.isEmpty()) {
                        this.dimensions_ = metricConfig.dimensions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureDimensionsIsMutable();
                        this.dimensions_.addAll(metricConfig.dimensions_);
                    }
                    onChanged();
                }
                if (!metricConfig.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = metricConfig.metrics_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(metricConfig.metrics_);
                    }
                    onChanged();
                }
                mergeUnknownFields(metricConfig.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig r3 = (io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig r4 = (io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.SdkAnalyticConfig$MetricConfig$Builder");
            }

            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setName(String str) {
                if (str != null) {
                    this.name_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearName() {
                this.name_ = MetricConfig.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                if (byteString != null) {
                    MetricConfig.checkByteStringIsUtf8(byteString);
                    this.name_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureDimensionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.dimensions_ = new LazyStringArrayList(this.dimensions_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getDimensionsList() {
                return this.dimensions_.getUnmodifiableView();
            }

            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            public String getDimensions(int i) {
                return (String) this.dimensions_.get(i);
            }

            public ByteString getDimensionsBytes(int i) {
                return this.dimensions_.getByteString(i);
            }

            public Builder setDimensions(int i, String str) {
                if (str != null) {
                    ensureDimensionsIsMutable();
                    this.dimensions_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addDimensions(String str) {
                if (str != null) {
                    ensureDimensionsIsMutable();
                    this.dimensions_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllDimensions(Iterable<String> iterable) {
                ensureDimensionsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.dimensions_);
                onChanged();
                return this;
            }

            public Builder clearDimensions() {
                this.dimensions_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addDimensionsBytes(ByteString byteString) {
                if (byteString != null) {
                    MetricConfig.checkByteStringIsUtf8(byteString);
                    ensureDimensionsIsMutable();
                    this.dimensions_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureMetricsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.metrics_ = new LazyStringArrayList(this.metrics_);
                    this.bitField0_ |= 2;
                }
            }

            public ProtocolStringList getMetricsList() {
                return this.metrics_.getUnmodifiableView();
            }

            public int getMetricsCount() {
                return this.metrics_.size();
            }

            public String getMetrics(int i) {
                return (String) this.metrics_.get(i);
            }

            public ByteString getMetricsBytes(int i) {
                return this.metrics_.getByteString(i);
            }

            public Builder setMetrics(int i, String str) {
                if (str != null) {
                    ensureMetricsIsMutable();
                    this.metrics_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addMetrics(String str) {
                if (str != null) {
                    ensureMetricsIsMutable();
                    this.metrics_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                ensureMetricsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.metrics_);
                onChanged();
                return this;
            }

            public Builder clearMetrics() {
                this.metrics_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                if (byteString != null) {
                    MetricConfig.checkByteStringIsUtf8(byteString);
                    ensureMetricsIsMutable();
                    this.metrics_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static MetricConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MetricConfig> parser() {
            return PARSER;
        }

        public Parser<MetricConfig> getParserForType() {
            return PARSER;
        }

        public MetricConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public String getUrl() {
        Object obj = this.url_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.url_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getUrlBytes() {
        Object obj = this.url_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.url_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getContext() {
        Object obj = this.context_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.context_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getContextBytes() {
        Object obj = this.context_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.context_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getInterval() {
        return this.interval_;
    }

    public int getCount() {
        return this.count_;
    }

    public List<MetricConfig> getMetricConfigsList() {
        return this.metricConfigs_;
    }

    public List<? extends MetricConfigOrBuilder> getMetricConfigsOrBuilderList() {
        return this.metricConfigs_;
    }

    public int getMetricConfigsCount() {
        return this.metricConfigs_.size();
    }

    public MetricConfig getMetricConfigs(int i) {
        return this.metricConfigs_.get(i);
    }

    public MetricConfigOrBuilder getMetricConfigsOrBuilder(int i) {
        return this.metricConfigs_.get(i);
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
        if (!getUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
        }
        if (!getContextBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.context_);
        }
        int i = this.interval_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        int i2 = this.count_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(4, i2);
        }
        for (int i3 = 0; i3 < this.metricConfigs_.size(); i3++) {
            codedOutputStream.writeMessage(5, this.metricConfigs_.get(i3));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getUrlBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.url_) + 0 : 0;
        if (!getContextBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.context_);
        }
        int i2 = this.interval_;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(3, i2);
        }
        int i3 = this.count_;
        if (i3 != 0) {
            computeStringSize += CodedOutputStream.computeInt32Size(4, i3);
        }
        for (int i4 = 0; i4 < this.metricConfigs_.size(); i4++) {
            computeStringSize += CodedOutputStream.computeMessageSize(5, this.metricConfigs_.get(i4));
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkAnalyticConfig)) {
            return super.equals(obj);
        }
        SdkAnalyticConfig sdkAnalyticConfig = (SdkAnalyticConfig) obj;
        if (getUrl().equals(sdkAnalyticConfig.getUrl()) && getContext().equals(sdkAnalyticConfig.getContext()) && getInterval() == sdkAnalyticConfig.getInterval() && getCount() == sdkAnalyticConfig.getCount() && getMetricConfigsList().equals(sdkAnalyticConfig.getMetricConfigsList()) && this.unknownFields.equals(sdkAnalyticConfig.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getContext().hashCode()) * 37) + 3) * 53) + getInterval()) * 37) + 4) * 53) + getCount();
        if (getMetricConfigsCount() > 0) {
            hashCode = (((hashCode * 37) + 5) * 53) + getMetricConfigsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static SdkAnalyticConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SdkAnalyticConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SdkAnalyticConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SdkAnalyticConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SdkAnalyticConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SdkAnalyticConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SdkAnalyticConfig parseFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SdkAnalyticConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SdkAnalyticConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SdkAnalyticConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SdkAnalyticConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SdkAnalyticConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SdkAnalyticConfig sdkAnalyticConfig) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sdkAnalyticConfig);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SdkAnalyticConfigOrBuilder {
        private int bitField0_;
        private Object context_;
        private int count_;
        private int interval_;
        private RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> metricConfigsBuilder_;
        private List<MetricConfig> metricConfigs_;
        private Object url_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(SdkAnalyticConfig.class, Builder.class);
        }

        private Builder() {
            this.url_ = "";
            this.context_ = "";
            this.metricConfigs_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.url_ = "";
            this.context_ = "";
            this.metricConfigs_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (SdkAnalyticConfig.alwaysUseFieldBuilders) {
                getMetricConfigsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.url_ = "";
            this.context_ = "";
            this.interval_ = 0;
            this.count_ = 0;
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metricConfigs_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
        }

        public SdkAnalyticConfig getDefaultInstanceForType() {
            return SdkAnalyticConfig.getDefaultInstance();
        }

        public SdkAnalyticConfig build() {
            SdkAnalyticConfig buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public SdkAnalyticConfig buildPartial() {
            SdkAnalyticConfig sdkAnalyticConfig = new SdkAnalyticConfig((GeneratedMessageV3.Builder) this);
            Object unused = sdkAnalyticConfig.url_ = this.url_;
            Object unused2 = sdkAnalyticConfig.context_ = this.context_;
            int unused3 = sdkAnalyticConfig.interval_ = this.interval_;
            int unused4 = sdkAnalyticConfig.count_ = this.count_;
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.metricConfigs_ = Collections.unmodifiableList(this.metricConfigs_);
                    this.bitField0_ &= -2;
                }
                List unused5 = sdkAnalyticConfig.metricConfigs_ = this.metricConfigs_;
            } else {
                List unused6 = sdkAnalyticConfig.metricConfigs_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return sdkAnalyticConfig;
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
            if (message instanceof SdkAnalyticConfig) {
                return mergeFrom((SdkAnalyticConfig) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SdkAnalyticConfig sdkAnalyticConfig) {
            if (sdkAnalyticConfig == SdkAnalyticConfig.getDefaultInstance()) {
                return this;
            }
            if (!sdkAnalyticConfig.getUrl().isEmpty()) {
                this.url_ = sdkAnalyticConfig.url_;
                onChanged();
            }
            if (!sdkAnalyticConfig.getContext().isEmpty()) {
                this.context_ = sdkAnalyticConfig.context_;
                onChanged();
            }
            if (sdkAnalyticConfig.getInterval() != 0) {
                setInterval(sdkAnalyticConfig.getInterval());
            }
            if (sdkAnalyticConfig.getCount() != 0) {
                setCount(sdkAnalyticConfig.getCount());
            }
            if (this.metricConfigsBuilder_ == null) {
                if (!sdkAnalyticConfig.metricConfigs_.isEmpty()) {
                    if (this.metricConfigs_.isEmpty()) {
                        this.metricConfigs_ = sdkAnalyticConfig.metricConfigs_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricConfigsIsMutable();
                        this.metricConfigs_.addAll(sdkAnalyticConfig.metricConfigs_);
                    }
                    onChanged();
                }
            } else if (!sdkAnalyticConfig.metricConfigs_.isEmpty()) {
                if (this.metricConfigsBuilder_.isEmpty()) {
                    this.metricConfigsBuilder_.dispose();
                    RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = null;
                    this.metricConfigsBuilder_ = null;
                    this.metricConfigs_ = sdkAnalyticConfig.metricConfigs_;
                    this.bitField0_ &= -2;
                    if (SdkAnalyticConfig.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getMetricConfigsFieldBuilder();
                    }
                    this.metricConfigsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.metricConfigsBuilder_.addAllMessages(sdkAnalyticConfig.metricConfigs_);
                }
            }
            mergeUnknownFields(sdkAnalyticConfig.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.SdkAnalyticConfig.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.SdkAnalyticConfig.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.SdkAnalyticConfig r3 = (io.bidmachine.protobuf.SdkAnalyticConfig) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.SdkAnalyticConfig) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.SdkAnalyticConfig r4 = (io.bidmachine.protobuf.SdkAnalyticConfig) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.SdkAnalyticConfig) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.SdkAnalyticConfig.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.SdkAnalyticConfig$Builder");
        }

        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setUrl(String str) {
            if (str != null) {
                this.url_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearUrl() {
            this.url_ = SdkAnalyticConfig.getDefaultInstance().getUrl();
            onChanged();
            return this;
        }

        public Builder setUrlBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticConfig.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setContext(String str) {
            if (str != null) {
                this.context_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearContext() {
            this.context_ = SdkAnalyticConfig.getDefaultInstance().getContext();
            onChanged();
            return this;
        }

        public Builder setContextBytes(ByteString byteString) {
            if (byteString != null) {
                SdkAnalyticConfig.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public int getInterval() {
            return this.interval_;
        }

        public Builder setInterval(int i) {
            this.interval_ = i;
            onChanged();
            return this;
        }

        public Builder clearInterval() {
            this.interval_ = 0;
            onChanged();
            return this;
        }

        public int getCount() {
            return this.count_;
        }

        public Builder setCount(int i) {
            this.count_ = i;
            onChanged();
            return this;
        }

        public Builder clearCount() {
            this.count_ = 0;
            onChanged();
            return this;
        }

        private void ensureMetricConfigsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metricConfigs_ = new ArrayList(this.metricConfigs_);
                this.bitField0_ |= 1;
            }
        }

        public List<MetricConfig> getMetricConfigsList() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.metricConfigs_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getMetricConfigsCount() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricConfigs_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public MetricConfig getMetricConfigs(int i) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricConfigs_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setMetricConfigs(int i, MetricConfig metricConfig) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, metricConfig);
            } else if (metricConfig != null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.set(i, metricConfig);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setMetricConfigs(int i, MetricConfig.Builder builder) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addMetricConfigs(MetricConfig metricConfig) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(metricConfig);
            } else if (metricConfig != null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(metricConfig);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addMetricConfigs(int i, MetricConfig metricConfig) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, metricConfig);
            } else if (metricConfig != null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(i, metricConfig);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addMetricConfigs(MetricConfig.Builder builder) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMetricConfigs(int i, MetricConfig.Builder builder) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllMetricConfigs(Iterable<? extends MetricConfig> iterable) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.metricConfigs_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearMetricConfigs() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metricConfigs_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeMetricConfigs(int i) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricConfigsIsMutable();
                this.metricConfigs_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public MetricConfig.Builder getMetricConfigsBuilder(int i) {
            return getMetricConfigsFieldBuilder().getBuilder(i);
        }

        public MetricConfigOrBuilder getMetricConfigsOrBuilder(int i) {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metricConfigs_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends MetricConfigOrBuilder> getMetricConfigsOrBuilderList() {
            RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> repeatedFieldBuilderV3 = this.metricConfigsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.metricConfigs_);
        }

        public MetricConfig.Builder addMetricConfigsBuilder() {
            return getMetricConfigsFieldBuilder().addBuilder(MetricConfig.getDefaultInstance());
        }

        public MetricConfig.Builder addMetricConfigsBuilder(int i) {
            return getMetricConfigsFieldBuilder().addBuilder(i, MetricConfig.getDefaultInstance());
        }

        public List<MetricConfig.Builder> getMetricConfigsBuilderList() {
            return getMetricConfigsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<MetricConfig, MetricConfig.Builder, MetricConfigOrBuilder> getMetricConfigsFieldBuilder() {
            if (this.metricConfigsBuilder_ == null) {
                List<MetricConfig> list = this.metricConfigs_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.metricConfigsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.metricConfigs_ = null;
            }
            return this.metricConfigsBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static SdkAnalyticConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SdkAnalyticConfig> parser() {
        return PARSER;
    }

    public Parser<SdkAnalyticConfig> getParserForType() {
        return PARSER;
    }

    public SdkAnalyticConfig getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
