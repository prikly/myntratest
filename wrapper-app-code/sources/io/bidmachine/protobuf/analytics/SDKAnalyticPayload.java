package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SDKAnalyticPayload extends GeneratedMessageV3 implements SDKAnalyticPayloadOrBuilder {
    private static final SDKAnalyticPayload DEFAULT_INSTANCE = new SDKAnalyticPayload();
    public static final int METRICS_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final Parser<SDKAnalyticPayload> PARSER = new AbstractParser<SDKAnalyticPayload>() {
        public SDKAnalyticPayload parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new SDKAnalyticPayload(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public List<Metric> metrics_;

    public interface MetricOrBuilder extends MessageOrBuilder {
        String getContext();

        ByteString getContextBytes();

        Metric.MetricData getData(int i);

        int getDataCount();

        List<Metric.MetricData> getDataList();

        Metric.MetricDataOrBuilder getDataOrBuilder(int i);

        List<? extends Metric.MetricDataOrBuilder> getDataOrBuilderList();
    }

    private SDKAnalyticPayload(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private SDKAnalyticPayload() {
        this.memoizedIsInitialized = -1;
        this.metrics_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new SDKAnalyticPayload();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private SDKAnalyticPayload(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (!z2 || !true) {
                                this.metrics_ = new ArrayList();
                                z2 |= true;
                            }
                            this.metrics_.add(codedInputStream.readMessage(Metric.parser(), extensionRegistryLite));
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
                        this.metrics_ = Collections.unmodifiableList(this.metrics_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.metrics_ = Collections.unmodifiableList(this.metrics_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKAnalyticPayload.class, Builder.class);
    }

    public static final class Metric extends GeneratedMessageV3 implements MetricOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 2;
        private static final Metric DEFAULT_INSTANCE = new Metric();
        /* access modifiers changed from: private */
        public static final Parser<Metric> PARSER = new AbstractParser<Metric>() {
            public Metric parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Metric(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object context_;
        /* access modifiers changed from: private */
        public List<MetricData> data_;
        private byte memoizedIsInitialized;

        public interface MetricDataOrBuilder extends MessageOrBuilder {
            MetricData.Dimension getDimensions(int i);

            int getDimensionsCount();

            List<MetricData.Dimension> getDimensionsList();

            MetricData.DimensionOrBuilder getDimensionsOrBuilder(int i);

            List<? extends MetricData.DimensionOrBuilder> getDimensionsOrBuilderList();

            MetricData.Error getError();

            MetricData.ErrorOrBuilder getErrorOrBuilder();

            MetricData.Measure getMeasures(int i);

            int getMeasuresCount();

            List<MetricData.Measure> getMeasuresList();

            MetricData.MeasureOrBuilder getMeasuresOrBuilder(int i);

            List<? extends MetricData.MeasureOrBuilder> getMeasuresOrBuilderList();

            String getName();

            ByteString getNameBytes();

            String getTimestamp();

            ByteString getTimestampBytes();

            boolean hasError();
        }

        private Metric(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Metric() {
            this.memoizedIsInitialized = -1;
            this.context_ = "";
            this.data_ = Collections.emptyList();
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
                                this.context_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                if (!z2 || !true) {
                                    this.data_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.data_.add(codedInputStream.readMessage(MetricData.parser(), extensionRegistryLite));
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
                            this.data_ = Collections.unmodifiableList(this.data_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.data_ = Collections.unmodifiableList(this.data_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
        }

        public static final class MetricData extends GeneratedMessageV3 implements MetricDataOrBuilder {
            private static final MetricData DEFAULT_INSTANCE = new MetricData();
            public static final int DIMENSIONS_FIELD_NUMBER = 3;
            public static final int ERROR_FIELD_NUMBER = 5;
            public static final int MEASURES_FIELD_NUMBER = 4;
            public static final int NAME_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Parser<MetricData> PARSER = new AbstractParser<MetricData>() {
                public MetricData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new MetricData(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int TIMESTAMP_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public List<Dimension> dimensions_;
            /* access modifiers changed from: private */
            public Error error_;
            /* access modifiers changed from: private */
            public List<Measure> measures_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public volatile Object name_;
            /* access modifiers changed from: private */
            public volatile Object timestamp_;

            public interface DimensionOrBuilder extends MessageOrBuilder {
                String getName();

                ByteString getNameBytes();

                String getValue();

                ByteString getValueBytes();
            }

            public interface ErrorOrBuilder extends MessageOrBuilder {
                String getDescription();

                ByteString getDescriptionBytes();

                String getName();

                ByteString getNameBytes();
            }

            public interface MeasureOrBuilder extends MessageOrBuilder {
                String getName();

                ByteString getNameBytes();

                double getValue();
            }

            private MetricData(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private MetricData() {
                this.memoizedIsInitialized = -1;
                this.timestamp_ = "";
                this.name_ = "";
                this.dimensions_ = Collections.emptyList();
                this.measures_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new MetricData();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private MetricData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.timestamp_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    if (!z2 || !true) {
                                        this.dimensions_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.dimensions_.add(codedInputStream.readMessage(Dimension.parser(), extensionRegistryLite));
                                } else if (readTag == 34) {
                                    if (!z2 || !true) {
                                        this.measures_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.measures_.add(codedInputStream.readMessage(Measure.parser(), extensionRegistryLite));
                                } else if (readTag == 42) {
                                    Error.Builder builder = this.error_ != null ? this.error_.toBuilder() : null;
                                    Error error = (Error) codedInputStream.readMessage(Error.parser(), extensionRegistryLite);
                                    this.error_ = error;
                                    if (builder != null) {
                                        builder.mergeFrom(error);
                                        this.error_ = builder.buildPartial();
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
                                this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                            }
                            if (z2 && true) {
                                this.measures_ = Collections.unmodifiableList(this.measures_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 && true) {
                        this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                    }
                    if (z2 && true) {
                        this.measures_ = Collections.unmodifiableList(this.measures_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricData.class, Builder.class);
            }

            public static final class Dimension extends GeneratedMessageV3 implements DimensionOrBuilder {
                private static final Dimension DEFAULT_INSTANCE = new Dimension();
                public static final int NAME_FIELD_NUMBER = 1;
                /* access modifiers changed from: private */
                public static final Parser<Dimension> PARSER = new AbstractParser<Dimension>() {
                    public Dimension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Dimension(codedInputStream, extensionRegistryLite);
                    }
                };
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public volatile Object name_;
                /* access modifiers changed from: private */
                public volatile Object value_;

                private Dimension(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private Dimension() {
                    this.memoizedIsInitialized = -1;
                    this.name_ = "";
                    this.value_ = "";
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Dimension();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private Dimension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this();
                    if (extensionRegistryLite != null) {
                        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                        boolean z = false;
                        while (!z) {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 10) {
                                        this.name_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 18) {
                                        this.value_ = codedInputStream.readStringRequireUtf8();
                                    } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e2) {
                                throw e2.setUnfinishedMessage(this);
                            } catch (IOException e3) {
                                throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                            } catch (Throwable th) {
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        return;
                    }
                    throw null;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.ensureFieldAccessorsInitialized(Dimension.class, Builder.class);
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

                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = copyFromUtf8;
                    return copyFromUtf8;
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
                    if (!getValueBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    if (!getNameBytes().isEmpty()) {
                        i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        i2 += GeneratedMessageV3.computeStringSize(2, this.value_);
                    }
                    int serializedSize = i2 + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Dimension)) {
                        return super.equals(obj);
                    }
                    Dimension dimension = (Dimension) obj;
                    if (getName().equals(dimension.getName()) && getValue().equals(dimension.getValue()) && this.unknownFields.equals(dimension.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode;
                    return hashCode;
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Dimension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static Dimension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static Dimension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static Dimension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static Dimension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Dimension parseFrom(InputStream inputStream) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static Dimension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Dimension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Dimension parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Dimension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Dimension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(Dimension dimension) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(dimension);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DimensionOrBuilder {
                    private Object name_;
                    private Object value_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable.ensureFieldAccessorsInitialized(Dimension.class, Builder.class);
                    }

                    private Builder() {
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.name_ = "";
                        this.value_ = "";
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = Dimension.alwaysUseFieldBuilders;
                    }

                    public Builder clear() {
                        super.clear();
                        this.name_ = "";
                        this.value_ = "";
                        return this;
                    }

                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
                    }

                    public Dimension getDefaultInstanceForType() {
                        return Dimension.getDefaultInstance();
                    }

                    public Dimension build() {
                        Dimension buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public Dimension buildPartial() {
                        Dimension dimension = new Dimension((GeneratedMessageV3.Builder) this);
                        Object unused = dimension.name_ = this.name_;
                        Object unused2 = dimension.value_ = this.value_;
                        onBuilt();
                        return dimension;
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
                        if (message instanceof Dimension) {
                            return mergeFrom((Dimension) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Dimension dimension) {
                        if (dimension == Dimension.getDefaultInstance()) {
                            return this;
                        }
                        if (!dimension.getName().isEmpty()) {
                            this.name_ = dimension.name_;
                            onChanged();
                        }
                        if (!dimension.getValue().isEmpty()) {
                            this.value_ = dimension.value_;
                            onChanged();
                        }
                        mergeUnknownFields(dimension.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Dimension$Builder");
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
                        this.name_ = Dimension.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString byteString) {
                        if (byteString != null) {
                            Dimension.checkByteStringIsUtf8(byteString);
                            this.name_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setValue(String str) {
                        if (str != null) {
                            this.value_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearValue() {
                        this.value_ = Dimension.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        if (byteString != null) {
                            Dimension.checkByteStringIsUtf8(byteString);
                            this.value_ = byteString;
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

                public static Dimension getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<Dimension> parser() {
                    return PARSER;
                }

                public Parser<Dimension> getParserForType() {
                    return PARSER;
                }

                public Dimension getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            public static final class Measure extends GeneratedMessageV3 implements MeasureOrBuilder {
                private static final Measure DEFAULT_INSTANCE = new Measure();
                public static final int NAME_FIELD_NUMBER = 1;
                /* access modifiers changed from: private */
                public static final Parser<Measure> PARSER = new AbstractParser<Measure>() {
                    public Measure parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Measure(codedInputStream, extensionRegistryLite);
                    }
                };
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public volatile Object name_;
                /* access modifiers changed from: private */
                public double value_;

                private Measure(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private Measure() {
                    this.memoizedIsInitialized = -1;
                    this.name_ = "";
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Measure();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private Measure(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this();
                    if (extensionRegistryLite != null) {
                        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                        boolean z = false;
                        while (!z) {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 10) {
                                        this.name_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 17) {
                                        this.value_ = codedInputStream.readDouble();
                                    } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e2) {
                                throw e2.setUnfinishedMessage(this);
                            } catch (IOException e3) {
                                throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                            } catch (Throwable th) {
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        return;
                    }
                    throw null;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.ensureFieldAccessorsInitialized(Measure.class, Builder.class);
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

                public double getValue() {
                    return this.value_;
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
                    double d2 = this.value_;
                    if (d2 != 0.0d) {
                        codedOutputStream.writeDouble(2, d2);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    if (!getNameBytes().isEmpty()) {
                        i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                    }
                    double d2 = this.value_;
                    if (d2 != 0.0d) {
                        i2 += CodedOutputStream.computeDoubleSize(2, d2);
                    }
                    int serializedSize = i2 + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Measure)) {
                        return super.equals(obj);
                    }
                    Measure measure = (Measure) obj;
                    if (getName().equals(measure.getName()) && Double.doubleToLongBits(getValue()) == Double.doubleToLongBits(measure.getValue()) && this.unknownFields.equals(measure.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + Internal.hashLong(Double.doubleToLongBits(getValue()))) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode;
                    return hashCode;
                }

                public static Measure parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Measure parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static Measure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static Measure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static Measure parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static Measure parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Measure parseFrom(InputStream inputStream) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static Measure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Measure parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Measure) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Measure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Measure) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Measure parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Measure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Measure) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(Measure measure) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(measure);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MeasureOrBuilder {
                    private Object name_;
                    private double value_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable.ensureFieldAccessorsInitialized(Measure.class, Builder.class);
                    }

                    private Builder() {
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.name_ = "";
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = Measure.alwaysUseFieldBuilders;
                    }

                    public Builder clear() {
                        super.clear();
                        this.name_ = "";
                        this.value_ = 0.0d;
                        return this;
                    }

                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
                    }

                    public Measure getDefaultInstanceForType() {
                        return Measure.getDefaultInstance();
                    }

                    public Measure build() {
                        Measure buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public Measure buildPartial() {
                        Measure measure = new Measure((GeneratedMessageV3.Builder) this);
                        Object unused = measure.name_ = this.name_;
                        double unused2 = measure.value_ = this.value_;
                        onBuilt();
                        return measure;
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
                        if (message instanceof Measure) {
                            return mergeFrom((Measure) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Measure measure) {
                        if (measure == Measure.getDefaultInstance()) {
                            return this;
                        }
                        if (!measure.getName().isEmpty()) {
                            this.name_ = measure.name_;
                            onChanged();
                        }
                        if (measure.getValue() != 0.0d) {
                            setValue(measure.getValue());
                        }
                        mergeUnknownFields(measure.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Measure$Builder");
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
                        this.name_ = Measure.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString byteString) {
                        if (byteString != null) {
                            Measure.checkByteStringIsUtf8(byteString);
                            this.name_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public double getValue() {
                        return this.value_;
                    }

                    public Builder setValue(double d2) {
                        this.value_ = d2;
                        onChanged();
                        return this;
                    }

                    public Builder clearValue() {
                        this.value_ = 0.0d;
                        onChanged();
                        return this;
                    }

                    public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.setUnknownFields(unknownFieldSet);
                    }

                    public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.mergeUnknownFields(unknownFieldSet);
                    }
                }

                public static Measure getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<Measure> parser() {
                    return PARSER;
                }

                public Parser<Measure> getParserForType() {
                    return PARSER;
                }

                public Measure getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            public static final class Error extends GeneratedMessageV3 implements ErrorOrBuilder {
                private static final Error DEFAULT_INSTANCE = new Error();
                public static final int DESCRIPTION_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                /* access modifiers changed from: private */
                public static final Parser<Error> PARSER = new AbstractParser<Error>() {
                    public Error parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Error(codedInputStream, extensionRegistryLite);
                    }
                };
                private static final long serialVersionUID = 0;
                /* access modifiers changed from: private */
                public volatile Object description_;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public volatile Object name_;

                private Error(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private Error() {
                    this.memoizedIsInitialized = -1;
                    this.name_ = "";
                    this.description_ = "";
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Error();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private Error(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this();
                    if (extensionRegistryLite != null) {
                        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                        boolean z = false;
                        while (!z) {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 10) {
                                        this.name_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 18) {
                                        this.description_ = codedInputStream.readStringRequireUtf8();
                                    } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e2) {
                                throw e2.setUnfinishedMessage(this);
                            } catch (IOException e3) {
                                throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                            } catch (Throwable th) {
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        return;
                    }
                    throw null;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
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

                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.description_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = copyFromUtf8;
                    return copyFromUtf8;
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
                    if (!getDescriptionBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.description_);
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = 0;
                    if (!getNameBytes().isEmpty()) {
                        i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
                    }
                    if (!getDescriptionBytes().isEmpty()) {
                        i2 += GeneratedMessageV3.computeStringSize(2, this.description_);
                    }
                    int serializedSize = i2 + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Error)) {
                        return super.equals(obj);
                    }
                    Error error = (Error) obj;
                    if (getName().equals(error.getName()) && getDescription().equals(error.getDescription()) && this.unknownFields.equals(error.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getDescription().hashCode()) * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode;
                    return hashCode;
                }

                public static Error parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static Error parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static Error parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Error parseFrom(InputStream inputStream) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Error parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Error) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Error parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Error) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(Error error) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(error);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ErrorOrBuilder {
                    private Object description_;
                    private Object name_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable.ensureFieldAccessorsInitialized(Error.class, Builder.class);
                    }

                    private Builder() {
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.name_ = "";
                        this.description_ = "";
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        boolean unused = Error.alwaysUseFieldBuilders;
                    }

                    public Builder clear() {
                        super.clear();
                        this.name_ = "";
                        this.description_ = "";
                        return this;
                    }

                    public Descriptors.Descriptor getDescriptorForType() {
                        return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
                    }

                    public Error getDefaultInstanceForType() {
                        return Error.getDefaultInstance();
                    }

                    public Error build() {
                        Error buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public Error buildPartial() {
                        Error error = new Error((GeneratedMessageV3.Builder) this);
                        Object unused = error.name_ = this.name_;
                        Object unused2 = error.description_ = this.description_;
                        onBuilt();
                        return error;
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
                        if (message instanceof Error) {
                            return mergeFrom((Error) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Error error) {
                        if (error == Error.getDefaultInstance()) {
                            return this;
                        }
                        if (!error.getName().isEmpty()) {
                            this.name_ = error.name_;
                            onChanged();
                        }
                        if (!error.getDescription().isEmpty()) {
                            this.description_ = error.description_;
                            onChanged();
                        }
                        mergeUnknownFields(error.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Error$Builder");
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
                        this.name_ = Error.getDefaultInstance().getName();
                        onChanged();
                        return this;
                    }

                    public Builder setNameBytes(ByteString byteString) {
                        if (byteString != null) {
                            Error.checkByteStringIsUtf8(byteString);
                            this.name_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public String getDescription() {
                        Object obj = this.description_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.description_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getDescriptionBytes() {
                        Object obj = this.description_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.description_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setDescription(String str) {
                        if (str != null) {
                            this.description_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearDescription() {
                        this.description_ = Error.getDefaultInstance().getDescription();
                        onChanged();
                        return this;
                    }

                    public Builder setDescriptionBytes(ByteString byteString) {
                        if (byteString != null) {
                            Error.checkByteStringIsUtf8(byteString);
                            this.description_ = byteString;
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

                public static Error getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<Error> parser() {
                    return PARSER;
                }

                public Parser<Error> getParserForType() {
                    return PARSER;
                }

                public Error getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            public String getTimestamp() {
                Object obj = this.timestamp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.timestamp_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTimestampBytes() {
                Object obj = this.timestamp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.timestamp_ = copyFromUtf8;
                return copyFromUtf8;
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

            public List<Dimension> getDimensionsList() {
                return this.dimensions_;
            }

            public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                return this.dimensions_;
            }

            public int getDimensionsCount() {
                return this.dimensions_.size();
            }

            public Dimension getDimensions(int i) {
                return this.dimensions_.get(i);
            }

            public DimensionOrBuilder getDimensionsOrBuilder(int i) {
                return this.dimensions_.get(i);
            }

            public List<Measure> getMeasuresList() {
                return this.measures_;
            }

            public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                return this.measures_;
            }

            public int getMeasuresCount() {
                return this.measures_.size();
            }

            public Measure getMeasures(int i) {
                return this.measures_.get(i);
            }

            public MeasureOrBuilder getMeasuresOrBuilder(int i) {
                return this.measures_.get(i);
            }

            public boolean hasError() {
                return this.error_ != null;
            }

            public Error getError() {
                Error error = this.error_;
                return error == null ? Error.getDefaultInstance() : error;
            }

            public ErrorOrBuilder getErrorOrBuilder() {
                return getError();
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
                if (!getTimestampBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.timestamp_);
                }
                if (!getNameBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
                }
                for (int i = 0; i < this.dimensions_.size(); i++) {
                    codedOutputStream.writeMessage(3, this.dimensions_.get(i));
                }
                for (int i2 = 0; i2 < this.measures_.size(); i2++) {
                    codedOutputStream.writeMessage(4, this.measures_.get(i2));
                }
                if (this.error_ != null) {
                    codedOutputStream.writeMessage(5, getError());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getTimestampBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.timestamp_) + 0 : 0;
                if (!getNameBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
                }
                for (int i2 = 0; i2 < this.dimensions_.size(); i2++) {
                    computeStringSize += CodedOutputStream.computeMessageSize(3, this.dimensions_.get(i2));
                }
                for (int i3 = 0; i3 < this.measures_.size(); i3++) {
                    computeStringSize += CodedOutputStream.computeMessageSize(4, this.measures_.get(i3));
                }
                if (this.error_ != null) {
                    computeStringSize += CodedOutputStream.computeMessageSize(5, getError());
                }
                int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MetricData)) {
                    return super.equals(obj);
                }
                MetricData metricData = (MetricData) obj;
                if (!getTimestamp().equals(metricData.getTimestamp()) || !getName().equals(metricData.getName()) || !getDimensionsList().equals(metricData.getDimensionsList()) || !getMeasuresList().equals(metricData.getMeasuresList()) || hasError() != metricData.hasError()) {
                    return false;
                }
                if ((!hasError() || getError().equals(metricData.getError())) && this.unknownFields.equals(metricData.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getName().hashCode();
                if (getDimensionsCount() > 0) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getDimensionsList().hashCode();
                }
                if (getMeasuresCount() > 0) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getMeasuresList().hashCode();
                }
                if (hasError()) {
                    hashCode = (((hashCode * 37) + 5) * 53) + getError().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static MetricData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static MetricData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static MetricData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static MetricData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static MetricData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static MetricData parseFrom(InputStream inputStream) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static MetricData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (MetricData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MetricData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MetricData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static MetricData parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static MetricData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (MetricData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(MetricData metricData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(metricData);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetricDataOrBuilder {
                private int bitField0_;
                private RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> dimensionsBuilder_;
                private List<Dimension> dimensions_;
                private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> errorBuilder_;
                private Error error_;
                private RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> measuresBuilder_;
                private List<Measure> measures_;
                private Object name_;
                private Object timestamp_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable.ensureFieldAccessorsInitialized(MetricData.class, Builder.class);
                }

                private Builder() {
                    this.timestamp_ = "";
                    this.name_ = "";
                    this.dimensions_ = Collections.emptyList();
                    this.measures_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.timestamp_ = "";
                    this.name_ = "";
                    this.dimensions_ = Collections.emptyList();
                    this.measures_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (MetricData.alwaysUseFieldBuilders) {
                        getDimensionsFieldBuilder();
                        getMeasuresFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.timestamp_ = "";
                    this.name_ = "";
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.dimensions_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV32 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        this.measures_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        repeatedFieldBuilderV32.clear();
                    }
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
                }

                public MetricData getDefaultInstanceForType() {
                    return MetricData.getDefaultInstance();
                }

                public MetricData build() {
                    MetricData buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public MetricData buildPartial() {
                    MetricData metricData = new MetricData((GeneratedMessageV3.Builder) this);
                    Object unused = metricData.timestamp_ = this.timestamp_;
                    Object unused2 = metricData.name_ = this.name_;
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.dimensions_ = Collections.unmodifiableList(this.dimensions_);
                            this.bitField0_ &= -2;
                        }
                        List unused3 = metricData.dimensions_ = this.dimensions_;
                    } else {
                        List unused4 = metricData.dimensions_ = repeatedFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV32 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.measures_ = Collections.unmodifiableList(this.measures_);
                            this.bitField0_ &= -3;
                        }
                        List unused5 = metricData.measures_ = this.measures_;
                    } else {
                        List unused6 = metricData.measures_ = repeatedFieldBuilderV32.build();
                    }
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Error unused7 = metricData.error_ = this.error_;
                    } else {
                        Error unused8 = metricData.error_ = singleFieldBuilderV3.build();
                    }
                    onBuilt();
                    return metricData;
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
                    if (message instanceof MetricData) {
                        return mergeFrom((MetricData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(MetricData metricData) {
                    if (metricData == MetricData.getDefaultInstance()) {
                        return this;
                    }
                    if (!metricData.getTimestamp().isEmpty()) {
                        this.timestamp_ = metricData.timestamp_;
                        onChanged();
                    }
                    if (!metricData.getName().isEmpty()) {
                        this.name_ = metricData.name_;
                        onChanged();
                    }
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = null;
                    if (this.dimensionsBuilder_ == null) {
                        if (!metricData.dimensions_.isEmpty()) {
                            if (this.dimensions_.isEmpty()) {
                                this.dimensions_ = metricData.dimensions_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureDimensionsIsMutable();
                                this.dimensions_.addAll(metricData.dimensions_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.dimensions_.isEmpty()) {
                        if (this.dimensionsBuilder_.isEmpty()) {
                            this.dimensionsBuilder_.dispose();
                            this.dimensionsBuilder_ = null;
                            this.dimensions_ = metricData.dimensions_;
                            this.bitField0_ &= -2;
                            this.dimensionsBuilder_ = MetricData.alwaysUseFieldBuilders ? getDimensionsFieldBuilder() : null;
                        } else {
                            this.dimensionsBuilder_.addAllMessages(metricData.dimensions_);
                        }
                    }
                    if (this.measuresBuilder_ == null) {
                        if (!metricData.measures_.isEmpty()) {
                            if (this.measures_.isEmpty()) {
                                this.measures_ = metricData.measures_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureMeasuresIsMutable();
                                this.measures_.addAll(metricData.measures_);
                            }
                            onChanged();
                        }
                    } else if (!metricData.measures_.isEmpty()) {
                        if (this.measuresBuilder_.isEmpty()) {
                            this.measuresBuilder_.dispose();
                            this.measuresBuilder_ = null;
                            this.measures_ = metricData.measures_;
                            this.bitField0_ &= -3;
                            if (MetricData.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getMeasuresFieldBuilder();
                            }
                            this.measuresBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.measuresBuilder_.addAllMessages(metricData.measures_);
                        }
                    }
                    if (metricData.hasError()) {
                        mergeError(metricData.getError());
                    }
                    mergeUnknownFields(metricData.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$MetricData$Builder");
                }

                public String getTimestamp() {
                    Object obj = this.timestamp_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.timestamp_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getTimestampBytes() {
                    Object obj = this.timestamp_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.timestamp_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setTimestamp(String str) {
                    if (str != null) {
                        this.timestamp_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearTimestamp() {
                    this.timestamp_ = MetricData.getDefaultInstance().getTimestamp();
                    onChanged();
                    return this;
                }

                public Builder setTimestampBytes(ByteString byteString) {
                    if (byteString != null) {
                        MetricData.checkByteStringIsUtf8(byteString);
                        this.timestamp_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
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
                    this.name_ = MetricData.getDefaultInstance().getName();
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    if (byteString != null) {
                        MetricData.checkByteStringIsUtf8(byteString);
                        this.name_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                private void ensureDimensionsIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.dimensions_ = new ArrayList(this.dimensions_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<Dimension> getDimensionsList() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.dimensions_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getDimensionsCount() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.dimensions_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Dimension getDimensions(int i) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.dimensions_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setDimensions(int i, Dimension dimension) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, dimension);
                    } else if (dimension != null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i, dimension);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setDimensions(int i, Dimension.Builder builder) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addDimensions(Dimension dimension) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(dimension);
                    } else if (dimension != null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(dimension);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addDimensions(int i, Dimension dimension) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, dimension);
                    } else if (dimension != null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i, dimension);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addDimensions(Dimension.Builder builder) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addDimensions(int i, Dimension.Builder builder) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllDimensions(Iterable<? extends Dimension> iterable) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.dimensions_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearDimensions() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.dimensions_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeDimensions(int i) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureDimensionsIsMutable();
                        this.dimensions_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Dimension.Builder getDimensionsBuilder(int i) {
                    return getDimensionsFieldBuilder().getBuilder(i);
                }

                public DimensionOrBuilder getDimensionsOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.dimensions_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends DimensionOrBuilder> getDimensionsOrBuilderList() {
                    RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> repeatedFieldBuilderV3 = this.dimensionsBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.dimensions_);
                }

                public Dimension.Builder addDimensionsBuilder() {
                    return getDimensionsFieldBuilder().addBuilder(Dimension.getDefaultInstance());
                }

                public Dimension.Builder addDimensionsBuilder(int i) {
                    return getDimensionsFieldBuilder().addBuilder(i, Dimension.getDefaultInstance());
                }

                public List<Dimension.Builder> getDimensionsBuilderList() {
                    return getDimensionsFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Dimension, Dimension.Builder, DimensionOrBuilder> getDimensionsFieldBuilder() {
                    if (this.dimensionsBuilder_ == null) {
                        List<Dimension> list = this.dimensions_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.dimensionsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.dimensions_ = null;
                    }
                    return this.dimensionsBuilder_;
                }

                private void ensureMeasuresIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.measures_ = new ArrayList(this.measures_);
                        this.bitField0_ |= 2;
                    }
                }

                public List<Measure> getMeasuresList() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.measures_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getMeasuresCount() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.measures_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Measure getMeasures(int i) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.measures_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setMeasures(int i, Measure measure) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, measure);
                    } else if (measure != null) {
                        ensureMeasuresIsMutable();
                        this.measures_.set(i, measure);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setMeasures(int i, Measure.Builder builder) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addMeasures(Measure measure) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(measure);
                    } else if (measure != null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(measure);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addMeasures(int i, Measure measure) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, measure);
                    } else if (measure != null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(i, measure);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addMeasures(Measure.Builder builder) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addMeasures(int i, Measure.Builder builder) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllMeasures(Iterable<? extends Measure> iterable) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.measures_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearMeasures() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.measures_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeMeasures(int i) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMeasuresIsMutable();
                        this.measures_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Measure.Builder getMeasuresBuilder(int i) {
                    return getMeasuresFieldBuilder().getBuilder(i);
                }

                public MeasureOrBuilder getMeasuresOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.measures_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends MeasureOrBuilder> getMeasuresOrBuilderList() {
                    RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> repeatedFieldBuilderV3 = this.measuresBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.measures_);
                }

                public Measure.Builder addMeasuresBuilder() {
                    return getMeasuresFieldBuilder().addBuilder(Measure.getDefaultInstance());
                }

                public Measure.Builder addMeasuresBuilder(int i) {
                    return getMeasuresFieldBuilder().addBuilder(i, Measure.getDefaultInstance());
                }

                public List<Measure.Builder> getMeasuresBuilderList() {
                    return getMeasuresFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Measure, Measure.Builder, MeasureOrBuilder> getMeasuresFieldBuilder() {
                    if (this.measuresBuilder_ == null) {
                        this.measuresBuilder_ = new RepeatedFieldBuilderV3<>(this.measures_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.measures_ = null;
                    }
                    return this.measuresBuilder_;
                }

                public boolean hasError() {
                    return (this.errorBuilder_ == null && this.error_ == null) ? false : true;
                }

                public Error getError() {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                public Builder setError(Error error) {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(error);
                    } else if (error != null) {
                        this.error_ = error;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setError(Error.Builder builder) {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.error_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeError(Error error) {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Error error2 = this.error_;
                        if (error2 != null) {
                            this.error_ = Error.newBuilder(error2).mergeFrom(error).buildPartial();
                        } else {
                            this.error_ = error;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(error);
                    }
                    return this;
                }

                public Builder clearError() {
                    if (this.errorBuilder_ == null) {
                        this.error_ = null;
                        onChanged();
                    } else {
                        this.error_ = null;
                        this.errorBuilder_ = null;
                    }
                    return this;
                }

                public Error.Builder getErrorBuilder() {
                    onChanged();
                    return getErrorFieldBuilder().getBuilder();
                }

                public ErrorOrBuilder getErrorOrBuilder() {
                    SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> singleFieldBuilderV3 = this.errorBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Error error = this.error_;
                    return error == null ? Error.getDefaultInstance() : error;
                }

                private SingleFieldBuilderV3<Error, Error.Builder, ErrorOrBuilder> getErrorFieldBuilder() {
                    if (this.errorBuilder_ == null) {
                        this.errorBuilder_ = new SingleFieldBuilderV3<>(getError(), getParentForChildren(), isClean());
                        this.error_ = null;
                    }
                    return this.errorBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static MetricData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<MetricData> parser() {
                return PARSER;
            }

            public Parser<MetricData> getParserForType() {
                return PARSER;
            }

            public MetricData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
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

        public List<MetricData> getDataList() {
            return this.data_;
        }

        public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        public int getDataCount() {
            return this.data_.size();
        }

        public MetricData getData(int i) {
            return this.data_.get(i);
        }

        public MetricDataOrBuilder getDataOrBuilder(int i) {
            return this.data_.get(i);
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
            if (!getContextBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.context_);
            }
            for (int i = 0; i < this.data_.size(); i++) {
                codedOutputStream.writeMessage(2, this.data_.get(i));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getContextBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.context_) + 0 : 0;
            for (int i2 = 0; i2 < this.data_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(2, this.data_.get(i2));
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
            if (getContext().equals(metric.getContext()) && getDataList().equals(metric.getDataList()) && this.unknownFields.equals(metric.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContext().hashCode();
            if (getDataCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getDataList().hashCode();
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
            private Object context_;
            private RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> dataBuilder_;
            private List<MetricData> data_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable.ensureFieldAccessorsInitialized(Metric.class, Builder.class);
            }

            private Builder() {
                this.context_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.context_ = "";
                this.data_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Metric.alwaysUseFieldBuilders) {
                    getDataFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.context_ = "";
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
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
                Object unused = metric.context_ = this.context_;
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.data_ = Collections.unmodifiableList(this.data_);
                        this.bitField0_ &= -2;
                    }
                    List unused2 = metric.data_ = this.data_;
                } else {
                    List unused3 = metric.data_ = repeatedFieldBuilderV3.build();
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
                if (!metric.getContext().isEmpty()) {
                    this.context_ = metric.context_;
                    onChanged();
                }
                if (this.dataBuilder_ == null) {
                    if (!metric.data_.isEmpty()) {
                        if (this.data_.isEmpty()) {
                            this.data_ = metric.data_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDataIsMutable();
                            this.data_.addAll(metric.data_);
                        }
                        onChanged();
                    }
                } else if (!metric.data_.isEmpty()) {
                    if (this.dataBuilder_.isEmpty()) {
                        this.dataBuilder_.dispose();
                        RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = null;
                        this.dataBuilder_ = null;
                        this.data_ = metric.data_;
                        this.bitField0_ &= -2;
                        if (Metric.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getDataFieldBuilder();
                        }
                        this.dataBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.dataBuilder_.addAllMessages(metric.data_);
                    }
                }
                mergeUnknownFields(metric.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Metric$Builder");
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
                this.context_ = Metric.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                if (byteString != null) {
                    Metric.checkByteStringIsUtf8(byteString);
                    this.context_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureDataIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.data_ = new ArrayList(this.data_);
                    this.bitField0_ |= 1;
                }
            }

            public List<MetricData> getDataList() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.data_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getDataCount() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public MetricData getData(int i) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setData(int i, MetricData metricData) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, metricData);
                } else if (metricData != null) {
                    ensureDataIsMutable();
                    this.data_.set(i, metricData);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setData(int i, MetricData.Builder builder) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addData(MetricData metricData) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(metricData);
                } else if (metricData != null) {
                    ensureDataIsMutable();
                    this.data_.add(metricData);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addData(int i, MetricData metricData) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, metricData);
                } else if (metricData != null) {
                    ensureDataIsMutable();
                    this.data_.add(i, metricData);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addData(MetricData.Builder builder) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addData(int i, MetricData.Builder builder) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllData(Iterable<? extends MetricData> iterable) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.data_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearData() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.data_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeData(int i) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDataIsMutable();
                    this.data_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public MetricData.Builder getDataBuilder(int i) {
                return getDataFieldBuilder().getBuilder(i);
            }

            public MetricDataOrBuilder getDataOrBuilder(int i) {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.data_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends MetricDataOrBuilder> getDataOrBuilderList() {
                RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> repeatedFieldBuilderV3 = this.dataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.data_);
            }

            public MetricData.Builder addDataBuilder() {
                return getDataFieldBuilder().addBuilder(MetricData.getDefaultInstance());
            }

            public MetricData.Builder addDataBuilder(int i) {
                return getDataFieldBuilder().addBuilder(i, MetricData.getDefaultInstance());
            }

            public List<MetricData.Builder> getDataBuilderList() {
                return getDataFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<MetricData, MetricData.Builder, MetricDataOrBuilder> getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    List<MetricData> list = this.data_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.dataBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
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

    public List<Metric> getMetricsList() {
        return this.metrics_;
    }

    public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public Metric getMetrics(int i) {
        return this.metrics_.get(i);
    }

    public MetricOrBuilder getMetricsOrBuilder(int i) {
        return this.metrics_.get(i);
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
        for (int i = 0; i < this.metrics_.size(); i++) {
            codedOutputStream.writeMessage(1, this.metrics_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.metrics_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.metrics_.get(i3));
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SDKAnalyticPayload)) {
            return super.equals(obj);
        }
        SDKAnalyticPayload sDKAnalyticPayload = (SDKAnalyticPayload) obj;
        if (getMetricsList().equals(sDKAnalyticPayload.getMetricsList()) && this.unknownFields.equals(sDKAnalyticPayload.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getMetricsCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getMetricsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static SDKAnalyticPayload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static SDKAnalyticPayload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static SDKAnalyticPayload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SDKAnalyticPayload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SDKAnalyticPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SDKAnalyticPayload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SDKAnalyticPayload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SDKAnalyticPayload sDKAnalyticPayload) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(sDKAnalyticPayload);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SDKAnalyticPayloadOrBuilder {
        private int bitField0_;
        private RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> metricsBuilder_;
        private List<Metric> metrics_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable.ensureFieldAccessorsInitialized(SDKAnalyticPayload.class, Builder.class);
        }

        private Builder() {
            this.metrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.metrics_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (SDKAnalyticPayload.alwaysUseFieldBuilders) {
                getMetricsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticProto.internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
        }

        public SDKAnalyticPayload getDefaultInstanceForType() {
            return SDKAnalyticPayload.getDefaultInstance();
        }

        public SDKAnalyticPayload build() {
            SDKAnalyticPayload buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public SDKAnalyticPayload buildPartial() {
            SDKAnalyticPayload sDKAnalyticPayload = new SDKAnalyticPayload((GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.metrics_ = Collections.unmodifiableList(this.metrics_);
                    this.bitField0_ &= -2;
                }
                List unused = sDKAnalyticPayload.metrics_ = this.metrics_;
            } else {
                List unused2 = sDKAnalyticPayload.metrics_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return sDKAnalyticPayload;
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
            if (message instanceof SDKAnalyticPayload) {
                return mergeFrom((SDKAnalyticPayload) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SDKAnalyticPayload sDKAnalyticPayload) {
            if (sDKAnalyticPayload == SDKAnalyticPayload.getDefaultInstance()) {
                return this;
            }
            if (this.metricsBuilder_ == null) {
                if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                    if (this.metrics_.isEmpty()) {
                        this.metrics_ = sDKAnalyticPayload.metrics_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMetricsIsMutable();
                        this.metrics_.addAll(sDKAnalyticPayload.metrics_);
                    }
                    onChanged();
                }
            } else if (!sDKAnalyticPayload.metrics_.isEmpty()) {
                if (this.metricsBuilder_.isEmpty()) {
                    this.metricsBuilder_.dispose();
                    RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = null;
                    this.metricsBuilder_ = null;
                    this.metrics_ = sDKAnalyticPayload.metrics_;
                    this.bitField0_ &= -2;
                    if (SDKAnalyticPayload.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getMetricsFieldBuilder();
                    }
                    this.metricsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.metricsBuilder_.addAllMessages(sDKAnalyticPayload.metrics_);
                }
            }
            mergeUnknownFields(sDKAnalyticPayload.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.SDKAnalyticPayload.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r3 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.analytics.SDKAnalyticPayload r4 = (io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.analytics.SDKAnalyticPayload) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.SDKAnalyticPayload.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.SDKAnalyticPayload$Builder");
        }

        private void ensureMetricsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.metrics_ = new ArrayList(this.metrics_);
                this.bitField0_ |= 1;
            }
        }

        public List<Metric> getMetricsList() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.metrics_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getMetricsCount() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public Metric getMetrics(int i) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setMetrics(int i, Metric metric) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, metric);
            } else if (metric != null) {
                ensureMetricsIsMutable();
                this.metrics_.set(i, metric);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setMetrics(int i, Metric.Builder builder) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addMetrics(Metric metric) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(metric);
            } else if (metric != null) {
                ensureMetricsIsMutable();
                this.metrics_.add(metric);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addMetrics(int i, Metric metric) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, metric);
            } else if (metric != null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i, metric);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addMetrics(Metric.Builder builder) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMetrics(int i, Metric.Builder builder) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllMetrics(Iterable<? extends Metric> iterable) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.metrics_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearMetrics() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.metrics_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeMetrics(int i) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMetricsIsMutable();
                this.metrics_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Metric.Builder getMetricsBuilder(int i) {
            return getMetricsFieldBuilder().getBuilder(i);
        }

        public MetricOrBuilder getMetricsOrBuilder(int i) {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.metrics_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends MetricOrBuilder> getMetricsOrBuilderList() {
            RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> repeatedFieldBuilderV3 = this.metricsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.metrics_);
        }

        public Metric.Builder addMetricsBuilder() {
            return getMetricsFieldBuilder().addBuilder(Metric.getDefaultInstance());
        }

        public Metric.Builder addMetricsBuilder(int i) {
            return getMetricsFieldBuilder().addBuilder(i, Metric.getDefaultInstance());
        }

        public List<Metric.Builder> getMetricsBuilderList() {
            return getMetricsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Metric, Metric.Builder, MetricOrBuilder> getMetricsFieldBuilder() {
            if (this.metricsBuilder_ == null) {
                List<Metric> list = this.metrics_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.metricsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.metrics_ = null;
            }
            return this.metricsBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static SDKAnalyticPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<SDKAnalyticPayload> parser() {
        return PARSER;
    }

    public Parser<SDKAnalyticPayload> getParserForType() {
        return PARSER;
    }

    public SDKAnalyticPayload getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
