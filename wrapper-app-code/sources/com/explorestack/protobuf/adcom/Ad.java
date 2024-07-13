package com.explorestack.protobuf.adcom;

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
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Ad extends GeneratedMessageV3 implements AdOrBuilder {
    public static final int ADOMAIN_FIELD_NUMBER = 2;
    public static final int AUDIT_FIELD_NUMBER = 16;
    public static final int BUNDLE_FIELD_NUMBER = 3;
    public static final int CATTAX_FIELD_NUMBER = 6;
    public static final int CAT_FIELD_NUMBER = 5;
    private static final Ad DEFAULT_INSTANCE = new Ad();
    public static final int DISPLAY_FIELD_NUMBER = 13;
    public static final int EXT_FIELD_NUMBER = 18;
    public static final int EXT_PROTO_FIELD_NUMBER = 17;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INIT_FIELD_NUMBER = 11;
    public static final int IURL_FIELD_NUMBER = 4;
    public static final int LANG_FIELD_NUMBER = 7;
    public static final int LASTMOD_FIELD_NUMBER = 12;
    public static final int MRATING_FIELD_NUMBER = 10;
    /* access modifiers changed from: private */
    public static final Parser<Ad> PARSER = new AbstractParser<Ad>() {
        public Ad parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Ad(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SECURE_FIELD_NUMBER = 9;
    public static final int VIDEO_FIELD_NUMBER = 14;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public LazyStringList adomain_;
    /* access modifiers changed from: private */
    public Audit audit_;
    /* access modifiers changed from: private */
    public LazyStringList bundle_;
    /* access modifiers changed from: private */
    public LazyStringList cat_;
    /* access modifiers changed from: private */
    public int cattax_;
    /* access modifiers changed from: private */
    public Display display_;
    /* access modifiers changed from: private */
    public List<Any> extProto_;
    /* access modifiers changed from: private */
    public Struct ext_;
    /* access modifiers changed from: private */
    public volatile Object id_;
    /* access modifiers changed from: private */
    public volatile Object init_;
    /* access modifiers changed from: private */
    public volatile Object iurl_;
    /* access modifiers changed from: private */
    public volatile Object lang_;
    /* access modifiers changed from: private */
    public volatile Object lastmod_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int mrating_;
    /* access modifiers changed from: private */
    public boolean secure_;
    /* access modifiers changed from: private */
    public Video video_;

    public interface AuditOrBuilder extends MessageOrBuilder {
        Ad getCorr();

        AdOrBuilder getCorrOrBuilder();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getFeedback(int i);

        ByteString getFeedbackBytes(int i);

        int getFeedbackCount();

        List<String> getFeedbackList();

        String getInit();

        ByteString getInitBytes();

        String getLastmod();

        ByteString getLastmodBytes();

        AuditStatusCode getStatus();

        int getStatusValue();

        boolean hasCorr();

        boolean hasExt();
    }

    public interface DisplayOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        Display.Banner getBanner();

        Display.BannerOrBuilder getBannerOrBuilder();

        String getCurl();

        ByteString getCurlBytes();

        Event getEvent(int i);

        int getEventCount();

        List<Event> getEventList();

        EventOrBuilder getEventOrBuilder(int i);

        List<? extends EventOrBuilder> getEventOrBuilderList();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        int getH();

        int getHratio();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        Display.Native getNative();

        Display.NativeOrBuilder getNativeOrBuilder();

        DisplayCreativeType getType(int i);

        int getTypeCount();

        List<DisplayCreativeType> getTypeList();

        int getTypeValue(int i);

        List<Integer> getTypeValueList();

        int getW();

        int getWratio();

        boolean hasBanner();

        boolean hasExt();

        boolean hasNative();
    }

    public interface EventOrBuilder extends MessageOrBuilder {
        boolean containsCdata(String str);

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        @Deprecated
        Map<String, String> getCdata();

        int getCdataCount();

        Map<String, String> getCdataMap();

        String getCdataOrDefault(String str, String str2);

        String getCdataOrThrow(String str);

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        EventTrackingMethod getMethod();

        int getMethodValue();

        EventType getType();

        int getTypeValue();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasExt();
    }

    public interface VideoOrBuilder extends MessageOrBuilder {
        String getAdm();

        ByteString getAdmBytes();

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        String getCurl();

        ByteString getCurlBytes();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        VideoCreativeType getType(int i);

        int getTypeCount();

        List<VideoCreativeType> getTypeList();

        int getTypeValue(int i);

        List<Integer> getTypeValueList();

        boolean hasExt();
    }

    private Ad(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Ad() {
        this.memoizedIsInitialized = -1;
        this.id_ = "";
        this.adomain_ = LazyStringArrayList.EMPTY;
        this.bundle_ = LazyStringArrayList.EMPTY;
        this.iurl_ = "";
        this.cat_ = LazyStringArrayList.EMPTY;
        this.cattax_ = 0;
        this.lang_ = "";
        this.mrating_ = 0;
        this.init_ = "";
        this.lastmod_ = "";
        this.extProto_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Ad();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Ad(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        case 18:
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.adomain_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.adomain_.add(readStringRequireUtf8);
                            break;
                        case 26:
                            String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.bundle_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.bundle_.add(readStringRequireUtf82);
                            break;
                        case 34:
                            this.iurl_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 42:
                            String readStringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.cat_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.cat_.add(readStringRequireUtf83);
                            break;
                        case 48:
                            this.cattax_ = codedInputStream.readEnum();
                            break;
                        case 58:
                            this.lang_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 72:
                            this.secure_ = codedInputStream.readBool();
                            break;
                        case 80:
                            this.mrating_ = codedInputStream.readEnum();
                            break;
                        case 90:
                            this.init_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 98:
                            this.lastmod_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 106:
                            Display.Builder builder = this.display_ != null ? this.display_.toBuilder() : null;
                            Display display = (Display) codedInputStream.readMessage(Display.parser(), extensionRegistryLite);
                            this.display_ = display;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(display);
                                this.display_ = builder.buildPartial();
                                break;
                            }
                        case 114:
                            Video.Builder builder2 = this.video_ != null ? this.video_.toBuilder() : null;
                            Video video = (Video) codedInputStream.readMessage(Video.parser(), extensionRegistryLite);
                            this.video_ = video;
                            if (builder2 == null) {
                                break;
                            } else {
                                builder2.mergeFrom(video);
                                this.video_ = builder2.buildPartial();
                                break;
                            }
                        case 130:
                            Audit.Builder builder3 = this.audit_ != null ? this.audit_.toBuilder() : null;
                            Audit audit = (Audit) codedInputStream.readMessage(Audit.parser(), extensionRegistryLite);
                            this.audit_ = audit;
                            if (builder3 == null) {
                                break;
                            } else {
                                builder3.mergeFrom(audit);
                                this.audit_ = builder3.buildPartial();
                                break;
                            }
                        case 138:
                            if (!z2 || !true) {
                                this.extProto_ = new ArrayList();
                                z2 |= true;
                            }
                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            break;
                        case 146:
                            Struct.Builder builder4 = this.ext_ != null ? this.ext_.toBuilder() : null;
                            Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.ext_ = struct;
                            if (builder4 == null) {
                                break;
                            } else {
                                builder4.mergeFrom(struct);
                                this.ext_ = builder4.buildPartial();
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
                        this.adomain_ = this.adomain_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.bundle_ = this.bundle_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.cat_ = this.cat_.getUnmodifiableView();
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
                this.adomain_ = this.adomain_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.bundle_ = this.bundle_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.cat_ = this.cat_.getUnmodifiableView();
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
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_fieldAccessorTable.ensureFieldAccessorsInitialized(Ad.class, Builder.class);
    }

    public static final class Event extends GeneratedMessageV3 implements EventOrBuilder {
        public static final int API_FIELD_NUMBER = 3;
        public static final int CDATA_FIELD_NUMBER = 5;
        private static final Event DEFAULT_INSTANCE = new Event();
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int METHOD_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<Event> PARSER = new AbstractParser<Event>() {
            public Event parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Event(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() {
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> api_;
        /* access modifiers changed from: private */
        public MapField<String, String> cdata_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int method_;
        /* access modifiers changed from: private */
        public int type_;
        /* access modifiers changed from: private */
        public volatile Object url_;

        private Event(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Event() {
            this.memoizedIsInitialized = -1;
            this.type_ = 0;
            this.method_ = 0;
            this.api_ = Collections.emptyList();
            this.url_ = "";
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Event();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Event(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.type_ = codedInputStream.readEnum();
                            } else if (readTag == 16) {
                                this.method_ = codedInputStream.readEnum();
                            } else if (readTag == 24) {
                                int readEnum = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.api_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                            } else if (readTag == 26) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.api_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.api_.add(Integer.valueOf(readEnum2));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 34) {
                                this.url_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                if (!z2 || !true) {
                                    this.cdata_ = MapField.newMapField(CdataDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CdataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.cdata_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            } else if (readTag == 50) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 58) {
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
                            this.api_ = Collections.unmodifiableList(this.api_);
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
                    this.api_ = Collections.unmodifiableList(this.api_);
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
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 5) {
                return internalGetCdata();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
        }

        public int getTypeValue() {
            return this.type_;
        }

        public EventType getType() {
            EventType valueOf = EventType.valueOf(this.type_);
            return valueOf == null ? EventType.UNRECOGNIZED : valueOf;
        }

        public int getMethodValue() {
            return this.method_;
        }

        public EventTrackingMethod getMethod() {
            EventTrackingMethod valueOf = EventTrackingMethod.valueOf(this.method_);
            return valueOf == null ? EventTrackingMethod.UNRECOGNIZED : valueOf;
        }

        public List<ApiFramework> getApiList() {
            return new Internal.ListAdapter(this.api_, api_converter_);
        }

        public int getApiCount() {
            return this.api_.size();
        }

        public ApiFramework getApi(int i) {
            return api_converter_.convert(this.api_.get(i));
        }

        public List<Integer> getApiValueList() {
            return this.api_;
        }

        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
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

        private static final class CdataDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_CdataEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

            private CdataDefaultEntryHolder() {
            }
        }

        /* access modifiers changed from: private */
        public MapField<String, String> internalGetCdata() {
            MapField<String, String> mapField = this.cdata_;
            return mapField == null ? MapField.emptyMapField(CdataDefaultEntryHolder.defaultEntry) : mapField;
        }

        public int getCdataCount() {
            return internalGetCdata().getMap().size();
        }

        public boolean containsCdata(String str) {
            if (str != null) {
                return internalGetCdata().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getCdata() {
            return getCdataMap();
        }

        public Map<String, String> getCdataMap() {
            return internalGetCdata().getMap();
        }

        public String getCdataOrDefault(String str, String str2) {
            if (str != null) {
                Map<String, String> map = internalGetCdata().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }
            throw null;
        }

        public String getCdataOrThrow(String str) {
            if (str != null) {
                Map<String, String> map = internalGetCdata().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
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
            getSerializedSize();
            if (this.type_ != EventType.EVENT_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                codedOutputStream.writeEnum(2, this.method_);
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i = 0; i < this.api_.size(); i++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i).intValue());
            }
            if (!getUrlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.url_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCdata(), CdataDefaultEntryHolder.defaultEntry, 5);
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                codedOutputStream.writeMessage(6, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) + 0 : 0;
            if (this.method_ != EventTrackingMethod.EVENT_TRACKING_METHOD_INVALID.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.method_);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.api_.size(); i3++) {
                i2 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i3).intValue());
            }
            int i4 = computeEnumSize + i2;
            if (!getApiList().isEmpty()) {
                i4 = i4 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i2);
            }
            this.apiMemoizedSerializedSize = i2;
            if (!getUrlBytes().isEmpty()) {
                i4 += GeneratedMessageV3.computeStringSize(4, this.url_);
            }
            for (Map.Entry next : internalGetCdata().getMap().entrySet()) {
                i4 += CodedOutputStream.computeMessageSize(5, CdataDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
            }
            for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                i4 += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i5));
            }
            if (this.ext_ != null) {
                i4 += CodedOutputStream.computeMessageSize(7, getExt());
            }
            int serializedSize = i4 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return super.equals(obj);
            }
            Event event = (Event) obj;
            if (this.type_ != event.type_ || this.method_ != event.method_ || !this.api_.equals(event.api_) || !getUrl().equals(event.getUrl()) || !internalGetCdata().equals(event.internalGetCdata()) || hasExt() != event.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(event.getExt())) && getExtProtoList().equals(event.getExtProtoList()) && this.unknownFields.equals(event.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + this.method_;
            if (getApiCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.api_.hashCode();
            }
            int hashCode2 = (((hashCode * 37) + 4) * 53) + getUrl().hashCode();
            if (!internalGetCdata().getMap().isEmpty()) {
                hashCode2 = (((hashCode2 * 37) + 5) * 53) + internalGetCdata().hashCode();
            }
            if (hasExt()) {
                hashCode2 = (((hashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }

        public static Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Event parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Event parseFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Event parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private MapField<String, String> cdata_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int method_;
            private int type_;
            private Object url_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor;
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMapField(int i) {
                if (i == 5) {
                    return internalGetCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMutableMapField(int i) {
                if (i == 5) {
                    return internalGetMutableCdata();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
            }

            private Builder() {
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.url_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.url_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Event.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.type_ = 0;
                this.method_ = 0;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -2;
                this.url_ = "";
                internalGetMutableCdata().clear();
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
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Event_descriptor;
            }

            public Event getDefaultInstanceForType() {
                return Event.getDefaultInstance();
            }

            public Event build() {
                Event buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Event buildPartial() {
                Event event = new Event((GeneratedMessageV3.Builder) this);
                int unused = event.type_ = this.type_;
                int unused2 = event.method_ = this.method_;
                if ((this.bitField0_ & 1) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -2;
                }
                List unused3 = event.api_ = this.api_;
                Object unused4 = event.url_ = this.url_;
                MapField unused5 = event.cdata_ = internalGetCdata();
                event.cdata_.makeImmutable();
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused6 = event.ext_ = this.ext_;
                } else {
                    Struct unused7 = event.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -5;
                    }
                    List unused8 = event.extProto_ = this.extProto_;
                } else {
                    List unused9 = event.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return event;
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
                if (message instanceof Event) {
                    return mergeFrom((Event) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Event event) {
                if (event == Event.getDefaultInstance()) {
                    return this;
                }
                if (event.type_ != 0) {
                    setTypeValue(event.getTypeValue());
                }
                if (event.method_ != 0) {
                    setMethodValue(event.getMethodValue());
                }
                if (!event.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = event.api_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(event.api_);
                    }
                    onChanged();
                }
                if (!event.getUrl().isEmpty()) {
                    this.url_ = event.url_;
                    onChanged();
                }
                internalGetMutableCdata().mergeFrom(event.internalGetCdata());
                if (event.hasExt()) {
                    mergeExt(event.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!event.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = event.extProto_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(event.extProto_);
                        }
                        onChanged();
                    }
                } else if (!event.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = event.extProto_;
                        this.bitField0_ &= -5;
                        if (Event.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(event.extProto_);
                    }
                }
                mergeUnknownFields(event.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Ad.Event.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Event.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Ad$Event r3 = (com.explorestack.protobuf.adcom.Ad.Event) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Event) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Ad$Event r4 = (com.explorestack.protobuf.adcom.Ad.Event) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Event) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Event.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Event$Builder");
            }

            public int getTypeValue() {
                return this.type_;
            }

            public Builder setTypeValue(int i) {
                this.type_ = i;
                onChanged();
                return this;
            }

            public EventType getType() {
                EventType valueOf = EventType.valueOf(this.type_);
                return valueOf == null ? EventType.UNRECOGNIZED : valueOf;
            }

            public Builder setType(EventType eventType) {
                if (eventType != null) {
                    this.type_ = eventType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearType() {
                this.type_ = 0;
                onChanged();
                return this;
            }

            public int getMethodValue() {
                return this.method_;
            }

            public Builder setMethodValue(int i) {
                this.method_ = i;
                onChanged();
                return this;
            }

            public EventTrackingMethod getMethod() {
                EventTrackingMethod valueOf = EventTrackingMethod.valueOf(this.method_);
                return valueOf == null ? EventTrackingMethod.UNRECOGNIZED : valueOf;
            }

            public Builder setMethod(EventTrackingMethod eventTrackingMethod) {
                if (eventTrackingMethod != null) {
                    this.method_ = eventTrackingMethod.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearMethod() {
                this.method_ = 0;
                onChanged();
                return this;
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 1;
                }
            }

            public List<ApiFramework> getApiList() {
                return new Internal.ListAdapter(this.api_, Event.api_converter_);
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public ApiFramework getApi(int i) {
                return (ApiFramework) Event.api_converter_.convert(this.api_.get(i));
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                if (apiFramework != null) {
                    ensureApiIsMutable();
                    this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addApi(ApiFramework apiFramework) {
                if (apiFramework != null) {
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                for (ApiFramework number : iterable) {
                    this.api_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer intValue : iterable) {
                    this.api_.add(Integer.valueOf(intValue.intValue()));
                }
                onChanged();
                return this;
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
                this.url_ = Event.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                if (byteString != null) {
                    Event.checkByteStringIsUtf8(byteString);
                    this.url_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            private MapField<String, String> internalGetCdata() {
                MapField<String, String> mapField = this.cdata_;
                return mapField == null ? MapField.emptyMapField(CdataDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<String, String> internalGetMutableCdata() {
                onChanged();
                if (this.cdata_ == null) {
                    this.cdata_ = MapField.newMapField(CdataDefaultEntryHolder.defaultEntry);
                }
                if (!this.cdata_.isMutable()) {
                    this.cdata_ = this.cdata_.copy();
                }
                return this.cdata_;
            }

            public int getCdataCount() {
                return internalGetCdata().getMap().size();
            }

            public boolean containsCdata(String str) {
                if (str != null) {
                    return internalGetCdata().getMap().containsKey(str);
                }
                throw null;
            }

            @Deprecated
            public Map<String, String> getCdata() {
                return getCdataMap();
            }

            public Map<String, String> getCdataMap() {
                return internalGetCdata().getMap();
            }

            public String getCdataOrDefault(String str, String str2) {
                if (str != null) {
                    Map<String, String> map = internalGetCdata().getMap();
                    return map.containsKey(str) ? map.get(str) : str2;
                }
                throw null;
            }

            public String getCdataOrThrow(String str) {
                if (str != null) {
                    Map<String, String> map = internalGetCdata().getMap();
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            }

            public Builder clearCdata() {
                internalGetMutableCdata().getMutableMap().clear();
                return this;
            }

            public Builder removeCdata(String str) {
                if (str != null) {
                    internalGetMutableCdata().getMutableMap().remove(str);
                    return this;
                }
                throw null;
            }

            @Deprecated
            public Map<String, String> getMutableCdata() {
                return internalGetMutableCdata().getMutableMap();
            }

            public Builder putCdata(String str, String str2) {
                if (str == null) {
                    throw null;
                } else if (str2 != null) {
                    internalGetMutableCdata().getMutableMap().put(str, str2);
                    return this;
                } else {
                    throw null;
                }
            }

            public Builder putAllCdata(Map<String, String> map) {
                internalGetMutableCdata().getMutableMap().putAll(map);
                return this;
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

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Event> parser() {
            return PARSER;
        }

        public Parser<Event> getParserForType() {
            return PARSER;
        }

        public Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Display extends GeneratedMessageV3 implements DisplayOrBuilder {
        public static final int ADM_FIELD_NUMBER = 8;
        public static final int API_FIELD_NUMBER = 2;
        public static final int BANNER_FIELD_NUMBER = 10;
        public static final int CURL_FIELD_NUMBER = 9;
        private static final Display DEFAULT_INSTANCE = new Display();
        public static final int EVENT_FIELD_NUMBER = 12;
        public static final int EXT_FIELD_NUMBER = 14;
        public static final int EXT_PROTO_FIELD_NUMBER = 13;
        public static final int HRATIO_FIELD_NUMBER = 7;
        public static final int H_FIELD_NUMBER = 5;
        public static final int MIME_FIELD_NUMBER = 1;
        public static final int NATIVE_FIELD_NUMBER = 11;
        /* access modifiers changed from: private */
        public static final Parser<Display> PARSER = new AbstractParser<Display>() {
            public Display parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Display(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TYPE_FIELD_NUMBER = 3;
        public static final int WRATIO_FIELD_NUMBER = 6;
        public static final int W_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() {
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, DisplayCreativeType> type_converter_ = new Internal.ListAdapter.Converter<Integer, DisplayCreativeType>() {
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType valueOf = DisplayCreativeType.valueOf(num.intValue());
                return valueOf == null ? DisplayCreativeType.UNRECOGNIZED : valueOf;
            }
        };
        /* access modifiers changed from: private */
        public volatile Object adm_;
        private int apiMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> api_;
        /* access modifiers changed from: private */
        public Banner banner_;
        /* access modifiers changed from: private */
        public volatile Object curl_;
        /* access modifiers changed from: private */
        public List<Event> event_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public int h_;
        /* access modifiers changed from: private */
        public int hratio_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public LazyStringList mime_;
        /* access modifiers changed from: private */
        public Native native_;
        private int typeMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> type_;
        /* access modifiers changed from: private */
        public int w_;
        /* access modifiers changed from: private */
        public int wratio_;

        public interface BannerOrBuilder extends MessageOrBuilder {
            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getImg();

            ByteString getImgBytes();

            String getLink();

            ByteString getLinkBytes();

            boolean hasExt();
        }

        public interface NativeOrBuilder extends MessageOrBuilder {
            Native.Asset getAsset(int i);

            int getAssetCount();

            List<Native.Asset> getAssetList();

            Native.AssetOrBuilder getAssetOrBuilder(int i);

            List<? extends Native.AssetOrBuilder> getAssetOrBuilderList();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            Native.LinkAsset getLink();

            Native.LinkAssetOrBuilder getLinkOrBuilder();

            boolean hasExt();

            boolean hasLink();
        }

        private Display(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Display() {
            this.memoizedIsInitialized = -1;
            this.mime_ = LazyStringArrayList.EMPTY;
            this.api_ = Collections.emptyList();
            this.type_ = Collections.emptyList();
            this.adm_ = "";
            this.curl_ = "";
            this.event_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Display();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Display(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.mime_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.mime_.add(readStringRequireUtf8);
                                break;
                            case 16:
                                int readEnum = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.api_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                                break;
                            case 18:
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.api_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.api_.add(Integer.valueOf(readEnum2));
                                }
                                codedInputStream.popLimit(pushLimit);
                                break;
                            case 24:
                                int readEnum3 = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.type_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.type_.add(Integer.valueOf(readEnum3));
                                break;
                            case 26:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.type_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.type_.add(Integer.valueOf(readEnum4));
                                }
                                codedInputStream.popLimit(pushLimit2);
                                break;
                            case 32:
                                this.w_ = codedInputStream.readUInt32();
                                break;
                            case 40:
                                this.h_ = codedInputStream.readUInt32();
                                break;
                            case 48:
                                this.wratio_ = codedInputStream.readUInt32();
                                break;
                            case 56:
                                this.hratio_ = codedInputStream.readUInt32();
                                break;
                            case 66:
                                this.adm_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.curl_ = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                Banner.Builder builder = this.banner_ != null ? this.banner_.toBuilder() : null;
                                Banner banner = (Banner) codedInputStream.readMessage(Banner.parser(), extensionRegistryLite);
                                this.banner_ = banner;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(banner);
                                    this.banner_ = builder.buildPartial();
                                    break;
                                }
                            case 90:
                                Native.Builder builder2 = this.native_ != null ? this.native_.toBuilder() : null;
                                Native nativeR = (Native) codedInputStream.readMessage(Native.parser(), extensionRegistryLite);
                                this.native_ = nativeR;
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(nativeR);
                                    this.native_ = builder2.buildPartial();
                                    break;
                                }
                            case 98:
                                if (!z2 || !true) {
                                    this.event_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.event_.add(codedInputStream.readMessage(Event.parser(), extensionRegistryLite));
                                break;
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
                            this.mime_ = this.mime_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.api_ = Collections.unmodifiableList(this.api_);
                        }
                        if (z2 && true) {
                            this.type_ = Collections.unmodifiableList(this.type_);
                        }
                        if (z2 && true) {
                            this.event_ = Collections.unmodifiableList(this.event_);
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
                    this.mime_ = this.mime_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                }
                if (z2 && true) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                }
                if (z2 && true) {
                    this.event_ = Collections.unmodifiableList(this.event_);
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
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_fieldAccessorTable.ensureFieldAccessorsInitialized(Display.class, Builder.class);
        }

        public static final class Banner extends GeneratedMessageV3 implements BannerOrBuilder {
            private static final Banner DEFAULT_INSTANCE = new Banner();
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int IMG_FIELD_NUMBER = 1;
            public static final int LINK_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Parser<Banner> PARSER = new AbstractParser<Banner>() {
                public Banner parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Banner(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public volatile Object img_;
            /* access modifiers changed from: private */
            public volatile Object link_;
            private byte memoizedIsInitialized;

            private Banner(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Banner() {
                this.memoizedIsInitialized = -1;
                this.img_ = "";
                this.link_ = "";
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Banner();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Banner(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.img_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 18) {
                                    this.link_ = codedInputStream.readStringRequireUtf8();
                                } else if (readTag == 26) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 34) {
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
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Banner_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Banner_fieldAccessorTable.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
            }

            public String getImg() {
                Object obj = this.img_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.img_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getImgBytes() {
                Object obj = this.img_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.img_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getLink() {
                Object obj = this.link_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.link_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLinkBytes() {
                Object obj = this.link_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.link_ = copyFromUtf8;
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
                if (!getImgBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.img_);
                }
                if (!getLinkBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.link_);
                }
                for (int i = 0; i < this.extProto_.size(); i++) {
                    codedOutputStream.writeMessage(3, this.extProto_.get(i));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(4, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getImgBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.img_) + 0 : 0;
                if (!getLinkBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(2, this.link_);
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    computeStringSize += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    computeStringSize += CodedOutputStream.computeMessageSize(4, getExt());
                }
                int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Banner)) {
                    return super.equals(obj);
                }
                Banner banner = (Banner) obj;
                if (!getImg().equals(banner.getImg()) || !getLink().equals(banner.getLink()) || hasExt() != banner.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(banner.getExt())) && getExtProtoList().equals(banner.getExtProtoList()) && this.unknownFields.equals(banner.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getImg().hashCode()) * 37) + 2) * 53) + getLink().hashCode();
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static Banner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Banner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Banner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Banner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Banner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Banner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Banner parseFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Banner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Banner parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Banner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Banner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Banner parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Banner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Banner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Banner banner) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(banner);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BannerOrBuilder {
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object img_;
                private Object link_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Banner_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Banner_fieldAccessorTable.ensureFieldAccessorsInitialized(Banner.class, Builder.class);
                }

                private Builder() {
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.img_ = "";
                    this.link_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Banner.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.img_ = "";
                    this.link_ = "";
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
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Banner_descriptor;
                }

                public Banner getDefaultInstanceForType() {
                    return Banner.getDefaultInstance();
                }

                public Banner build() {
                    Banner buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Banner buildPartial() {
                    Banner banner = new Banner((GeneratedMessageV3.Builder) this);
                    Object unused = banner.img_ = this.img_;
                    Object unused2 = banner.link_ = this.link_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused3 = banner.ext_ = this.ext_;
                    } else {
                        Struct unused4 = banner.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        List unused5 = banner.extProto_ = this.extProto_;
                    } else {
                        List unused6 = banner.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return banner;
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
                    if (message instanceof Banner) {
                        return mergeFrom((Banner) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Banner banner) {
                    if (banner == Banner.getDefaultInstance()) {
                        return this;
                    }
                    if (!banner.getImg().isEmpty()) {
                        this.img_ = banner.img_;
                        onChanged();
                    }
                    if (!banner.getLink().isEmpty()) {
                        this.link_ = banner.link_;
                        onChanged();
                    }
                    if (banner.hasExt()) {
                        mergeExt(banner.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!banner.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = banner.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(banner.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!banner.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = banner.extProto_;
                            this.bitField0_ &= -2;
                            if (Banner.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(banner.extProto_);
                        }
                    }
                    mergeUnknownFields(banner.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Ad.Display.Banner.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Banner.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r3 = (com.explorestack.protobuf.adcom.Ad.Display.Banner) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Banner) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Ad$Display$Banner r4 = (com.explorestack.protobuf.adcom.Ad.Display.Banner) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Banner) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Banner.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Banner$Builder");
                }

                public String getImg() {
                    Object obj = this.img_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.img_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getImgBytes() {
                    Object obj = this.img_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.img_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setImg(String str) {
                    if (str != null) {
                        this.img_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearImg() {
                    this.img_ = Banner.getDefaultInstance().getImg();
                    onChanged();
                    return this;
                }

                public Builder setImgBytes(ByteString byteString) {
                    if (byteString != null) {
                        Banner.checkByteStringIsUtf8(byteString);
                        this.img_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getLink() {
                    Object obj = this.link_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.link_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getLinkBytes() {
                    Object obj = this.link_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.link_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setLink(String str) {
                    if (str != null) {
                        this.link_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearLink() {
                    this.link_ = Banner.getDefaultInstance().getLink();
                    onChanged();
                    return this;
                }

                public Builder setLinkBytes(ByteString byteString) {
                    if (byteString != null) {
                        Banner.checkByteStringIsUtf8(byteString);
                        this.link_ = byteString;
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

            public static Banner getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Banner> parser() {
                return PARSER;
            }

            public Parser<Banner> getParserForType() {
                return PARSER;
            }

            public Banner getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public static final class Native extends GeneratedMessageV3 implements NativeOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 2;
            private static final Native DEFAULT_INSTANCE = new Native();
            public static final int EXT_FIELD_NUMBER = 4;
            public static final int EXT_PROTO_FIELD_NUMBER = 3;
            public static final int LINK_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Parser<Native> PARSER = new AbstractParser<Native>() {
                public Native parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Native(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public List<Asset> asset_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public LinkAsset link_;
            private byte memoizedIsInitialized;

            public interface AssetOrBuilder extends MessageOrBuilder {
                Asset.DataAsset getData();

                Asset.DataAssetOrBuilder getDataOrBuilder();

                Struct getExt();

                StructOrBuilder getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                AnyOrBuilder getExtProtoOrBuilder(int i);

                List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                int getId();

                Asset.ImageAsset getImage();

                Asset.ImageAssetOrBuilder getImageOrBuilder();

                LinkAsset getLink();

                LinkAssetOrBuilder getLinkOrBuilder();

                boolean getReq();

                Asset.TitleAsset getTitle();

                Asset.TitleAssetOrBuilder getTitleOrBuilder();

                Asset.VideoAsset getVideo();

                Asset.VideoAssetOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImage();

                boolean hasLink();

                boolean hasTitle();

                boolean hasVideo();
            }

            public interface LinkAssetOrBuilder extends MessageOrBuilder {
                Struct getExt();

                StructOrBuilder getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                AnyOrBuilder getExtProtoOrBuilder(int i);

                List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                String getTrkr(int i);

                ByteString getTrkrBytes(int i);

                int getTrkrCount();

                List<String> getTrkrList();

                String getUrl();

                ByteString getUrlBytes();

                String getUrlfb();

                ByteString getUrlfbBytes();

                boolean hasExt();
            }

            private Native(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Native() {
                this.memoizedIsInitialized = -1;
                this.asset_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Native();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Native(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    LinkAsset.Builder builder = this.link_ != null ? this.link_.toBuilder() : null;
                                    LinkAsset linkAsset = (LinkAsset) codedInputStream.readMessage(LinkAsset.parser(), extensionRegistryLite);
                                    this.link_ = linkAsset;
                                    if (builder != null) {
                                        builder.mergeFrom(linkAsset);
                                        this.link_ = builder.buildPartial();
                                    }
                                } else if (readTag == 18) {
                                    if (!z2 || !true) {
                                        this.asset_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.asset_.add(codedInputStream.readMessage(Asset.parser(), extensionRegistryLite));
                                } else if (readTag == 26) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 34) {
                                    Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder2 != null) {
                                        builder2.mergeFrom(struct);
                                        this.ext_ = builder2.buildPartial();
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
                                this.asset_ = Collections.unmodifiableList(this.asset_);
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
                        this.asset_ = Collections.unmodifiableList(this.asset_);
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
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_fieldAccessorTable.ensureFieldAccessorsInitialized(Native.class, Builder.class);
            }

            public static final class LinkAsset extends GeneratedMessageV3 implements LinkAssetOrBuilder {
                private static final LinkAsset DEFAULT_INSTANCE = new LinkAsset();
                public static final int EXT_FIELD_NUMBER = 5;
                public static final int EXT_PROTO_FIELD_NUMBER = 4;
                /* access modifiers changed from: private */
                public static final Parser<LinkAsset> PARSER = new AbstractParser<LinkAsset>() {
                    public LinkAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new LinkAsset(codedInputStream, extensionRegistryLite);
                    }
                };
                public static final int TRKR_FIELD_NUMBER = 3;
                public static final int URLFB_FIELD_NUMBER = 2;
                public static final int URL_FIELD_NUMBER = 1;
                private static final long serialVersionUID = 0;
                /* access modifiers changed from: private */
                public List<Any> extProto_;
                /* access modifiers changed from: private */
                public Struct ext_;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public LazyStringList trkr_;
                /* access modifiers changed from: private */
                public volatile Object url_;
                /* access modifiers changed from: private */
                public volatile Object urlfb_;

                private LinkAsset(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private LinkAsset() {
                    this.memoizedIsInitialized = -1;
                    this.url_ = "";
                    this.urlfb_ = "";
                    this.trkr_ = LazyStringArrayList.EMPTY;
                    this.extProto_ = Collections.emptyList();
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new LinkAsset();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private LinkAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.urlfb_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 26) {
                                        String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                        if (!z2 || !true) {
                                            this.trkr_ = new LazyStringArrayList();
                                            z2 |= true;
                                        }
                                        this.trkr_.add(readStringRequireUtf8);
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
                                    this.trkr_ = this.trkr_.getUnmodifiableView();
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
                            this.trkr_ = this.trkr_.getUnmodifiableView();
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
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_LinkAsset_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_LinkAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(LinkAsset.class, Builder.class);
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

                public String getUrlfb() {
                    Object obj = this.urlfb_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.urlfb_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getUrlfbBytes() {
                    Object obj = this.urlfb_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.urlfb_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public ProtocolStringList getTrkrList() {
                    return this.trkr_;
                }

                public int getTrkrCount() {
                    return this.trkr_.size();
                }

                public String getTrkr(int i) {
                    return (String) this.trkr_.get(i);
                }

                public ByteString getTrkrBytes(int i) {
                    return this.trkr_.getByteString(i);
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
                    if (!getUrlBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
                    }
                    if (!getUrlfbBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.urlfb_);
                    }
                    for (int i = 0; i < this.trkr_.size(); i++) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.trkr_.getRaw(i));
                    }
                    for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                        codedOutputStream.writeMessage(4, this.extProto_.get(i2));
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
                    int computeStringSize = !getUrlBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.url_) + 0 : 0;
                    if (!getUrlfbBytes().isEmpty()) {
                        computeStringSize += GeneratedMessageV3.computeStringSize(2, this.urlfb_);
                    }
                    int i2 = 0;
                    for (int i3 = 0; i3 < this.trkr_.size(); i3++) {
                        i2 += computeStringSizeNoTag(this.trkr_.getRaw(i3));
                    }
                    int size = computeStringSize + i2 + (getTrkrList().size() * 1);
                    for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                        size += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i4));
                    }
                    if (this.ext_ != null) {
                        size += CodedOutputStream.computeMessageSize(5, getExt());
                    }
                    int serializedSize = size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LinkAsset)) {
                        return super.equals(obj);
                    }
                    LinkAsset linkAsset = (LinkAsset) obj;
                    if (!getUrl().equals(linkAsset.getUrl()) || !getUrlfb().equals(linkAsset.getUrlfb()) || !getTrkrList().equals(linkAsset.getTrkrList()) || hasExt() != linkAsset.hasExt()) {
                        return false;
                    }
                    if ((!hasExt() || getExt().equals(linkAsset.getExt())) && getExtProtoList().equals(linkAsset.getExtProtoList()) && this.unknownFields.equals(linkAsset.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getUrlfb().hashCode();
                    if (getTrkrCount() > 0) {
                        hashCode = (((hashCode * 37) + 3) * 53) + getTrkrList().hashCode();
                    }
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

                public static LinkAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static LinkAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static LinkAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static LinkAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static LinkAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static LinkAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static LinkAsset parseFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static LinkAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static LinkAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static LinkAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (LinkAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(LinkAsset linkAsset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(linkAsset);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LinkAssetOrBuilder {
                    private int bitField0_;
                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private LazyStringList trkr_;
                    private Object url_;
                    private Object urlfb_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_LinkAsset_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_LinkAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(LinkAsset.class, Builder.class);
                    }

                    private Builder() {
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        if (LinkAsset.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder clear() {
                        super.clear();
                        this.url_ = "";
                        this.urlfb_ = "";
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -2;
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -3;
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    public Descriptors.Descriptor getDescriptorForType() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_LinkAsset_descriptor;
                    }

                    public LinkAsset getDefaultInstanceForType() {
                        return LinkAsset.getDefaultInstance();
                    }

                    public LinkAsset build() {
                        LinkAsset buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public LinkAsset buildPartial() {
                        LinkAsset linkAsset = new LinkAsset((GeneratedMessageV3.Builder) this);
                        Object unused = linkAsset.url_ = this.url_;
                        Object unused2 = linkAsset.urlfb_ = this.urlfb_;
                        if ((this.bitField0_ & 1) != 0) {
                            this.trkr_ = this.trkr_.getUnmodifiableView();
                            this.bitField0_ &= -2;
                        }
                        LazyStringList unused3 = linkAsset.trkr_ = this.trkr_;
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            Struct unused4 = linkAsset.ext_ = this.ext_;
                        } else {
                            Struct unused5 = linkAsset.ext_ = singleFieldBuilderV3.build();
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            if ((this.bitField0_ & 2) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -3;
                            }
                            List unused6 = linkAsset.extProto_ = this.extProto_;
                        } else {
                            List unused7 = linkAsset.extProto_ = repeatedFieldBuilderV3.build();
                        }
                        onBuilt();
                        return linkAsset;
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
                        if (message instanceof LinkAsset) {
                            return mergeFrom((LinkAsset) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(LinkAsset linkAsset) {
                        if (linkAsset == LinkAsset.getDefaultInstance()) {
                            return this;
                        }
                        if (!linkAsset.getUrl().isEmpty()) {
                            this.url_ = linkAsset.url_;
                            onChanged();
                        }
                        if (!linkAsset.getUrlfb().isEmpty()) {
                            this.urlfb_ = linkAsset.urlfb_;
                            onChanged();
                        }
                        if (!linkAsset.trkr_.isEmpty()) {
                            if (this.trkr_.isEmpty()) {
                                this.trkr_ = linkAsset.trkr_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureTrkrIsMutable();
                                this.trkr_.addAll(linkAsset.trkr_);
                            }
                            onChanged();
                        }
                        if (linkAsset.hasExt()) {
                            mergeExt(linkAsset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!linkAsset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = linkAsset.extProto_;
                                    this.bitField0_ &= -3;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(linkAsset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!linkAsset.extProto_.isEmpty()) {
                            if (this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.dispose();
                                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                this.extProtoBuilder_ = null;
                                this.extProto_ = linkAsset.extProto_;
                                this.bitField0_ &= -3;
                                if (LinkAsset.alwaysUseFieldBuilders) {
                                    repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                }
                                this.extProtoBuilder_ = repeatedFieldBuilderV3;
                            } else {
                                this.extProtoBuilder_.addAllMessages(linkAsset.extProto_);
                            }
                        }
                        mergeUnknownFields(linkAsset.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.LinkAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$LinkAsset$Builder");
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
                        this.url_ = LinkAsset.getDefaultInstance().getUrl();
                        onChanged();
                        return this;
                    }

                    public Builder setUrlBytes(ByteString byteString) {
                        if (byteString != null) {
                            LinkAsset.checkByteStringIsUtf8(byteString);
                            this.url_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public String getUrlfb() {
                        Object obj = this.urlfb_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.urlfb_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getUrlfbBytes() {
                        Object obj = this.urlfb_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.urlfb_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setUrlfb(String str) {
                        if (str != null) {
                            this.urlfb_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearUrlfb() {
                        this.urlfb_ = LinkAsset.getDefaultInstance().getUrlfb();
                        onChanged();
                        return this;
                    }

                    public Builder setUrlfbBytes(ByteString byteString) {
                        if (byteString != null) {
                            LinkAsset.checkByteStringIsUtf8(byteString);
                            this.urlfb_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    private void ensureTrkrIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.trkr_ = new LazyStringArrayList(this.trkr_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public ProtocolStringList getTrkrList() {
                        return this.trkr_.getUnmodifiableView();
                    }

                    public int getTrkrCount() {
                        return this.trkr_.size();
                    }

                    public String getTrkr(int i) {
                        return (String) this.trkr_.get(i);
                    }

                    public ByteString getTrkrBytes(int i) {
                        return this.trkr_.getByteString(i);
                    }

                    public Builder setTrkr(int i, String str) {
                        if (str != null) {
                            ensureTrkrIsMutable();
                            this.trkr_.set(i, str);
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder addTrkr(String str) {
                        if (str != null) {
                            ensureTrkrIsMutable();
                            this.trkr_.add(str);
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder addAllTrkr(Iterable<String> iterable) {
                        ensureTrkrIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.trkr_);
                        onChanged();
                        return this;
                    }

                    public Builder clearTrkr() {
                        this.trkr_ = LazyStringArrayList.EMPTY;
                        this.bitField0_ &= -2;
                        onChanged();
                        return this;
                    }

                    public Builder addTrkrBytes(ByteString byteString) {
                        if (byteString != null) {
                            LinkAsset.checkByteStringIsUtf8(byteString);
                            ensureTrkrIsMutable();
                            this.trkr_.add(byteString);
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
                        if ((this.bitField0_ & 2) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 2;
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
                            this.bitField0_ &= -3;
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
                            this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
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

                public static LinkAsset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<LinkAsset> parser() {
                    return PARSER;
                }

                public Parser<LinkAsset> getParserForType() {
                    return PARSER;
                }

                public LinkAsset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            public static final class Asset extends GeneratedMessageV3 implements AssetOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                private static final Asset DEFAULT_INSTANCE = new Asset();
                public static final int EXT_FIELD_NUMBER = 9;
                public static final int EXT_PROTO_FIELD_NUMBER = 8;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMAGE_FIELD_NUMBER = 4;
                public static final int LINK_FIELD_NUMBER = 7;
                /* access modifiers changed from: private */
                public static final Parser<Asset> PARSER = new AbstractParser<Asset>() {
                    public Asset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Asset(codedInputStream, extensionRegistryLite);
                    }
                };
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                /* access modifiers changed from: private */
                public DataAsset data_;
                /* access modifiers changed from: private */
                public List<Any> extProto_;
                /* access modifiers changed from: private */
                public Struct ext_;
                /* access modifiers changed from: private */
                public int id_;
                /* access modifiers changed from: private */
                public ImageAsset image_;
                /* access modifiers changed from: private */
                public LinkAsset link_;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public boolean req_;
                /* access modifiers changed from: private */
                public TitleAsset title_;
                /* access modifiers changed from: private */
                public VideoAsset video_;

                public interface DataAssetOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getLen();

                    NativeDataAssetType getType();

                    int getTypeValue();

                    String getValue();

                    ByteString getValueBytes();

                    boolean hasExt();
                }

                public interface ImageAssetOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getH();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    String getUrl();

                    ByteString getUrlBytes();

                    int getW();

                    boolean hasExt();
                }

                public interface TitleAssetOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getLen();

                    String getText();

                    ByteString getTextBytes();

                    boolean hasExt();
                }

                public interface VideoAssetOrBuilder extends MessageOrBuilder {
                    String getAdm();

                    ByteString getAdmBytes();

                    String getCurl();

                    ByteString getCurlBytes();

                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    boolean hasExt();
                }

                private Asset(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private Asset() {
                    this.memoizedIsInitialized = -1;
                    this.extProto_ = Collections.emptyList();
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Asset();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private Asset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this();
                    if (extensionRegistryLite != null) {
                        UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                        boolean z = false;
                        boolean z2 = false;
                        while (!z) {
                            try {
                                int readTag = codedInputStream.readTag();
                                if (readTag != 0) {
                                    if (readTag == 8) {
                                        this.id_ = codedInputStream.readUInt32();
                                    } else if (readTag == 16) {
                                        this.req_ = codedInputStream.readBool();
                                    } else if (readTag == 26) {
                                        TitleAsset.Builder builder = this.title_ != null ? this.title_.toBuilder() : null;
                                        TitleAsset titleAsset = (TitleAsset) codedInputStream.readMessage(TitleAsset.parser(), extensionRegistryLite);
                                        this.title_ = titleAsset;
                                        if (builder != null) {
                                            builder.mergeFrom(titleAsset);
                                            this.title_ = builder.buildPartial();
                                        }
                                    } else if (readTag == 34) {
                                        ImageAsset.Builder builder2 = this.image_ != null ? this.image_.toBuilder() : null;
                                        ImageAsset imageAsset = (ImageAsset) codedInputStream.readMessage(ImageAsset.parser(), extensionRegistryLite);
                                        this.image_ = imageAsset;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(imageAsset);
                                            this.image_ = builder2.buildPartial();
                                        }
                                    } else if (readTag == 42) {
                                        VideoAsset.Builder builder3 = this.video_ != null ? this.video_.toBuilder() : null;
                                        VideoAsset videoAsset = (VideoAsset) codedInputStream.readMessage(VideoAsset.parser(), extensionRegistryLite);
                                        this.video_ = videoAsset;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(videoAsset);
                                            this.video_ = builder3.buildPartial();
                                        }
                                    } else if (readTag == 50) {
                                        DataAsset.Builder builder4 = this.data_ != null ? this.data_.toBuilder() : null;
                                        DataAsset dataAsset = (DataAsset) codedInputStream.readMessage(DataAsset.parser(), extensionRegistryLite);
                                        this.data_ = dataAsset;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(dataAsset);
                                            this.data_ = builder4.buildPartial();
                                        }
                                    } else if (readTag == 58) {
                                        LinkAsset.Builder builder5 = this.link_ != null ? this.link_.toBuilder() : null;
                                        LinkAsset linkAsset = (LinkAsset) codedInputStream.readMessage(LinkAsset.parser(), extensionRegistryLite);
                                        this.link_ = linkAsset;
                                        if (builder5 != null) {
                                            builder5.mergeFrom(linkAsset);
                                            this.link_ = builder5.buildPartial();
                                        }
                                    } else if (readTag == 66) {
                                        if (!z2 || !true) {
                                            this.extProto_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    } else if (readTag == 74) {
                                        Struct.Builder builder6 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                        Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                        this.ext_ = struct;
                                        if (builder6 != null) {
                                            builder6.mergeFrom(struct);
                                            this.ext_ = builder6.buildPartial();
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
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_fieldAccessorTable.ensureFieldAccessorsInitialized(Asset.class, Builder.class);
                }

                public static final class TitleAsset extends GeneratedMessageV3 implements TitleAssetOrBuilder {
                    private static final TitleAsset DEFAULT_INSTANCE = new TitleAsset();
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    /* access modifiers changed from: private */
                    public static final Parser<TitleAsset> PARSER = new AbstractParser<TitleAsset>() {
                        public TitleAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new TitleAsset(codedInputStream, extensionRegistryLite);
                        }
                    };
                    public static final int TEXT_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    /* access modifiers changed from: private */
                    public List<Any> extProto_;
                    /* access modifiers changed from: private */
                    public Struct ext_;
                    /* access modifiers changed from: private */
                    public int len_;
                    private byte memoizedIsInitialized;
                    /* access modifiers changed from: private */
                    public volatile Object text_;

                    private TitleAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = -1;
                    }

                    private TitleAsset() {
                        this.memoizedIsInitialized = -1;
                        this.text_ = "";
                        this.extProto_ = Collections.emptyList();
                    }

                    /* access modifiers changed from: protected */
                    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                        return new TitleAsset();
                    }

                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    private TitleAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.text_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag == 16) {
                                            this.len_ = codedInputStream.readUInt32();
                                        } else if (readTag == 26) {
                                            if (!z2 || !true) {
                                                this.extProto_ = new ArrayList();
                                                z2 |= true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                        } else if (readTag == 34) {
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_TitleAsset_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_TitleAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleAsset.class, Builder.class);
                    }

                    public String getText() {
                        Object obj = this.text_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.text_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getTextBytes() {
                        Object obj = this.text_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.text_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public int getLen() {
                        return this.len_;
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
                        if (!getTextBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.text_);
                        }
                        int i = this.len_;
                        if (i != 0) {
                            codedOutputStream.writeUInt32(2, i);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            codedOutputStream.writeMessage(3, this.extProto_.get(i2));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(4, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public int getSerializedSize() {
                        int i = this.memoizedSize;
                        if (i != -1) {
                            return i;
                        }
                        int computeStringSize = !getTextBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.text_) + 0 : 0;
                        int i2 = this.len_;
                        if (i2 != 0) {
                            computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
                        }
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            computeStringSize += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            computeStringSize += CodedOutputStream.computeMessageSize(4, getExt());
                        }
                        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAsset)) {
                            return super.equals(obj);
                        }
                        TitleAsset titleAsset = (TitleAsset) obj;
                        if (!getText().equals(titleAsset.getText()) || getLen() != titleAsset.getLen() || hasExt() != titleAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(titleAsset.getExt())) && getExtProtoList().equals(titleAsset.getExtProtoList()) && this.unknownFields.equals(titleAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    public int hashCode() {
                        if (this.memoizedHashCode != 0) {
                            return this.memoizedHashCode;
                        }
                        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getText().hashCode()) * 37) + 2) * 53) + getLen();
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static TitleAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    public static TitleAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    public static TitleAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    public static TitleAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    public static TitleAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static TitleAsset parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static TitleAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static TitleAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static TitleAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }

                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static Builder newBuilder(TitleAsset titleAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAsset);
                    }

                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    /* access modifiers changed from: protected */
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TitleAssetOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private Object text_;

                        public final boolean isInitialized() {
                            return true;
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_TitleAsset_descriptor;
                        }

                        /* access modifiers changed from: protected */
                        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_TitleAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleAsset.class, Builder.class);
                        }

                        private Builder() {
                            this.text_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.text_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private void maybeForceBuilderInitialization() {
                            if (TitleAsset.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder clear() {
                            super.clear();
                            this.text_ = "";
                            this.len_ = 0;
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
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_TitleAsset_descriptor;
                        }

                        public TitleAsset getDefaultInstanceForType() {
                            return TitleAsset.getDefaultInstance();
                        }

                        public TitleAsset build() {
                            TitleAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw newUninitializedMessageException(buildPartial);
                        }

                        public TitleAsset buildPartial() {
                            TitleAsset titleAsset = new TitleAsset((GeneratedMessageV3.Builder) this);
                            Object unused = titleAsset.text_ = this.text_;
                            int unused2 = titleAsset.len_ = this.len_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                Struct unused3 = titleAsset.ext_ = this.ext_;
                            } else {
                                Struct unused4 = titleAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                List unused5 = titleAsset.extProto_ = this.extProto_;
                            } else {
                                List unused6 = titleAsset.extProto_ = repeatedFieldBuilderV3.build();
                            }
                            onBuilt();
                            return titleAsset;
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
                            if (message instanceof TitleAsset) {
                                return mergeFrom((TitleAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(TitleAsset titleAsset) {
                            if (titleAsset == TitleAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!titleAsset.getText().isEmpty()) {
                                this.text_ = titleAsset.text_;
                                onChanged();
                            }
                            if (titleAsset.getLen() != 0) {
                                setLen(titleAsset.getLen());
                            }
                            if (titleAsset.hasExt()) {
                                mergeExt(titleAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAsset.extProto_.isEmpty()) {
                                if (this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.dispose();
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    if (TitleAsset.alwaysUseFieldBuilders) {
                                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                                } else {
                                    this.extProtoBuilder_.addAllMessages(titleAsset.extProto_);
                                }
                            }
                            mergeUnknownFields(titleAsset.unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                if (r3 == 0) goto L_0x0010
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r3)
                            L_0x0010:
                                return r2
                            L_0x0011:
                                r3 = move-exception
                                goto L_0x0021
                            L_0x0013:
                                r3 = move-exception
                                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r4     // Catch:{ all -> 0x0011 }
                                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                                throw r3     // Catch:{ all -> 0x001f }
                            L_0x001f:
                                r3 = move-exception
                                r0 = r4
                            L_0x0021:
                                if (r0 == 0) goto L_0x0026
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset) r0)
                            L_0x0026:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.TitleAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$TitleAsset$Builder");
                        }

                        public String getText() {
                            Object obj = this.text_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.text_ = stringUtf8;
                            return stringUtf8;
                        }

                        public ByteString getTextBytes() {
                            Object obj = this.text_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.text_ = copyFromUtf8;
                            return copyFromUtf8;
                        }

                        public Builder setText(String str) {
                            if (str != null) {
                                this.text_ = str;
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public Builder clearText() {
                            this.text_ = TitleAsset.getDefaultInstance().getText();
                            onChanged();
                            return this;
                        }

                        public Builder setTextBytes(ByteString byteString) {
                            if (byteString != null) {
                                TitleAsset.checkByteStringIsUtf8(byteString);
                                this.text_ = byteString;
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public int getLen() {
                            return this.len_;
                        }

                        public Builder setLen(int i) {
                            this.len_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
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

                    public static TitleAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Parser<TitleAsset> parser() {
                        return PARSER;
                    }

                    public Parser<TitleAsset> getParserForType() {
                        return PARSER;
                    }

                    public TitleAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }
                }

                public static final class ImageAsset extends GeneratedMessageV3 implements ImageAssetOrBuilder {
                    private static final ImageAsset DEFAULT_INSTANCE = new ImageAsset();
                    public static final int EXT_FIELD_NUMBER = 6;
                    public static final int EXT_PROTO_FIELD_NUMBER = 5;
                    public static final int H_FIELD_NUMBER = 3;
                    /* access modifiers changed from: private */
                    public static final Parser<ImageAsset> PARSER = new AbstractParser<ImageAsset>() {
                        public ImageAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new ImageAsset(codedInputStream, extensionRegistryLite);
                        }
                    };
                    public static final int TYPE_FIELD_NUMBER = 4;
                    public static final int URL_FIELD_NUMBER = 1;
                    public static final int W_FIELD_NUMBER = 2;
                    private static final long serialVersionUID = 0;
                    /* access modifiers changed from: private */
                    public List<Any> extProto_;
                    /* access modifiers changed from: private */
                    public Struct ext_;
                    /* access modifiers changed from: private */
                    public int h_;
                    private byte memoizedIsInitialized;
                    /* access modifiers changed from: private */
                    public int type_;
                    /* access modifiers changed from: private */
                    public volatile Object url_;
                    /* access modifiers changed from: private */
                    public int w_;

                    private ImageAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = -1;
                    }

                    private ImageAsset() {
                        this.memoizedIsInitialized = -1;
                        this.url_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    /* access modifiers changed from: protected */
                    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                        return new ImageAsset();
                    }

                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    private ImageAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        } else if (readTag == 16) {
                                            this.w_ = codedInputStream.readUInt32();
                                        } else if (readTag == 24) {
                                            this.h_ = codedInputStream.readUInt32();
                                        } else if (readTag == 32) {
                                            this.type_ = codedInputStream.readEnum();
                                        } else if (readTag == 42) {
                                            if (!z2 || !true) {
                                                this.extProto_ = new ArrayList();
                                                z2 |= true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                        } else if (readTag == 50) {
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_ImageAsset_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_ImageAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageAsset.class, Builder.class);
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

                    public int getW() {
                        return this.w_;
                    }

                    public int getH() {
                        return this.h_;
                    }

                    public int getTypeValue() {
                        return this.type_;
                    }

                    public NativeImageAssetType getType() {
                        NativeImageAssetType valueOf = NativeImageAssetType.valueOf(this.type_);
                        return valueOf == null ? NativeImageAssetType.UNRECOGNIZED : valueOf;
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
                        if (!getUrlBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
                        }
                        int i = this.w_;
                        if (i != 0) {
                            codedOutputStream.writeUInt32(2, i);
                        }
                        int i2 = this.h_;
                        if (i2 != 0) {
                            codedOutputStream.writeUInt32(3, i2);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.writeEnum(4, this.type_);
                        }
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            codedOutputStream.writeMessage(5, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(6, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public int getSerializedSize() {
                        int i = this.memoizedSize;
                        if (i != -1) {
                            return i;
                        }
                        int computeStringSize = !getUrlBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.url_) + 0 : 0;
                        int i2 = this.w_;
                        if (i2 != 0) {
                            computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
                        }
                        int i3 = this.h_;
                        if (i3 != 0) {
                            computeStringSize += CodedOutputStream.computeUInt32Size(3, i3);
                        }
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            computeStringSize += CodedOutputStream.computeEnumSize(4, this.type_);
                        }
                        for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                            computeStringSize += CodedOutputStream.computeMessageSize(5, this.extProto_.get(i4));
                        }
                        if (this.ext_ != null) {
                            computeStringSize += CodedOutputStream.computeMessageSize(6, getExt());
                        }
                        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAsset)) {
                            return super.equals(obj);
                        }
                        ImageAsset imageAsset = (ImageAsset) obj;
                        if (!getUrl().equals(imageAsset.getUrl()) || getW() != imageAsset.getW() || getH() != imageAsset.getH() || this.type_ != imageAsset.type_ || hasExt() != imageAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(imageAsset.getExt())) && getExtProtoList().equals(imageAsset.getExtProtoList()) && this.unknownFields.equals(imageAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    public int hashCode() {
                        if (this.memoizedHashCode != 0) {
                            return this.memoizedHashCode;
                        }
                        int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getW()) * 37) + 3) * 53) + getH()) * 37) + 4) * 53) + this.type_;
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 6) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 5) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static ImageAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    public static ImageAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    public static ImageAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    public static ImageAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    public static ImageAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static ImageAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static ImageAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }

                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static Builder newBuilder(ImageAsset imageAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAsset);
                    }

                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    /* access modifiers changed from: protected */
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImageAssetOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int type_;
                        private Object url_;
                        private int w_;

                        public final boolean isInitialized() {
                            return true;
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_ImageAsset_descriptor;
                        }

                        /* access modifiers changed from: protected */
                        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_ImageAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageAsset.class, Builder.class);
                        }

                        private Builder() {
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.url_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private void maybeForceBuilderInitialization() {
                            if (ImageAsset.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder clear() {
                            super.clear();
                            this.url_ = "";
                            this.w_ = 0;
                            this.h_ = 0;
                            this.type_ = 0;
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
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_ImageAsset_descriptor;
                        }

                        public ImageAsset getDefaultInstanceForType() {
                            return ImageAsset.getDefaultInstance();
                        }

                        public ImageAsset build() {
                            ImageAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw newUninitializedMessageException(buildPartial);
                        }

                        public ImageAsset buildPartial() {
                            ImageAsset imageAsset = new ImageAsset((GeneratedMessageV3.Builder) this);
                            Object unused = imageAsset.url_ = this.url_;
                            int unused2 = imageAsset.w_ = this.w_;
                            int unused3 = imageAsset.h_ = this.h_;
                            int unused4 = imageAsset.type_ = this.type_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                Struct unused5 = imageAsset.ext_ = this.ext_;
                            } else {
                                Struct unused6 = imageAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                List unused7 = imageAsset.extProto_ = this.extProto_;
                            } else {
                                List unused8 = imageAsset.extProto_ = repeatedFieldBuilderV3.build();
                            }
                            onBuilt();
                            return imageAsset;
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
                            if (message instanceof ImageAsset) {
                                return mergeFrom((ImageAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(ImageAsset imageAsset) {
                            if (imageAsset == ImageAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!imageAsset.getUrl().isEmpty()) {
                                this.url_ = imageAsset.url_;
                                onChanged();
                            }
                            if (imageAsset.getW() != 0) {
                                setW(imageAsset.getW());
                            }
                            if (imageAsset.getH() != 0) {
                                setH(imageAsset.getH());
                            }
                            if (imageAsset.type_ != 0) {
                                setTypeValue(imageAsset.getTypeValue());
                            }
                            if (imageAsset.hasExt()) {
                                mergeExt(imageAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAsset.extProto_.isEmpty()) {
                                if (this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.dispose();
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    if (ImageAsset.alwaysUseFieldBuilders) {
                                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                                } else {
                                    this.extProtoBuilder_.addAllMessages(imageAsset.extProto_);
                                }
                            }
                            mergeUnknownFields(imageAsset.unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                if (r3 == 0) goto L_0x0010
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r3)
                            L_0x0010:
                                return r2
                            L_0x0011:
                                r3 = move-exception
                                goto L_0x0021
                            L_0x0013:
                                r3 = move-exception
                                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r4     // Catch:{ all -> 0x0011 }
                                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                                throw r3     // Catch:{ all -> 0x001f }
                            L_0x001f:
                                r3 = move-exception
                                r0 = r4
                            L_0x0021:
                                if (r0 == 0) goto L_0x0026
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset) r0)
                            L_0x0026:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.ImageAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$ImageAsset$Builder");
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
                            this.url_ = ImageAsset.getDefaultInstance().getUrl();
                            onChanged();
                            return this;
                        }

                        public Builder setUrlBytes(ByteString byteString) {
                            if (byteString != null) {
                                ImageAsset.checkByteStringIsUtf8(byteString);
                                this.url_ = byteString;
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public int getW() {
                            return this.w_;
                        }

                        public Builder setW(int i) {
                            this.w_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder clearW() {
                            this.w_ = 0;
                            onChanged();
                            return this;
                        }

                        public int getH() {
                            return this.h_;
                        }

                        public Builder setH(int i) {
                            this.h_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder clearH() {
                            this.h_ = 0;
                            onChanged();
                            return this;
                        }

                        public int getTypeValue() {
                            return this.type_;
                        }

                        public Builder setTypeValue(int i) {
                            this.type_ = i;
                            onChanged();
                            return this;
                        }

                        public NativeImageAssetType getType() {
                            NativeImageAssetType valueOf = NativeImageAssetType.valueOf(this.type_);
                            return valueOf == null ? NativeImageAssetType.UNRECOGNIZED : valueOf;
                        }

                        public Builder setType(NativeImageAssetType nativeImageAssetType) {
                            if (nativeImageAssetType != null) {
                                this.type_ = nativeImageAssetType.getNumber();
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
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

                    public static ImageAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Parser<ImageAsset> parser() {
                        return PARSER;
                    }

                    public Parser<ImageAsset> getParserForType() {
                        return PARSER;
                    }

                    public ImageAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }
                }

                public static final class VideoAsset extends GeneratedMessageV3 implements VideoAssetOrBuilder {
                    public static final int ADM_FIELD_NUMBER = 1;
                    public static final int CURL_FIELD_NUMBER = 2;
                    private static final VideoAsset DEFAULT_INSTANCE = new VideoAsset();
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    /* access modifiers changed from: private */
                    public static final Parser<VideoAsset> PARSER = new AbstractParser<VideoAsset>() {
                        public VideoAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new VideoAsset(codedInputStream, extensionRegistryLite);
                        }
                    };
                    private static final long serialVersionUID = 0;
                    /* access modifiers changed from: private */
                    public volatile Object adm_;
                    /* access modifiers changed from: private */
                    public volatile Object curl_;
                    /* access modifiers changed from: private */
                    public List<Any> extProto_;
                    /* access modifiers changed from: private */
                    public Struct ext_;
                    private byte memoizedIsInitialized;

                    private VideoAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = -1;
                    }

                    private VideoAsset() {
                        this.memoizedIsInitialized = -1;
                        this.adm_ = "";
                        this.curl_ = "";
                        this.extProto_ = Collections.emptyList();
                    }

                    /* access modifiers changed from: protected */
                    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                        return new VideoAsset();
                    }

                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    private VideoAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.adm_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag == 18) {
                                            this.curl_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag == 26) {
                                            if (!z2 || !true) {
                                                this.extProto_ = new ArrayList();
                                                z2 |= true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                        } else if (readTag == 34) {
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_VideoAsset_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_VideoAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoAsset.class, Builder.class);
                    }

                    public String getAdm() {
                        Object obj = this.adm_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.adm_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getAdmBytes() {
                        Object obj = this.adm_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.adm_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public String getCurl() {
                        Object obj = this.curl_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.curl_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getCurlBytes() {
                        Object obj = this.curl_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.curl_ = copyFromUtf8;
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
                        if (!getAdmBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.adm_);
                        }
                        if (!getCurlBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 2, this.curl_);
                        }
                        for (int i = 0; i < this.extProto_.size(); i++) {
                            codedOutputStream.writeMessage(3, this.extProto_.get(i));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(4, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public int getSerializedSize() {
                        int i = this.memoizedSize;
                        if (i != -1) {
                            return i;
                        }
                        int computeStringSize = !getAdmBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.adm_) + 0 : 0;
                        if (!getCurlBytes().isEmpty()) {
                            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.curl_);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            computeStringSize += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i2));
                        }
                        if (this.ext_ != null) {
                            computeStringSize += CodedOutputStream.computeMessageSize(4, getExt());
                        }
                        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof VideoAsset)) {
                            return super.equals(obj);
                        }
                        VideoAsset videoAsset = (VideoAsset) obj;
                        if (!getAdm().equals(videoAsset.getAdm()) || !getCurl().equals(videoAsset.getCurl()) || hasExt() != videoAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(videoAsset.getExt())) && getExtProtoList().equals(videoAsset.getExtProtoList()) && this.unknownFields.equals(videoAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    public int hashCode() {
                        if (this.memoizedHashCode != 0) {
                            return this.memoizedHashCode;
                        }
                        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAdm().hashCode()) * 37) + 2) * 53) + getCurl().hashCode();
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static VideoAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    public static VideoAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    public static VideoAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    public static VideoAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    public static VideoAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static VideoAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static VideoAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static VideoAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (VideoAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }

                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static Builder newBuilder(VideoAsset videoAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoAsset);
                    }

                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    /* access modifiers changed from: protected */
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VideoAssetOrBuilder {
                        private Object adm_;
                        private int bitField0_;
                        private Object curl_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;

                        public final boolean isInitialized() {
                            return true;
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_VideoAsset_descriptor;
                        }

                        /* access modifiers changed from: protected */
                        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_VideoAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoAsset.class, Builder.class);
                        }

                        private Builder() {
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.adm_ = "";
                            this.curl_ = "";
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private void maybeForceBuilderInitialization() {
                            if (VideoAsset.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder clear() {
                            super.clear();
                            this.adm_ = "";
                            this.curl_ = "";
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
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_VideoAsset_descriptor;
                        }

                        public VideoAsset getDefaultInstanceForType() {
                            return VideoAsset.getDefaultInstance();
                        }

                        public VideoAsset build() {
                            VideoAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw newUninitializedMessageException(buildPartial);
                        }

                        public VideoAsset buildPartial() {
                            VideoAsset videoAsset = new VideoAsset((GeneratedMessageV3.Builder) this);
                            Object unused = videoAsset.adm_ = this.adm_;
                            Object unused2 = videoAsset.curl_ = this.curl_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                Struct unused3 = videoAsset.ext_ = this.ext_;
                            } else {
                                Struct unused4 = videoAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                List unused5 = videoAsset.extProto_ = this.extProto_;
                            } else {
                                List unused6 = videoAsset.extProto_ = repeatedFieldBuilderV3.build();
                            }
                            onBuilt();
                            return videoAsset;
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
                            if (message instanceof VideoAsset) {
                                return mergeFrom((VideoAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(VideoAsset videoAsset) {
                            if (videoAsset == VideoAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!videoAsset.getAdm().isEmpty()) {
                                this.adm_ = videoAsset.adm_;
                                onChanged();
                            }
                            if (!videoAsset.getCurl().isEmpty()) {
                                this.curl_ = videoAsset.curl_;
                                onChanged();
                            }
                            if (videoAsset.hasExt()) {
                                mergeExt(videoAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!videoAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = videoAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(videoAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!videoAsset.extProto_.isEmpty()) {
                                if (this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.dispose();
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = videoAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    if (VideoAsset.alwaysUseFieldBuilders) {
                                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                                } else {
                                    this.extProtoBuilder_.addAllMessages(videoAsset.extProto_);
                                }
                            }
                            mergeUnknownFields(videoAsset.unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                if (r3 == 0) goto L_0x0010
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r3)
                            L_0x0010:
                                return r2
                            L_0x0011:
                                r3 = move-exception
                                goto L_0x0021
                            L_0x0013:
                                r3 = move-exception
                                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r4     // Catch:{ all -> 0x0011 }
                                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                                throw r3     // Catch:{ all -> 0x001f }
                            L_0x001f:
                                r3 = move-exception
                                r0 = r4
                            L_0x0021:
                                if (r0 == 0) goto L_0x0026
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset) r0)
                            L_0x0026:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.VideoAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$VideoAsset$Builder");
                        }

                        public String getAdm() {
                            Object obj = this.adm_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.adm_ = stringUtf8;
                            return stringUtf8;
                        }

                        public ByteString getAdmBytes() {
                            Object obj = this.adm_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.adm_ = copyFromUtf8;
                            return copyFromUtf8;
                        }

                        public Builder setAdm(String str) {
                            if (str != null) {
                                this.adm_ = str;
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public Builder clearAdm() {
                            this.adm_ = VideoAsset.getDefaultInstance().getAdm();
                            onChanged();
                            return this;
                        }

                        public Builder setAdmBytes(ByteString byteString) {
                            if (byteString != null) {
                                VideoAsset.checkByteStringIsUtf8(byteString);
                                this.adm_ = byteString;
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public String getCurl() {
                            Object obj = this.curl_;
                            if (obj instanceof String) {
                                return (String) obj;
                            }
                            String stringUtf8 = ((ByteString) obj).toStringUtf8();
                            this.curl_ = stringUtf8;
                            return stringUtf8;
                        }

                        public ByteString getCurlBytes() {
                            Object obj = this.curl_;
                            if (!(obj instanceof String)) {
                                return (ByteString) obj;
                            }
                            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                            this.curl_ = copyFromUtf8;
                            return copyFromUtf8;
                        }

                        public Builder setCurl(String str) {
                            if (str != null) {
                                this.curl_ = str;
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public Builder clearCurl() {
                            this.curl_ = VideoAsset.getDefaultInstance().getCurl();
                            onChanged();
                            return this;
                        }

                        public Builder setCurlBytes(ByteString byteString) {
                            if (byteString != null) {
                                VideoAsset.checkByteStringIsUtf8(byteString);
                                this.curl_ = byteString;
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

                    public static VideoAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Parser<VideoAsset> parser() {
                        return PARSER;
                    }

                    public Parser<VideoAsset> getParserForType() {
                        return PARSER;
                    }

                    public VideoAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }
                }

                public static final class DataAsset extends GeneratedMessageV3 implements DataAssetOrBuilder {
                    private static final DataAsset DEFAULT_INSTANCE = new DataAsset();
                    public static final int EXT_FIELD_NUMBER = 5;
                    public static final int EXT_PROTO_FIELD_NUMBER = 4;
                    public static final int LEN_FIELD_NUMBER = 2;
                    /* access modifiers changed from: private */
                    public static final Parser<DataAsset> PARSER = new AbstractParser<DataAsset>() {
                        public DataAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new DataAsset(codedInputStream, extensionRegistryLite);
                        }
                    };
                    public static final int TYPE_FIELD_NUMBER = 3;
                    public static final int VALUE_FIELD_NUMBER = 1;
                    private static final long serialVersionUID = 0;
                    /* access modifiers changed from: private */
                    public List<Any> extProto_;
                    /* access modifiers changed from: private */
                    public Struct ext_;
                    /* access modifiers changed from: private */
                    public int len_;
                    private byte memoizedIsInitialized;
                    /* access modifiers changed from: private */
                    public int type_;
                    /* access modifiers changed from: private */
                    public volatile Object value_;

                    private DataAsset(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = -1;
                    }

                    private DataAsset() {
                        this.memoizedIsInitialized = -1;
                        this.value_ = "";
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    /* access modifiers changed from: protected */
                    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                        return new DataAsset();
                    }

                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    private DataAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.value_ = codedInputStream.readStringRequireUtf8();
                                        } else if (readTag == 16) {
                                            this.len_ = codedInputStream.readUInt32();
                                        } else if (readTag == 24) {
                                            this.type_ = codedInputStream.readEnum();
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_DataAsset_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_DataAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(DataAsset.class, Builder.class);
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

                    public int getLen() {
                        return this.len_;
                    }

                    public int getTypeValue() {
                        return this.type_;
                    }

                    public NativeDataAssetType getType() {
                        NativeDataAssetType valueOf = NativeDataAssetType.valueOf(this.type_);
                        return valueOf == null ? NativeDataAssetType.UNRECOGNIZED : valueOf;
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
                        if (!getValueBytes().isEmpty()) {
                            GeneratedMessageV3.writeString(codedOutputStream, 1, this.value_);
                        }
                        int i = this.len_;
                        if (i != 0) {
                            codedOutputStream.writeUInt32(2, i);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.writeEnum(3, this.type_);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            codedOutputStream.writeMessage(4, this.extProto_.get(i2));
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
                        int computeStringSize = !getValueBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.value_) + 0 : 0;
                        int i2 = this.len_;
                        if (i2 != 0) {
                            computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
                        }
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            computeStringSize += CodedOutputStream.computeEnumSize(3, this.type_);
                        }
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            computeStringSize += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i3));
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
                        if (!(obj instanceof DataAsset)) {
                            return super.equals(obj);
                        }
                        DataAsset dataAsset = (DataAsset) obj;
                        if (!getValue().equals(dataAsset.getValue()) || getLen() != dataAsset.getLen() || this.type_ != dataAsset.type_ || hasExt() != dataAsset.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(dataAsset.getExt())) && getExtProtoList().equals(dataAsset.getExtProtoList()) && this.unknownFields.equals(dataAsset.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    public int hashCode() {
                        if (this.memoizedHashCode != 0) {
                            return this.memoizedHashCode;
                        }
                        int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getValue().hashCode()) * 37) + 2) * 53) + getLen()) * 37) + 3) * 53) + this.type_;
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

                    public static DataAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static DataAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    public static DataAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    public static DataAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    public static DataAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    public static DataAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static DataAsset parseFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static DataAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static DataAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }

                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static Builder newBuilder(DataAsset dataAsset) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAsset);
                    }

                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    /* access modifiers changed from: protected */
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataAssetOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;
                        private Object value_;

                        public final boolean isInitialized() {
                            return true;
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_DataAsset_descriptor;
                        }

                        /* access modifiers changed from: protected */
                        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_DataAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(DataAsset.class, Builder.class);
                        }

                        private Builder() {
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.value_ = "";
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private void maybeForceBuilderInitialization() {
                            if (DataAsset.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder clear() {
                            super.clear();
                            this.value_ = "";
                            this.len_ = 0;
                            this.type_ = 0;
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
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_DataAsset_descriptor;
                        }

                        public DataAsset getDefaultInstanceForType() {
                            return DataAsset.getDefaultInstance();
                        }

                        public DataAsset build() {
                            DataAsset buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw newUninitializedMessageException(buildPartial);
                        }

                        public DataAsset buildPartial() {
                            DataAsset dataAsset = new DataAsset((GeneratedMessageV3.Builder) this);
                            Object unused = dataAsset.value_ = this.value_;
                            int unused2 = dataAsset.len_ = this.len_;
                            int unused3 = dataAsset.type_ = this.type_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                Struct unused4 = dataAsset.ext_ = this.ext_;
                            } else {
                                Struct unused5 = dataAsset.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                List unused6 = dataAsset.extProto_ = this.extProto_;
                            } else {
                                List unused7 = dataAsset.extProto_ = repeatedFieldBuilderV3.build();
                            }
                            onBuilt();
                            return dataAsset;
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
                            if (message instanceof DataAsset) {
                                return mergeFrom((DataAsset) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(DataAsset dataAsset) {
                            if (dataAsset == DataAsset.getDefaultInstance()) {
                                return this;
                            }
                            if (!dataAsset.getValue().isEmpty()) {
                                this.value_ = dataAsset.value_;
                                onChanged();
                            }
                            if (dataAsset.getLen() != 0) {
                                setLen(dataAsset.getLen());
                            }
                            if (dataAsset.type_ != 0) {
                                setTypeValue(dataAsset.getTypeValue());
                            }
                            if (dataAsset.hasExt()) {
                                mergeExt(dataAsset.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAsset.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAsset.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAsset.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAsset.extProto_.isEmpty()) {
                                if (this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.dispose();
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAsset.extProto_;
                                    this.bitField0_ &= -2;
                                    if (DataAsset.alwaysUseFieldBuilders) {
                                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                                } else {
                                    this.extProtoBuilder_.addAllMessages(dataAsset.extProto_);
                                }
                            }
                            mergeUnknownFields(dataAsset.unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                if (r3 == 0) goto L_0x0010
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r3)
                            L_0x0010:
                                return r2
                            L_0x0011:
                                r3 = move-exception
                                goto L_0x0021
                            L_0x0013:
                                r3 = move-exception
                                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                                com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r4     // Catch:{ all -> 0x0011 }
                                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                                throw r3     // Catch:{ all -> 0x001f }
                            L_0x001f:
                                r3 = move-exception
                                r0 = r4
                            L_0x0021:
                                if (r0 == 0) goto L_0x0026
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset) r0)
                            L_0x0026:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.DataAsset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$DataAsset$Builder");
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
                            this.value_ = DataAsset.getDefaultInstance().getValue();
                            onChanged();
                            return this;
                        }

                        public Builder setValueBytes(ByteString byteString) {
                            if (byteString != null) {
                                DataAsset.checkByteStringIsUtf8(byteString);
                                this.value_ = byteString;
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public int getLen() {
                            return this.len_;
                        }

                        public Builder setLen(int i) {
                            this.len_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder clearLen() {
                            this.len_ = 0;
                            onChanged();
                            return this;
                        }

                        public int getTypeValue() {
                            return this.type_;
                        }

                        public Builder setTypeValue(int i) {
                            this.type_ = i;
                            onChanged();
                            return this;
                        }

                        public NativeDataAssetType getType() {
                            NativeDataAssetType valueOf = NativeDataAssetType.valueOf(this.type_);
                            return valueOf == null ? NativeDataAssetType.UNRECOGNIZED : valueOf;
                        }

                        public Builder setType(NativeDataAssetType nativeDataAssetType) {
                            if (nativeDataAssetType != null) {
                                this.type_ = nativeDataAssetType.getNumber();
                                onChanged();
                                return this;
                            }
                            throw null;
                        }

                        public Builder clearType() {
                            this.type_ = 0;
                            onChanged();
                            return this;
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

                    public static DataAsset getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Parser<DataAsset> parser() {
                        return PARSER;
                    }

                    public Parser<DataAsset> getParserForType() {
                        return PARSER;
                    }

                    public DataAsset getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }
                }

                public int getId() {
                    return this.id_;
                }

                public boolean getReq() {
                    return this.req_;
                }

                public boolean hasTitle() {
                    return this.title_ != null;
                }

                public TitleAsset getTitle() {
                    TitleAsset titleAsset = this.title_;
                    return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                }

                public TitleAssetOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                public boolean hasImage() {
                    return this.image_ != null;
                }

                public ImageAsset getImage() {
                    ImageAsset imageAsset = this.image_;
                    return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                }

                public ImageAssetOrBuilder getImageOrBuilder() {
                    return getImage();
                }

                public boolean hasVideo() {
                    return this.video_ != null;
                }

                public VideoAsset getVideo() {
                    VideoAsset videoAsset = this.video_;
                    return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                }

                public VideoAssetOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                public boolean hasData() {
                    return this.data_ != null;
                }

                public DataAsset getData() {
                    DataAsset dataAsset = this.data_;
                    return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                }

                public DataAssetOrBuilder getDataOrBuilder() {
                    return getData();
                }

                public boolean hasLink() {
                    return this.link_ != null;
                }

                public LinkAsset getLink() {
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                public LinkAssetOrBuilder getLinkOrBuilder() {
                    return getLink();
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
                    int i = this.id_;
                    if (i != 0) {
                        codedOutputStream.writeUInt32(1, i);
                    }
                    boolean z = this.req_;
                    if (z) {
                        codedOutputStream.writeBool(2, z);
                    }
                    if (this.title_ != null) {
                        codedOutputStream.writeMessage(3, getTitle());
                    }
                    if (this.image_ != null) {
                        codedOutputStream.writeMessage(4, getImage());
                    }
                    if (this.video_ != null) {
                        codedOutputStream.writeMessage(5, getVideo());
                    }
                    if (this.data_ != null) {
                        codedOutputStream.writeMessage(6, getData());
                    }
                    if (this.link_ != null) {
                        codedOutputStream.writeMessage(7, getLink());
                    }
                    for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                        codedOutputStream.writeMessage(8, this.extProto_.get(i2));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.writeMessage(9, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int i2 = this.id_;
                    int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) + 0 : 0;
                    boolean z = this.req_;
                    if (z) {
                        computeUInt32Size += CodedOutputStream.computeBoolSize(2, z);
                    }
                    if (this.title_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(3, getTitle());
                    }
                    if (this.image_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(4, getImage());
                    }
                    if (this.video_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(5, getVideo());
                    }
                    if (this.data_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(6, getData());
                    }
                    if (this.link_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(7, getLink());
                    }
                    for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(8, this.extProto_.get(i3));
                    }
                    if (this.ext_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(9, getExt());
                    }
                    int serializedSize = computeUInt32Size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Asset)) {
                        return super.equals(obj);
                    }
                    Asset asset = (Asset) obj;
                    if (getId() != asset.getId() || getReq() != asset.getReq() || hasTitle() != asset.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(asset.getTitle())) || hasImage() != asset.hasImage()) {
                        return false;
                    }
                    if ((hasImage() && !getImage().equals(asset.getImage())) || hasVideo() != asset.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(asset.getVideo())) || hasData() != asset.hasData()) {
                        return false;
                    }
                    if ((hasData() && !getData().equals(asset.getData())) || hasLink() != asset.hasLink()) {
                        return false;
                    }
                    if ((hasLink() && !getLink().equals(asset.getLink())) || hasExt() != asset.hasExt()) {
                        return false;
                    }
                    if ((!hasExt() || getExt().equals(asset.getExt())) && getExtProtoList().equals(asset.getExtProtoList()) && this.unknownFields.equals(asset.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId()) * 37) + 2) * 53) + Internal.hashBoolean(getReq());
                    if (hasTitle()) {
                        hashCode = (((hashCode * 37) + 3) * 53) + getTitle().hashCode();
                    }
                    if (hasImage()) {
                        hashCode = (((hashCode * 37) + 4) * 53) + getImage().hashCode();
                    }
                    if (hasVideo()) {
                        hashCode = (((hashCode * 37) + 5) * 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        hashCode = (((hashCode * 37) + 6) * 53) + getData().hashCode();
                    }
                    if (hasLink()) {
                        hashCode = (((hashCode * 37) + 7) * 53) + getLink().hashCode();
                    }
                    if (hasExt()) {
                        hashCode = (((hashCode * 37) + 9) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        hashCode = (((hashCode * 37) + 8) * 53) + getExtProtoList().hashCode();
                    }
                    int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode2;
                    return hashCode2;
                }

                public static Asset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Asset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static Asset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static Asset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static Asset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static Asset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Asset parseFrom(InputStream inputStream) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static Asset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Asset parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Asset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Asset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Asset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Asset parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Asset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Asset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(Asset asset) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(asset);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssetOrBuilder {
                    private int bitField0_;
                    private SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> dataBuilder_;
                    private DataAsset data_;
                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> imageBuilder_;
                    private ImageAsset image_;
                    private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> linkBuilder_;
                    private LinkAsset link_;
                    private boolean req_;
                    private SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> titleBuilder_;
                    private TitleAsset title_;
                    private SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> videoBuilder_;
                    private VideoAsset video_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_fieldAccessorTable.ensureFieldAccessorsInitialized(Asset.class, Builder.class);
                    }

                    private Builder() {
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        if (Asset.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder clear() {
                        super.clear();
                        this.id_ = 0;
                        this.req_ = false;
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
                        }
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_Asset_descriptor;
                    }

                    public Asset getDefaultInstanceForType() {
                        return Asset.getDefaultInstance();
                    }

                    public Asset build() {
                        Asset buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public Asset buildPartial() {
                        Asset asset = new Asset((GeneratedMessageV3.Builder) this);
                        int unused = asset.id_ = this.id_;
                        boolean unused2 = asset.req_ = this.req_;
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            TitleAsset unused3 = asset.title_ = this.title_;
                        } else {
                            TitleAsset unused4 = asset.title_ = singleFieldBuilderV3.build();
                        }
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV32 = this.imageBuilder_;
                        if (singleFieldBuilderV32 == null) {
                            ImageAsset unused5 = asset.image_ = this.image_;
                        } else {
                            ImageAsset unused6 = asset.image_ = singleFieldBuilderV32.build();
                        }
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV33 = this.videoBuilder_;
                        if (singleFieldBuilderV33 == null) {
                            VideoAsset unused7 = asset.video_ = this.video_;
                        } else {
                            VideoAsset unused8 = asset.video_ = singleFieldBuilderV33.build();
                        }
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV34 = this.dataBuilder_;
                        if (singleFieldBuilderV34 == null) {
                            DataAsset unused9 = asset.data_ = this.data_;
                        } else {
                            DataAsset unused10 = asset.data_ = singleFieldBuilderV34.build();
                        }
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV35 = this.linkBuilder_;
                        if (singleFieldBuilderV35 == null) {
                            LinkAsset unused11 = asset.link_ = this.link_;
                        } else {
                            LinkAsset unused12 = asset.link_ = singleFieldBuilderV35.build();
                        }
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV36 = this.extBuilder_;
                        if (singleFieldBuilderV36 == null) {
                            Struct unused13 = asset.ext_ = this.ext_;
                        } else {
                            Struct unused14 = asset.ext_ = singleFieldBuilderV36.build();
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            List unused15 = asset.extProto_ = this.extProto_;
                        } else {
                            List unused16 = asset.extProto_ = repeatedFieldBuilderV3.build();
                        }
                        onBuilt();
                        return asset;
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
                        if (message instanceof Asset) {
                            return mergeFrom((Asset) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Asset asset) {
                        if (asset == Asset.getDefaultInstance()) {
                            return this;
                        }
                        if (asset.getId() != 0) {
                            setId(asset.getId());
                        }
                        if (asset.getReq()) {
                            setReq(asset.getReq());
                        }
                        if (asset.hasTitle()) {
                            mergeTitle(asset.getTitle());
                        }
                        if (asset.hasImage()) {
                            mergeImage(asset.getImage());
                        }
                        if (asset.hasVideo()) {
                            mergeVideo(asset.getVideo());
                        }
                        if (asset.hasData()) {
                            mergeData(asset.getData());
                        }
                        if (asset.hasLink()) {
                            mergeLink(asset.getLink());
                        }
                        if (asset.hasExt()) {
                            mergeExt(asset.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!asset.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = asset.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(asset.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!asset.extProto_.isEmpty()) {
                            if (this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.dispose();
                                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                this.extProtoBuilder_ = null;
                                this.extProto_ = asset.extProto_;
                                this.bitField0_ &= -2;
                                if (Asset.alwaysUseFieldBuilders) {
                                    repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                }
                                this.extProtoBuilder_ = repeatedFieldBuilderV3;
                            } else {
                                this.extProtoBuilder_.addAllMessages(asset.extProto_);
                            }
                        }
                        mergeUnknownFields(asset.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            com.explorestack.protobuf.adcom.Ad$Display$Native$Asset r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native.Asset) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Asset.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Asset$Builder");
                    }

                    public int getId() {
                        return this.id_;
                    }

                    public Builder setId(int i) {
                        this.id_ = i;
                        onChanged();
                        return this;
                    }

                    public Builder clearId() {
                        this.id_ = 0;
                        onChanged();
                        return this;
                    }

                    public boolean getReq() {
                        return this.req_;
                    }

                    public Builder setReq(boolean z) {
                        this.req_ = z;
                        onChanged();
                        return this;
                    }

                    public Builder clearReq() {
                        this.req_ = false;
                        onChanged();
                        return this;
                    }

                    public boolean hasTitle() {
                        return (this.titleBuilder_ == null && this.title_ == null) ? false : true;
                    }

                    public TitleAsset getTitle() {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    public Builder setTitle(TitleAsset titleAsset) {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(titleAsset);
                        } else if (titleAsset != null) {
                            this.title_ = titleAsset;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setTitle(TitleAsset.Builder builder) {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.title_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeTitle(TitleAsset titleAsset) {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            TitleAsset titleAsset2 = this.title_;
                            if (titleAsset2 != null) {
                                this.title_ = TitleAsset.newBuilder(titleAsset2).mergeFrom(titleAsset).buildPartial();
                            } else {
                                this.title_ = titleAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(titleAsset);
                        }
                        return this;
                    }

                    public Builder clearTitle() {
                        if (this.titleBuilder_ == null) {
                            this.title_ = null;
                            onChanged();
                        } else {
                            this.title_ = null;
                            this.titleBuilder_ = null;
                        }
                        return this;
                    }

                    public TitleAsset.Builder getTitleBuilder() {
                        onChanged();
                        return getTitleFieldBuilder().getBuilder();
                    }

                    public TitleAssetOrBuilder getTitleOrBuilder() {
                        SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        TitleAsset titleAsset = this.title_;
                        return titleAsset == null ? TitleAsset.getDefaultInstance() : titleAsset;
                    }

                    private SingleFieldBuilderV3<TitleAsset, TitleAsset.Builder, TitleAssetOrBuilder> getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new SingleFieldBuilderV3<>(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    public boolean hasImage() {
                        return (this.imageBuilder_ == null && this.image_ == null) ? false : true;
                    }

                    public ImageAsset getImage() {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    public Builder setImage(ImageAsset imageAsset) {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(imageAsset);
                        } else if (imageAsset != null) {
                            this.image_ = imageAsset;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setImage(ImageAsset.Builder builder) {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.image_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeImage(ImageAsset imageAsset) {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            ImageAsset imageAsset2 = this.image_;
                            if (imageAsset2 != null) {
                                this.image_ = ImageAsset.newBuilder(imageAsset2).mergeFrom(imageAsset).buildPartial();
                            } else {
                                this.image_ = imageAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(imageAsset);
                        }
                        return this;
                    }

                    public Builder clearImage() {
                        if (this.imageBuilder_ == null) {
                            this.image_ = null;
                            onChanged();
                        } else {
                            this.image_ = null;
                            this.imageBuilder_ = null;
                        }
                        return this;
                    }

                    public ImageAsset.Builder getImageBuilder() {
                        onChanged();
                        return getImageFieldBuilder().getBuilder();
                    }

                    public ImageAssetOrBuilder getImageOrBuilder() {
                        SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> singleFieldBuilderV3 = this.imageBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        ImageAsset imageAsset = this.image_;
                        return imageAsset == null ? ImageAsset.getDefaultInstance() : imageAsset;
                    }

                    private SingleFieldBuilderV3<ImageAsset, ImageAsset.Builder, ImageAssetOrBuilder> getImageFieldBuilder() {
                        if (this.imageBuilder_ == null) {
                            this.imageBuilder_ = new SingleFieldBuilderV3<>(getImage(), getParentForChildren(), isClean());
                            this.image_ = null;
                        }
                        return this.imageBuilder_;
                    }

                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    public VideoAsset getVideo() {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    public Builder setVideo(VideoAsset videoAsset) {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(videoAsset);
                        } else if (videoAsset != null) {
                            this.video_ = videoAsset;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setVideo(VideoAsset.Builder builder) {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.video_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeVideo(VideoAsset videoAsset) {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            VideoAsset videoAsset2 = this.video_;
                            if (videoAsset2 != null) {
                                this.video_ = VideoAsset.newBuilder(videoAsset2).mergeFrom(videoAsset).buildPartial();
                            } else {
                                this.video_ = videoAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(videoAsset);
                        }
                        return this;
                    }

                    public Builder clearVideo() {
                        if (this.videoBuilder_ == null) {
                            this.video_ = null;
                            onChanged();
                        } else {
                            this.video_ = null;
                            this.videoBuilder_ = null;
                        }
                        return this;
                    }

                    public VideoAsset.Builder getVideoBuilder() {
                        onChanged();
                        return getVideoFieldBuilder().getBuilder();
                    }

                    public VideoAssetOrBuilder getVideoOrBuilder() {
                        SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        VideoAsset videoAsset = this.video_;
                        return videoAsset == null ? VideoAsset.getDefaultInstance() : videoAsset;
                    }

                    private SingleFieldBuilderV3<VideoAsset, VideoAsset.Builder, VideoAssetOrBuilder> getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new SingleFieldBuilderV3<>(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
                    }

                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    public DataAsset getData() {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    public Builder setData(DataAsset dataAsset) {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(dataAsset);
                        } else if (dataAsset != null) {
                            this.data_ = dataAsset;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setData(DataAsset.Builder builder) {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.data_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeData(DataAsset dataAsset) {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            DataAsset dataAsset2 = this.data_;
                            if (dataAsset2 != null) {
                                this.data_ = DataAsset.newBuilder(dataAsset2).mergeFrom(dataAsset).buildPartial();
                            } else {
                                this.data_ = dataAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(dataAsset);
                        }
                        return this;
                    }

                    public Builder clearData() {
                        if (this.dataBuilder_ == null) {
                            this.data_ = null;
                            onChanged();
                        } else {
                            this.data_ = null;
                            this.dataBuilder_ = null;
                        }
                        return this;
                    }

                    public DataAsset.Builder getDataBuilder() {
                        onChanged();
                        return getDataFieldBuilder().getBuilder();
                    }

                    public DataAssetOrBuilder getDataOrBuilder() {
                        SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        DataAsset dataAsset = this.data_;
                        return dataAsset == null ? DataAsset.getDefaultInstance() : dataAsset;
                    }

                    private SingleFieldBuilderV3<DataAsset, DataAsset.Builder, DataAssetOrBuilder> getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new SingleFieldBuilderV3<>(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
                    }

                    public boolean hasLink() {
                        return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                    }

                    public LinkAsset getLink() {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    public Builder setLink(LinkAsset linkAsset) {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(linkAsset);
                        } else if (linkAsset != null) {
                            this.link_ = linkAsset;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setLink(LinkAsset.Builder builder) {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.link_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeLink(LinkAsset linkAsset) {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            LinkAsset linkAsset2 = this.link_;
                            if (linkAsset2 != null) {
                                this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                            } else {
                                this.link_ = linkAsset;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(linkAsset);
                        }
                        return this;
                    }

                    public Builder clearLink() {
                        if (this.linkBuilder_ == null) {
                            this.link_ = null;
                            onChanged();
                        } else {
                            this.link_ = null;
                            this.linkBuilder_ = null;
                        }
                        return this;
                    }

                    public LinkAsset.Builder getLinkBuilder() {
                        onChanged();
                        return getLinkFieldBuilder().getBuilder();
                    }

                    public LinkAssetOrBuilder getLinkOrBuilder() {
                        SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        LinkAsset linkAsset = this.link_;
                        return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                    }

                    private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> getLinkFieldBuilder() {
                        if (this.linkBuilder_ == null) {
                            this.linkBuilder_ = new SingleFieldBuilderV3<>(getLink(), getParentForChildren(), isClean());
                            this.link_ = null;
                        }
                        return this.linkBuilder_;
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

                public static Asset getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<Asset> parser() {
                    return PARSER;
                }

                public Parser<Asset> getParserForType() {
                    return PARSER;
                }

                public Asset getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            public boolean hasLink() {
                return this.link_ != null;
            }

            public LinkAsset getLink() {
                LinkAsset linkAsset = this.link_;
                return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
            }

            public LinkAssetOrBuilder getLinkOrBuilder() {
                return getLink();
            }

            public List<Asset> getAssetList() {
                return this.asset_;
            }

            public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            public int getAssetCount() {
                return this.asset_.size();
            }

            public Asset getAsset(int i) {
                return this.asset_.get(i);
            }

            public AssetOrBuilder getAssetOrBuilder(int i) {
                return this.asset_.get(i);
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
                if (this.link_ != null) {
                    codedOutputStream.writeMessage(1, getLink());
                }
                for (int i = 0; i < this.asset_.size(); i++) {
                    codedOutputStream.writeMessage(2, this.asset_.get(i));
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    codedOutputStream.writeMessage(3, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(4, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeMessageSize = this.link_ != null ? CodedOutputStream.computeMessageSize(1, getLink()) + 0 : 0;
                for (int i2 = 0; i2 < this.asset_.size(); i2++) {
                    computeMessageSize += CodedOutputStream.computeMessageSize(2, this.asset_.get(i2));
                }
                for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                    computeMessageSize += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i3));
                }
                if (this.ext_ != null) {
                    computeMessageSize += CodedOutputStream.computeMessageSize(4, getExt());
                }
                int serializedSize = computeMessageSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Native)) {
                    return super.equals(obj);
                }
                Native nativeR = (Native) obj;
                if (hasLink() != nativeR.hasLink()) {
                    return false;
                }
                if ((hasLink() && !getLink().equals(nativeR.getLink())) || !getAssetList().equals(nativeR.getAssetList()) || hasExt() != nativeR.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(nativeR.getExt())) && getExtProtoList().equals(nativeR.getExtProtoList()) && this.unknownFields.equals(nativeR.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + getDescriptor().hashCode();
                if (hasLink()) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getLink().hashCode();
                }
                if (getAssetCount() > 0) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getAssetList().hashCode();
                }
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static Native parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Native parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Native parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Native parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Native parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Native parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Native parseFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Native parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Native parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Native) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Native parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Native parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Native parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Native) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Native nativeR) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(nativeR);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NativeOrBuilder {
                private RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> assetBuilder_;
                private List<Asset> asset_;
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> linkBuilder_;
                private LinkAsset link_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_fieldAccessorTable.ensureFieldAccessorsInitialized(Native.class, Builder.class);
                }

                private Builder() {
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.asset_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Native.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.asset_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
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
                        this.bitField0_ &= -3;
                    } else {
                        repeatedFieldBuilderV32.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_Native_descriptor;
                }

                public Native getDefaultInstanceForType() {
                    return Native.getDefaultInstance();
                }

                public Native build() {
                    Native buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Native buildPartial() {
                    Native nativeR = new Native((GeneratedMessageV3.Builder) this);
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        LinkAsset unused = nativeR.link_ = this.link_;
                    } else {
                        LinkAsset unused2 = nativeR.link_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        List unused3 = nativeR.asset_ = this.asset_;
                    } else {
                        List unused4 = nativeR.asset_ = repeatedFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        Struct unused5 = nativeR.ext_ = this.ext_;
                    } else {
                        Struct unused6 = nativeR.ext_ = singleFieldBuilderV32.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        List unused7 = nativeR.extProto_ = this.extProto_;
                    } else {
                        List unused8 = nativeR.extProto_ = repeatedFieldBuilderV32.build();
                    }
                    onBuilt();
                    return nativeR;
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
                    if (message instanceof Native) {
                        return mergeFrom((Native) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Native nativeR) {
                    if (nativeR == Native.getDefaultInstance()) {
                        return this;
                    }
                    if (nativeR.hasLink()) {
                        mergeLink(nativeR.getLink());
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                    if (this.assetBuilder_ == null) {
                        if (!nativeR.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = nativeR.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(nativeR.asset_);
                            }
                            onChanged();
                        }
                    } else if (!nativeR.asset_.isEmpty()) {
                        if (this.assetBuilder_.isEmpty()) {
                            this.assetBuilder_.dispose();
                            this.assetBuilder_ = null;
                            this.asset_ = nativeR.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = Native.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        } else {
                            this.assetBuilder_.addAllMessages(nativeR.asset_);
                        }
                    }
                    if (nativeR.hasExt()) {
                        mergeExt(nativeR.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!nativeR.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = nativeR.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(nativeR.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!nativeR.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = nativeR.extProto_;
                            this.bitField0_ &= -3;
                            if (Native.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(nativeR.extProto_);
                        }
                    }
                    mergeUnknownFields(nativeR.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Ad.Display.Native.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.Native.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Ad$Display$Native r3 = (com.explorestack.protobuf.adcom.Ad.Display.Native) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Ad$Display$Native r4 = (com.explorestack.protobuf.adcom.Ad.Display.Native) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display.Native) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Native.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Native$Builder");
                }

                public boolean hasLink() {
                    return (this.linkBuilder_ == null && this.link_ == null) ? false : true;
                }

                public LinkAsset getLink() {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                public Builder setLink(LinkAsset linkAsset) {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(linkAsset);
                    } else if (linkAsset != null) {
                        this.link_ = linkAsset;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setLink(LinkAsset.Builder builder) {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.link_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeLink(LinkAsset linkAsset) {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        LinkAsset linkAsset2 = this.link_;
                        if (linkAsset2 != null) {
                            this.link_ = LinkAsset.newBuilder(linkAsset2).mergeFrom(linkAsset).buildPartial();
                        } else {
                            this.link_ = linkAsset;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(linkAsset);
                    }
                    return this;
                }

                public Builder clearLink() {
                    if (this.linkBuilder_ == null) {
                        this.link_ = null;
                        onChanged();
                    } else {
                        this.link_ = null;
                        this.linkBuilder_ = null;
                    }
                    return this;
                }

                public LinkAsset.Builder getLinkBuilder() {
                    onChanged();
                    return getLinkFieldBuilder().getBuilder();
                }

                public LinkAssetOrBuilder getLinkOrBuilder() {
                    SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> singleFieldBuilderV3 = this.linkBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    LinkAsset linkAsset = this.link_;
                    return linkAsset == null ? LinkAsset.getDefaultInstance() : linkAsset;
                }

                private SingleFieldBuilderV3<LinkAsset, LinkAsset.Builder, LinkAssetOrBuilder> getLinkFieldBuilder() {
                    if (this.linkBuilder_ == null) {
                        this.linkBuilder_ = new SingleFieldBuilderV3<>(getLink(), getParentForChildren(), isClean());
                        this.link_ = null;
                    }
                    return this.linkBuilder_;
                }

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<Asset> getAssetList() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.asset_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getAssetCount() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Asset getAsset(int i) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setAsset(int i, Asset asset) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, asset);
                    } else if (asset != null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i, asset);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setAsset(int i, Asset.Builder builder) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAsset(Asset asset) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(asset);
                    } else if (asset != null) {
                        ensureAssetIsMutable();
                        this.asset_.add(asset);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addAsset(int i, Asset asset) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, asset);
                    } else if (asset != null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i, asset);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addAsset(Asset.Builder builder) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addAsset(int i, Asset.Builder builder) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllAsset(Iterable<? extends Asset> iterable) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.asset_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearAsset() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.asset_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeAsset(int i) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Asset.Builder getAssetBuilder(int i) {
                    return getAssetFieldBuilder().getBuilder(i);
                }

                public AssetOrBuilder getAssetOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AssetOrBuilder> getAssetOrBuilderList() {
                    RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.asset_);
                }

                public Asset.Builder addAssetBuilder() {
                    return getAssetFieldBuilder().addBuilder(Asset.getDefaultInstance());
                }

                public Asset.Builder addAssetBuilder(int i) {
                    return getAssetFieldBuilder().addBuilder(i, Asset.getDefaultInstance());
                }

                public List<Asset.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Asset, Asset.Builder, AssetOrBuilder> getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        List<Asset> list = this.asset_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.assetBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.asset_ = null;
                    }
                    return this.assetBuilder_;
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
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
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
                        this.bitField0_ &= -3;
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
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
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

            public static Native getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Native> parser() {
                return PARSER;
            }

            public Parser<Native> getParserForType() {
                return PARSER;
            }

            public Native getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public ProtocolStringList getMimeList() {
            return this.mime_;
        }

        public int getMimeCount() {
            return this.mime_.size();
        }

        public String getMime(int i) {
            return (String) this.mime_.get(i);
        }

        public ByteString getMimeBytes(int i) {
            return this.mime_.getByteString(i);
        }

        public List<ApiFramework> getApiList() {
            return new Internal.ListAdapter(this.api_, api_converter_);
        }

        public int getApiCount() {
            return this.api_.size();
        }

        public ApiFramework getApi(int i) {
            return api_converter_.convert(this.api_.get(i));
        }

        public List<Integer> getApiValueList() {
            return this.api_;
        }

        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
        }

        public List<DisplayCreativeType> getTypeList() {
            return new Internal.ListAdapter(this.type_, type_converter_);
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        public DisplayCreativeType getType(int i) {
            return type_converter_.convert(this.type_.get(i));
        }

        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        public int getTypeValue(int i) {
            return this.type_.get(i).intValue();
        }

        public int getW() {
            return this.w_;
        }

        public int getH() {
            return this.h_;
        }

        public int getWratio() {
            return this.wratio_;
        }

        public int getHratio() {
            return this.hratio_;
        }

        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasBanner() {
            return this.banner_ != null;
        }

        public Banner getBanner() {
            Banner banner = this.banner_;
            return banner == null ? Banner.getDefaultInstance() : banner;
        }

        public BannerOrBuilder getBannerOrBuilder() {
            return getBanner();
        }

        public boolean hasNative() {
            return this.native_ != null;
        }

        public Native getNative() {
            Native nativeR = this.native_;
            return nativeR == null ? Native.getDefaultInstance() : nativeR;
        }

        public NativeOrBuilder getNativeOrBuilder() {
            return getNative();
        }

        public List<Event> getEventList() {
            return this.event_;
        }

        public List<? extends EventOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        public int getEventCount() {
            return this.event_.size();
        }

        public Event getEvent(int i) {
            return this.event_.get(i);
        }

        public EventOrBuilder getEventOrBuilder(int i) {
            return this.event_.get(i);
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
            getSerializedSize();
            for (int i = 0; i < this.mime_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.mime_.getRaw(i));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.api_.size(); i2++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i2).intValue());
            }
            if (getTypeList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.typeMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.type_.size(); i3++) {
                codedOutputStream.writeEnumNoTag(this.type_.get(i3).intValue());
            }
            int i4 = this.w_;
            if (i4 != 0) {
                codedOutputStream.writeUInt32(4, i4);
            }
            int i5 = this.h_;
            if (i5 != 0) {
                codedOutputStream.writeUInt32(5, i5);
            }
            int i6 = this.wratio_;
            if (i6 != 0) {
                codedOutputStream.writeUInt32(6, i6);
            }
            int i7 = this.hratio_;
            if (i7 != 0) {
                codedOutputStream.writeUInt32(7, i7);
            }
            if (!getAdmBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.curl_);
            }
            if (this.banner_ != null) {
                codedOutputStream.writeMessage(10, getBanner());
            }
            if (this.native_ != null) {
                codedOutputStream.writeMessage(11, getNative());
            }
            for (int i8 = 0; i8 < this.event_.size(); i8++) {
                codedOutputStream.writeMessage(12, this.event_.get(i8));
            }
            for (int i9 = 0; i9 < this.extProto_.size(); i9++) {
                codedOutputStream.writeMessage(13, this.extProto_.get(i9));
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
            int i2 = 0;
            for (int i3 = 0; i3 < this.mime_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.mime_.getRaw(i3));
            }
            int size = i2 + 0 + (getMimeList().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.api_.size(); i5++) {
                i4 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i5).intValue());
            }
            int i6 = size + i4;
            if (!getApiList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i4);
            }
            this.apiMemoizedSerializedSize = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < this.type_.size(); i8++) {
                i7 += CodedOutputStream.computeEnumSizeNoTag(this.type_.get(i8).intValue());
            }
            int i9 = i6 + i7;
            if (!getTypeList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i7);
            }
            this.typeMemoizedSerializedSize = i7;
            int i10 = this.w_;
            if (i10 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(4, i10);
            }
            int i11 = this.h_;
            if (i11 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(5, i11);
            }
            int i12 = this.wratio_;
            if (i12 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(6, i12);
            }
            int i13 = this.hratio_;
            if (i13 != 0) {
                i9 += CodedOutputStream.computeUInt32Size(7, i13);
            }
            if (!getAdmBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(8, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(9, this.curl_);
            }
            if (this.banner_ != null) {
                i9 += CodedOutputStream.computeMessageSize(10, getBanner());
            }
            if (this.native_ != null) {
                i9 += CodedOutputStream.computeMessageSize(11, getNative());
            }
            for (int i14 = 0; i14 < this.event_.size(); i14++) {
                i9 += CodedOutputStream.computeMessageSize(12, this.event_.get(i14));
            }
            for (int i15 = 0; i15 < this.extProto_.size(); i15++) {
                i9 += CodedOutputStream.computeMessageSize(13, this.extProto_.get(i15));
            }
            if (this.ext_ != null) {
                i9 += CodedOutputStream.computeMessageSize(14, getExt());
            }
            int serializedSize = i9 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Display)) {
                return super.equals(obj);
            }
            Display display = (Display) obj;
            if (!getMimeList().equals(display.getMimeList()) || !this.api_.equals(display.api_) || !this.type_.equals(display.type_) || getW() != display.getW() || getH() != display.getH() || getWratio() != display.getWratio() || getHratio() != display.getHratio() || !getAdm().equals(display.getAdm()) || !getCurl().equals(display.getCurl()) || hasBanner() != display.hasBanner()) {
                return false;
            }
            if ((hasBanner() && !getBanner().equals(display.getBanner())) || hasNative() != display.hasNative()) {
                return false;
            }
            if ((hasNative() && !getNative().equals(display.getNative())) || !getEventList().equals(display.getEventList()) || hasExt() != display.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(display.getExt())) && getExtProtoList().equals(display.getExtProtoList()) && this.unknownFields.equals(display.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getMimeCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int w = (((((((((((((((((((((((hashCode * 37) + 4) * 53) + getW()) * 37) + 5) * 53) + getH()) * 37) + 6) * 53) + getWratio()) * 37) + 7) * 53) + getHratio()) * 37) + 8) * 53) + getAdm().hashCode()) * 37) + 9) * 53) + getCurl().hashCode();
            if (hasBanner()) {
                w = (((w * 37) + 10) * 53) + getBanner().hashCode();
            }
            if (hasNative()) {
                w = (((w * 37) + 11) * 53) + getNative().hashCode();
            }
            if (getEventCount() > 0) {
                w = (((w * 37) + 12) * 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                w = (((w * 37) + 14) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                w = (((w * 37) + 13) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (w * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Display parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Display parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Display parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Display parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Display parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Display parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Display parseFrom(InputStream inputStream) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Display parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Display parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Display) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Display parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Display) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Display parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Display parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Display) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Display display) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(display);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisplayOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> bannerBuilder_;
            private Banner banner_;
            private int bitField0_;
            private Object curl_;
            private RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> eventBuilder_;
            private List<Event> event_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int hratio_;
            private LazyStringList mime_;
            private SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> nativeBuilder_;
            private Native native_;
            private List<Integer> type_;
            private int w_;
            private int wratio_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_fieldAccessorTable.ensureFieldAccessorsInitialized(Display.class, Builder.class);
            }

            private Builder() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Display.alwaysUseFieldBuilders) {
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.w_ = 0;
                this.h_ = 0;
                this.wratio_ = 0;
                this.hratio_ = 0;
                this.adm_ = "";
                this.curl_ = "";
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    repeatedFieldBuilderV3.clear();
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
                    this.bitField0_ &= -17;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Display_descriptor;
            }

            public Display getDefaultInstanceForType() {
                return Display.getDefaultInstance();
            }

            public Display build() {
                Display buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Display buildPartial() {
                Display display = new Display((GeneratedMessageV3.Builder) this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused = display.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                List unused2 = display.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                List unused3 = display.type_ = this.type_;
                int unused4 = display.w_ = this.w_;
                int unused5 = display.h_ = this.h_;
                int unused6 = display.wratio_ = this.wratio_;
                int unused7 = display.hratio_ = this.hratio_;
                Object unused8 = display.adm_ = this.adm_;
                Object unused9 = display.curl_ = this.curl_;
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Banner unused10 = display.banner_ = this.banner_;
                } else {
                    Banner unused11 = display.banner_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV32 = this.nativeBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Native unused12 = display.native_ = this.native_;
                } else {
                    Native unused13 = display.native_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -9;
                    }
                    List unused14 = display.event_ = this.event_;
                } else {
                    List unused15 = display.event_ = repeatedFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV33 = this.extBuilder_;
                if (singleFieldBuilderV33 == null) {
                    Struct unused16 = display.ext_ = this.ext_;
                } else {
                    Struct unused17 = display.ext_ = singleFieldBuilderV33.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -17;
                    }
                    List unused18 = display.extProto_ = this.extProto_;
                } else {
                    List unused19 = display.extProto_ = repeatedFieldBuilderV32.build();
                }
                onBuilt();
                return display;
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
                if (message instanceof Display) {
                    return mergeFrom((Display) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Display display) {
                if (display == Display.getDefaultInstance()) {
                    return this;
                }
                if (!display.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = display.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(display.mime_);
                    }
                    onChanged();
                }
                if (!display.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = display.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(display.api_);
                    }
                    onChanged();
                }
                if (!display.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = display.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(display.type_);
                    }
                    onChanged();
                }
                if (display.getW() != 0) {
                    setW(display.getW());
                }
                if (display.getH() != 0) {
                    setH(display.getH());
                }
                if (display.getWratio() != 0) {
                    setWratio(display.getWratio());
                }
                if (display.getHratio() != 0) {
                    setHratio(display.getHratio());
                }
                if (!display.getAdm().isEmpty()) {
                    this.adm_ = display.adm_;
                    onChanged();
                }
                if (!display.getCurl().isEmpty()) {
                    this.curl_ = display.curl_;
                    onChanged();
                }
                if (display.hasBanner()) {
                    mergeBanner(display.getBanner());
                }
                if (display.hasNative()) {
                    mergeNative(display.getNative());
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                if (this.eventBuilder_ == null) {
                    if (!display.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = display.event_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(display.event_);
                        }
                        onChanged();
                    }
                } else if (!display.event_.isEmpty()) {
                    if (this.eventBuilder_.isEmpty()) {
                        this.eventBuilder_.dispose();
                        this.eventBuilder_ = null;
                        this.event_ = display.event_;
                        this.bitField0_ &= -9;
                        this.eventBuilder_ = Display.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    } else {
                        this.eventBuilder_.addAllMessages(display.event_);
                    }
                }
                if (display.hasExt()) {
                    mergeExt(display.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!display.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = display.extProto_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(display.extProto_);
                        }
                        onChanged();
                    }
                } else if (!display.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = display.extProto_;
                        this.bitField0_ &= -17;
                        if (Display.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(display.extProto_);
                    }
                }
                mergeUnknownFields(display.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Ad.Display.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Display.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Ad$Display r3 = (com.explorestack.protobuf.adcom.Ad.Display) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Ad$Display r4 = (com.explorestack.protobuf.adcom.Ad.Display) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Display) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Display.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Display$Builder");
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new LazyStringArrayList(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            public int getMimeCount() {
                return this.mime_.size();
            }

            public String getMime(int i) {
                return (String) this.mime_.get(i);
            }

            public ByteString getMimeBytes(int i) {
                return this.mime_.getByteString(i);
            }

            public Builder setMime(int i, String str) {
                if (str != null) {
                    ensureMimeIsMutable();
                    this.mime_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addMime(String str) {
                if (str != null) {
                    ensureMimeIsMutable();
                    this.mime_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.mime_);
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                if (byteString != null) {
                    Display.checkByteStringIsUtf8(byteString);
                    ensureMimeIsMutable();
                    this.mime_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            public List<ApiFramework> getApiList() {
                return new Internal.ListAdapter(this.api_, Display.api_converter_);
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public ApiFramework getApi(int i) {
                return (ApiFramework) Display.api_converter_.convert(this.api_.get(i));
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                if (apiFramework != null) {
                    ensureApiIsMutable();
                    this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addApi(ApiFramework apiFramework) {
                if (apiFramework != null) {
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                for (ApiFramework number : iterable) {
                    this.api_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer intValue : iterable) {
                    this.api_.add(Integer.valueOf(intValue.intValue()));
                }
                onChanged();
                return this;
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            public List<DisplayCreativeType> getTypeList() {
                return new Internal.ListAdapter(this.type_, Display.type_converter_);
            }

            public int getTypeCount() {
                return this.type_.size();
            }

            public DisplayCreativeType getType(int i) {
                return (DisplayCreativeType) Display.type_converter_.convert(this.type_.get(i));
            }

            public Builder setType(int i, DisplayCreativeType displayCreativeType) {
                if (displayCreativeType != null) {
                    ensureTypeIsMutable();
                    this.type_.set(i, Integer.valueOf(displayCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addType(DisplayCreativeType displayCreativeType) {
                if (displayCreativeType != null) {
                    ensureTypeIsMutable();
                    this.type_.add(Integer.valueOf(displayCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllType(Iterable<? extends DisplayCreativeType> iterable) {
                ensureTypeIsMutable();
                for (DisplayCreativeType number : iterable) {
                    this.type_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            public int getTypeValue(int i) {
                return this.type_.get(i).intValue();
            }

            public Builder setTypeValue(int i, int i2) {
                ensureTypeIsMutable();
                this.type_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer intValue : iterable) {
                    this.type_.add(Integer.valueOf(intValue.intValue()));
                }
                onChanged();
                return this;
            }

            public int getW() {
                return this.w_;
            }

            public Builder setW(int i) {
                this.w_ = i;
                onChanged();
                return this;
            }

            public Builder clearW() {
                this.w_ = 0;
                onChanged();
                return this;
            }

            public int getH() {
                return this.h_;
            }

            public Builder setH(int i) {
                this.h_ = i;
                onChanged();
                return this;
            }

            public Builder clearH() {
                this.h_ = 0;
                onChanged();
                return this;
            }

            public int getWratio() {
                return this.wratio_;
            }

            public Builder setWratio(int i) {
                this.wratio_ = i;
                onChanged();
                return this;
            }

            public Builder clearWratio() {
                this.wratio_ = 0;
                onChanged();
                return this;
            }

            public int getHratio() {
                return this.hratio_;
            }

            public Builder setHratio(int i) {
                this.hratio_ = i;
                onChanged();
                return this;
            }

            public Builder clearHratio() {
                this.hratio_ = 0;
                onChanged();
                return this;
            }

            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAdm(String str) {
                if (str != null) {
                    this.adm_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAdm() {
                this.adm_ = Display.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                if (byteString != null) {
                    Display.checkByteStringIsUtf8(byteString);
                    this.adm_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCurl(String str) {
                if (str != null) {
                    this.curl_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCurl() {
                this.curl_ = Display.getDefaultInstance().getCurl();
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                if (byteString != null) {
                    Display.checkByteStringIsUtf8(byteString);
                    this.curl_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasBanner() {
                return (this.bannerBuilder_ == null && this.banner_ == null) ? false : true;
            }

            public Banner getBanner() {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            public Builder setBanner(Banner banner) {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(banner);
                } else if (banner != null) {
                    this.banner_ = banner;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setBanner(Banner.Builder builder) {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.banner_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeBanner(Banner banner) {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Banner banner2 = this.banner_;
                    if (banner2 != null) {
                        this.banner_ = Banner.newBuilder(banner2).mergeFrom(banner).buildPartial();
                    } else {
                        this.banner_ = banner;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(banner);
                }
                return this;
            }

            public Builder clearBanner() {
                if (this.bannerBuilder_ == null) {
                    this.banner_ = null;
                    onChanged();
                } else {
                    this.banner_ = null;
                    this.bannerBuilder_ = null;
                }
                return this;
            }

            public Banner.Builder getBannerBuilder() {
                onChanged();
                return getBannerFieldBuilder().getBuilder();
            }

            public BannerOrBuilder getBannerOrBuilder() {
                SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> singleFieldBuilderV3 = this.bannerBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Banner banner = this.banner_;
                return banner == null ? Banner.getDefaultInstance() : banner;
            }

            private SingleFieldBuilderV3<Banner, Banner.Builder, BannerOrBuilder> getBannerFieldBuilder() {
                if (this.bannerBuilder_ == null) {
                    this.bannerBuilder_ = new SingleFieldBuilderV3<>(getBanner(), getParentForChildren(), isClean());
                    this.banner_ = null;
                }
                return this.bannerBuilder_;
            }

            public boolean hasNative() {
                return (this.nativeBuilder_ == null && this.native_ == null) ? false : true;
            }

            public Native getNative() {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Native nativeR = this.native_;
                return nativeR == null ? Native.getDefaultInstance() : nativeR;
            }

            public Builder setNative(Native nativeR) {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(nativeR);
                } else if (nativeR != null) {
                    this.native_ = nativeR;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setNative(Native.Builder builder) {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.native_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeNative(Native nativeR) {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Native nativeR2 = this.native_;
                    if (nativeR2 != null) {
                        this.native_ = Native.newBuilder(nativeR2).mergeFrom(nativeR).buildPartial();
                    } else {
                        this.native_ = nativeR;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(nativeR);
                }
                return this;
            }

            public Builder clearNative() {
                if (this.nativeBuilder_ == null) {
                    this.native_ = null;
                    onChanged();
                } else {
                    this.native_ = null;
                    this.nativeBuilder_ = null;
                }
                return this;
            }

            public Native.Builder getNativeBuilder() {
                onChanged();
                return getNativeFieldBuilder().getBuilder();
            }

            public NativeOrBuilder getNativeOrBuilder() {
                SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> singleFieldBuilderV3 = this.nativeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Native nativeR = this.native_;
                return nativeR == null ? Native.getDefaultInstance() : nativeR;
            }

            private SingleFieldBuilderV3<Native, Native.Builder, NativeOrBuilder> getNativeFieldBuilder() {
                if (this.nativeBuilder_ == null) {
                    this.nativeBuilder_ = new SingleFieldBuilderV3<>(getNative(), getParentForChildren(), isClean());
                    this.native_ = null;
                }
                return this.nativeBuilder_;
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 8;
                }
            }

            public List<Event> getEventList() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.event_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getEventCount() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Event getEvent(int i) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setEvent(int i, Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, event);
                } else if (event != null) {
                    ensureEventIsMutable();
                    this.event_.set(i, event);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setEvent(int i, Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addEvent(Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(event);
                } else if (event != null) {
                    ensureEventIsMutable();
                    this.event_.add(event);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addEvent(int i, Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, event);
                } else if (event != null) {
                    ensureEventIsMutable();
                    this.event_.add(i, event);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addEvent(Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addEvent(int i, Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllEvent(Iterable<? extends Event> iterable) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.event_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearEvent() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeEvent(int i) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Event.Builder getEventBuilder(int i) {
                return getEventFieldBuilder().getBuilder(i);
            }

            public EventOrBuilder getEventOrBuilder(int i) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends EventOrBuilder> getEventOrBuilderList() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.event_);
            }

            public Event.Builder addEventBuilder() {
                return getEventFieldBuilder().addBuilder(Event.getDefaultInstance());
            }

            public Event.Builder addEventBuilder(int i) {
                return getEventFieldBuilder().addBuilder(i, Event.getDefaultInstance());
            }

            public List<Event.Builder> getEventBuilderList() {
                return getEventFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new RepeatedFieldBuilderV3<>(this.event_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.event_ = null;
                }
                return this.eventBuilder_;
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
                if ((this.bitField0_ & 16) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 16;
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
                    this.bitField0_ &= -17;
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
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
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

        public static Display getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Display> parser() {
            return PARSER;
        }

        public Parser<Display> getParserForType() {
            return PARSER;
        }

        public Display getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Video extends GeneratedMessageV3 implements VideoOrBuilder {
        public static final int ADM_FIELD_NUMBER = 4;
        public static final int API_FIELD_NUMBER = 2;
        public static final int CURL_FIELD_NUMBER = 5;
        private static final Video DEFAULT_INSTANCE = new Video();
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int MIME_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Parser<Video> PARSER = new AbstractParser<Video>() {
            public Video parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Video(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TYPE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() {
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, VideoCreativeType> type_converter_ = new Internal.ListAdapter.Converter<Integer, VideoCreativeType>() {
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType valueOf = VideoCreativeType.valueOf(num.intValue());
                return valueOf == null ? VideoCreativeType.UNRECOGNIZED : valueOf;
            }
        };
        /* access modifiers changed from: private */
        public volatile Object adm_;
        private int apiMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> api_;
        /* access modifiers changed from: private */
        public volatile Object curl_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public LazyStringList mime_;
        private int typeMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> type_;

        private Video(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Video() {
            this.memoizedIsInitialized = -1;
            this.mime_ = LazyStringArrayList.EMPTY;
            this.api_ = Collections.emptyList();
            this.type_ = Collections.emptyList();
            this.adm_ = "";
            this.curl_ = "";
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Video();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Video(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.mime_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.mime_.add(readStringRequireUtf8);
                            } else if (readTag == 16) {
                                int readEnum = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.api_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                            } else if (readTag == 18) {
                                int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum2 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.api_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.api_.add(Integer.valueOf(readEnum2));
                                }
                                codedInputStream.popLimit(pushLimit);
                            } else if (readTag == 24) {
                                int readEnum3 = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.type_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.type_.add(Integer.valueOf(readEnum3));
                            } else if (readTag == 26) {
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.type_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.type_.add(Integer.valueOf(readEnum4));
                                }
                                codedInputStream.popLimit(pushLimit2);
                            } else if (readTag == 34) {
                                this.adm_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.curl_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 58) {
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
                            this.mime_ = this.mime_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.api_ = Collections.unmodifiableList(this.api_);
                        }
                        if (z2 && true) {
                            this.type_ = Collections.unmodifiableList(this.type_);
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
                    this.mime_ = this.mime_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                }
                if (z2 && true) {
                    this.type_ = Collections.unmodifiableList(this.type_);
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
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_fieldAccessorTable.ensureFieldAccessorsInitialized(Video.class, Builder.class);
        }

        public ProtocolStringList getMimeList() {
            return this.mime_;
        }

        public int getMimeCount() {
            return this.mime_.size();
        }

        public String getMime(int i) {
            return (String) this.mime_.get(i);
        }

        public ByteString getMimeBytes(int i) {
            return this.mime_.getByteString(i);
        }

        public List<ApiFramework> getApiList() {
            return new Internal.ListAdapter(this.api_, api_converter_);
        }

        public int getApiCount() {
            return this.api_.size();
        }

        public ApiFramework getApi(int i) {
            return api_converter_.convert(this.api_.get(i));
        }

        public List<Integer> getApiValueList() {
            return this.api_;
        }

        public int getApiValue(int i) {
            return this.api_.get(i).intValue();
        }

        public List<VideoCreativeType> getTypeList() {
            return new Internal.ListAdapter(this.type_, type_converter_);
        }

        public int getTypeCount() {
            return this.type_.size();
        }

        public VideoCreativeType getType(int i) {
            return type_converter_.convert(this.type_.get(i));
        }

        public List<Integer> getTypeValueList() {
            return this.type_;
        }

        public int getTypeValue(int i) {
            return this.type_.get(i).intValue();
        }

        public String getAdm() {
            Object obj = this.adm_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.adm_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getAdmBytes() {
            Object obj = this.adm_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.adm_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getCurl() {
            Object obj = this.curl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.curl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCurlBytes() {
            Object obj = this.curl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.curl_ = copyFromUtf8;
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
            getSerializedSize();
            for (int i = 0; i < this.mime_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.mime_.getRaw(i));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.api_.size(); i2++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i2).intValue());
            }
            if (getTypeList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.typeMemoizedSerializedSize);
            }
            for (int i3 = 0; i3 < this.type_.size(); i3++) {
                codedOutputStream.writeEnumNoTag(this.type_.get(i3).intValue());
            }
            if (!getAdmBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.curl_);
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                codedOutputStream.writeMessage(6, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.mime_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.mime_.getRaw(i3));
            }
            int size = i2 + 0 + (getMimeList().size() * 1);
            int i4 = 0;
            for (int i5 = 0; i5 < this.api_.size(); i5++) {
                i4 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i5).intValue());
            }
            int i6 = size + i4;
            if (!getApiList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i4);
            }
            this.apiMemoizedSerializedSize = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < this.type_.size(); i8++) {
                i7 += CodedOutputStream.computeEnumSizeNoTag(this.type_.get(i8).intValue());
            }
            int i9 = i6 + i7;
            if (!getTypeList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i7);
            }
            this.typeMemoizedSerializedSize = i7;
            if (!getAdmBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(4, this.adm_);
            }
            if (!getCurlBytes().isEmpty()) {
                i9 += GeneratedMessageV3.computeStringSize(5, this.curl_);
            }
            for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                i9 += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i10));
            }
            if (this.ext_ != null) {
                i9 += CodedOutputStream.computeMessageSize(7, getExt());
            }
            int serializedSize = i9 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return super.equals(obj);
            }
            Video video = (Video) obj;
            if (!getMimeList().equals(video.getMimeList()) || !this.api_.equals(video.api_) || !this.type_.equals(video.type_) || !getAdm().equals(video.getAdm()) || !getCurl().equals(video.getCurl()) || hasExt() != video.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(video.getExt())) && getExtProtoList().equals(video.getExtProtoList()) && this.unknownFields.equals(video.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + getDescriptor().hashCode();
            if (getMimeCount() > 0) {
                hashCode = (((hashCode * 37) + 1) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.api_.hashCode();
            }
            if (getTypeCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.type_.hashCode();
            }
            int hashCode2 = (((((((hashCode * 37) + 4) * 53) + getAdm().hashCode()) * 37) + 5) * 53) + getCurl().hashCode();
            if (hasExt()) {
                hashCode2 = (((hashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }

        public static Video parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Video parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Video parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Video parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Video parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Video parseFrom(InputStream inputStream) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Video parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Video parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Video) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Video parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Video) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Video parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Video parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Video) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Video video) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(video);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VideoOrBuilder {
            private Object adm_;
            private List<Integer> api_;
            private int bitField0_;
            private Object curl_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private LazyStringList mime_;
            private List<Integer> type_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_fieldAccessorTable.ensureFieldAccessorsInitialized(Video.class, Builder.class);
            }

            private Builder() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.type_ = Collections.emptyList();
                this.adm_ = "";
                this.curl_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Video.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.adm_ = "";
                this.curl_ = "";
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -9;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Video_descriptor;
            }

            public Video getDefaultInstanceForType() {
                return Video.getDefaultInstance();
            }

            public Video build() {
                Video buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Video buildPartial() {
                Video video = new Video((GeneratedMessageV3.Builder) this);
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused = video.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                List unused2 = video.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -5;
                }
                List unused3 = video.type_ = this.type_;
                Object unused4 = video.adm_ = this.adm_;
                Object unused5 = video.curl_ = this.curl_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused6 = video.ext_ = this.ext_;
                } else {
                    Struct unused7 = video.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -9;
                    }
                    List unused8 = video.extProto_ = this.extProto_;
                } else {
                    List unused9 = video.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return video;
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
                if (message instanceof Video) {
                    return mergeFrom((Video) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Video video) {
                if (video == Video.getDefaultInstance()) {
                    return this;
                }
                if (!video.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = video.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(video.mime_);
                    }
                    onChanged();
                }
                if (!video.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = video.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(video.api_);
                    }
                    onChanged();
                }
                if (!video.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = video.type_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(video.type_);
                    }
                    onChanged();
                }
                if (!video.getAdm().isEmpty()) {
                    this.adm_ = video.adm_;
                    onChanged();
                }
                if (!video.getCurl().isEmpty()) {
                    this.curl_ = video.curl_;
                    onChanged();
                }
                if (video.hasExt()) {
                    mergeExt(video.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!video.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = video.extProto_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(video.extProto_);
                        }
                        onChanged();
                    }
                } else if (!video.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = video.extProto_;
                        this.bitField0_ &= -9;
                        if (Video.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(video.extProto_);
                    }
                }
                mergeUnknownFields(video.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Ad.Video.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Video.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Ad$Video r3 = (com.explorestack.protobuf.adcom.Ad.Video) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Video) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Ad$Video r4 = (com.explorestack.protobuf.adcom.Ad.Video) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Video) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Video.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Video$Builder");
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.mime_ = new LazyStringArrayList(this.mime_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getMimeList() {
                return this.mime_.getUnmodifiableView();
            }

            public int getMimeCount() {
                return this.mime_.size();
            }

            public String getMime(int i) {
                return (String) this.mime_.get(i);
            }

            public ByteString getMimeBytes(int i) {
                return this.mime_.getByteString(i);
            }

            public Builder setMime(int i, String str) {
                if (str != null) {
                    ensureMimeIsMutable();
                    this.mime_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addMime(String str) {
                if (str != null) {
                    ensureMimeIsMutable();
                    this.mime_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllMime(Iterable<String> iterable) {
                ensureMimeIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.mime_);
                onChanged();
                return this;
            }

            public Builder clearMime() {
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                if (byteString != null) {
                    Video.checkByteStringIsUtf8(byteString);
                    ensureMimeIsMutable();
                    this.mime_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 2;
                }
            }

            public List<ApiFramework> getApiList() {
                return new Internal.ListAdapter(this.api_, Video.api_converter_);
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public ApiFramework getApi(int i) {
                return (ApiFramework) Video.api_converter_.convert(this.api_.get(i));
            }

            public Builder setApi(int i, ApiFramework apiFramework) {
                if (apiFramework != null) {
                    ensureApiIsMutable();
                    this.api_.set(i, Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addApi(ApiFramework apiFramework) {
                if (apiFramework != null) {
                    ensureApiIsMutable();
                    this.api_.add(Integer.valueOf(apiFramework.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllApi(Iterable<? extends ApiFramework> iterable) {
                ensureApiIsMutable();
                for (ApiFramework number : iterable) {
                    this.api_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearApi() {
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public List<Integer> getApiValueList() {
                return Collections.unmodifiableList(this.api_);
            }

            public int getApiValue(int i) {
                return this.api_.get(i).intValue();
            }

            public Builder setApiValue(int i, int i2) {
                ensureApiIsMutable();
                this.api_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addApiValue(int i) {
                ensureApiIsMutable();
                this.api_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllApiValue(Iterable<Integer> iterable) {
                ensureApiIsMutable();
                for (Integer intValue : iterable) {
                    this.api_.add(Integer.valueOf(intValue.intValue()));
                }
                onChanged();
                return this;
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 4;
                }
            }

            public List<VideoCreativeType> getTypeList() {
                return new Internal.ListAdapter(this.type_, Video.type_converter_);
            }

            public int getTypeCount() {
                return this.type_.size();
            }

            public VideoCreativeType getType(int i) {
                return (VideoCreativeType) Video.type_converter_.convert(this.type_.get(i));
            }

            public Builder setType(int i, VideoCreativeType videoCreativeType) {
                if (videoCreativeType != null) {
                    ensureTypeIsMutable();
                    this.type_.set(i, Integer.valueOf(videoCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addType(VideoCreativeType videoCreativeType) {
                if (videoCreativeType != null) {
                    ensureTypeIsMutable();
                    this.type_.add(Integer.valueOf(videoCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllType(Iterable<? extends VideoCreativeType> iterable) {
                ensureTypeIsMutable();
                for (VideoCreativeType number : iterable) {
                    this.type_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.type_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public List<Integer> getTypeValueList() {
                return Collections.unmodifiableList(this.type_);
            }

            public int getTypeValue(int i) {
                return this.type_.get(i).intValue();
            }

            public Builder setTypeValue(int i, int i2) {
                ensureTypeIsMutable();
                this.type_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addTypeValue(int i) {
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllTypeValue(Iterable<Integer> iterable) {
                ensureTypeIsMutable();
                for (Integer intValue : iterable) {
                    this.type_.add(Integer.valueOf(intValue.intValue()));
                }
                onChanged();
                return this;
            }

            public String getAdm() {
                Object obj = this.adm_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.adm_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getAdmBytes() {
                Object obj = this.adm_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.adm_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setAdm(String str) {
                if (str != null) {
                    this.adm_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearAdm() {
                this.adm_ = Video.getDefaultInstance().getAdm();
                onChanged();
                return this;
            }

            public Builder setAdmBytes(ByteString byteString) {
                if (byteString != null) {
                    Video.checkByteStringIsUtf8(byteString);
                    this.adm_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getCurl() {
                Object obj = this.curl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.curl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCurlBytes() {
                Object obj = this.curl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.curl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setCurl(String str) {
                if (str != null) {
                    this.curl_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearCurl() {
                this.curl_ = Video.getDefaultInstance().getCurl();
                onChanged();
                return this;
            }

            public Builder setCurlBytes(ByteString byteString) {
                if (byteString != null) {
                    Video.checkByteStringIsUtf8(byteString);
                    this.curl_ = byteString;
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

        public static Video getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Video> parser() {
            return PARSER;
        }

        public Parser<Video> getParserForType() {
            return PARSER;
        }

        public Video getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class Audit extends GeneratedMessageV3 implements AuditOrBuilder {
        public static final int CORR_FIELD_NUMBER = 5;
        private static final Audit DEFAULT_INSTANCE = new Audit();
        public static final int EXT_FIELD_NUMBER = 7;
        public static final int EXT_PROTO_FIELD_NUMBER = 6;
        public static final int FEEDBACK_FIELD_NUMBER = 2;
        public static final int INIT_FIELD_NUMBER = 3;
        public static final int LASTMOD_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final Parser<Audit> PARSER = new AbstractParser<Audit>() {
            public Audit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Audit(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public Ad corr_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public LazyStringList feedback_;
        /* access modifiers changed from: private */
        public volatile Object init_;
        /* access modifiers changed from: private */
        public volatile Object lastmod_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public int status_;

        private Audit(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Audit() {
            this.memoizedIsInitialized = -1;
            this.status_ = 0;
            this.feedback_ = LazyStringArrayList.EMPTY;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Audit();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Audit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistryLite != null) {
                UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.status_ = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.feedback_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.feedback_.add(readStringRequireUtf8);
                            } else if (readTag == 26) {
                                this.init_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.lastmod_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                Builder builder = this.corr_ != null ? this.corr_.toBuilder() : null;
                                Ad ad = (Ad) codedInputStream.readMessage(Ad.parser(), extensionRegistryLite);
                                this.corr_ = ad;
                                if (builder != null) {
                                    builder.mergeFrom(ad);
                                    this.corr_ = builder.buildPartial();
                                }
                            } else if (readTag == 50) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 58) {
                                Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder2 != null) {
                                    builder2.mergeFrom(struct);
                                    this.ext_ = builder2.buildPartial();
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
                            this.feedback_ = this.feedback_.getUnmodifiableView();
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
                    this.feedback_ = this.feedback_.getUnmodifiableView();
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
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_fieldAccessorTable.ensureFieldAccessorsInitialized(Audit.class, Builder.class);
        }

        public int getStatusValue() {
            return this.status_;
        }

        public AuditStatusCode getStatus() {
            AuditStatusCode valueOf = AuditStatusCode.valueOf(this.status_);
            return valueOf == null ? AuditStatusCode.UNRECOGNIZED : valueOf;
        }

        public ProtocolStringList getFeedbackList() {
            return this.feedback_;
        }

        public int getFeedbackCount() {
            return this.feedback_.size();
        }

        public String getFeedback(int i) {
            return (String) this.feedback_.get(i);
        }

        public ByteString getFeedbackBytes(int i) {
            return this.feedback_.getByteString(i);
        }

        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean hasCorr() {
            return this.corr_ != null;
        }

        public Ad getCorr() {
            Ad ad = this.corr_;
            return ad == null ? Ad.getDefaultInstance() : ad;
        }

        public AdOrBuilder getCorrOrBuilder() {
            return getCorr();
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
            if (this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            for (int i = 0; i < this.feedback_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.feedback_.getRaw(i));
            }
            if (!getInitBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.lastmod_);
            }
            if (this.corr_ != null) {
                codedOutputStream.writeMessage(5, getCorr());
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                codedOutputStream.writeMessage(6, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(7, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.status_ != AuditStatusCode.AUDIT_STATUS_CODE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.status_) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.feedback_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.feedback_.getRaw(i3));
            }
            int size = computeEnumSize + i2 + (getFeedbackList().size() * 1);
            if (!getInitBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(3, this.init_);
            }
            if (!getLastmodBytes().isEmpty()) {
                size += GeneratedMessageV3.computeStringSize(4, this.lastmod_);
            }
            if (this.corr_ != null) {
                size += CodedOutputStream.computeMessageSize(5, getCorr());
            }
            for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                size += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i4));
            }
            if (this.ext_ != null) {
                size += CodedOutputStream.computeMessageSize(7, getExt());
            }
            int serializedSize = size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Audit)) {
                return super.equals(obj);
            }
            Audit audit = (Audit) obj;
            if (this.status_ != audit.status_ || !getFeedbackList().equals(audit.getFeedbackList()) || !getInit().equals(audit.getInit()) || !getLastmod().equals(audit.getLastmod()) || hasCorr() != audit.hasCorr()) {
                return false;
            }
            if ((hasCorr() && !getCorr().equals(audit.getCorr())) || hasExt() != audit.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(audit.getExt())) && getExtProtoList().equals(audit.getExtProtoList()) && this.unknownFields.equals(audit.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.status_;
            if (getFeedbackCount() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + getFeedbackList().hashCode();
            }
            int hashCode2 = (((((((hashCode * 37) + 3) * 53) + getInit().hashCode()) * 37) + 4) * 53) + getLastmod().hashCode();
            if (hasCorr()) {
                hashCode2 = (((hashCode2 * 37) + 5) * 53) + getCorr().hashCode();
            }
            if (hasExt()) {
                hashCode2 = (((hashCode2 * 37) + 7) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode2 = (((hashCode2 * 37) + 6) * 53) + getExtProtoList().hashCode();
            }
            int hashCode3 = (hashCode2 * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode3;
            return hashCode3;
        }

        public static Audit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Audit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Audit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Audit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Audit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Audit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Audit parseFrom(InputStream inputStream) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Audit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Audit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Audit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Audit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Audit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Audit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Audit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Audit audit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audit);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuditOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> corrBuilder_;
            private Ad corr_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private LazyStringList feedback_;
            private Object init_;
            private Object lastmod_;
            private int status_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_fieldAccessorTable.ensureFieldAccessorsInitialized(Audit.class, Builder.class);
            }

            private Builder() {
                this.status_ = 0;
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.init_ = "";
                this.lastmod_ = "";
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Audit.alwaysUseFieldBuilders) {
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.status_ = 0;
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.init_ = "";
                this.lastmod_ = "";
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_Audit_descriptor;
            }

            public Audit getDefaultInstanceForType() {
                return Audit.getDefaultInstance();
            }

            public Audit build() {
                Audit buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Audit buildPartial() {
                Audit audit = new Audit((GeneratedMessageV3.Builder) this);
                int unused = audit.status_ = this.status_;
                if ((this.bitField0_ & 1) != 0) {
                    this.feedback_ = this.feedback_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused2 = audit.feedback_ = this.feedback_;
                Object unused3 = audit.init_ = this.init_;
                Object unused4 = audit.lastmod_ = this.lastmod_;
                SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Ad unused5 = audit.corr_ = this.corr_;
                } else {
                    Ad unused6 = audit.corr_ = singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Struct unused7 = audit.ext_ = this.ext_;
                } else {
                    Struct unused8 = audit.ext_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    List unused9 = audit.extProto_ = this.extProto_;
                } else {
                    List unused10 = audit.extProto_ = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return audit;
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
                if (message instanceof Audit) {
                    return mergeFrom((Audit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Audit audit) {
                if (audit == Audit.getDefaultInstance()) {
                    return this;
                }
                if (audit.status_ != 0) {
                    setStatusValue(audit.getStatusValue());
                }
                if (!audit.feedback_.isEmpty()) {
                    if (this.feedback_.isEmpty()) {
                        this.feedback_ = audit.feedback_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeedbackIsMutable();
                        this.feedback_.addAll(audit.feedback_);
                    }
                    onChanged();
                }
                if (!audit.getInit().isEmpty()) {
                    this.init_ = audit.init_;
                    onChanged();
                }
                if (!audit.getLastmod().isEmpty()) {
                    this.lastmod_ = audit.lastmod_;
                    onChanged();
                }
                if (audit.hasCorr()) {
                    mergeCorr(audit.getCorr());
                }
                if (audit.hasExt()) {
                    mergeExt(audit.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!audit.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = audit.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(audit.extProto_);
                        }
                        onChanged();
                    }
                } else if (!audit.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                        this.extProtoBuilder_ = null;
                        this.extProto_ = audit.extProto_;
                        this.bitField0_ &= -3;
                        if (Audit.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(audit.extProto_);
                    }
                }
                mergeUnknownFields(audit.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Ad.Audit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.Audit.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Ad$Audit r3 = (com.explorestack.protobuf.adcom.Ad.Audit) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Audit) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Ad$Audit r4 = (com.explorestack.protobuf.adcom.Ad.Audit) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Ad.Audit) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Audit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Audit$Builder");
            }

            public int getStatusValue() {
                return this.status_;
            }

            public Builder setStatusValue(int i) {
                this.status_ = i;
                onChanged();
                return this;
            }

            public AuditStatusCode getStatus() {
                AuditStatusCode valueOf = AuditStatusCode.valueOf(this.status_);
                return valueOf == null ? AuditStatusCode.UNRECOGNIZED : valueOf;
            }

            public Builder setStatus(AuditStatusCode auditStatusCode) {
                if (auditStatusCode != null) {
                    this.status_ = auditStatusCode.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearStatus() {
                this.status_ = 0;
                onChanged();
                return this;
            }

            private void ensureFeedbackIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.feedback_ = new LazyStringArrayList(this.feedback_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getFeedbackList() {
                return this.feedback_.getUnmodifiableView();
            }

            public int getFeedbackCount() {
                return this.feedback_.size();
            }

            public String getFeedback(int i) {
                return (String) this.feedback_.get(i);
            }

            public ByteString getFeedbackBytes(int i) {
                return this.feedback_.getByteString(i);
            }

            public Builder setFeedback(int i, String str) {
                if (str != null) {
                    ensureFeedbackIsMutable();
                    this.feedback_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addFeedback(String str) {
                if (str != null) {
                    ensureFeedbackIsMutable();
                    this.feedback_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllFeedback(Iterable<String> iterable) {
                ensureFeedbackIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.feedback_);
                onChanged();
                return this;
            }

            public Builder clearFeedback() {
                this.feedback_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addFeedbackBytes(ByteString byteString) {
                if (byteString != null) {
                    Audit.checkByteStringIsUtf8(byteString);
                    ensureFeedbackIsMutable();
                    this.feedback_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getInit() {
                Object obj = this.init_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.init_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getInitBytes() {
                Object obj = this.init_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.init_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setInit(String str) {
                if (str != null) {
                    this.init_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearInit() {
                this.init_ = Audit.getDefaultInstance().getInit();
                onChanged();
                return this;
            }

            public Builder setInitBytes(ByteString byteString) {
                if (byteString != null) {
                    Audit.checkByteStringIsUtf8(byteString);
                    this.init_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getLastmod() {
                Object obj = this.lastmod_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lastmod_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLastmodBytes() {
                Object obj = this.lastmod_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastmod_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setLastmod(String str) {
                if (str != null) {
                    this.lastmod_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLastmod() {
                this.lastmod_ = Audit.getDefaultInstance().getLastmod();
                onChanged();
                return this;
            }

            public Builder setLastmodBytes(ByteString byteString) {
                if (byteString != null) {
                    Audit.checkByteStringIsUtf8(byteString);
                    this.lastmod_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean hasCorr() {
                return (this.corrBuilder_ == null && this.corr_ == null) ? false : true;
            }

            public Ad getCorr() {
                SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Ad ad = this.corr_;
                return ad == null ? Ad.getDefaultInstance() : ad;
            }

            public Builder setCorr(Ad ad) {
                SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(ad);
                } else if (ad != null) {
                    this.corr_ = ad;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setCorr(Builder builder) {
                SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.corr_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeCorr(Ad ad) {
                SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Ad ad2 = this.corr_;
                    if (ad2 != null) {
                        this.corr_ = Ad.newBuilder(ad2).mergeFrom(ad).buildPartial();
                    } else {
                        this.corr_ = ad;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(ad);
                }
                return this;
            }

            public Builder clearCorr() {
                if (this.corrBuilder_ == null) {
                    this.corr_ = null;
                    onChanged();
                } else {
                    this.corr_ = null;
                    this.corrBuilder_ = null;
                }
                return this;
            }

            public Builder getCorrBuilder() {
                onChanged();
                return getCorrFieldBuilder().getBuilder();
            }

            public AdOrBuilder getCorrOrBuilder() {
                SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> singleFieldBuilderV3 = this.corrBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Ad ad = this.corr_;
                return ad == null ? Ad.getDefaultInstance() : ad;
            }

            private SingleFieldBuilderV3<Ad, Builder, AdOrBuilder> getCorrFieldBuilder() {
                if (this.corrBuilder_ == null) {
                    this.corrBuilder_ = new SingleFieldBuilderV3<>(getCorr(), getParentForChildren(), isClean());
                    this.corr_ = null;
                }
                return this.corrBuilder_;
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
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
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
                    this.bitField0_ &= -3;
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
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
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

        public static Audit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Audit> parser() {
            return PARSER;
        }

        public Parser<Audit> getParserForType() {
            return PARSER;
        }

        public Audit getDefaultInstanceForType() {
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

    public ProtocolStringList getAdomainList() {
        return this.adomain_;
    }

    public int getAdomainCount() {
        return this.adomain_.size();
    }

    public String getAdomain(int i) {
        return (String) this.adomain_.get(i);
    }

    public ByteString getAdomainBytes(int i) {
        return this.adomain_.getByteString(i);
    }

    public ProtocolStringList getBundleList() {
        return this.bundle_;
    }

    public int getBundleCount() {
        return this.bundle_.size();
    }

    public String getBundle(int i) {
        return (String) this.bundle_.get(i);
    }

    public ByteString getBundleBytes(int i) {
        return this.bundle_.getByteString(i);
    }

    public String getIurl() {
        Object obj = this.iurl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.iurl_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIurlBytes() {
        Object obj = this.iurl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.iurl_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public ProtocolStringList getCatList() {
        return this.cat_;
    }

    public int getCatCount() {
        return this.cat_.size();
    }

    public String getCat(int i) {
        return (String) this.cat_.get(i);
    }

    public ByteString getCatBytes(int i) {
        return this.cat_.getByteString(i);
    }

    public int getCattaxValue() {
        return this.cattax_;
    }

    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
    }

    public String getLang() {
        Object obj = this.lang_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lang_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getLangBytes() {
        Object obj = this.lang_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lang_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean getSecure() {
        return this.secure_;
    }

    public int getMratingValue() {
        return this.mrating_;
    }

    public MediaRating getMrating() {
        MediaRating valueOf = MediaRating.valueOf(this.mrating_);
        return valueOf == null ? MediaRating.UNRECOGNIZED : valueOf;
    }

    public String getInit() {
        Object obj = this.init_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.init_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getInitBytes() {
        Object obj = this.init_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.init_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getLastmod() {
        Object obj = this.lastmod_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.lastmod_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getLastmodBytes() {
        Object obj = this.lastmod_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.lastmod_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean hasDisplay() {
        return this.display_ != null;
    }

    public Display getDisplay() {
        Display display = this.display_;
        return display == null ? Display.getDefaultInstance() : display;
    }

    public DisplayOrBuilder getDisplayOrBuilder() {
        return getDisplay();
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    public Video getVideo() {
        Video video = this.video_;
        return video == null ? Video.getDefaultInstance() : video;
    }

    public VideoOrBuilder getVideoOrBuilder() {
        return getVideo();
    }

    public boolean hasAudit() {
        return this.audit_ != null;
    }

    public Audit getAudit() {
        Audit audit = this.audit_;
        return audit == null ? Audit.getDefaultInstance() : audit;
    }

    public AuditOrBuilder getAuditOrBuilder() {
        return getAudit();
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
        for (int i = 0; i < this.adomain_.size(); i++) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.adomain_.getRaw(i));
        }
        for (int i2 = 0; i2 < this.bundle_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.bundle_.getRaw(i2));
        }
        if (!getIurlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.iurl_);
        }
        for (int i3 = 0; i3 < this.cat_.size(); i3++) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.cat_.getRaw(i3));
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            codedOutputStream.writeEnum(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.lang_);
        }
        boolean z = this.secure_;
        if (z) {
            codedOutputStream.writeBool(9, z);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            codedOutputStream.writeEnum(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.lastmod_);
        }
        if (this.display_ != null) {
            codedOutputStream.writeMessage(13, getDisplay());
        }
        if (this.video_ != null) {
            codedOutputStream.writeMessage(14, getVideo());
        }
        if (this.audit_ != null) {
            codedOutputStream.writeMessage(16, getAudit());
        }
        for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
            codedOutputStream.writeMessage(17, this.extProto_.get(i4));
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(18, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.adomain_.size(); i3++) {
            i2 += computeStringSizeNoTag(this.adomain_.getRaw(i3));
        }
        int size = computeStringSize + i2 + (getAdomainList().size() * 1);
        int i4 = 0;
        for (int i5 = 0; i5 < this.bundle_.size(); i5++) {
            i4 += computeStringSizeNoTag(this.bundle_.getRaw(i5));
        }
        int size2 = size + i4 + (getBundleList().size() * 1);
        if (!getIurlBytes().isEmpty()) {
            size2 += GeneratedMessageV3.computeStringSize(4, this.iurl_);
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.cat_.size(); i7++) {
            i6 += computeStringSizeNoTag(this.cat_.getRaw(i7));
        }
        int size3 = size2 + i6 + (getCatList().size() * 1);
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size3 += CodedOutputStream.computeEnumSize(6, this.cattax_);
        }
        if (!getLangBytes().isEmpty()) {
            size3 += GeneratedMessageV3.computeStringSize(7, this.lang_);
        }
        boolean z = this.secure_;
        if (z) {
            size3 += CodedOutputStream.computeBoolSize(9, z);
        }
        if (this.mrating_ != MediaRating.MEDIA_RATING_INVALID.getNumber()) {
            size3 += CodedOutputStream.computeEnumSize(10, this.mrating_);
        }
        if (!getInitBytes().isEmpty()) {
            size3 += GeneratedMessageV3.computeStringSize(11, this.init_);
        }
        if (!getLastmodBytes().isEmpty()) {
            size3 += GeneratedMessageV3.computeStringSize(12, this.lastmod_);
        }
        if (this.display_ != null) {
            size3 += CodedOutputStream.computeMessageSize(13, getDisplay());
        }
        if (this.video_ != null) {
            size3 += CodedOutputStream.computeMessageSize(14, getVideo());
        }
        if (this.audit_ != null) {
            size3 += CodedOutputStream.computeMessageSize(16, getAudit());
        }
        for (int i8 = 0; i8 < this.extProto_.size(); i8++) {
            size3 += CodedOutputStream.computeMessageSize(17, this.extProto_.get(i8));
        }
        if (this.ext_ != null) {
            size3 += CodedOutputStream.computeMessageSize(18, getExt());
        }
        int serializedSize = size3 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return super.equals(obj);
        }
        Ad ad = (Ad) obj;
        if (!getId().equals(ad.getId()) || !getAdomainList().equals(ad.getAdomainList()) || !getBundleList().equals(ad.getBundleList()) || !getIurl().equals(ad.getIurl()) || !getCatList().equals(ad.getCatList()) || this.cattax_ != ad.cattax_ || !getLang().equals(ad.getLang()) || getSecure() != ad.getSecure() || this.mrating_ != ad.mrating_ || !getInit().equals(ad.getInit()) || !getLastmod().equals(ad.getLastmod()) || hasDisplay() != ad.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(ad.getDisplay())) || hasVideo() != ad.hasVideo()) {
            return false;
        }
        if ((hasVideo() && !getVideo().equals(ad.getVideo())) || hasAudit() != ad.hasAudit()) {
            return false;
        }
        if ((hasAudit() && !getAudit().equals(ad.getAudit())) || hasExt() != ad.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(ad.getExt())) && getExtProtoList().equals(ad.getExtProtoList()) && this.unknownFields.equals(ad.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode();
        if (getAdomainCount() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + getAdomainList().hashCode();
        }
        if (getBundleCount() > 0) {
            hashCode = (((hashCode * 37) + 3) * 53) + getBundleList().hashCode();
        }
        int hashCode2 = (((hashCode * 37) + 4) * 53) + getIurl().hashCode();
        if (getCatCount() > 0) {
            hashCode2 = (((hashCode2 * 37) + 5) * 53) + getCatList().hashCode();
        }
        int hashCode3 = (((((((((((((((((((((((hashCode2 * 37) + 6) * 53) + this.cattax_) * 37) + 7) * 53) + getLang().hashCode()) * 37) + 9) * 53) + Internal.hashBoolean(getSecure())) * 37) + 10) * 53) + this.mrating_) * 37) + 11) * 53) + getInit().hashCode()) * 37) + 12) * 53) + getLastmod().hashCode();
        if (hasDisplay()) {
            hashCode3 = (((hashCode3 * 37) + 13) * 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            hashCode3 = (((hashCode3 * 37) + 14) * 53) + getVideo().hashCode();
        }
        if (hasAudit()) {
            hashCode3 = (((hashCode3 * 37) + 16) * 53) + getAudit().hashCode();
        }
        if (hasExt()) {
            hashCode3 = (((hashCode3 * 37) + 18) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            hashCode3 = (((hashCode3 * 37) + 17) * 53) + getExtProtoList().hashCode();
        }
        int hashCode4 = (hashCode3 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode4;
        return hashCode4;
    }

    public static Ad parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Ad parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Ad parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Ad parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Ad parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Ad parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Ad parseFrom(InputStream inputStream) throws IOException {
        return (Ad) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Ad parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ad) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Ad parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ad) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Ad parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ad) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Ad parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Ad) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Ad parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ad) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Ad ad) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(ad);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdOrBuilder {
        private LazyStringList adomain_;
        private SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> auditBuilder_;
        private Audit audit_;
        private int bitField0_;
        private LazyStringList bundle_;
        private LazyStringList cat_;
        private int cattax_;
        private SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> displayBuilder_;
        private Display display_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private Object init_;
        private Object iurl_;
        private Object lang_;
        private Object lastmod_;
        private int mrating_;
        private boolean secure_;
        private SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> videoBuilder_;
        private Video video_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_fieldAccessorTable.ensureFieldAccessorsInitialized(Ad.class, Builder.class);
        }

        private Builder() {
            this.id_ = "";
            this.adomain_ = LazyStringArrayList.EMPTY;
            this.bundle_ = LazyStringArrayList.EMPTY;
            this.iurl_ = "";
            this.cat_ = LazyStringArrayList.EMPTY;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.id_ = "";
            this.adomain_ = LazyStringArrayList.EMPTY;
            this.bundle_ = LazyStringArrayList.EMPTY;
            this.iurl_ = "";
            this.cat_ = LazyStringArrayList.EMPTY;
            this.cattax_ = 0;
            this.lang_ = "";
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Ad.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.id_ = "";
            this.adomain_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.bundle_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.iurl_ = "";
            this.cat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            this.cattax_ = 0;
            this.lang_ = "";
            this.secure_ = false;
            this.mrating_ = 0;
            this.init_ = "";
            this.lastmod_ = "";
            if (this.displayBuilder_ == null) {
                this.display_ = null;
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            if (this.videoBuilder_ == null) {
                this.video_ = null;
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -9;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Ad_descriptor;
        }

        public Ad getDefaultInstanceForType() {
            return Ad.getDefaultInstance();
        }

        public Ad build() {
            Ad buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Ad buildPartial() {
            Ad ad = new Ad((GeneratedMessageV3.Builder) this);
            Object unused = ad.id_ = this.id_;
            if ((this.bitField0_ & 1) != 0) {
                this.adomain_ = this.adomain_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            LazyStringList unused2 = ad.adomain_ = this.adomain_;
            if ((this.bitField0_ & 2) != 0) {
                this.bundle_ = this.bundle_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            LazyStringList unused3 = ad.bundle_ = this.bundle_;
            Object unused4 = ad.iurl_ = this.iurl_;
            if ((this.bitField0_ & 4) != 0) {
                this.cat_ = this.cat_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            LazyStringList unused5 = ad.cat_ = this.cat_;
            int unused6 = ad.cattax_ = this.cattax_;
            Object unused7 = ad.lang_ = this.lang_;
            boolean unused8 = ad.secure_ = this.secure_;
            int unused9 = ad.mrating_ = this.mrating_;
            Object unused10 = ad.init_ = this.init_;
            Object unused11 = ad.lastmod_ = this.lastmod_;
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                Display unused12 = ad.display_ = this.display_;
            } else {
                Display unused13 = ad.display_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV32 = this.videoBuilder_;
            if (singleFieldBuilderV32 == null) {
                Video unused14 = ad.video_ = this.video_;
            } else {
                Video unused15 = ad.video_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV33 = this.auditBuilder_;
            if (singleFieldBuilderV33 == null) {
                Audit unused16 = ad.audit_ = this.audit_;
            } else {
                Audit unused17 = ad.audit_ = singleFieldBuilderV33.build();
            }
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV34 = this.extBuilder_;
            if (singleFieldBuilderV34 == null) {
                Struct unused18 = ad.ext_ = this.ext_;
            } else {
                Struct unused19 = ad.ext_ = singleFieldBuilderV34.build();
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 8) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -9;
                }
                List unused20 = ad.extProto_ = this.extProto_;
            } else {
                List unused21 = ad.extProto_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return ad;
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
            if (message instanceof Ad) {
                return mergeFrom((Ad) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Ad ad) {
            if (ad == Ad.getDefaultInstance()) {
                return this;
            }
            if (!ad.getId().isEmpty()) {
                this.id_ = ad.id_;
                onChanged();
            }
            if (!ad.adomain_.isEmpty()) {
                if (this.adomain_.isEmpty()) {
                    this.adomain_ = ad.adomain_;
                    this.bitField0_ &= -2;
                } else {
                    ensureAdomainIsMutable();
                    this.adomain_.addAll(ad.adomain_);
                }
                onChanged();
            }
            if (!ad.bundle_.isEmpty()) {
                if (this.bundle_.isEmpty()) {
                    this.bundle_ = ad.bundle_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBundleIsMutable();
                    this.bundle_.addAll(ad.bundle_);
                }
                onChanged();
            }
            if (!ad.getIurl().isEmpty()) {
                this.iurl_ = ad.iurl_;
                onChanged();
            }
            if (!ad.cat_.isEmpty()) {
                if (this.cat_.isEmpty()) {
                    this.cat_ = ad.cat_;
                    this.bitField0_ &= -5;
                } else {
                    ensureCatIsMutable();
                    this.cat_.addAll(ad.cat_);
                }
                onChanged();
            }
            if (ad.cattax_ != 0) {
                setCattaxValue(ad.getCattaxValue());
            }
            if (!ad.getLang().isEmpty()) {
                this.lang_ = ad.lang_;
                onChanged();
            }
            if (ad.getSecure()) {
                setSecure(ad.getSecure());
            }
            if (ad.mrating_ != 0) {
                setMratingValue(ad.getMratingValue());
            }
            if (!ad.getInit().isEmpty()) {
                this.init_ = ad.init_;
                onChanged();
            }
            if (!ad.getLastmod().isEmpty()) {
                this.lastmod_ = ad.lastmod_;
                onChanged();
            }
            if (ad.hasDisplay()) {
                mergeDisplay(ad.getDisplay());
            }
            if (ad.hasVideo()) {
                mergeVideo(ad.getVideo());
            }
            if (ad.hasAudit()) {
                mergeAudit(ad.getAudit());
            }
            if (ad.hasExt()) {
                mergeExt(ad.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!ad.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = ad.extProto_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(ad.extProto_);
                    }
                    onChanged();
                }
            } else if (!ad.extProto_.isEmpty()) {
                if (this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.dispose();
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                    this.extProtoBuilder_ = null;
                    this.extProto_ = ad.extProto_;
                    this.bitField0_ &= -9;
                    if (Ad.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                    }
                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.extProtoBuilder_.addAllMessages(ad.extProto_);
                }
            }
            mergeUnknownFields(ad.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.explorestack.protobuf.adcom.Ad.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Ad.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.explorestack.protobuf.adcom.Ad r3 = (com.explorestack.protobuf.adcom.Ad) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.explorestack.protobuf.adcom.Ad r4 = (com.explorestack.protobuf.adcom.Ad) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.explorestack.protobuf.adcom.Ad) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Ad.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Ad$Builder");
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
            this.id_ = Ad.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureAdomainIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adomain_ = new LazyStringArrayList(this.adomain_);
                this.bitField0_ |= 1;
            }
        }

        public ProtocolStringList getAdomainList() {
            return this.adomain_.getUnmodifiableView();
        }

        public int getAdomainCount() {
            return this.adomain_.size();
        }

        public String getAdomain(int i) {
            return (String) this.adomain_.get(i);
        }

        public ByteString getAdomainBytes(int i) {
            return this.adomain_.getByteString(i);
        }

        public Builder setAdomain(int i, String str) {
            if (str != null) {
                ensureAdomainIsMutable();
                this.adomain_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAdomain(String str) {
            if (str != null) {
                ensureAdomainIsMutable();
                this.adomain_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllAdomain(Iterable<String> iterable) {
            ensureAdomainIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.adomain_);
            onChanged();
            return this;
        }

        public Builder clearAdomain() {
            this.adomain_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder addAdomainBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                ensureAdomainIsMutable();
                this.adomain_.add(byteString);
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureBundleIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.bundle_ = new LazyStringArrayList(this.bundle_);
                this.bitField0_ |= 2;
            }
        }

        public ProtocolStringList getBundleList() {
            return this.bundle_.getUnmodifiableView();
        }

        public int getBundleCount() {
            return this.bundle_.size();
        }

        public String getBundle(int i) {
            return (String) this.bundle_.get(i);
        }

        public ByteString getBundleBytes(int i) {
            return this.bundle_.getByteString(i);
        }

        public Builder setBundle(int i, String str) {
            if (str != null) {
                ensureBundleIsMutable();
                this.bundle_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addBundle(String str) {
            if (str != null) {
                ensureBundleIsMutable();
                this.bundle_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllBundle(Iterable<String> iterable) {
            ensureBundleIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.bundle_);
            onChanged();
            return this;
        }

        public Builder clearBundle() {
            this.bundle_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addBundleBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                ensureBundleIsMutable();
                this.bundle_.add(byteString);
                onChanged();
                return this;
            }
            throw null;
        }

        public String getIurl() {
            Object obj = this.iurl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.iurl_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIurlBytes() {
            Object obj = this.iurl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iurl_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setIurl(String str) {
            if (str != null) {
                this.iurl_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearIurl() {
            this.iurl_ = Ad.getDefaultInstance().getIurl();
            onChanged();
            return this;
        }

        public Builder setIurlBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                this.iurl_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureCatIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.cat_ = new LazyStringArrayList(this.cat_);
                this.bitField0_ |= 4;
            }
        }

        public ProtocolStringList getCatList() {
            return this.cat_.getUnmodifiableView();
        }

        public int getCatCount() {
            return this.cat_.size();
        }

        public String getCat(int i) {
            return (String) this.cat_.get(i);
        }

        public ByteString getCatBytes(int i) {
            return this.cat_.getByteString(i);
        }

        public Builder setCat(int i, String str) {
            if (str != null) {
                ensureCatIsMutable();
                this.cat_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addCat(String str) {
            if (str != null) {
                ensureCatIsMutable();
                this.cat_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllCat(Iterable<String> iterable) {
            ensureCatIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.cat_);
            onChanged();
            return this;
        }

        public Builder clearCat() {
            this.cat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addCatBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                ensureCatIsMutable();
                this.cat_.add(byteString);
                onChanged();
                return this;
            }
            throw null;
        }

        public int getCattaxValue() {
            return this.cattax_;
        }

        public Builder setCattaxValue(int i) {
            this.cattax_ = i;
            onChanged();
            return this;
        }

        public CategoryTaxonomy getCattax() {
            CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
            return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
        }

        public Builder setCattax(CategoryTaxonomy categoryTaxonomy) {
            if (categoryTaxonomy != null) {
                this.cattax_ = categoryTaxonomy.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearCattax() {
            this.cattax_ = 0;
            onChanged();
            return this;
        }

        public String getLang() {
            Object obj = this.lang_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lang_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLangBytes() {
            Object obj = this.lang_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lang_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setLang(String str) {
            if (str != null) {
                this.lang_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearLang() {
            this.lang_ = Ad.getDefaultInstance().getLang();
            onChanged();
            return this;
        }

        public Builder setLangBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                this.lang_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean getSecure() {
            return this.secure_;
        }

        public Builder setSecure(boolean z) {
            this.secure_ = z;
            onChanged();
            return this;
        }

        public Builder clearSecure() {
            this.secure_ = false;
            onChanged();
            return this;
        }

        public int getMratingValue() {
            return this.mrating_;
        }

        public Builder setMratingValue(int i) {
            this.mrating_ = i;
            onChanged();
            return this;
        }

        public MediaRating getMrating() {
            MediaRating valueOf = MediaRating.valueOf(this.mrating_);
            return valueOf == null ? MediaRating.UNRECOGNIZED : valueOf;
        }

        public Builder setMrating(MediaRating mediaRating) {
            if (mediaRating != null) {
                this.mrating_ = mediaRating.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearMrating() {
            this.mrating_ = 0;
            onChanged();
            return this;
        }

        public String getInit() {
            Object obj = this.init_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.init_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getInitBytes() {
            Object obj = this.init_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.init_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setInit(String str) {
            if (str != null) {
                this.init_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearInit() {
            this.init_ = Ad.getDefaultInstance().getInit();
            onChanged();
            return this;
        }

        public Builder setInitBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                this.init_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getLastmod() {
            Object obj = this.lastmod_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.lastmod_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getLastmodBytes() {
            Object obj = this.lastmod_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastmod_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setLastmod(String str) {
            if (str != null) {
                this.lastmod_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearLastmod() {
            this.lastmod_ = Ad.getDefaultInstance().getLastmod();
            onChanged();
            return this;
        }

        public Builder setLastmodBytes(ByteString byteString) {
            if (byteString != null) {
                Ad.checkByteStringIsUtf8(byteString);
                this.lastmod_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        public Display getDisplay() {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
        }

        public Builder setDisplay(Display display) {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(display);
            } else if (display != null) {
                this.display_ = display;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setDisplay(Display.Builder builder) {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.display_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDisplay(Display display) {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                Display display2 = this.display_;
                if (display2 != null) {
                    this.display_ = Display.newBuilder(display2).mergeFrom(display).buildPartial();
                } else {
                    this.display_ = display;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(display);
            }
            return this;
        }

        public Builder clearDisplay() {
            if (this.displayBuilder_ == null) {
                this.display_ = null;
                onChanged();
            } else {
                this.display_ = null;
                this.displayBuilder_ = null;
            }
            return this;
        }

        public Display.Builder getDisplayBuilder() {
            onChanged();
            return getDisplayFieldBuilder().getBuilder();
        }

        public DisplayOrBuilder getDisplayOrBuilder() {
            SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Display display = this.display_;
            return display == null ? Display.getDefaultInstance() : display;
        }

        private SingleFieldBuilderV3<Display, Display.Builder, DisplayOrBuilder> getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new SingleFieldBuilderV3<>(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
        }

        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        public Video getVideo() {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        public Builder setVideo(Video video) {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(video);
            } else if (video != null) {
                this.video_ = video;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setVideo(Video.Builder builder) {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.video_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeVideo(Video video) {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                Video video2 = this.video_;
                if (video2 != null) {
                    this.video_ = Video.newBuilder(video2).mergeFrom(video).buildPartial();
                } else {
                    this.video_ = video;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(video);
            }
            return this;
        }

        public Builder clearVideo() {
            if (this.videoBuilder_ == null) {
                this.video_ = null;
                onChanged();
            } else {
                this.video_ = null;
                this.videoBuilder_ = null;
            }
            return this;
        }

        public Video.Builder getVideoBuilder() {
            onChanged();
            return getVideoFieldBuilder().getBuilder();
        }

        public VideoOrBuilder getVideoOrBuilder() {
            SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Video video = this.video_;
            return video == null ? Video.getDefaultInstance() : video;
        }

        private SingleFieldBuilderV3<Video, Video.Builder, VideoOrBuilder> getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new SingleFieldBuilderV3<>(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
        }

        public boolean hasAudit() {
            return (this.auditBuilder_ == null && this.audit_ == null) ? false : true;
        }

        public Audit getAudit() {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        public Builder setAudit(Audit audit) {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(audit);
            } else if (audit != null) {
                this.audit_ = audit;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setAudit(Audit.Builder builder) {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.audit_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeAudit(Audit audit) {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 == null) {
                Audit audit2 = this.audit_;
                if (audit2 != null) {
                    this.audit_ = Audit.newBuilder(audit2).mergeFrom(audit).buildPartial();
                } else {
                    this.audit_ = audit;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(audit);
            }
            return this;
        }

        public Builder clearAudit() {
            if (this.auditBuilder_ == null) {
                this.audit_ = null;
                onChanged();
            } else {
                this.audit_ = null;
                this.auditBuilder_ = null;
            }
            return this;
        }

        public Audit.Builder getAuditBuilder() {
            onChanged();
            return getAuditFieldBuilder().getBuilder();
        }

        public AuditOrBuilder getAuditOrBuilder() {
            SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> singleFieldBuilderV3 = this.auditBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Audit audit = this.audit_;
            return audit == null ? Audit.getDefaultInstance() : audit;
        }

        private SingleFieldBuilderV3<Audit, Audit.Builder, AuditOrBuilder> getAuditFieldBuilder() {
            if (this.auditBuilder_ == null) {
                this.auditBuilder_ = new SingleFieldBuilderV3<>(getAudit(), getParentForChildren(), isClean());
                this.audit_ = null;
            }
            return this.auditBuilder_;
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

    public static Ad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Ad> parser() {
        return PARSER;
    }

    public Parser<Ad> getParserForType() {
        return PARSER;
    }

    public Ad getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
