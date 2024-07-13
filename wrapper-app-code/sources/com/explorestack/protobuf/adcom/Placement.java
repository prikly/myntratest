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
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolStringList;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.openrtb.LossReason;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Placement extends GeneratedMessageV3 implements PlacementOrBuilder {
    public static final int ADMX_FIELD_NUMBER = 14;
    public static final int BADV_FIELD_NUMBER = 9;
    public static final int BAPP_FIELD_NUMBER = 10;
    public static final int BATTR_FIELD_NUMBER = 11;
    public static final int BCAT_FIELD_NUMBER = 6;
    public static final int CATTAX_FIELD_NUMBER = 7;
    public static final int CURLX_FIELD_NUMBER = 15;
    private static final Placement DEFAULT_INSTANCE = new Placement();
    public static final int DISPLAY_FIELD_NUMBER = 16;
    public static final int EXT_FIELD_NUMBER = 20;
    public static final int EXT_PROTO_FIELD_NUMBER = 19;
    /* access modifiers changed from: private */
    public static final Parser<Placement> PARSER = new AbstractParser<Placement>() {
        public Placement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Placement(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int REWARD_FIELD_NUMBER = 5;
    public static final int SDKVER_FIELD_NUMBER = 4;
    public static final int SDK_FIELD_NUMBER = 3;
    public static final int SECURE_FIELD_NUMBER = 13;
    public static final int SSAI_FIELD_NUMBER = 2;
    public static final int TAGID_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 17;
    public static final int WLANG_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final Internal.ListAdapter.Converter<Integer, CreativeAttribute> battr_converter_ = new Internal.ListAdapter.Converter<Integer, CreativeAttribute>() {
        public CreativeAttribute convert(Integer num) {
            CreativeAttribute valueOf = CreativeAttribute.valueOf(num.intValue());
            return valueOf == null ? CreativeAttribute.UNRECOGNIZED : valueOf;
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public boolean admx_;
    /* access modifiers changed from: private */
    public LazyStringList badv_;
    /* access modifiers changed from: private */
    public LazyStringList bapp_;
    private int battrMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> battr_;
    /* access modifiers changed from: private */
    public LazyStringList bcat_;
    /* access modifiers changed from: private */
    public int cattax_;
    /* access modifiers changed from: private */
    public boolean curlx_;
    /* access modifiers changed from: private */
    public DisplayPlacement display_;
    /* access modifiers changed from: private */
    public List<Any> extProto_;
    /* access modifiers changed from: private */
    public Struct ext_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public boolean reward_;
    /* access modifiers changed from: private */
    public volatile Object sdk_;
    /* access modifiers changed from: private */
    public volatile Object sdkver_;
    /* access modifiers changed from: private */
    public boolean secure_;
    /* access modifiers changed from: private */
    public int ssai_;
    /* access modifiers changed from: private */
    public volatile Object tagid_;
    /* access modifiers changed from: private */
    public VideoPlacement video_;
    /* access modifiers changed from: private */
    public LazyStringList wlang_;

    public interface DisplayPlacementOrBuilder extends MessageOrBuilder {
        int getAmpren();

        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        ClickType getClktype();

        int getClktypeValue();

        DisplayContextType getContext();

        int getContextValue();

        DisplayCreativeType getCtype(int i);

        int getCtypeCount();

        List<DisplayCreativeType> getCtypeList();

        int getCtypeValue(int i);

        List<Integer> getCtypeValueList();

        DisplayPlacement.DisplayFormat getDisplayfmt(int i);

        int getDisplayfmtCount();

        List<DisplayPlacement.DisplayFormat> getDisplayfmtList();

        DisplayPlacement.DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i);

        List<? extends DisplayPlacement.DisplayFormatOrBuilder> getDisplayfmtOrBuilderList();

        DisplayPlacement.EventSpec getEvent(int i);

        int getEventCount();

        List<DisplayPlacement.EventSpec> getEventList();

        DisplayPlacement.EventSpecOrBuilder getEventOrBuilder(int i);

        List<? extends DisplayPlacement.EventSpecOrBuilder> getEventOrBuilderList();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        int getH();

        String getIfrbust(int i);

        ByteString getIfrbustBytes(int i);

        int getIfrbustCount();

        List<String> getIfrbustList();

        boolean getInstl();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        DisplayPlacement.NativeFormat getNativefmt();

        DisplayPlacement.NativeFormatOrBuilder getNativefmtOrBuilder();

        PlacementPosition getPos();

        int getPosValue();

        boolean getPriv();

        DisplayPlacementType getPtype();

        int getPtypeValue();

        boolean getTopframe();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();

        boolean hasNativefmt();
    }

    public interface VideoPlacementOrBuilder extends MessageOrBuilder {
        ApiFramework getApi(int i);

        int getApiCount();

        List<ApiFramework> getApiList();

        int getApiValue(int i);

        List<Integer> getApiValueList();

        boolean getBoxing();

        ClickType getClktype();

        int getClktypeValue();

        VideoPlacement.Companion getComp(int i);

        int getCompCount();

        List<VideoPlacement.Companion> getCompList();

        VideoPlacement.CompanionOrBuilder getCompOrBuilder(int i);

        List<? extends VideoPlacement.CompanionOrBuilder> getCompOrBuilderList();

        CompanionType getComptype(int i);

        int getComptypeCount();

        List<CompanionType> getComptypeList();

        int getComptypeValue(int i);

        List<Integer> getComptypeValueList();

        VideoCreativeType getCtype(int i);

        int getCtypeCount();

        List<VideoCreativeType> getCtypeList();

        int getCtypeValue(int i);

        List<Integer> getCtypeValueList();

        int getDelay();

        DeliveryMethod getDelivery(int i);

        int getDeliveryCount();

        List<DeliveryMethod> getDeliveryList();

        int getDeliveryValue(int i);

        List<Integer> getDeliveryValueList();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        int getH();

        LinearityMode getLinear();

        int getLinearValue();

        int getMaxbitr();

        int getMaxdur();

        int getMaxext();

        int getMaxseq();

        String getMime(int i);

        ByteString getMimeBytes(int i);

        int getMimeCount();

        List<String> getMimeList();

        int getMinbitr();

        int getMindur();

        PlaybackCessationMode getPlayend();

        int getPlayendValue();

        PlaybackMethod getPlaymethod();

        int getPlaymethodValue();

        PlacementPosition getPos();

        int getPosValue();

        VideoPlacementType getPtype();

        int getPtypeValue();

        boolean getSkip();

        int getSkipafter();

        int getSkipmin();

        SizeUnit getUnit();

        int getUnitValue();

        int getW();

        boolean hasExt();
    }

    private Placement(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Placement() {
        this.memoizedIsInitialized = -1;
        this.tagid_ = "";
        this.sdk_ = "";
        this.sdkver_ = "";
        this.bcat_ = LazyStringArrayList.EMPTY;
        this.cattax_ = 0;
        this.badv_ = LazyStringArrayList.EMPTY;
        this.bapp_ = LazyStringArrayList.EMPTY;
        this.battr_ = Collections.emptyList();
        this.wlang_ = LazyStringArrayList.EMPTY;
        this.extProto_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Placement();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Placement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.tagid_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 16:
                            this.ssai_ = codedInputStream.readUInt32();
                            break;
                        case 26:
                            this.sdk_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 34:
                            this.sdkver_ = codedInputStream.readStringRequireUtf8();
                            break;
                        case 40:
                            this.reward_ = codedInputStream.readBool();
                            break;
                        case 50:
                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.bcat_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.bcat_.add(readStringRequireUtf8);
                            break;
                        case 56:
                            this.cattax_ = codedInputStream.readEnum();
                            break;
                        case 74:
                            String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.badv_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.badv_.add(readStringRequireUtf82);
                            break;
                        case 82:
                            String readStringRequireUtf83 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.bapp_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.bapp_.add(readStringRequireUtf83);
                            break;
                        case 88:
                            int readEnum = codedInputStream.readEnum();
                            if (!z2 || !true) {
                                this.battr_ = new ArrayList();
                                z2 |= true;
                            }
                            this.battr_.add(Integer.valueOf(readEnum));
                            break;
                        case 90:
                            int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                            while (codedInputStream.getBytesUntilLimit() > 0) {
                                int readEnum2 = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.battr_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.battr_.add(Integer.valueOf(readEnum2));
                            }
                            codedInputStream.popLimit(pushLimit);
                            break;
                        case 98:
                            String readStringRequireUtf84 = codedInputStream.readStringRequireUtf8();
                            if (!z2 || !true) {
                                this.wlang_ = new LazyStringArrayList();
                                z2 |= true;
                            }
                            this.wlang_.add(readStringRequireUtf84);
                            break;
                        case 104:
                            this.secure_ = codedInputStream.readBool();
                            break;
                        case 112:
                            this.admx_ = codedInputStream.readBool();
                            break;
                        case 120:
                            this.curlx_ = codedInputStream.readBool();
                            break;
                        case 130:
                            DisplayPlacement.Builder builder = this.display_ != null ? this.display_.toBuilder() : null;
                            DisplayPlacement displayPlacement = (DisplayPlacement) codedInputStream.readMessage(DisplayPlacement.parser(), extensionRegistryLite);
                            this.display_ = displayPlacement;
                            if (builder == null) {
                                break;
                            } else {
                                builder.mergeFrom(displayPlacement);
                                this.display_ = builder.buildPartial();
                                break;
                            }
                        case 138:
                            VideoPlacement.Builder builder2 = this.video_ != null ? this.video_.toBuilder() : null;
                            VideoPlacement videoPlacement = (VideoPlacement) codedInputStream.readMessage(VideoPlacement.parser(), extensionRegistryLite);
                            this.video_ = videoPlacement;
                            if (builder2 == null) {
                                break;
                            } else {
                                builder2.mergeFrom(videoPlacement);
                                this.video_ = builder2.buildPartial();
                                break;
                            }
                        case 154:
                            if (!z2 || !true) {
                                this.extProto_ = new ArrayList();
                                z2 |= true;
                            }
                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            break;
                        case 162:
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
                        this.bcat_ = this.bcat_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.badv_ = this.badv_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.bapp_ = this.bapp_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.battr_ = Collections.unmodifiableList(this.battr_);
                    }
                    if (z2 && true) {
                        this.wlang_ = this.wlang_.getUnmodifiableView();
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
                this.bcat_ = this.bcat_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.badv_ = this.badv_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
            }
            if (z2 && true) {
                this.battr_ = Collections.unmodifiableList(this.battr_);
            }
            if (z2 && true) {
                this.wlang_ = this.wlang_.getUnmodifiableView();
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
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_fieldAccessorTable.ensureFieldAccessorsInitialized(Placement.class, Builder.class);
    }

    public static final class DisplayPlacement extends GeneratedMessageV3 implements DisplayPlacementOrBuilder {
        public static final int AMPREN_FIELD_NUMBER = 6;
        public static final int API_FIELD_NUMBER = 10;
        public static final int CLKTYPE_FIELD_NUMBER = 5;
        public static final int CONTEXT_FIELD_NUMBER = 8;
        public static final int CTYPE_FIELD_NUMBER = 11;
        private static final DisplayPlacement DEFAULT_INSTANCE = new DisplayPlacement();
        public static final int DISPLAYFMT_FIELD_NUMBER = 16;
        public static final int EVENT_FIELD_NUMBER = 18;
        public static final int EXT_FIELD_NUMBER = 20;
        public static final int EXT_PROTO_FIELD_NUMBER = 19;
        public static final int H_FIELD_NUMBER = 13;
        public static final int IFRBUST_FIELD_NUMBER = 4;
        public static final int INSTL_FIELD_NUMBER = 2;
        public static final int MIME_FIELD_NUMBER = 9;
        public static final int NATIVEFMT_FIELD_NUMBER = 17;
        /* access modifiers changed from: private */
        public static final Parser<DisplayPlacement> PARSER = new AbstractParser<DisplayPlacement>() {
            public DisplayPlacement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new DisplayPlacement(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int POS_FIELD_NUMBER = 1;
        public static final int PRIV_FIELD_NUMBER = 15;
        public static final int PTYPE_FIELD_NUMBER = 7;
        public static final int TOPFRAME_FIELD_NUMBER = 3;
        public static final int UNIT_FIELD_NUMBER = 14;
        public static final int W_FIELD_NUMBER = 12;
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() {
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, DisplayCreativeType> ctype_converter_ = new Internal.ListAdapter.Converter<Integer, DisplayCreativeType>() {
            public DisplayCreativeType convert(Integer num) {
                DisplayCreativeType valueOf = DisplayCreativeType.valueOf(num.intValue());
                return valueOf == null ? DisplayCreativeType.UNRECOGNIZED : valueOf;
            }
        };
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public int ampren_;
        private int apiMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> api_;
        /* access modifiers changed from: private */
        public int clktype_;
        /* access modifiers changed from: private */
        public int context_;
        private int ctypeMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> ctype_;
        /* access modifiers changed from: private */
        public List<DisplayFormat> displayfmt_;
        /* access modifiers changed from: private */
        public List<EventSpec> event_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public int h_;
        /* access modifiers changed from: private */
        public LazyStringList ifrbust_;
        /* access modifiers changed from: private */
        public boolean instl_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public LazyStringList mime_;
        /* access modifiers changed from: private */
        public NativeFormat nativefmt_;
        /* access modifiers changed from: private */
        public int pos_;
        /* access modifiers changed from: private */
        public boolean priv_;
        /* access modifiers changed from: private */
        public int ptype_;
        /* access modifiers changed from: private */
        public boolean topframe_;
        /* access modifiers changed from: private */
        public int unit_;
        /* access modifiers changed from: private */
        public int w_;

        public interface DisplayFormatOrBuilder extends MessageOrBuilder {
            ExpandableDirection getExpdir(int i);

            int getExpdirCount();

            List<ExpandableDirection> getExpdirList();

            int getExpdirValue(int i);

            List<Integer> getExpdirValueList();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            int getH();

            int getHratio();

            int getW();

            int getWratio();

            boolean hasExt();
        }

        public interface EventSpecOrBuilder extends MessageOrBuilder {
            ApiFramework getApi(int i);

            int getApiCount();

            List<ApiFramework> getApiList();

            int getApiValue(int i);

            List<Integer> getApiValueList();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getJstrk(int i);

            ByteString getJstrkBytes(int i);

            int getJstrkCount();

            List<String> getJstrkList();

            EventTrackingMethod getMethod(int i);

            int getMethodCount();

            List<EventTrackingMethod> getMethodList();

            int getMethodValue(int i);

            List<Integer> getMethodValueList();

            String getPxtrk(int i);

            ByteString getPxtrkBytes(int i);

            int getPxtrkCount();

            List<String> getPxtrkList();

            EventType getType();

            int getTypeValue();

            boolean getWjs();

            boolean getWpx();

            boolean hasExt();
        }

        public interface NativeFormatOrBuilder extends MessageOrBuilder {
            NativeFormat.AssetFormat getAsset(int i);

            int getAssetCount();

            List<NativeFormat.AssetFormat> getAssetList();

            NativeFormat.AssetFormatOrBuilder getAssetOrBuilder(int i);

            List<? extends NativeFormat.AssetFormatOrBuilder> getAssetOrBuilderList();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            boolean hasExt();
        }

        private DisplayPlacement(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private DisplayPlacement() {
            this.memoizedIsInitialized = -1;
            this.pos_ = 0;
            this.ifrbust_ = LazyStringArrayList.EMPTY;
            this.clktype_ = 0;
            this.ptype_ = 0;
            this.context_ = 0;
            this.mime_ = LazyStringArrayList.EMPTY;
            this.api_ = Collections.emptyList();
            this.ctype_ = Collections.emptyList();
            this.unit_ = 0;
            this.displayfmt_ = Collections.emptyList();
            this.event_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DisplayPlacement();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DisplayPlacement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            case 8:
                                this.pos_ = codedInputStream.readEnum();
                                break;
                            case 16:
                                this.instl_ = codedInputStream.readBool();
                                break;
                            case 24:
                                this.topframe_ = codedInputStream.readBool();
                                break;
                            case 34:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.ifrbust_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.ifrbust_.add(readStringRequireUtf8);
                                break;
                            case 40:
                                this.clktype_ = codedInputStream.readEnum();
                                break;
                            case 48:
                                this.ampren_ = codedInputStream.readUInt32();
                                break;
                            case 56:
                                this.ptype_ = codedInputStream.readEnum();
                                break;
                            case 64:
                                this.context_ = codedInputStream.readEnum();
                                break;
                            case 74:
                                String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.mime_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.mime_.add(readStringRequireUtf82);
                                break;
                            case 80:
                                int readEnum = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.api_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                                break;
                            case 82:
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
                            case 88:
                                int readEnum3 = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.ctype_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.ctype_.add(Integer.valueOf(readEnum3));
                                break;
                            case 90:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.ctype_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.ctype_.add(Integer.valueOf(readEnum4));
                                }
                                codedInputStream.popLimit(pushLimit2);
                                break;
                            case 96:
                                this.w_ = codedInputStream.readUInt32();
                                break;
                            case 104:
                                this.h_ = codedInputStream.readUInt32();
                                break;
                            case 112:
                                this.unit_ = codedInputStream.readEnum();
                                break;
                            case 120:
                                this.priv_ = codedInputStream.readBool();
                                break;
                            case 130:
                                if (!z2 || !true) {
                                    this.displayfmt_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.displayfmt_.add(codedInputStream.readMessage(DisplayFormat.parser(), extensionRegistryLite));
                                break;
                            case 138:
                                NativeFormat.Builder builder = this.nativefmt_ != null ? this.nativefmt_.toBuilder() : null;
                                NativeFormat nativeFormat = (NativeFormat) codedInputStream.readMessage(NativeFormat.parser(), extensionRegistryLite);
                                this.nativefmt_ = nativeFormat;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(nativeFormat);
                                    this.nativefmt_ = builder.buildPartial();
                                    break;
                                }
                            case 146:
                                if (!z2 || !true) {
                                    this.event_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.event_.add(codedInputStream.readMessage(EventSpec.parser(), extensionRegistryLite));
                                break;
                            case 154:
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                break;
                            case 162:
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
                            this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.mime_ = this.mime_.getUnmodifiableView();
                        }
                        if (z2 && true) {
                            this.api_ = Collections.unmodifiableList(this.api_);
                        }
                        if (z2 && true) {
                            this.ctype_ = Collections.unmodifiableList(this.ctype_);
                        }
                        if (z2 && true) {
                            this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
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
                    this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                }
                if (z2 && true) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                }
                if (z2 && true) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                }
                if (z2 && true) {
                    this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
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
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayPlacement.class, Builder.class);
        }

        public static final class DisplayFormat extends GeneratedMessageV3 implements DisplayFormatOrBuilder {
            private static final DisplayFormat DEFAULT_INSTANCE = new DisplayFormat();
            public static final int EXPDIR_FIELD_NUMBER = 5;
            public static final int EXT_FIELD_NUMBER = 7;
            public static final int EXT_PROTO_FIELD_NUMBER = 6;
            public static final int HRATIO_FIELD_NUMBER = 4;
            public static final int H_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Parser<DisplayFormat> PARSER = new AbstractParser<DisplayFormat>() {
                public DisplayFormat parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new DisplayFormat(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int WRATIO_FIELD_NUMBER = 3;
            public static final int W_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Internal.ListAdapter.Converter<Integer, ExpandableDirection> expdir_converter_ = new Internal.ListAdapter.Converter<Integer, ExpandableDirection>() {
                public ExpandableDirection convert(Integer num) {
                    ExpandableDirection valueOf = ExpandableDirection.valueOf(num.intValue());
                    return valueOf == null ? ExpandableDirection.UNRECOGNIZED : valueOf;
                }
            };
            private static final long serialVersionUID = 0;
            private int expdirMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> expdir_;
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
            public int w_;
            /* access modifiers changed from: private */
            public int wratio_;

            private DisplayFormat(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private DisplayFormat() {
                this.memoizedIsInitialized = -1;
                this.expdir_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new DisplayFormat();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private DisplayFormat(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.w_ = codedInputStream.readUInt32();
                                } else if (readTag == 16) {
                                    this.h_ = codedInputStream.readUInt32();
                                } else if (readTag == 24) {
                                    this.wratio_ = codedInputStream.readUInt32();
                                } else if (readTag == 32) {
                                    this.hratio_ = codedInputStream.readUInt32();
                                } else if (readTag == 40) {
                                    int readEnum = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.expdir_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.expdir_.add(Integer.valueOf(readEnum));
                                } else if (readTag == 42) {
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int readEnum2 = codedInputStream.readEnum();
                                        if (!z2 || !true) {
                                            this.expdir_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.expdir_.add(Integer.valueOf(readEnum2));
                                    }
                                    codedInputStream.popLimit(pushLimit);
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
                                this.expdir_ = Collections.unmodifiableList(this.expdir_);
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
                        this.expdir_ = Collections.unmodifiableList(this.expdir_);
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
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_DisplayFormat_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_DisplayFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayFormat.class, Builder.class);
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

            public List<ExpandableDirection> getExpdirList() {
                return new Internal.ListAdapter(this.expdir_, expdir_converter_);
            }

            public int getExpdirCount() {
                return this.expdir_.size();
            }

            public ExpandableDirection getExpdir(int i) {
                return expdir_converter_.convert(this.expdir_.get(i));
            }

            public List<Integer> getExpdirValueList() {
                return this.expdir_;
            }

            public int getExpdirValue(int i) {
                return this.expdir_.get(i).intValue();
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
                int i = this.w_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(1, i);
                }
                int i2 = this.h_;
                if (i2 != 0) {
                    codedOutputStream.writeUInt32(2, i2);
                }
                int i3 = this.wratio_;
                if (i3 != 0) {
                    codedOutputStream.writeUInt32(3, i3);
                }
                int i4 = this.hratio_;
                if (i4 != 0) {
                    codedOutputStream.writeUInt32(4, i4);
                }
                if (getExpdirList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(42);
                    codedOutputStream.writeUInt32NoTag(this.expdirMemoizedSerializedSize);
                }
                for (int i5 = 0; i5 < this.expdir_.size(); i5++) {
                    codedOutputStream.writeEnumNoTag(this.expdir_.get(i5).intValue());
                }
                for (int i6 = 0; i6 < this.extProto_.size(); i6++) {
                    codedOutputStream.writeMessage(6, this.extProto_.get(i6));
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
                int i2 = this.w_;
                int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) + 0 : 0;
                int i3 = this.h_;
                if (i3 != 0) {
                    computeUInt32Size += CodedOutputStream.computeUInt32Size(2, i3);
                }
                int i4 = this.wratio_;
                if (i4 != 0) {
                    computeUInt32Size += CodedOutputStream.computeUInt32Size(3, i4);
                }
                int i5 = this.hratio_;
                if (i5 != 0) {
                    computeUInt32Size += CodedOutputStream.computeUInt32Size(4, i5);
                }
                int i6 = 0;
                for (int i7 = 0; i7 < this.expdir_.size(); i7++) {
                    i6 += CodedOutputStream.computeEnumSizeNoTag(this.expdir_.get(i7).intValue());
                }
                int i8 = computeUInt32Size + i6;
                if (!getExpdirList().isEmpty()) {
                    i8 = i8 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i6);
                }
                this.expdirMemoizedSerializedSize = i6;
                for (int i9 = 0; i9 < this.extProto_.size(); i9++) {
                    i8 += CodedOutputStream.computeMessageSize(6, this.extProto_.get(i9));
                }
                if (this.ext_ != null) {
                    i8 += CodedOutputStream.computeMessageSize(7, getExt());
                }
                int serializedSize = i8 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DisplayFormat)) {
                    return super.equals(obj);
                }
                DisplayFormat displayFormat = (DisplayFormat) obj;
                if (getW() != displayFormat.getW() || getH() != displayFormat.getH() || getWratio() != displayFormat.getWratio() || getHratio() != displayFormat.getHratio() || !this.expdir_.equals(displayFormat.expdir_) || hasExt() != displayFormat.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(displayFormat.getExt())) && getExtProtoList().equals(displayFormat.getExtProtoList()) && this.unknownFields.equals(displayFormat.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getW()) * 37) + 2) * 53) + getH()) * 37) + 3) * 53) + getWratio()) * 37) + 4) * 53) + getHratio();
                if (getExpdirCount() > 0) {
                    hashCode = (((hashCode * 37) + 5) * 53) + this.expdir_.hashCode();
                }
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 7) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 6) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static DisplayFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static DisplayFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static DisplayFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static DisplayFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static DisplayFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static DisplayFormat parseFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static DisplayFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DisplayFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DisplayFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DisplayFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DisplayFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static DisplayFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (DisplayFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static DisplayFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DisplayFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(DisplayFormat displayFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayFormat);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisplayFormatOrBuilder {
                private int bitField0_;
                private List<Integer> expdir_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private int h_;
                private int hratio_;
                private int w_;
                private int wratio_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_DisplayFormat_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_DisplayFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayFormat.class, Builder.class);
                }

                private Builder() {
                    this.expdir_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.expdir_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (DisplayFormat.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.w_ = 0;
                    this.h_ = 0;
                    this.wratio_ = 0;
                    this.hratio_ = 0;
                    this.expdir_ = Collections.emptyList();
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
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_DisplayFormat_descriptor;
                }

                public DisplayFormat getDefaultInstanceForType() {
                    return DisplayFormat.getDefaultInstance();
                }

                public DisplayFormat build() {
                    DisplayFormat buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public DisplayFormat buildPartial() {
                    DisplayFormat displayFormat = new DisplayFormat((GeneratedMessageV3.Builder) this);
                    int unused = displayFormat.w_ = this.w_;
                    int unused2 = displayFormat.h_ = this.h_;
                    int unused3 = displayFormat.wratio_ = this.wratio_;
                    int unused4 = displayFormat.hratio_ = this.hratio_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.expdir_ = Collections.unmodifiableList(this.expdir_);
                        this.bitField0_ &= -2;
                    }
                    List unused5 = displayFormat.expdir_ = this.expdir_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused6 = displayFormat.ext_ = this.ext_;
                    } else {
                        Struct unused7 = displayFormat.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        List unused8 = displayFormat.extProto_ = this.extProto_;
                    } else {
                        List unused9 = displayFormat.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return displayFormat;
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
                    if (message instanceof DisplayFormat) {
                        return mergeFrom((DisplayFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(DisplayFormat displayFormat) {
                    if (displayFormat == DisplayFormat.getDefaultInstance()) {
                        return this;
                    }
                    if (displayFormat.getW() != 0) {
                        setW(displayFormat.getW());
                    }
                    if (displayFormat.getH() != 0) {
                        setH(displayFormat.getH());
                    }
                    if (displayFormat.getWratio() != 0) {
                        setWratio(displayFormat.getWratio());
                    }
                    if (displayFormat.getHratio() != 0) {
                        setHratio(displayFormat.getHratio());
                    }
                    if (!displayFormat.expdir_.isEmpty()) {
                        if (this.expdir_.isEmpty()) {
                            this.expdir_ = displayFormat.expdir_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureExpdirIsMutable();
                            this.expdir_.addAll(displayFormat.expdir_);
                        }
                        onChanged();
                    }
                    if (displayFormat.hasExt()) {
                        mergeExt(displayFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!displayFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = displayFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(displayFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!displayFormat.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = displayFormat.extProto_;
                            this.bitField0_ &= -3;
                            if (DisplayFormat.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(displayFormat.extProto_);
                        }
                    }
                    mergeUnknownFields(displayFormat.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.DisplayFormat.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$DisplayFormat$Builder");
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

                private void ensureExpdirIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.expdir_ = new ArrayList(this.expdir_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<ExpandableDirection> getExpdirList() {
                    return new Internal.ListAdapter(this.expdir_, DisplayFormat.expdir_converter_);
                }

                public int getExpdirCount() {
                    return this.expdir_.size();
                }

                public ExpandableDirection getExpdir(int i) {
                    return (ExpandableDirection) DisplayFormat.expdir_converter_.convert(this.expdir_.get(i));
                }

                public Builder setExpdir(int i, ExpandableDirection expandableDirection) {
                    if (expandableDirection != null) {
                        ensureExpdirIsMutable();
                        this.expdir_.set(i, Integer.valueOf(expandableDirection.getNumber()));
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addExpdir(ExpandableDirection expandableDirection) {
                    if (expandableDirection != null) {
                        ensureExpdirIsMutable();
                        this.expdir_.add(Integer.valueOf(expandableDirection.getNumber()));
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllExpdir(Iterable<? extends ExpandableDirection> iterable) {
                    ensureExpdirIsMutable();
                    for (ExpandableDirection number : iterable) {
                        this.expdir_.add(Integer.valueOf(number.getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder clearExpdir() {
                    this.expdir_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public List<Integer> getExpdirValueList() {
                    return Collections.unmodifiableList(this.expdir_);
                }

                public int getExpdirValue(int i) {
                    return this.expdir_.get(i).intValue();
                }

                public Builder setExpdirValue(int i, int i2) {
                    ensureExpdirIsMutable();
                    this.expdir_.set(i, Integer.valueOf(i2));
                    onChanged();
                    return this;
                }

                public Builder addExpdirValue(int i) {
                    ensureExpdirIsMutable();
                    this.expdir_.add(Integer.valueOf(i));
                    onChanged();
                    return this;
                }

                public Builder addAllExpdirValue(Iterable<Integer> iterable) {
                    ensureExpdirIsMutable();
                    for (Integer intValue : iterable) {
                        this.expdir_.add(Integer.valueOf(intValue.intValue()));
                    }
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

            public static DisplayFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<DisplayFormat> parser() {
                return PARSER;
            }

            public Parser<DisplayFormat> getParserForType() {
                return PARSER;
            }

            public DisplayFormat getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public static final class NativeFormat extends GeneratedMessageV3 implements NativeFormatOrBuilder {
            public static final int ASSET_FIELD_NUMBER = 1;
            private static final NativeFormat DEFAULT_INSTANCE = new NativeFormat();
            public static final int EXT_FIELD_NUMBER = 3;
            public static final int EXT_PROTO_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Parser<NativeFormat> PARSER = new AbstractParser<NativeFormat>() {
                public NativeFormat parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new NativeFormat(codedInputStream, extensionRegistryLite);
                }
            };
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public List<AssetFormat> asset_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            private byte memoizedIsInitialized;

            public interface AssetFormatOrBuilder extends MessageOrBuilder {
                AssetFormat.DataAssetFormat getData();

                AssetFormat.DataAssetFormatOrBuilder getDataOrBuilder();

                Struct getExt();

                StructOrBuilder getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                AnyOrBuilder getExtProtoOrBuilder(int i);

                List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                int getId();

                AssetFormat.ImageAssetFormat getImg();

                AssetFormat.ImageAssetFormatOrBuilder getImgOrBuilder();

                boolean getReq();

                AssetFormat.TitleAssetFormat getTitle();

                AssetFormat.TitleAssetFormatOrBuilder getTitleOrBuilder();

                VideoPlacement getVideo();

                VideoPlacementOrBuilder getVideoOrBuilder();

                boolean hasData();

                boolean hasExt();

                boolean hasImg();

                boolean hasTitle();

                boolean hasVideo();
            }

            private NativeFormat(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private NativeFormat() {
                this.memoizedIsInitialized = -1;
                this.asset_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new NativeFormat();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private NativeFormat(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.asset_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.asset_.add(codedInputStream.readMessage(AssetFormat.parser(), extensionRegistryLite));
                                } else if (readTag == 18) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 26) {
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
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(NativeFormat.class, Builder.class);
            }

            public static final class AssetFormat extends GeneratedMessageV3 implements AssetFormatOrBuilder {
                public static final int DATA_FIELD_NUMBER = 6;
                private static final AssetFormat DEFAULT_INSTANCE = new AssetFormat();
                public static final int EXT_FIELD_NUMBER = 8;
                public static final int EXT_PROTO_FIELD_NUMBER = 7;
                public static final int ID_FIELD_NUMBER = 1;
                public static final int IMG_FIELD_NUMBER = 4;
                /* access modifiers changed from: private */
                public static final Parser<AssetFormat> PARSER = new AbstractParser<AssetFormat>() {
                    public AssetFormat parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new AssetFormat(codedInputStream, extensionRegistryLite);
                    }
                };
                public static final int REQ_FIELD_NUMBER = 2;
                public static final int TITLE_FIELD_NUMBER = 3;
                public static final int VIDEO_FIELD_NUMBER = 5;
                private static final long serialVersionUID = 0;
                /* access modifiers changed from: private */
                public DataAssetFormat data_;
                /* access modifiers changed from: private */
                public List<Any> extProto_;
                /* access modifiers changed from: private */
                public Struct ext_;
                /* access modifiers changed from: private */
                public int id_;
                /* access modifiers changed from: private */
                public ImageAssetFormat img_;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public boolean req_;
                /* access modifiers changed from: private */
                public TitleAssetFormat title_;
                /* access modifiers changed from: private */
                public VideoPlacement video_;

                public interface DataAssetFormatOrBuilder extends MessageOrBuilder {
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

                    boolean hasExt();
                }

                public interface ImageAssetFormatOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getH();

                    int getHmin();

                    int getHratio();

                    String getMime(int i);

                    ByteString getMimeBytes(int i);

                    int getMimeCount();

                    List<String> getMimeList();

                    NativeImageAssetType getType();

                    int getTypeValue();

                    int getW();

                    int getWmin();

                    int getWratio();

                    boolean hasExt();
                }

                public interface TitleAssetFormatOrBuilder extends MessageOrBuilder {
                    Struct getExt();

                    StructOrBuilder getExtOrBuilder();

                    Any getExtProto(int i);

                    int getExtProtoCount();

                    List<Any> getExtProtoList();

                    AnyOrBuilder getExtProtoOrBuilder(int i);

                    List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                    int getLen();

                    boolean hasExt();
                }

                private AssetFormat(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private AssetFormat() {
                    this.memoizedIsInitialized = -1;
                    this.extProto_ = Collections.emptyList();
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new AssetFormat();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private AssetFormat(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        TitleAssetFormat.Builder builder = this.title_ != null ? this.title_.toBuilder() : null;
                                        TitleAssetFormat titleAssetFormat = (TitleAssetFormat) codedInputStream.readMessage(TitleAssetFormat.parser(), extensionRegistryLite);
                                        this.title_ = titleAssetFormat;
                                        if (builder != null) {
                                            builder.mergeFrom(titleAssetFormat);
                                            this.title_ = builder.buildPartial();
                                        }
                                    } else if (readTag == 34) {
                                        ImageAssetFormat.Builder builder2 = this.img_ != null ? this.img_.toBuilder() : null;
                                        ImageAssetFormat imageAssetFormat = (ImageAssetFormat) codedInputStream.readMessage(ImageAssetFormat.parser(), extensionRegistryLite);
                                        this.img_ = imageAssetFormat;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(imageAssetFormat);
                                            this.img_ = builder2.buildPartial();
                                        }
                                    } else if (readTag == 42) {
                                        VideoPlacement.Builder builder3 = this.video_ != null ? this.video_.toBuilder() : null;
                                        VideoPlacement videoPlacement = (VideoPlacement) codedInputStream.readMessage(VideoPlacement.parser(), extensionRegistryLite);
                                        this.video_ = videoPlacement;
                                        if (builder3 != null) {
                                            builder3.mergeFrom(videoPlacement);
                                            this.video_ = builder3.buildPartial();
                                        }
                                    } else if (readTag == 50) {
                                        DataAssetFormat.Builder builder4 = this.data_ != null ? this.data_.toBuilder() : null;
                                        DataAssetFormat dataAssetFormat = (DataAssetFormat) codedInputStream.readMessage(DataAssetFormat.parser(), extensionRegistryLite);
                                        this.data_ = dataAssetFormat;
                                        if (builder4 != null) {
                                            builder4.mergeFrom(dataAssetFormat);
                                            this.data_ = builder4.buildPartial();
                                        }
                                    } else if (readTag == 58) {
                                        if (!z2 || !true) {
                                            this.extProto_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    } else if (readTag == 66) {
                                        Struct.Builder builder5 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                        Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                        this.ext_ = struct;
                                        if (builder5 != null) {
                                            builder5.mergeFrom(struct);
                                            this.ext_ = builder5.buildPartial();
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
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetFormat.class, Builder.class);
                }

                public static final class TitleAssetFormat extends GeneratedMessageV3 implements TitleAssetFormatOrBuilder {
                    private static final TitleAssetFormat DEFAULT_INSTANCE = new TitleAssetFormat();
                    public static final int EXT_FIELD_NUMBER = 3;
                    public static final int EXT_PROTO_FIELD_NUMBER = 2;
                    public static final int LEN_FIELD_NUMBER = 1;
                    /* access modifiers changed from: private */
                    public static final Parser<TitleAssetFormat> PARSER = new AbstractParser<TitleAssetFormat>() {
                        public TitleAssetFormat parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new TitleAssetFormat(codedInputStream, extensionRegistryLite);
                        }
                    };
                    private static final long serialVersionUID = 0;
                    /* access modifiers changed from: private */
                    public List<Any> extProto_;
                    /* access modifiers changed from: private */
                    public Struct ext_;
                    /* access modifiers changed from: private */
                    public int len_;
                    private byte memoizedIsInitialized;

                    private TitleAssetFormat(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = -1;
                    }

                    private TitleAssetFormat() {
                        this.memoizedIsInitialized = -1;
                        this.extProto_ = Collections.emptyList();
                    }

                    /* access modifiers changed from: protected */
                    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                        return new TitleAssetFormat();
                    }

                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    private TitleAssetFormat(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                            this.len_ = codedInputStream.readUInt32();
                                        } else if (readTag == 18) {
                                            if (!z2 || !true) {
                                                this.extProto_ = new ArrayList();
                                                z2 |= true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                        } else if (readTag == 26) {
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_TitleAssetFormat_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_TitleAssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleAssetFormat.class, Builder.class);
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
                        int i = this.len_;
                        if (i != 0) {
                            codedOutputStream.writeUInt32(1, i);
                        }
                        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                            codedOutputStream.writeMessage(2, this.extProto_.get(i2));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(3, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public int getSerializedSize() {
                        int i = this.memoizedSize;
                        if (i != -1) {
                            return i;
                        }
                        int i2 = this.len_;
                        int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) + 0 : 0;
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            computeUInt32Size += CodedOutputStream.computeMessageSize(2, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            computeUInt32Size += CodedOutputStream.computeMessageSize(3, getExt());
                        }
                        int serializedSize = computeUInt32Size + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof TitleAssetFormat)) {
                            return super.equals(obj);
                        }
                        TitleAssetFormat titleAssetFormat = (TitleAssetFormat) obj;
                        if (getLen() != titleAssetFormat.getLen() || hasExt() != titleAssetFormat.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(titleAssetFormat.getExt())) && getExtProtoList().equals(titleAssetFormat.getExtProtoList()) && this.unknownFields.equals(titleAssetFormat.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    public int hashCode() {
                        if (this.memoizedHashCode != 0) {
                            return this.memoizedHashCode;
                        }
                        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getLen();
                        if (hasExt()) {
                            hashCode = (((hashCode * 37) + 3) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            hashCode = (((hashCode * 37) + 2) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static TitleAssetFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    public static TitleAssetFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    public static TitleAssetFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static TitleAssetFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (TitleAssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static TitleAssetFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static TitleAssetFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (TitleAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static TitleAssetFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (TitleAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }

                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static Builder newBuilder(TitleAssetFormat titleAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(titleAssetFormat);
                    }

                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    /* access modifiers changed from: protected */
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TitleAssetFormatOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;

                        public final boolean isInitialized() {
                            return true;
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_TitleAssetFormat_descriptor;
                        }

                        /* access modifiers changed from: protected */
                        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_TitleAssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(TitleAssetFormat.class, Builder.class);
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
                            if (TitleAssetFormat.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder clear() {
                            super.clear();
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
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_TitleAssetFormat_descriptor;
                        }

                        public TitleAssetFormat getDefaultInstanceForType() {
                            return TitleAssetFormat.getDefaultInstance();
                        }

                        public TitleAssetFormat build() {
                            TitleAssetFormat buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw newUninitializedMessageException(buildPartial);
                        }

                        public TitleAssetFormat buildPartial() {
                            TitleAssetFormat titleAssetFormat = new TitleAssetFormat((GeneratedMessageV3.Builder) this);
                            int unused = titleAssetFormat.len_ = this.len_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                Struct unused2 = titleAssetFormat.ext_ = this.ext_;
                            } else {
                                Struct unused3 = titleAssetFormat.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                List unused4 = titleAssetFormat.extProto_ = this.extProto_;
                            } else {
                                List unused5 = titleAssetFormat.extProto_ = repeatedFieldBuilderV3.build();
                            }
                            onBuilt();
                            return titleAssetFormat;
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
                            if (message instanceof TitleAssetFormat) {
                                return mergeFrom((TitleAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(TitleAssetFormat titleAssetFormat) {
                            if (titleAssetFormat == TitleAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (titleAssetFormat.getLen() != 0) {
                                setLen(titleAssetFormat.getLen());
                            }
                            if (titleAssetFormat.hasExt()) {
                                mergeExt(titleAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!titleAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = titleAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(titleAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!titleAssetFormat.extProto_.isEmpty()) {
                                if (this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.dispose();
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = titleAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    if (TitleAssetFormat.alwaysUseFieldBuilders) {
                                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                                } else {
                                    this.extProtoBuilder_.addAllMessages(titleAssetFormat.extProto_);
                                }
                            }
                            mergeUnknownFields(titleAssetFormat.unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                if (r3 == 0) goto L_0x0010
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r3)
                            L_0x0010:
                                return r2
                            L_0x0011:
                                r3 = move-exception
                                goto L_0x0021
                            L_0x0013:
                                r3 = move-exception
                                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r4     // Catch:{ all -> 0x0011 }
                                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                                throw r3     // Catch:{ all -> 0x001f }
                            L_0x001f:
                                r3 = move-exception
                                r0 = r4
                            L_0x0021:
                                if (r0 == 0) goto L_0x0026
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat) r0)
                            L_0x0026:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$TitleAssetFormat$Builder");
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

                    public static TitleAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Parser<TitleAssetFormat> parser() {
                        return PARSER;
                    }

                    public Parser<TitleAssetFormat> getParserForType() {
                        return PARSER;
                    }

                    public TitleAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }
                }

                public static final class ImageAssetFormat extends GeneratedMessageV3 implements ImageAssetFormatOrBuilder {
                    private static final ImageAssetFormat DEFAULT_INSTANCE = new ImageAssetFormat();
                    public static final int EXT_FIELD_NUMBER = 10;
                    public static final int EXT_PROTO_FIELD_NUMBER = 9;
                    public static final int HMIN_FIELD_NUMBER = 6;
                    public static final int HRATIO_FIELD_NUMBER = 8;
                    public static final int H_FIELD_NUMBER = 4;
                    public static final int MIME_FIELD_NUMBER = 2;
                    /* access modifiers changed from: private */
                    public static final Parser<ImageAssetFormat> PARSER = new AbstractParser<ImageAssetFormat>() {
                        public ImageAssetFormat parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new ImageAssetFormat(codedInputStream, extensionRegistryLite);
                        }
                    };
                    public static final int TYPE_FIELD_NUMBER = 1;
                    public static final int WMIN_FIELD_NUMBER = 5;
                    public static final int WRATIO_FIELD_NUMBER = 7;
                    public static final int W_FIELD_NUMBER = 3;
                    private static final long serialVersionUID = 0;
                    /* access modifiers changed from: private */
                    public List<Any> extProto_;
                    /* access modifiers changed from: private */
                    public Struct ext_;
                    /* access modifiers changed from: private */
                    public int h_;
                    /* access modifiers changed from: private */
                    public int hmin_;
                    /* access modifiers changed from: private */
                    public int hratio_;
                    private byte memoizedIsInitialized;
                    /* access modifiers changed from: private */
                    public LazyStringList mime_;
                    /* access modifiers changed from: private */
                    public int type_;
                    /* access modifiers changed from: private */
                    public int w_;
                    /* access modifiers changed from: private */
                    public int wmin_;
                    /* access modifiers changed from: private */
                    public int wratio_;

                    private ImageAssetFormat(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = -1;
                    }

                    private ImageAssetFormat() {
                        this.memoizedIsInitialized = -1;
                        this.type_ = 0;
                        this.mime_ = LazyStringArrayList.EMPTY;
                        this.extProto_ = Collections.emptyList();
                    }

                    /* access modifiers changed from: protected */
                    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                        return new ImageAssetFormat();
                    }

                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    private ImageAssetFormat(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        case 8:
                                            this.type_ = codedInputStream.readEnum();
                                            break;
                                        case 18:
                                            String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                            if (!z2 || !true) {
                                                this.mime_ = new LazyStringArrayList();
                                                z2 |= true;
                                            }
                                            this.mime_.add(readStringRequireUtf8);
                                            break;
                                        case 24:
                                            this.w_ = codedInputStream.readUInt32();
                                            break;
                                        case 32:
                                            this.h_ = codedInputStream.readUInt32();
                                            break;
                                        case 40:
                                            this.wmin_ = codedInputStream.readUInt32();
                                            break;
                                        case 48:
                                            this.hmin_ = codedInputStream.readUInt32();
                                            break;
                                        case 56:
                                            this.wratio_ = codedInputStream.readUInt32();
                                            break;
                                        case 64:
                                            this.hratio_ = codedInputStream.readUInt32();
                                            break;
                                        case 74:
                                            if (!z2 || !true) {
                                                this.extProto_ = new ArrayList();
                                                z2 |= true;
                                            }
                                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                            break;
                                        case 82:
                                            Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                            Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                            this.ext_ = struct;
                                            if (builder == null) {
                                                break;
                                            } else {
                                                builder.mergeFrom(struct);
                                                this.ext_ = builder.buildPartial();
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
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            return;
                        }
                        throw null;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_ImageAssetFormat_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_ImageAssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageAssetFormat.class, Builder.class);
                    }

                    public int getTypeValue() {
                        return this.type_;
                    }

                    public NativeImageAssetType getType() {
                        NativeImageAssetType valueOf = NativeImageAssetType.valueOf(this.type_);
                        return valueOf == null ? NativeImageAssetType.UNRECOGNIZED : valueOf;
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

                    public int getW() {
                        return this.w_;
                    }

                    public int getH() {
                        return this.h_;
                    }

                    public int getWmin() {
                        return this.wmin_;
                    }

                    public int getHmin() {
                        return this.hmin_;
                    }

                    public int getWratio() {
                        return this.wratio_;
                    }

                    public int getHratio() {
                        return this.hratio_;
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
                        if (this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.writeEnum(1, this.type_);
                        }
                        for (int i = 0; i < this.mime_.size(); i++) {
                            GeneratedMessageV3.writeString(codedOutputStream, 2, this.mime_.getRaw(i));
                        }
                        int i2 = this.w_;
                        if (i2 != 0) {
                            codedOutputStream.writeUInt32(3, i2);
                        }
                        int i3 = this.h_;
                        if (i3 != 0) {
                            codedOutputStream.writeUInt32(4, i3);
                        }
                        int i4 = this.wmin_;
                        if (i4 != 0) {
                            codedOutputStream.writeUInt32(5, i4);
                        }
                        int i5 = this.hmin_;
                        if (i5 != 0) {
                            codedOutputStream.writeUInt32(6, i5);
                        }
                        int i6 = this.wratio_;
                        if (i6 != 0) {
                            codedOutputStream.writeUInt32(7, i6);
                        }
                        int i7 = this.hratio_;
                        if (i7 != 0) {
                            codedOutputStream.writeUInt32(8, i7);
                        }
                        for (int i8 = 0; i8 < this.extProto_.size(); i8++) {
                            codedOutputStream.writeMessage(9, this.extProto_.get(i8));
                        }
                        if (this.ext_ != null) {
                            codedOutputStream.writeMessage(10, getExt());
                        }
                        this.unknownFields.writeTo(codedOutputStream);
                    }

                    public int getSerializedSize() {
                        int i = this.memoizedSize;
                        if (i != -1) {
                            return i;
                        }
                        int computeEnumSize = this.type_ != NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) + 0 : 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < this.mime_.size(); i3++) {
                            i2 += computeStringSizeNoTag(this.mime_.getRaw(i3));
                        }
                        int size = computeEnumSize + i2 + (getMimeList().size() * 1);
                        int i4 = this.w_;
                        if (i4 != 0) {
                            size += CodedOutputStream.computeUInt32Size(3, i4);
                        }
                        int i5 = this.h_;
                        if (i5 != 0) {
                            size += CodedOutputStream.computeUInt32Size(4, i5);
                        }
                        int i6 = this.wmin_;
                        if (i6 != 0) {
                            size += CodedOutputStream.computeUInt32Size(5, i6);
                        }
                        int i7 = this.hmin_;
                        if (i7 != 0) {
                            size += CodedOutputStream.computeUInt32Size(6, i7);
                        }
                        int i8 = this.wratio_;
                        if (i8 != 0) {
                            size += CodedOutputStream.computeUInt32Size(7, i8);
                        }
                        int i9 = this.hratio_;
                        if (i9 != 0) {
                            size += CodedOutputStream.computeUInt32Size(8, i9);
                        }
                        for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                            size += CodedOutputStream.computeMessageSize(9, this.extProto_.get(i10));
                        }
                        if (this.ext_ != null) {
                            size += CodedOutputStream.computeMessageSize(10, getExt());
                        }
                        int serializedSize = size + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof ImageAssetFormat)) {
                            return super.equals(obj);
                        }
                        ImageAssetFormat imageAssetFormat = (ImageAssetFormat) obj;
                        if (this.type_ != imageAssetFormat.type_ || !getMimeList().equals(imageAssetFormat.getMimeList()) || getW() != imageAssetFormat.getW() || getH() != imageAssetFormat.getH() || getWmin() != imageAssetFormat.getWmin() || getHmin() != imageAssetFormat.getHmin() || getWratio() != imageAssetFormat.getWratio() || getHratio() != imageAssetFormat.getHratio() || hasExt() != imageAssetFormat.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(imageAssetFormat.getExt())) && getExtProtoList().equals(imageAssetFormat.getExtProtoList()) && this.unknownFields.equals(imageAssetFormat.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    public int hashCode() {
                        if (this.memoizedHashCode != 0) {
                            return this.memoizedHashCode;
                        }
                        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_;
                        if (getMimeCount() > 0) {
                            hashCode = (((hashCode * 37) + 2) * 53) + getMimeList().hashCode();
                        }
                        int w = (((((((((((((((((((((((hashCode * 37) + 3) * 53) + getW()) * 37) + 4) * 53) + getH()) * 37) + 5) * 53) + getWmin()) * 37) + 6) * 53) + getHmin()) * 37) + 7) * 53) + getWratio()) * 37) + 8) * 53) + getHratio();
                        if (hasExt()) {
                            w = (((w * 37) + 10) * 53) + getExt().hashCode();
                        }
                        if (getExtProtoCount() > 0) {
                            w = (((w * 37) + 9) * 53) + getExtProtoList().hashCode();
                        }
                        int hashCode2 = (w * 29) + this.unknownFields.hashCode();
                        this.memoizedHashCode = hashCode2;
                        return hashCode2;
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static ImageAssetFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    public static ImageAssetFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    public static ImageAssetFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (ImageAssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static ImageAssetFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static ImageAssetFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (ImageAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static ImageAssetFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (ImageAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }

                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static Builder newBuilder(ImageAssetFormat imageAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(imageAssetFormat);
                    }

                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    /* access modifiers changed from: protected */
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImageAssetFormatOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int h_;
                        private int hmin_;
                        private int hratio_;
                        private LazyStringList mime_;
                        private int type_;
                        private int w_;
                        private int wmin_;
                        private int wratio_;

                        public final boolean isInitialized() {
                            return true;
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_ImageAssetFormat_descriptor;
                        }

                        /* access modifiers changed from: protected */
                        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_ImageAssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(ImageAssetFormat.class, Builder.class);
                        }

                        private Builder() {
                            this.type_ = 0;
                            this.mime_ = LazyStringArrayList.EMPTY;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.type_ = 0;
                            this.mime_ = LazyStringArrayList.EMPTY;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private void maybeForceBuilderInitialization() {
                            if (ImageAssetFormat.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder clear() {
                            super.clear();
                            this.type_ = 0;
                            this.mime_ = LazyStringArrayList.EMPTY;
                            this.bitField0_ &= -2;
                            this.w_ = 0;
                            this.h_ = 0;
                            this.wmin_ = 0;
                            this.hmin_ = 0;
                            this.wratio_ = 0;
                            this.hratio_ = 0;
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
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_ImageAssetFormat_descriptor;
                        }

                        public ImageAssetFormat getDefaultInstanceForType() {
                            return ImageAssetFormat.getDefaultInstance();
                        }

                        public ImageAssetFormat build() {
                            ImageAssetFormat buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw newUninitializedMessageException(buildPartial);
                        }

                        public ImageAssetFormat buildPartial() {
                            ImageAssetFormat imageAssetFormat = new ImageAssetFormat((GeneratedMessageV3.Builder) this);
                            int unused = imageAssetFormat.type_ = this.type_;
                            if ((this.bitField0_ & 1) != 0) {
                                this.mime_ = this.mime_.getUnmodifiableView();
                                this.bitField0_ &= -2;
                            }
                            LazyStringList unused2 = imageAssetFormat.mime_ = this.mime_;
                            int unused3 = imageAssetFormat.w_ = this.w_;
                            int unused4 = imageAssetFormat.h_ = this.h_;
                            int unused5 = imageAssetFormat.wmin_ = this.wmin_;
                            int unused6 = imageAssetFormat.hmin_ = this.hmin_;
                            int unused7 = imageAssetFormat.wratio_ = this.wratio_;
                            int unused8 = imageAssetFormat.hratio_ = this.hratio_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                Struct unused9 = imageAssetFormat.ext_ = this.ext_;
                            } else {
                                Struct unused10 = imageAssetFormat.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                if ((this.bitField0_ & 2) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -3;
                                }
                                List unused11 = imageAssetFormat.extProto_ = this.extProto_;
                            } else {
                                List unused12 = imageAssetFormat.extProto_ = repeatedFieldBuilderV3.build();
                            }
                            onBuilt();
                            return imageAssetFormat;
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
                            if (message instanceof ImageAssetFormat) {
                                return mergeFrom((ImageAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(ImageAssetFormat imageAssetFormat) {
                            if (imageAssetFormat == ImageAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (imageAssetFormat.type_ != 0) {
                                setTypeValue(imageAssetFormat.getTypeValue());
                            }
                            if (!imageAssetFormat.mime_.isEmpty()) {
                                if (this.mime_.isEmpty()) {
                                    this.mime_ = imageAssetFormat.mime_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureMimeIsMutable();
                                    this.mime_.addAll(imageAssetFormat.mime_);
                                }
                                onChanged();
                            }
                            if (imageAssetFormat.getW() != 0) {
                                setW(imageAssetFormat.getW());
                            }
                            if (imageAssetFormat.getH() != 0) {
                                setH(imageAssetFormat.getH());
                            }
                            if (imageAssetFormat.getWmin() != 0) {
                                setWmin(imageAssetFormat.getWmin());
                            }
                            if (imageAssetFormat.getHmin() != 0) {
                                setHmin(imageAssetFormat.getHmin());
                            }
                            if (imageAssetFormat.getWratio() != 0) {
                                setWratio(imageAssetFormat.getWratio());
                            }
                            if (imageAssetFormat.getHratio() != 0) {
                                setHratio(imageAssetFormat.getHratio());
                            }
                            if (imageAssetFormat.hasExt()) {
                                mergeExt(imageAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!imageAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = imageAssetFormat.extProto_;
                                        this.bitField0_ &= -3;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(imageAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!imageAssetFormat.extProto_.isEmpty()) {
                                if (this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.dispose();
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = imageAssetFormat.extProto_;
                                    this.bitField0_ &= -3;
                                    if (ImageAssetFormat.alwaysUseFieldBuilders) {
                                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                                } else {
                                    this.extProtoBuilder_.addAllMessages(imageAssetFormat.extProto_);
                                }
                            }
                            mergeUnknownFields(imageAssetFormat.unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                if (r3 == 0) goto L_0x0010
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r3)
                            L_0x0010:
                                return r2
                            L_0x0011:
                                r3 = move-exception
                                goto L_0x0021
                            L_0x0013:
                                r3 = move-exception
                                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r4     // Catch:{ all -> 0x0011 }
                                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                                throw r3     // Catch:{ all -> 0x001f }
                            L_0x001f:
                                r3 = move-exception
                                r0 = r4
                            L_0x0021:
                                if (r0 == 0) goto L_0x0026
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat) r0)
                            L_0x0026:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$ImageAssetFormat$Builder");
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
                                ImageAssetFormat.checkByteStringIsUtf8(byteString);
                                ensureMimeIsMutable();
                                this.mime_.add(byteString);
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

                        public int getWmin() {
                            return this.wmin_;
                        }

                        public Builder setWmin(int i) {
                            this.wmin_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder clearWmin() {
                            this.wmin_ = 0;
                            onChanged();
                            return this;
                        }

                        public int getHmin() {
                            return this.hmin_;
                        }

                        public Builder setHmin(int i) {
                            this.hmin_ = i;
                            onChanged();
                            return this;
                        }

                        public Builder clearHmin() {
                            this.hmin_ = 0;
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

                    public static ImageAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Parser<ImageAssetFormat> parser() {
                        return PARSER;
                    }

                    public Parser<ImageAssetFormat> getParserForType() {
                        return PARSER;
                    }

                    public ImageAssetFormat getDefaultInstanceForType() {
                        return DEFAULT_INSTANCE;
                    }
                }

                public static final class DataAssetFormat extends GeneratedMessageV3 implements DataAssetFormatOrBuilder {
                    private static final DataAssetFormat DEFAULT_INSTANCE = new DataAssetFormat();
                    public static final int EXT_FIELD_NUMBER = 4;
                    public static final int EXT_PROTO_FIELD_NUMBER = 3;
                    public static final int LEN_FIELD_NUMBER = 2;
                    /* access modifiers changed from: private */
                    public static final Parser<DataAssetFormat> PARSER = new AbstractParser<DataAssetFormat>() {
                        public DataAssetFormat parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                            return new DataAssetFormat(codedInputStream, extensionRegistryLite);
                        }
                    };
                    public static final int TYPE_FIELD_NUMBER = 1;
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

                    private DataAssetFormat(GeneratedMessageV3.Builder<?> builder) {
                        super(builder);
                        this.memoizedIsInitialized = -1;
                    }

                    private DataAssetFormat() {
                        this.memoizedIsInitialized = -1;
                        this.type_ = 0;
                        this.extProto_ = Collections.emptyList();
                    }

                    /* access modifiers changed from: protected */
                    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                        return new DataAssetFormat();
                    }

                    public final UnknownFieldSet getUnknownFields() {
                        return this.unknownFields;
                    }

                    private DataAssetFormat(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_DataAssetFormat_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_DataAssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(DataAssetFormat.class, Builder.class);
                    }

                    public int getTypeValue() {
                        return this.type_;
                    }

                    public NativeDataAssetType getType() {
                        NativeDataAssetType valueOf = NativeDataAssetType.valueOf(this.type_);
                        return valueOf == null ? NativeDataAssetType.UNRECOGNIZED : valueOf;
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
                        if (this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber()) {
                            codedOutputStream.writeEnum(1, this.type_);
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
                        int computeEnumSize = this.type_ != NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) + 0 : 0;
                        int i2 = this.len_;
                        if (i2 != 0) {
                            computeEnumSize += CodedOutputStream.computeUInt32Size(2, i2);
                        }
                        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                            computeEnumSize += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i3));
                        }
                        if (this.ext_ != null) {
                            computeEnumSize += CodedOutputStream.computeMessageSize(4, getExt());
                        }
                        int serializedSize = computeEnumSize + this.unknownFields.getSerializedSize();
                        this.memoizedSize = serializedSize;
                        return serializedSize;
                    }

                    public boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof DataAssetFormat)) {
                            return super.equals(obj);
                        }
                        DataAssetFormat dataAssetFormat = (DataAssetFormat) obj;
                        if (this.type_ != dataAssetFormat.type_ || getLen() != dataAssetFormat.getLen() || hasExt() != dataAssetFormat.hasExt()) {
                            return false;
                        }
                        if ((!hasExt() || getExt().equals(dataAssetFormat.getExt())) && getExtProtoList().equals(dataAssetFormat.getExtProtoList()) && this.unknownFields.equals(dataAssetFormat.unknownFields)) {
                            return true;
                        }
                        return false;
                    }

                    public int hashCode() {
                        if (this.memoizedHashCode != 0) {
                            return this.memoizedHashCode;
                        }
                        int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + getLen();
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

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer);
                    }

                    public static DataAssetFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString);
                    }

                    public static DataAssetFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(byteString, extensionRegistryLite);
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr);
                    }

                    public static DataAssetFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return PARSER.parseFrom(bArr, extensionRegistryLite);
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                    }

                    public static DataAssetFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                        return (DataAssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                    }

                    public static DataAssetFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                    }

                    public static DataAssetFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
                        return (DataAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                    }

                    public static DataAssetFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                        return (DataAssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                    }

                    public Builder newBuilderForType() {
                        return newBuilder();
                    }

                    public static Builder newBuilder() {
                        return DEFAULT_INSTANCE.toBuilder();
                    }

                    public static Builder newBuilder(DataAssetFormat dataAssetFormat) {
                        return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataAssetFormat);
                    }

                    public Builder toBuilder() {
                        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                    }

                    /* access modifiers changed from: protected */
                    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                        return new Builder(builderParent);
                    }

                    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataAssetFormatOrBuilder {
                        private int bitField0_;
                        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                        private List<Any> extProto_;
                        private Struct ext_;
                        private int len_;
                        private int type_;

                        public final boolean isInitialized() {
                            return true;
                        }

                        public static final Descriptors.Descriptor getDescriptor() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_DataAssetFormat_descriptor;
                        }

                        /* access modifiers changed from: protected */
                        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_DataAssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(DataAssetFormat.class, Builder.class);
                        }

                        private Builder() {
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                            super(builderParent);
                            this.type_ = 0;
                            this.extProto_ = Collections.emptyList();
                            maybeForceBuilderInitialization();
                        }

                        private void maybeForceBuilderInitialization() {
                            if (DataAssetFormat.alwaysUseFieldBuilders) {
                                getExtProtoFieldBuilder();
                            }
                        }

                        public Builder clear() {
                            super.clear();
                            this.type_ = 0;
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
                            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_DataAssetFormat_descriptor;
                        }

                        public DataAssetFormat getDefaultInstanceForType() {
                            return DataAssetFormat.getDefaultInstance();
                        }

                        public DataAssetFormat build() {
                            DataAssetFormat buildPartial = buildPartial();
                            if (buildPartial.isInitialized()) {
                                return buildPartial;
                            }
                            throw newUninitializedMessageException(buildPartial);
                        }

                        public DataAssetFormat buildPartial() {
                            DataAssetFormat dataAssetFormat = new DataAssetFormat((GeneratedMessageV3.Builder) this);
                            int unused = dataAssetFormat.type_ = this.type_;
                            int unused2 = dataAssetFormat.len_ = this.len_;
                            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                            if (singleFieldBuilderV3 == null) {
                                Struct unused3 = dataAssetFormat.ext_ = this.ext_;
                            } else {
                                Struct unused4 = dataAssetFormat.ext_ = singleFieldBuilderV3.build();
                            }
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                            if (repeatedFieldBuilderV3 == null) {
                                if ((this.bitField0_ & 1) != 0) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                    this.bitField0_ &= -2;
                                }
                                List unused5 = dataAssetFormat.extProto_ = this.extProto_;
                            } else {
                                List unused6 = dataAssetFormat.extProto_ = repeatedFieldBuilderV3.build();
                            }
                            onBuilt();
                            return dataAssetFormat;
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
                            if (message instanceof DataAssetFormat) {
                                return mergeFrom((DataAssetFormat) message);
                            }
                            super.mergeFrom(message);
                            return this;
                        }

                        public Builder mergeFrom(DataAssetFormat dataAssetFormat) {
                            if (dataAssetFormat == DataAssetFormat.getDefaultInstance()) {
                                return this;
                            }
                            if (dataAssetFormat.type_ != 0) {
                                setTypeValue(dataAssetFormat.getTypeValue());
                            }
                            if (dataAssetFormat.getLen() != 0) {
                                setLen(dataAssetFormat.getLen());
                            }
                            if (dataAssetFormat.hasExt()) {
                                mergeExt(dataAssetFormat.getExt());
                            }
                            if (this.extProtoBuilder_ == null) {
                                if (!dataAssetFormat.extProto_.isEmpty()) {
                                    if (this.extProto_.isEmpty()) {
                                        this.extProto_ = dataAssetFormat.extProto_;
                                        this.bitField0_ &= -2;
                                    } else {
                                        ensureExtProtoIsMutable();
                                        this.extProto_.addAll(dataAssetFormat.extProto_);
                                    }
                                    onChanged();
                                }
                            } else if (!dataAssetFormat.extProto_.isEmpty()) {
                                if (this.extProtoBuilder_.isEmpty()) {
                                    this.extProtoBuilder_.dispose();
                                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                    this.extProtoBuilder_ = null;
                                    this.extProto_ = dataAssetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                    if (DataAssetFormat.alwaysUseFieldBuilders) {
                                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                    }
                                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                                } else {
                                    this.extProtoBuilder_.addAllMessages(dataAssetFormat.extProto_);
                                }
                            }
                            mergeUnknownFields(dataAssetFormat.unknownFields);
                            onChanged();
                            return this;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                            /*
                                r2 = this;
                                r0 = 0
                                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                                if (r3 == 0) goto L_0x0010
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r3)
                            L_0x0010:
                                return r2
                            L_0x0011:
                                r3 = move-exception
                                goto L_0x0021
                            L_0x0013:
                                r3 = move-exception
                                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                                com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r4     // Catch:{ all -> 0x0011 }
                                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                                throw r3     // Catch:{ all -> 0x001f }
                            L_0x001f:
                                r3 = move-exception
                                r0 = r4
                            L_0x0021:
                                if (r0 == 0) goto L_0x0026
                                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat) r0)
                            L_0x0026:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$DataAssetFormat$Builder");
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

                    public static DataAssetFormat getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Parser<DataAssetFormat> parser() {
                        return PARSER;
                    }

                    public Parser<DataAssetFormat> getParserForType() {
                        return PARSER;
                    }

                    public DataAssetFormat getDefaultInstanceForType() {
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

                public TitleAssetFormat getTitle() {
                    TitleAssetFormat titleAssetFormat = this.title_;
                    return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                }

                public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                    return getTitle();
                }

                public boolean hasImg() {
                    return this.img_ != null;
                }

                public ImageAssetFormat getImg() {
                    ImageAssetFormat imageAssetFormat = this.img_;
                    return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                }

                public ImageAssetFormatOrBuilder getImgOrBuilder() {
                    return getImg();
                }

                public boolean hasVideo() {
                    return this.video_ != null;
                }

                public VideoPlacement getVideo() {
                    VideoPlacement videoPlacement = this.video_;
                    return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                }

                public VideoPlacementOrBuilder getVideoOrBuilder() {
                    return getVideo();
                }

                public boolean hasData() {
                    return this.data_ != null;
                }

                public DataAssetFormat getData() {
                    DataAssetFormat dataAssetFormat = this.data_;
                    return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                }

                public DataAssetFormatOrBuilder getDataOrBuilder() {
                    return getData();
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
                    if (this.img_ != null) {
                        codedOutputStream.writeMessage(4, getImg());
                    }
                    if (this.video_ != null) {
                        codedOutputStream.writeMessage(5, getVideo());
                    }
                    if (this.data_ != null) {
                        codedOutputStream.writeMessage(6, getData());
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
                    int i2 = this.id_;
                    int computeUInt32Size = i2 != 0 ? CodedOutputStream.computeUInt32Size(1, i2) + 0 : 0;
                    boolean z = this.req_;
                    if (z) {
                        computeUInt32Size += CodedOutputStream.computeBoolSize(2, z);
                    }
                    if (this.title_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(3, getTitle());
                    }
                    if (this.img_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(4, getImg());
                    }
                    if (this.video_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(5, getVideo());
                    }
                    if (this.data_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(6, getData());
                    }
                    for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(7, this.extProto_.get(i3));
                    }
                    if (this.ext_ != null) {
                        computeUInt32Size += CodedOutputStream.computeMessageSize(8, getExt());
                    }
                    int serializedSize = computeUInt32Size + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AssetFormat)) {
                        return super.equals(obj);
                    }
                    AssetFormat assetFormat = (AssetFormat) obj;
                    if (getId() != assetFormat.getId() || getReq() != assetFormat.getReq() || hasTitle() != assetFormat.hasTitle()) {
                        return false;
                    }
                    if ((hasTitle() && !getTitle().equals(assetFormat.getTitle())) || hasImg() != assetFormat.hasImg()) {
                        return false;
                    }
                    if ((hasImg() && !getImg().equals(assetFormat.getImg())) || hasVideo() != assetFormat.hasVideo()) {
                        return false;
                    }
                    if ((hasVideo() && !getVideo().equals(assetFormat.getVideo())) || hasData() != assetFormat.hasData()) {
                        return false;
                    }
                    if ((hasData() && !getData().equals(assetFormat.getData())) || hasExt() != assetFormat.hasExt()) {
                        return false;
                    }
                    if ((!hasExt() || getExt().equals(assetFormat.getExt())) && getExtProtoList().equals(assetFormat.getExtProtoList()) && this.unknownFields.equals(assetFormat.unknownFields)) {
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
                    if (hasImg()) {
                        hashCode = (((hashCode * 37) + 4) * 53) + getImg().hashCode();
                    }
                    if (hasVideo()) {
                        hashCode = (((hashCode * 37) + 5) * 53) + getVideo().hashCode();
                    }
                    if (hasData()) {
                        hashCode = (((hashCode * 37) + 6) * 53) + getData().hashCode();
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

                public static AssetFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static AssetFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static AssetFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static AssetFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static AssetFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static AssetFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static AssetFormat parseFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static AssetFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (AssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (AssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static AssetFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (AssetFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static AssetFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (AssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static AssetFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (AssetFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(AssetFormat assetFormat) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetFormat);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssetFormatOrBuilder {
                    private int bitField0_;
                    private SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> dataBuilder_;
                    private DataAssetFormat data_;
                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private int id_;
                    private SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> imgBuilder_;
                    private ImageAssetFormat img_;
                    private boolean req_;
                    private SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> titleBuilder_;
                    private TitleAssetFormat title_;
                    private SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> videoBuilder_;
                    private VideoPlacement video_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetFormat.class, Builder.class);
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
                        if (AssetFormat.alwaysUseFieldBuilders) {
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
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                        } else {
                            this.img_ = null;
                            this.imgBuilder_ = null;
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
                        return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_AssetFormat_descriptor;
                    }

                    public AssetFormat getDefaultInstanceForType() {
                        return AssetFormat.getDefaultInstance();
                    }

                    public AssetFormat build() {
                        AssetFormat buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public AssetFormat buildPartial() {
                        AssetFormat assetFormat = new AssetFormat((GeneratedMessageV3.Builder) this);
                        int unused = assetFormat.id_ = this.id_;
                        boolean unused2 = assetFormat.req_ = this.req_;
                        SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            TitleAssetFormat unused3 = assetFormat.title_ = this.title_;
                        } else {
                            TitleAssetFormat unused4 = assetFormat.title_ = singleFieldBuilderV3.build();
                        }
                        SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> singleFieldBuilderV32 = this.imgBuilder_;
                        if (singleFieldBuilderV32 == null) {
                            ImageAssetFormat unused5 = assetFormat.img_ = this.img_;
                        } else {
                            ImageAssetFormat unused6 = assetFormat.img_ = singleFieldBuilderV32.build();
                        }
                        SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV33 = this.videoBuilder_;
                        if (singleFieldBuilderV33 == null) {
                            VideoPlacement unused7 = assetFormat.video_ = this.video_;
                        } else {
                            VideoPlacement unused8 = assetFormat.video_ = singleFieldBuilderV33.build();
                        }
                        SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> singleFieldBuilderV34 = this.dataBuilder_;
                        if (singleFieldBuilderV34 == null) {
                            DataAssetFormat unused9 = assetFormat.data_ = this.data_;
                        } else {
                            DataAssetFormat unused10 = assetFormat.data_ = singleFieldBuilderV34.build();
                        }
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV35 = this.extBuilder_;
                        if (singleFieldBuilderV35 == null) {
                            Struct unused11 = assetFormat.ext_ = this.ext_;
                        } else {
                            Struct unused12 = assetFormat.ext_ = singleFieldBuilderV35.build();
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            List unused13 = assetFormat.extProto_ = this.extProto_;
                        } else {
                            List unused14 = assetFormat.extProto_ = repeatedFieldBuilderV3.build();
                        }
                        onBuilt();
                        return assetFormat;
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
                        if (message instanceof AssetFormat) {
                            return mergeFrom((AssetFormat) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(AssetFormat assetFormat) {
                        if (assetFormat == AssetFormat.getDefaultInstance()) {
                            return this;
                        }
                        if (assetFormat.getId() != 0) {
                            setId(assetFormat.getId());
                        }
                        if (assetFormat.getReq()) {
                            setReq(assetFormat.getReq());
                        }
                        if (assetFormat.hasTitle()) {
                            mergeTitle(assetFormat.getTitle());
                        }
                        if (assetFormat.hasImg()) {
                            mergeImg(assetFormat.getImg());
                        }
                        if (assetFormat.hasVideo()) {
                            mergeVideo(assetFormat.getVideo());
                        }
                        if (assetFormat.hasData()) {
                            mergeData(assetFormat.getData());
                        }
                        if (assetFormat.hasExt()) {
                            mergeExt(assetFormat.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!assetFormat.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = assetFormat.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(assetFormat.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!assetFormat.extProto_.isEmpty()) {
                            if (this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.dispose();
                                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                this.extProtoBuilder_ = null;
                                this.extProto_ = assetFormat.extProto_;
                                this.bitField0_ &= -2;
                                if (AssetFormat.alwaysUseFieldBuilders) {
                                    repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                }
                                this.extProtoBuilder_ = repeatedFieldBuilderV3;
                            } else {
                                this.extProtoBuilder_.addAllMessages(assetFormat.extProto_);
                            }
                        }
                        mergeUnknownFields(assetFormat.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$AssetFormat$Builder");
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

                    public TitleAssetFormat getTitle() {
                        SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    public Builder setTitle(TitleAssetFormat titleAssetFormat) {
                        SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(titleAssetFormat);
                        } else if (titleAssetFormat != null) {
                            this.title_ = titleAssetFormat;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setTitle(TitleAssetFormat.Builder builder) {
                        SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.title_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeTitle(TitleAssetFormat titleAssetFormat) {
                        SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            TitleAssetFormat titleAssetFormat2 = this.title_;
                            if (titleAssetFormat2 != null) {
                                this.title_ = TitleAssetFormat.newBuilder(titleAssetFormat2).mergeFrom(titleAssetFormat).buildPartial();
                            } else {
                                this.title_ = titleAssetFormat;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(titleAssetFormat);
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

                    public TitleAssetFormat.Builder getTitleBuilder() {
                        onChanged();
                        return getTitleFieldBuilder().getBuilder();
                    }

                    public TitleAssetFormatOrBuilder getTitleOrBuilder() {
                        SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> singleFieldBuilderV3 = this.titleBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        TitleAssetFormat titleAssetFormat = this.title_;
                        return titleAssetFormat == null ? TitleAssetFormat.getDefaultInstance() : titleAssetFormat;
                    }

                    private SingleFieldBuilderV3<TitleAssetFormat, TitleAssetFormat.Builder, TitleAssetFormatOrBuilder> getTitleFieldBuilder() {
                        if (this.titleBuilder_ == null) {
                            this.titleBuilder_ = new SingleFieldBuilderV3<>(getTitle(), getParentForChildren(), isClean());
                            this.title_ = null;
                        }
                        return this.titleBuilder_;
                    }

                    public boolean hasImg() {
                        return (this.imgBuilder_ == null && this.img_ == null) ? false : true;
                    }

                    public ImageAssetFormat getImg() {
                        SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> singleFieldBuilderV3 = this.imgBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    public Builder setImg(ImageAssetFormat imageAssetFormat) {
                        SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> singleFieldBuilderV3 = this.imgBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(imageAssetFormat);
                        } else if (imageAssetFormat != null) {
                            this.img_ = imageAssetFormat;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setImg(ImageAssetFormat.Builder builder) {
                        SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> singleFieldBuilderV3 = this.imgBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.img_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeImg(ImageAssetFormat imageAssetFormat) {
                        SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> singleFieldBuilderV3 = this.imgBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            ImageAssetFormat imageAssetFormat2 = this.img_;
                            if (imageAssetFormat2 != null) {
                                this.img_ = ImageAssetFormat.newBuilder(imageAssetFormat2).mergeFrom(imageAssetFormat).buildPartial();
                            } else {
                                this.img_ = imageAssetFormat;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(imageAssetFormat);
                        }
                        return this;
                    }

                    public Builder clearImg() {
                        if (this.imgBuilder_ == null) {
                            this.img_ = null;
                            onChanged();
                        } else {
                            this.img_ = null;
                            this.imgBuilder_ = null;
                        }
                        return this;
                    }

                    public ImageAssetFormat.Builder getImgBuilder() {
                        onChanged();
                        return getImgFieldBuilder().getBuilder();
                    }

                    public ImageAssetFormatOrBuilder getImgOrBuilder() {
                        SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> singleFieldBuilderV3 = this.imgBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        ImageAssetFormat imageAssetFormat = this.img_;
                        return imageAssetFormat == null ? ImageAssetFormat.getDefaultInstance() : imageAssetFormat;
                    }

                    private SingleFieldBuilderV3<ImageAssetFormat, ImageAssetFormat.Builder, ImageAssetFormatOrBuilder> getImgFieldBuilder() {
                        if (this.imgBuilder_ == null) {
                            this.imgBuilder_ = new SingleFieldBuilderV3<>(getImg(), getParentForChildren(), isClean());
                            this.img_ = null;
                        }
                        return this.imgBuilder_;
                    }

                    public boolean hasVideo() {
                        return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
                    }

                    public VideoPlacement getVideo() {
                        SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    public Builder setVideo(VideoPlacement videoPlacement) {
                        SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(videoPlacement);
                        } else if (videoPlacement != null) {
                            this.video_ = videoPlacement;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setVideo(VideoPlacement.Builder builder) {
                        SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.video_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeVideo(VideoPlacement videoPlacement) {
                        SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            VideoPlacement videoPlacement2 = this.video_;
                            if (videoPlacement2 != null) {
                                this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
                            } else {
                                this.video_ = videoPlacement;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(videoPlacement);
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

                    public VideoPlacement.Builder getVideoBuilder() {
                        onChanged();
                        return getVideoFieldBuilder().getBuilder();
                    }

                    public VideoPlacementOrBuilder getVideoOrBuilder() {
                        SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        VideoPlacement videoPlacement = this.video_;
                        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
                    }

                    private SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> getVideoFieldBuilder() {
                        if (this.videoBuilder_ == null) {
                            this.videoBuilder_ = new SingleFieldBuilderV3<>(getVideo(), getParentForChildren(), isClean());
                            this.video_ = null;
                        }
                        return this.videoBuilder_;
                    }

                    public boolean hasData() {
                        return (this.dataBuilder_ == null && this.data_ == null) ? false : true;
                    }

                    public DataAssetFormat getData() {
                        SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    public Builder setData(DataAssetFormat dataAssetFormat) {
                        SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(dataAssetFormat);
                        } else if (dataAssetFormat != null) {
                            this.data_ = dataAssetFormat;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setData(DataAssetFormat.Builder builder) {
                        SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.data_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeData(DataAssetFormat dataAssetFormat) {
                        SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            DataAssetFormat dataAssetFormat2 = this.data_;
                            if (dataAssetFormat2 != null) {
                                this.data_ = DataAssetFormat.newBuilder(dataAssetFormat2).mergeFrom(dataAssetFormat).buildPartial();
                            } else {
                                this.data_ = dataAssetFormat;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(dataAssetFormat);
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

                    public DataAssetFormat.Builder getDataBuilder() {
                        onChanged();
                        return getDataFieldBuilder().getBuilder();
                    }

                    public DataAssetFormatOrBuilder getDataOrBuilder() {
                        SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> singleFieldBuilderV3 = this.dataBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        DataAssetFormat dataAssetFormat = this.data_;
                        return dataAssetFormat == null ? DataAssetFormat.getDefaultInstance() : dataAssetFormat;
                    }

                    private SingleFieldBuilderV3<DataAssetFormat, DataAssetFormat.Builder, DataAssetFormatOrBuilder> getDataFieldBuilder() {
                        if (this.dataBuilder_ == null) {
                            this.dataBuilder_ = new SingleFieldBuilderV3<>(getData(), getParentForChildren(), isClean());
                            this.data_ = null;
                        }
                        return this.dataBuilder_;
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

                public static AssetFormat getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<AssetFormat> parser() {
                    return PARSER;
                }

                public Parser<AssetFormat> getParserForType() {
                    return PARSER;
                }

                public AssetFormat getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
            }

            public List<AssetFormat> getAssetList() {
                return this.asset_;
            }

            public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                return this.asset_;
            }

            public int getAssetCount() {
                return this.asset_.size();
            }

            public AssetFormat getAsset(int i) {
                return this.asset_.get(i);
            }

            public AssetFormatOrBuilder getAssetOrBuilder(int i) {
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
                for (int i = 0; i < this.asset_.size(); i++) {
                    codedOutputStream.writeMessage(1, this.asset_.get(i));
                }
                for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                    codedOutputStream.writeMessage(2, this.extProto_.get(i2));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(3, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.asset_.size(); i3++) {
                    i2 += CodedOutputStream.computeMessageSize(1, this.asset_.get(i3));
                }
                for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                    i2 += CodedOutputStream.computeMessageSize(2, this.extProto_.get(i4));
                }
                if (this.ext_ != null) {
                    i2 += CodedOutputStream.computeMessageSize(3, getExt());
                }
                int serializedSize = i2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof NativeFormat)) {
                    return super.equals(obj);
                }
                NativeFormat nativeFormat = (NativeFormat) obj;
                if (!getAssetList().equals(nativeFormat.getAssetList()) || hasExt() != nativeFormat.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(nativeFormat.getExt())) && getExtProtoList().equals(nativeFormat.getExtProtoList()) && this.unknownFields.equals(nativeFormat.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = 779 + getDescriptor().hashCode();
                if (getAssetCount() > 0) {
                    hashCode = (((hashCode * 37) + 1) * 53) + getAssetList().hashCode();
                }
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 2) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static NativeFormat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static NativeFormat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static NativeFormat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static NativeFormat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static NativeFormat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static NativeFormat parseFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static NativeFormat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (NativeFormat) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (NativeFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static NativeFormat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (NativeFormat) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static NativeFormat parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (NativeFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static NativeFormat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (NativeFormat) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(NativeFormat nativeFormat) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(nativeFormat);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements NativeFormatOrBuilder {
                private RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> assetBuilder_;
                private List<AssetFormat> asset_;
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_fieldAccessorTable.ensureFieldAccessorsInitialized(NativeFormat.class, Builder.class);
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
                    if (NativeFormat.alwaysUseFieldBuilders) {
                        getAssetFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
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
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_NativeFormat_descriptor;
                }

                public NativeFormat getDefaultInstanceForType() {
                    return NativeFormat.getDefaultInstance();
                }

                public NativeFormat build() {
                    NativeFormat buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public NativeFormat buildPartial() {
                    NativeFormat nativeFormat = new NativeFormat((GeneratedMessageV3.Builder) this);
                    int i = this.bitField0_;
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((i & 1) != 0) {
                            this.asset_ = Collections.unmodifiableList(this.asset_);
                            this.bitField0_ &= -2;
                        }
                        List unused = nativeFormat.asset_ = this.asset_;
                    } else {
                        List unused2 = nativeFormat.asset_ = repeatedFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused3 = nativeFormat.ext_ = this.ext_;
                    } else {
                        Struct unused4 = nativeFormat.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        List unused5 = nativeFormat.extProto_ = this.extProto_;
                    } else {
                        List unused6 = nativeFormat.extProto_ = repeatedFieldBuilderV32.build();
                    }
                    onBuilt();
                    return nativeFormat;
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
                    if (message instanceof NativeFormat) {
                        return mergeFrom((NativeFormat) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(NativeFormat nativeFormat) {
                    if (nativeFormat == NativeFormat.getDefaultInstance()) {
                        return this;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                    if (this.assetBuilder_ == null) {
                        if (!nativeFormat.asset_.isEmpty()) {
                            if (this.asset_.isEmpty()) {
                                this.asset_ = nativeFormat.asset_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureAssetIsMutable();
                                this.asset_.addAll(nativeFormat.asset_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.asset_.isEmpty()) {
                        if (this.assetBuilder_.isEmpty()) {
                            this.assetBuilder_.dispose();
                            this.assetBuilder_ = null;
                            this.asset_ = nativeFormat.asset_;
                            this.bitField0_ &= -2;
                            this.assetBuilder_ = NativeFormat.alwaysUseFieldBuilders ? getAssetFieldBuilder() : null;
                        } else {
                            this.assetBuilder_.addAllMessages(nativeFormat.asset_);
                        }
                    }
                    if (nativeFormat.hasExt()) {
                        mergeExt(nativeFormat.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!nativeFormat.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = nativeFormat.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(nativeFormat.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!nativeFormat.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = nativeFormat.extProto_;
                            this.bitField0_ &= -3;
                            if (NativeFormat.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(nativeFormat.extProto_);
                        }
                    }
                    mergeUnknownFields(nativeFormat.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.NativeFormat.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$NativeFormat$Builder");
                }

                private void ensureAssetIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.asset_ = new ArrayList(this.asset_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<AssetFormat> getAssetList() {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.asset_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getAssetCount() {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public AssetFormat getAsset(int i) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setAsset(int i, AssetFormat assetFormat) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, assetFormat);
                    } else if (assetFormat != null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i, assetFormat);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setAsset(int i, AssetFormat.Builder builder) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAsset(AssetFormat assetFormat) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(assetFormat);
                    } else if (assetFormat != null) {
                        ensureAssetIsMutable();
                        this.asset_.add(assetFormat);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addAsset(int i, AssetFormat assetFormat) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, assetFormat);
                    } else if (assetFormat != null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i, assetFormat);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addAsset(AssetFormat.Builder builder) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addAsset(int i, AssetFormat.Builder builder) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllAsset(Iterable<? extends AssetFormat> iterable) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
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
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
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
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureAssetIsMutable();
                        this.asset_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public AssetFormat.Builder getAssetBuilder(int i) {
                    return getAssetFieldBuilder().getBuilder(i);
                }

                public AssetFormatOrBuilder getAssetOrBuilder(int i) {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.asset_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AssetFormatOrBuilder> getAssetOrBuilderList() {
                    RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> repeatedFieldBuilderV3 = this.assetBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.asset_);
                }

                public AssetFormat.Builder addAssetBuilder() {
                    return getAssetFieldBuilder().addBuilder(AssetFormat.getDefaultInstance());
                }

                public AssetFormat.Builder addAssetBuilder(int i) {
                    return getAssetFieldBuilder().addBuilder(i, AssetFormat.getDefaultInstance());
                }

                public List<AssetFormat.Builder> getAssetBuilderList() {
                    return getAssetFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<AssetFormat, AssetFormat.Builder, AssetFormatOrBuilder> getAssetFieldBuilder() {
                    if (this.assetBuilder_ == null) {
                        List<AssetFormat> list = this.asset_;
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

            public static NativeFormat getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<NativeFormat> parser() {
                return PARSER;
            }

            public Parser<NativeFormat> getParserForType() {
                return PARSER;
            }

            public NativeFormat getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public static final class EventSpec extends GeneratedMessageV3 implements EventSpecOrBuilder {
            public static final int API_FIELD_NUMBER = 3;
            private static final EventSpec DEFAULT_INSTANCE = new EventSpec();
            public static final int EXT_FIELD_NUMBER = 9;
            public static final int EXT_PROTO_FIELD_NUMBER = 8;
            public static final int JSTRK_FIELD_NUMBER = 4;
            public static final int METHOD_FIELD_NUMBER = 2;
            /* access modifiers changed from: private */
            public static final Parser<EventSpec> PARSER = new AbstractParser<EventSpec>() {
                public EventSpec parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new EventSpec(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int PXTRK_FIELD_NUMBER = 6;
            public static final int TYPE_FIELD_NUMBER = 1;
            public static final int WJS_FIELD_NUMBER = 5;
            public static final int WPX_FIELD_NUMBER = 7;
            /* access modifiers changed from: private */
            public static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() {
                public ApiFramework convert(Integer num) {
                    ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                    return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
                }
            };
            /* access modifiers changed from: private */
            public static final Internal.ListAdapter.Converter<Integer, EventTrackingMethod> method_converter_ = new Internal.ListAdapter.Converter<Integer, EventTrackingMethod>() {
                public EventTrackingMethod convert(Integer num) {
                    EventTrackingMethod valueOf = EventTrackingMethod.valueOf(num.intValue());
                    return valueOf == null ? EventTrackingMethod.UNRECOGNIZED : valueOf;
                }
            };
            private static final long serialVersionUID = 0;
            private int apiMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> api_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public LazyStringList jstrk_;
            private byte memoizedIsInitialized;
            private int methodMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> method_;
            /* access modifiers changed from: private */
            public LazyStringList pxtrk_;
            /* access modifiers changed from: private */
            public int type_;
            /* access modifiers changed from: private */
            public boolean wjs_;
            /* access modifiers changed from: private */
            public boolean wpx_;

            private EventSpec(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private EventSpec() {
                this.memoizedIsInitialized = -1;
                this.type_ = 0;
                this.method_ = Collections.emptyList();
                this.api_ = Collections.emptyList();
                this.jstrk_ = LazyStringArrayList.EMPTY;
                this.pxtrk_ = LazyStringArrayList.EMPTY;
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new EventSpec();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private EventSpec(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                case 8:
                                    this.type_ = codedInputStream.readEnum();
                                    break;
                                case 16:
                                    int readEnum = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.method_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.method_.add(Integer.valueOf(readEnum));
                                    break;
                                case 18:
                                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int readEnum2 = codedInputStream.readEnum();
                                        if (!z2 || !true) {
                                            this.method_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.method_.add(Integer.valueOf(readEnum2));
                                    }
                                    codedInputStream.popLimit(pushLimit);
                                    break;
                                case 24:
                                    int readEnum3 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.api_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.api_.add(Integer.valueOf(readEnum3));
                                    break;
                                case 26:
                                    int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int readEnum4 = codedInputStream.readEnum();
                                        if (!z2 || !true) {
                                            this.api_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.api_.add(Integer.valueOf(readEnum4));
                                    }
                                    codedInputStream.popLimit(pushLimit2);
                                    break;
                                case 34:
                                    String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                    if (!z2 || !true) {
                                        this.jstrk_ = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.jstrk_.add(readStringRequireUtf8);
                                    break;
                                case 40:
                                    this.wjs_ = codedInputStream.readBool();
                                    break;
                                case 50:
                                    String readStringRequireUtf82 = codedInputStream.readStringRequireUtf8();
                                    if (!z2 || !true) {
                                        this.pxtrk_ = new LazyStringArrayList();
                                        z2 |= true;
                                    }
                                    this.pxtrk_.add(readStringRequireUtf82);
                                    break;
                                case 56:
                                    this.wpx_ = codedInputStream.readBool();
                                    break;
                                case 66:
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    break;
                                case 74:
                                    Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder == null) {
                                        break;
                                    } else {
                                        builder.mergeFrom(struct);
                                        this.ext_ = builder.buildPartial();
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
                                this.method_ = Collections.unmodifiableList(this.method_);
                            }
                            if (z2 && true) {
                                this.api_ = Collections.unmodifiableList(this.api_);
                            }
                            if (z2 && true) {
                                this.jstrk_ = this.jstrk_.getUnmodifiableView();
                            }
                            if (z2 && true) {
                                this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
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
                        this.method_ = Collections.unmodifiableList(this.method_);
                    }
                    if (z2 && true) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                    }
                    if (z2 && true) {
                        this.jstrk_ = this.jstrk_.getUnmodifiableView();
                    }
                    if (z2 && true) {
                        this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
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
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_EventSpec_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_EventSpec_fieldAccessorTable.ensureFieldAccessorsInitialized(EventSpec.class, Builder.class);
            }

            public int getTypeValue() {
                return this.type_;
            }

            public EventType getType() {
                EventType valueOf = EventType.valueOf(this.type_);
                return valueOf == null ? EventType.UNRECOGNIZED : valueOf;
            }

            public List<EventTrackingMethod> getMethodList() {
                return new Internal.ListAdapter(this.method_, method_converter_);
            }

            public int getMethodCount() {
                return this.method_.size();
            }

            public EventTrackingMethod getMethod(int i) {
                return method_converter_.convert(this.method_.get(i));
            }

            public List<Integer> getMethodValueList() {
                return this.method_;
            }

            public int getMethodValue(int i) {
                return this.method_.get(i).intValue();
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

            public ProtocolStringList getJstrkList() {
                return this.jstrk_;
            }

            public int getJstrkCount() {
                return this.jstrk_.size();
            }

            public String getJstrk(int i) {
                return (String) this.jstrk_.get(i);
            }

            public ByteString getJstrkBytes(int i) {
                return this.jstrk_.getByteString(i);
            }

            public boolean getWjs() {
                return this.wjs_;
            }

            public ProtocolStringList getPxtrkList() {
                return this.pxtrk_;
            }

            public int getPxtrkCount() {
                return this.pxtrk_.size();
            }

            public String getPxtrk(int i) {
                return (String) this.pxtrk_.get(i);
            }

            public ByteString getPxtrkBytes(int i) {
                return this.pxtrk_.getByteString(i);
            }

            public boolean getWpx() {
                return this.wpx_;
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
                if (getMethodList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(18);
                    codedOutputStream.writeUInt32NoTag(this.methodMemoizedSerializedSize);
                }
                for (int i = 0; i < this.method_.size(); i++) {
                    codedOutputStream.writeEnumNoTag(this.method_.get(i).intValue());
                }
                if (getApiList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(26);
                    codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.api_.size(); i2++) {
                    codedOutputStream.writeEnumNoTag(this.api_.get(i2).intValue());
                }
                for (int i3 = 0; i3 < this.jstrk_.size(); i3++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.jstrk_.getRaw(i3));
                }
                boolean z = this.wjs_;
                if (z) {
                    codedOutputStream.writeBool(5, z);
                }
                for (int i4 = 0; i4 < this.pxtrk_.size(); i4++) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.pxtrk_.getRaw(i4));
                }
                boolean z2 = this.wpx_;
                if (z2) {
                    codedOutputStream.writeBool(7, z2);
                }
                for (int i5 = 0; i5 < this.extProto_.size(); i5++) {
                    codedOutputStream.writeMessage(8, this.extProto_.get(i5));
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
                int computeEnumSize = this.type_ != EventType.EVENT_TYPE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) + 0 : 0;
                int i2 = 0;
                for (int i3 = 0; i3 < this.method_.size(); i3++) {
                    i2 += CodedOutputStream.computeEnumSizeNoTag(this.method_.get(i3).intValue());
                }
                int i4 = computeEnumSize + i2;
                if (!getMethodList().isEmpty()) {
                    i4 = i4 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i2);
                }
                this.methodMemoizedSerializedSize = i2;
                int i5 = 0;
                for (int i6 = 0; i6 < this.api_.size(); i6++) {
                    i5 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i6).intValue());
                }
                int i7 = i4 + i5;
                if (!getApiList().isEmpty()) {
                    i7 = i7 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i5);
                }
                this.apiMemoizedSerializedSize = i5;
                int i8 = 0;
                for (int i9 = 0; i9 < this.jstrk_.size(); i9++) {
                    i8 += computeStringSizeNoTag(this.jstrk_.getRaw(i9));
                }
                int size = i7 + i8 + (getJstrkList().size() * 1);
                boolean z = this.wjs_;
                if (z) {
                    size += CodedOutputStream.computeBoolSize(5, z);
                }
                int i10 = 0;
                for (int i11 = 0; i11 < this.pxtrk_.size(); i11++) {
                    i10 += computeStringSizeNoTag(this.pxtrk_.getRaw(i11));
                }
                int size2 = size + i10 + (getPxtrkList().size() * 1);
                boolean z2 = this.wpx_;
                if (z2) {
                    size2 += CodedOutputStream.computeBoolSize(7, z2);
                }
                for (int i12 = 0; i12 < this.extProto_.size(); i12++) {
                    size2 += CodedOutputStream.computeMessageSize(8, this.extProto_.get(i12));
                }
                if (this.ext_ != null) {
                    size2 += CodedOutputStream.computeMessageSize(9, getExt());
                }
                int serializedSize = size2 + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EventSpec)) {
                    return super.equals(obj);
                }
                EventSpec eventSpec = (EventSpec) obj;
                if (this.type_ != eventSpec.type_ || !this.method_.equals(eventSpec.method_) || !this.api_.equals(eventSpec.api_) || !getJstrkList().equals(eventSpec.getJstrkList()) || getWjs() != eventSpec.getWjs() || !getPxtrkList().equals(eventSpec.getPxtrkList()) || getWpx() != eventSpec.getWpx() || hasExt() != eventSpec.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(eventSpec.getExt())) && getExtProtoList().equals(eventSpec.getExtProtoList()) && this.unknownFields.equals(eventSpec.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_;
                if (getMethodCount() > 0) {
                    hashCode = (((hashCode * 37) + 2) * 53) + this.method_.hashCode();
                }
                if (getApiCount() > 0) {
                    hashCode = (((hashCode * 37) + 3) * 53) + this.api_.hashCode();
                }
                if (getJstrkCount() > 0) {
                    hashCode = (((hashCode * 37) + 4) * 53) + getJstrkList().hashCode();
                }
                int hashBoolean = (((hashCode * 37) + 5) * 53) + Internal.hashBoolean(getWjs());
                if (getPxtrkCount() > 0) {
                    hashBoolean = (((hashBoolean * 37) + 6) * 53) + getPxtrkList().hashCode();
                }
                int hashBoolean2 = (((hashBoolean * 37) + 7) * 53) + Internal.hashBoolean(getWpx());
                if (hasExt()) {
                    hashBoolean2 = (((hashBoolean2 * 37) + 9) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashBoolean2 = (((hashBoolean2 * 37) + 8) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashBoolean2 * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static EventSpec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static EventSpec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static EventSpec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static EventSpec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static EventSpec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static EventSpec parseFrom(InputStream inputStream) throws IOException {
                return (EventSpec) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EventSpec) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (EventSpec) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static EventSpec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EventSpec) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static EventSpec parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (EventSpec) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static EventSpec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (EventSpec) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(EventSpec eventSpec) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventSpec);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventSpecOrBuilder {
                private List<Integer> api_;
                private int bitField0_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private LazyStringList jstrk_;
                private List<Integer> method_;
                private LazyStringList pxtrk_;
                private int type_;
                private boolean wjs_;
                private boolean wpx_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_EventSpec_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_EventSpec_fieldAccessorTable.ensureFieldAccessorsInitialized(EventSpec.class, Builder.class);
                }

                private Builder() {
                    this.type_ = 0;
                    this.method_ = Collections.emptyList();
                    this.api_ = Collections.emptyList();
                    this.jstrk_ = LazyStringArrayList.EMPTY;
                    this.pxtrk_ = LazyStringArrayList.EMPTY;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.type_ = 0;
                    this.method_ = Collections.emptyList();
                    this.api_ = Collections.emptyList();
                    this.jstrk_ = LazyStringArrayList.EMPTY;
                    this.pxtrk_ = LazyStringArrayList.EMPTY;
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (EventSpec.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.type_ = 0;
                    this.method_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    this.api_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    this.jstrk_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -5;
                    this.wjs_ = false;
                    this.pxtrk_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -9;
                    this.wpx_ = false;
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -17;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_EventSpec_descriptor;
                }

                public EventSpec getDefaultInstanceForType() {
                    return EventSpec.getDefaultInstance();
                }

                public EventSpec build() {
                    EventSpec buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public EventSpec buildPartial() {
                    EventSpec eventSpec = new EventSpec((GeneratedMessageV3.Builder) this);
                    int unused = eventSpec.type_ = this.type_;
                    if ((this.bitField0_ & 1) != 0) {
                        this.method_ = Collections.unmodifiableList(this.method_);
                        this.bitField0_ &= -2;
                    }
                    List unused2 = eventSpec.method_ = this.method_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.api_ = Collections.unmodifiableList(this.api_);
                        this.bitField0_ &= -3;
                    }
                    List unused3 = eventSpec.api_ = this.api_;
                    if ((this.bitField0_ & 4) != 0) {
                        this.jstrk_ = this.jstrk_.getUnmodifiableView();
                        this.bitField0_ &= -5;
                    }
                    LazyStringList unused4 = eventSpec.jstrk_ = this.jstrk_;
                    boolean unused5 = eventSpec.wjs_ = this.wjs_;
                    if ((this.bitField0_ & 8) != 0) {
                        this.pxtrk_ = this.pxtrk_.getUnmodifiableView();
                        this.bitField0_ &= -9;
                    }
                    LazyStringList unused6 = eventSpec.pxtrk_ = this.pxtrk_;
                    boolean unused7 = eventSpec.wpx_ = this.wpx_;
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct unused8 = eventSpec.ext_ = this.ext_;
                    } else {
                        Struct unused9 = eventSpec.ext_ = singleFieldBuilderV3.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 16) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -17;
                        }
                        List unused10 = eventSpec.extProto_ = this.extProto_;
                    } else {
                        List unused11 = eventSpec.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return eventSpec;
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
                    if (message instanceof EventSpec) {
                        return mergeFrom((EventSpec) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(EventSpec eventSpec) {
                    if (eventSpec == EventSpec.getDefaultInstance()) {
                        return this;
                    }
                    if (eventSpec.type_ != 0) {
                        setTypeValue(eventSpec.getTypeValue());
                    }
                    if (!eventSpec.method_.isEmpty()) {
                        if (this.method_.isEmpty()) {
                            this.method_ = eventSpec.method_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMethodIsMutable();
                            this.method_.addAll(eventSpec.method_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.api_.isEmpty()) {
                        if (this.api_.isEmpty()) {
                            this.api_ = eventSpec.api_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureApiIsMutable();
                            this.api_.addAll(eventSpec.api_);
                        }
                        onChanged();
                    }
                    if (!eventSpec.jstrk_.isEmpty()) {
                        if (this.jstrk_.isEmpty()) {
                            this.jstrk_ = eventSpec.jstrk_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureJstrkIsMutable();
                            this.jstrk_.addAll(eventSpec.jstrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWjs()) {
                        setWjs(eventSpec.getWjs());
                    }
                    if (!eventSpec.pxtrk_.isEmpty()) {
                        if (this.pxtrk_.isEmpty()) {
                            this.pxtrk_ = eventSpec.pxtrk_;
                            this.bitField0_ &= -9;
                        } else {
                            ensurePxtrkIsMutable();
                            this.pxtrk_.addAll(eventSpec.pxtrk_);
                        }
                        onChanged();
                    }
                    if (eventSpec.getWpx()) {
                        setWpx(eventSpec.getWpx());
                    }
                    if (eventSpec.hasExt()) {
                        mergeExt(eventSpec.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!eventSpec.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = eventSpec.extProto_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(eventSpec.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!eventSpec.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = eventSpec.extProto_;
                            this.bitField0_ &= -17;
                            if (EventSpec.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(eventSpec.extProto_);
                        }
                    }
                    mergeUnknownFields(eventSpec.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.EventSpec.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$EventSpec$Builder");
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

                private void ensureMethodIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.method_ = new ArrayList(this.method_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<EventTrackingMethod> getMethodList() {
                    return new Internal.ListAdapter(this.method_, EventSpec.method_converter_);
                }

                public int getMethodCount() {
                    return this.method_.size();
                }

                public EventTrackingMethod getMethod(int i) {
                    return (EventTrackingMethod) EventSpec.method_converter_.convert(this.method_.get(i));
                }

                public Builder setMethod(int i, EventTrackingMethod eventTrackingMethod) {
                    if (eventTrackingMethod != null) {
                        ensureMethodIsMutable();
                        this.method_.set(i, Integer.valueOf(eventTrackingMethod.getNumber()));
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addMethod(EventTrackingMethod eventTrackingMethod) {
                    if (eventTrackingMethod != null) {
                        ensureMethodIsMutable();
                        this.method_.add(Integer.valueOf(eventTrackingMethod.getNumber()));
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllMethod(Iterable<? extends EventTrackingMethod> iterable) {
                    ensureMethodIsMutable();
                    for (EventTrackingMethod number : iterable) {
                        this.method_.add(Integer.valueOf(number.getNumber()));
                    }
                    onChanged();
                    return this;
                }

                public Builder clearMethod() {
                    this.method_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public List<Integer> getMethodValueList() {
                    return Collections.unmodifiableList(this.method_);
                }

                public int getMethodValue(int i) {
                    return this.method_.get(i).intValue();
                }

                public Builder setMethodValue(int i, int i2) {
                    ensureMethodIsMutable();
                    this.method_.set(i, Integer.valueOf(i2));
                    onChanged();
                    return this;
                }

                public Builder addMethodValue(int i) {
                    ensureMethodIsMutable();
                    this.method_.add(Integer.valueOf(i));
                    onChanged();
                    return this;
                }

                public Builder addAllMethodValue(Iterable<Integer> iterable) {
                    ensureMethodIsMutable();
                    for (Integer intValue : iterable) {
                        this.method_.add(Integer.valueOf(intValue.intValue()));
                    }
                    onChanged();
                    return this;
                }

                private void ensureApiIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.api_ = new ArrayList(this.api_);
                        this.bitField0_ |= 2;
                    }
                }

                public List<ApiFramework> getApiList() {
                    return new Internal.ListAdapter(this.api_, EventSpec.api_converter_);
                }

                public int getApiCount() {
                    return this.api_.size();
                }

                public ApiFramework getApi(int i) {
                    return (ApiFramework) EventSpec.api_converter_.convert(this.api_.get(i));
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

                private void ensureJstrkIsMutable() {
                    if ((this.bitField0_ & 4) == 0) {
                        this.jstrk_ = new LazyStringArrayList(this.jstrk_);
                        this.bitField0_ |= 4;
                    }
                }

                public ProtocolStringList getJstrkList() {
                    return this.jstrk_.getUnmodifiableView();
                }

                public int getJstrkCount() {
                    return this.jstrk_.size();
                }

                public String getJstrk(int i) {
                    return (String) this.jstrk_.get(i);
                }

                public ByteString getJstrkBytes(int i) {
                    return this.jstrk_.getByteString(i);
                }

                public Builder setJstrk(int i, String str) {
                    if (str != null) {
                        ensureJstrkIsMutable();
                        this.jstrk_.set(i, str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addJstrk(String str) {
                    if (str != null) {
                        ensureJstrkIsMutable();
                        this.jstrk_.add(str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllJstrk(Iterable<String> iterable) {
                    ensureJstrkIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.jstrk_);
                    onChanged();
                    return this;
                }

                public Builder clearJstrk() {
                    this.jstrk_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder addJstrkBytes(ByteString byteString) {
                    if (byteString != null) {
                        EventSpec.checkByteStringIsUtf8(byteString);
                        ensureJstrkIsMutable();
                        this.jstrk_.add(byteString);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean getWjs() {
                    return this.wjs_;
                }

                public Builder setWjs(boolean z) {
                    this.wjs_ = z;
                    onChanged();
                    return this;
                }

                public Builder clearWjs() {
                    this.wjs_ = false;
                    onChanged();
                    return this;
                }

                private void ensurePxtrkIsMutable() {
                    if ((this.bitField0_ & 8) == 0) {
                        this.pxtrk_ = new LazyStringArrayList(this.pxtrk_);
                        this.bitField0_ |= 8;
                    }
                }

                public ProtocolStringList getPxtrkList() {
                    return this.pxtrk_.getUnmodifiableView();
                }

                public int getPxtrkCount() {
                    return this.pxtrk_.size();
                }

                public String getPxtrk(int i) {
                    return (String) this.pxtrk_.get(i);
                }

                public ByteString getPxtrkBytes(int i) {
                    return this.pxtrk_.getByteString(i);
                }

                public Builder setPxtrk(int i, String str) {
                    if (str != null) {
                        ensurePxtrkIsMutable();
                        this.pxtrk_.set(i, str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addPxtrk(String str) {
                    if (str != null) {
                        ensurePxtrkIsMutable();
                        this.pxtrk_.add(str);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder addAllPxtrk(Iterable<String> iterable) {
                    ensurePxtrkIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.pxtrk_);
                    onChanged();
                    return this;
                }

                public Builder clearPxtrk() {
                    this.pxtrk_ = LazyStringArrayList.EMPTY;
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                public Builder addPxtrkBytes(ByteString byteString) {
                    if (byteString != null) {
                        EventSpec.checkByteStringIsUtf8(byteString);
                        ensurePxtrkIsMutable();
                        this.pxtrk_.add(byteString);
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public boolean getWpx() {
                    return this.wpx_;
                }

                public Builder setWpx(boolean z) {
                    this.wpx_ = z;
                    onChanged();
                    return this;
                }

                public Builder clearWpx() {
                    this.wpx_ = false;
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

            public static EventSpec getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<EventSpec> parser() {
                return PARSER;
            }

            public Parser<EventSpec> getParserForType() {
                return PARSER;
            }

            public EventSpec getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public int getPosValue() {
            return this.pos_;
        }

        public PlacementPosition getPos() {
            PlacementPosition valueOf = PlacementPosition.valueOf(this.pos_);
            return valueOf == null ? PlacementPosition.UNRECOGNIZED : valueOf;
        }

        public boolean getInstl() {
            return this.instl_;
        }

        public boolean getTopframe() {
            return this.topframe_;
        }

        public ProtocolStringList getIfrbustList() {
            return this.ifrbust_;
        }

        public int getIfrbustCount() {
            return this.ifrbust_.size();
        }

        public String getIfrbust(int i) {
            return (String) this.ifrbust_.get(i);
        }

        public ByteString getIfrbustBytes(int i) {
            return this.ifrbust_.getByteString(i);
        }

        public int getClktypeValue() {
            return this.clktype_;
        }

        public ClickType getClktype() {
            ClickType valueOf = ClickType.valueOf(this.clktype_);
            return valueOf == null ? ClickType.UNRECOGNIZED : valueOf;
        }

        public int getAmpren() {
            return this.ampren_;
        }

        public int getPtypeValue() {
            return this.ptype_;
        }

        public DisplayPlacementType getPtype() {
            DisplayPlacementType valueOf = DisplayPlacementType.valueOf(this.ptype_);
            return valueOf == null ? DisplayPlacementType.UNRECOGNIZED : valueOf;
        }

        public int getContextValue() {
            return this.context_;
        }

        public DisplayContextType getContext() {
            DisplayContextType valueOf = DisplayContextType.valueOf(this.context_);
            return valueOf == null ? DisplayContextType.UNRECOGNIZED : valueOf;
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

        public List<DisplayCreativeType> getCtypeList() {
            return new Internal.ListAdapter(this.ctype_, ctype_converter_);
        }

        public int getCtypeCount() {
            return this.ctype_.size();
        }

        public DisplayCreativeType getCtype(int i) {
            return ctype_converter_.convert(this.ctype_.get(i));
        }

        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        public int getCtypeValue(int i) {
            return this.ctype_.get(i).intValue();
        }

        public int getW() {
            return this.w_;
        }

        public int getH() {
            return this.h_;
        }

        public int getUnitValue() {
            return this.unit_;
        }

        public SizeUnit getUnit() {
            SizeUnit valueOf = SizeUnit.valueOf(this.unit_);
            return valueOf == null ? SizeUnit.UNRECOGNIZED : valueOf;
        }

        public boolean getPriv() {
            return this.priv_;
        }

        public List<DisplayFormat> getDisplayfmtList() {
            return this.displayfmt_;
        }

        public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
            return this.displayfmt_;
        }

        public int getDisplayfmtCount() {
            return this.displayfmt_.size();
        }

        public DisplayFormat getDisplayfmt(int i) {
            return this.displayfmt_.get(i);
        }

        public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i) {
            return this.displayfmt_.get(i);
        }

        public boolean hasNativefmt() {
            return this.nativefmt_ != null;
        }

        public NativeFormat getNativefmt() {
            NativeFormat nativeFormat = this.nativefmt_;
            return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
        }

        public NativeFormatOrBuilder getNativefmtOrBuilder() {
            return getNativefmt();
        }

        public List<EventSpec> getEventList() {
            return this.event_;
        }

        public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
            return this.event_;
        }

        public int getEventCount() {
            return this.event_.size();
        }

        public EventSpec getEvent(int i) {
            return this.event_.get(i);
        }

        public EventSpecOrBuilder getEventOrBuilder(int i) {
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
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.pos_);
            }
            boolean z = this.instl_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            boolean z2 = this.topframe_;
            if (z2) {
                codedOutputStream.writeBool(3, z2);
            }
            for (int i = 0; i < this.ifrbust_.size(); i++) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.ifrbust_.getRaw(i));
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                codedOutputStream.writeEnum(5, this.clktype_);
            }
            int i2 = this.ampren_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(6, i2);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(8, this.context_);
            }
            for (int i3 = 0; i3 < this.mime_.size(); i3++) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.mime_.getRaw(i3));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(82);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i4 = 0; i4 < this.api_.size(); i4++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i4).intValue());
            }
            if (getCtypeList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(90);
                codedOutputStream.writeUInt32NoTag(this.ctypeMemoizedSerializedSize);
            }
            for (int i5 = 0; i5 < this.ctype_.size(); i5++) {
                codedOutputStream.writeEnumNoTag(this.ctype_.get(i5).intValue());
            }
            int i6 = this.w_;
            if (i6 != 0) {
                codedOutputStream.writeUInt32(12, i6);
            }
            int i7 = this.h_;
            if (i7 != 0) {
                codedOutputStream.writeUInt32(13, i7);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                codedOutputStream.writeEnum(14, this.unit_);
            }
            boolean z3 = this.priv_;
            if (z3) {
                codedOutputStream.writeBool(15, z3);
            }
            for (int i8 = 0; i8 < this.displayfmt_.size(); i8++) {
                codedOutputStream.writeMessage(16, this.displayfmt_.get(i8));
            }
            if (this.nativefmt_ != null) {
                codedOutputStream.writeMessage(17, getNativefmt());
            }
            for (int i9 = 0; i9 < this.event_.size(); i9++) {
                codedOutputStream.writeMessage(18, this.event_.get(i9));
            }
            for (int i10 = 0; i10 < this.extProto_.size(); i10++) {
                codedOutputStream.writeMessage(19, this.extProto_.get(i10));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(20, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.pos_) + 0 : 0;
            boolean z = this.instl_;
            if (z) {
                computeEnumSize += CodedOutputStream.computeBoolSize(2, z);
            }
            boolean z2 = this.topframe_;
            if (z2) {
                computeEnumSize += CodedOutputStream.computeBoolSize(3, z2);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.ifrbust_.size(); i3++) {
                i2 += computeStringSizeNoTag(this.ifrbust_.getRaw(i3));
            }
            int size = computeEnumSize + i2 + (getIfrbustList().size() * 1);
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(5, this.clktype_);
            }
            int i4 = this.ampren_;
            if (i4 != 0) {
                size += CodedOutputStream.computeUInt32Size(6, i4);
            }
            if (this.ptype_ != DisplayPlacementType.DISPLAY_PLACEMENT_TYPE_INVALID.getNumber()) {
                size += CodedOutputStream.computeEnumSize(7, this.ptype_);
            }
            if (this.context_ != DisplayContextType.DISPLAY_CONTEXT_TYPE_INVALID.getNumber()) {
                size += CodedOutputStream.computeEnumSize(8, this.context_);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.mime_.size(); i6++) {
                i5 += computeStringSizeNoTag(this.mime_.getRaw(i6));
            }
            int size2 = size + i5 + (getMimeList().size() * 1);
            int i7 = 0;
            for (int i8 = 0; i8 < this.api_.size(); i8++) {
                i7 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i8).intValue());
            }
            int i9 = size2 + i7;
            if (!getApiList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i7);
            }
            this.apiMemoizedSerializedSize = i7;
            int i10 = 0;
            for (int i11 = 0; i11 < this.ctype_.size(); i11++) {
                i10 += CodedOutputStream.computeEnumSizeNoTag(this.ctype_.get(i11).intValue());
            }
            int i12 = i9 + i10;
            if (!getCtypeList().isEmpty()) {
                i12 = i12 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i10);
            }
            this.ctypeMemoizedSerializedSize = i10;
            int i13 = this.w_;
            if (i13 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(12, i13);
            }
            int i14 = this.h_;
            if (i14 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(13, i14);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                i12 += CodedOutputStream.computeEnumSize(14, this.unit_);
            }
            boolean z3 = this.priv_;
            if (z3) {
                i12 += CodedOutputStream.computeBoolSize(15, z3);
            }
            for (int i15 = 0; i15 < this.displayfmt_.size(); i15++) {
                i12 += CodedOutputStream.computeMessageSize(16, this.displayfmt_.get(i15));
            }
            if (this.nativefmt_ != null) {
                i12 += CodedOutputStream.computeMessageSize(17, getNativefmt());
            }
            for (int i16 = 0; i16 < this.event_.size(); i16++) {
                i12 += CodedOutputStream.computeMessageSize(18, this.event_.get(i16));
            }
            for (int i17 = 0; i17 < this.extProto_.size(); i17++) {
                i12 += CodedOutputStream.computeMessageSize(19, this.extProto_.get(i17));
            }
            if (this.ext_ != null) {
                i12 += CodedOutputStream.computeMessageSize(20, getExt());
            }
            int serializedSize = i12 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayPlacement)) {
                return super.equals(obj);
            }
            DisplayPlacement displayPlacement = (DisplayPlacement) obj;
            if (this.pos_ != displayPlacement.pos_ || getInstl() != displayPlacement.getInstl() || getTopframe() != displayPlacement.getTopframe() || !getIfrbustList().equals(displayPlacement.getIfrbustList()) || this.clktype_ != displayPlacement.clktype_ || getAmpren() != displayPlacement.getAmpren() || this.ptype_ != displayPlacement.ptype_ || this.context_ != displayPlacement.context_ || !getMimeList().equals(displayPlacement.getMimeList()) || !this.api_.equals(displayPlacement.api_) || !this.ctype_.equals(displayPlacement.ctype_) || getW() != displayPlacement.getW() || getH() != displayPlacement.getH() || this.unit_ != displayPlacement.unit_ || getPriv() != displayPlacement.getPriv() || !getDisplayfmtList().equals(displayPlacement.getDisplayfmtList()) || hasNativefmt() != displayPlacement.hasNativefmt()) {
                return false;
            }
            if ((hasNativefmt() && !getNativefmt().equals(displayPlacement.getNativefmt())) || !getEventList().equals(displayPlacement.getEventList()) || hasExt() != displayPlacement.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(displayPlacement.getExt())) && getExtProtoList().equals(displayPlacement.getExtProtoList()) && this.unknownFields.equals(displayPlacement.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.pos_) * 37) + 2) * 53) + Internal.hashBoolean(getInstl())) * 37) + 3) * 53) + Internal.hashBoolean(getTopframe());
            if (getIfrbustCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getIfrbustList().hashCode();
            }
            int ampren = (((((((((((((((hashCode * 37) + 5) * 53) + this.clktype_) * 37) + 6) * 53) + getAmpren()) * 37) + 7) * 53) + this.ptype_) * 37) + 8) * 53) + this.context_;
            if (getMimeCount() > 0) {
                ampren = (((ampren * 37) + 9) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                ampren = (((ampren * 37) + 10) * 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                ampren = (((ampren * 37) + 11) * 53) + this.ctype_.hashCode();
            }
            int w = (((((((((((((((ampren * 37) + 12) * 53) + getW()) * 37) + 13) * 53) + getH()) * 37) + 14) * 53) + this.unit_) * 37) + 15) * 53) + Internal.hashBoolean(getPriv());
            if (getDisplayfmtCount() > 0) {
                w = (((w * 37) + 16) * 53) + getDisplayfmtList().hashCode();
            }
            if (hasNativefmt()) {
                w = (((w * 37) + 17) * 53) + getNativefmt().hashCode();
            }
            if (getEventCount() > 0) {
                w = (((w * 37) + 18) * 53) + getEventList().hashCode();
            }
            if (hasExt()) {
                w = (((w * 37) + 20) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                w = (((w * 37) + 19) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (w * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static DisplayPlacement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static DisplayPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static DisplayPlacement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DisplayPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static DisplayPlacement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisplayPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DisplayPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayPlacement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisplayPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisplayPlacement parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DisplayPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DisplayPlacement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DisplayPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DisplayPlacement displayPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayPlacement);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisplayPlacementOrBuilder {
            private int ampren_;
            private List<Integer> api_;
            private int bitField0_;
            private int clktype_;
            private int context_;
            private List<Integer> ctype_;
            private RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> displayfmtBuilder_;
            private List<DisplayFormat> displayfmt_;
            private RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> eventBuilder_;
            private List<EventSpec> event_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private LazyStringList ifrbust_;
            private boolean instl_;
            private LazyStringList mime_;
            private SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> nativefmtBuilder_;
            private NativeFormat nativefmt_;
            private int pos_;
            private boolean priv_;
            private int ptype_;
            private boolean topframe_;
            private int unit_;
            private int w_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayPlacement.class, Builder.class);
            }

            private Builder() {
                this.pos_ = 0;
                this.ifrbust_ = LazyStringArrayList.EMPTY;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.displayfmt_ = Collections.emptyList();
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.pos_ = 0;
                this.ifrbust_ = LazyStringArrayList.EMPTY;
                this.clktype_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.displayfmt_ = Collections.emptyList();
                this.event_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (DisplayPlacement.alwaysUseFieldBuilders) {
                    getDisplayfmtFieldBuilder();
                    getEventFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.pos_ = 0;
                this.instl_ = false;
                this.topframe_ = false;
                this.ifrbust_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.clktype_ = 0;
                this.ampren_ = 0;
                this.ptype_ = 0;
                this.context_ = 0;
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -3;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -9;
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.priv_ = false;
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.displayfmt_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                } else {
                    this.nativefmt_ = null;
                    this.nativefmtBuilder_ = null;
                }
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV32 = this.eventBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                } else {
                    repeatedFieldBuilderV32.clear();
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
                    this.bitField0_ &= -65;
                } else {
                    repeatedFieldBuilderV33.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_DisplayPlacement_descriptor;
            }

            public DisplayPlacement getDefaultInstanceForType() {
                return DisplayPlacement.getDefaultInstance();
            }

            public DisplayPlacement build() {
                DisplayPlacement buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public DisplayPlacement buildPartial() {
                DisplayPlacement displayPlacement = new DisplayPlacement((GeneratedMessageV3.Builder) this);
                int unused = displayPlacement.pos_ = this.pos_;
                boolean unused2 = displayPlacement.instl_ = this.instl_;
                boolean unused3 = displayPlacement.topframe_ = this.topframe_;
                if ((this.bitField0_ & 1) != 0) {
                    this.ifrbust_ = this.ifrbust_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused4 = displayPlacement.ifrbust_ = this.ifrbust_;
                int unused5 = displayPlacement.clktype_ = this.clktype_;
                int unused6 = displayPlacement.ampren_ = this.ampren_;
                int unused7 = displayPlacement.ptype_ = this.ptype_;
                int unused8 = displayPlacement.context_ = this.context_;
                if ((this.bitField0_ & 2) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -3;
                }
                LazyStringList unused9 = displayPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 4) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -5;
                }
                List unused10 = displayPlacement.api_ = this.api_;
                if ((this.bitField0_ & 8) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -9;
                }
                List unused11 = displayPlacement.ctype_ = this.ctype_;
                int unused12 = displayPlacement.w_ = this.w_;
                int unused13 = displayPlacement.h_ = this.h_;
                int unused14 = displayPlacement.unit_ = this.unit_;
                boolean unused15 = displayPlacement.priv_ = this.priv_;
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.displayfmt_ = Collections.unmodifiableList(this.displayfmt_);
                        this.bitField0_ &= -17;
                    }
                    List unused16 = displayPlacement.displayfmt_ = this.displayfmt_;
                } else {
                    List unused17 = displayPlacement.displayfmt_ = repeatedFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> singleFieldBuilderV3 = this.nativefmtBuilder_;
                if (singleFieldBuilderV3 == null) {
                    NativeFormat unused18 = displayPlacement.nativefmt_ = this.nativefmt_;
                } else {
                    NativeFormat unused19 = displayPlacement.nativefmt_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV32 = this.eventBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 32) != 0) {
                        this.event_ = Collections.unmodifiableList(this.event_);
                        this.bitField0_ &= -33;
                    }
                    List unused20 = displayPlacement.event_ = this.event_;
                } else {
                    List unused21 = displayPlacement.event_ = repeatedFieldBuilderV32.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                if (singleFieldBuilderV32 == null) {
                    Struct unused22 = displayPlacement.ext_ = this.ext_;
                } else {
                    Struct unused23 = displayPlacement.ext_ = singleFieldBuilderV32.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV33 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV33 == null) {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    List unused24 = displayPlacement.extProto_ = this.extProto_;
                } else {
                    List unused25 = displayPlacement.extProto_ = repeatedFieldBuilderV33.build();
                }
                onBuilt();
                return displayPlacement;
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
                if (message instanceof DisplayPlacement) {
                    return mergeFrom((DisplayPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DisplayPlacement displayPlacement) {
                if (displayPlacement == DisplayPlacement.getDefaultInstance()) {
                    return this;
                }
                if (displayPlacement.pos_ != 0) {
                    setPosValue(displayPlacement.getPosValue());
                }
                if (displayPlacement.getInstl()) {
                    setInstl(displayPlacement.getInstl());
                }
                if (displayPlacement.getTopframe()) {
                    setTopframe(displayPlacement.getTopframe());
                }
                if (!displayPlacement.ifrbust_.isEmpty()) {
                    if (this.ifrbust_.isEmpty()) {
                        this.ifrbust_ = displayPlacement.ifrbust_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureIfrbustIsMutable();
                        this.ifrbust_.addAll(displayPlacement.ifrbust_);
                    }
                    onChanged();
                }
                if (displayPlacement.clktype_ != 0) {
                    setClktypeValue(displayPlacement.getClktypeValue());
                }
                if (displayPlacement.getAmpren() != 0) {
                    setAmpren(displayPlacement.getAmpren());
                }
                if (displayPlacement.ptype_ != 0) {
                    setPtypeValue(displayPlacement.getPtypeValue());
                }
                if (displayPlacement.context_ != 0) {
                    setContextValue(displayPlacement.getContextValue());
                }
                if (!displayPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = displayPlacement.mime_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(displayPlacement.mime_);
                    }
                    onChanged();
                }
                if (!displayPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = displayPlacement.api_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(displayPlacement.api_);
                    }
                    onChanged();
                }
                if (!displayPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = displayPlacement.ctype_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(displayPlacement.ctype_);
                    }
                    onChanged();
                }
                if (displayPlacement.getW() != 0) {
                    setW(displayPlacement.getW());
                }
                if (displayPlacement.getH() != 0) {
                    setH(displayPlacement.getH());
                }
                if (displayPlacement.unit_ != 0) {
                    setUnitValue(displayPlacement.getUnitValue());
                }
                if (displayPlacement.getPriv()) {
                    setPriv(displayPlacement.getPriv());
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                if (this.displayfmtBuilder_ == null) {
                    if (!displayPlacement.displayfmt_.isEmpty()) {
                        if (this.displayfmt_.isEmpty()) {
                            this.displayfmt_ = displayPlacement.displayfmt_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureDisplayfmtIsMutable();
                            this.displayfmt_.addAll(displayPlacement.displayfmt_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.displayfmt_.isEmpty()) {
                    if (this.displayfmtBuilder_.isEmpty()) {
                        this.displayfmtBuilder_.dispose();
                        this.displayfmtBuilder_ = null;
                        this.displayfmt_ = displayPlacement.displayfmt_;
                        this.bitField0_ &= -17;
                        this.displayfmtBuilder_ = DisplayPlacement.alwaysUseFieldBuilders ? getDisplayfmtFieldBuilder() : null;
                    } else {
                        this.displayfmtBuilder_.addAllMessages(displayPlacement.displayfmt_);
                    }
                }
                if (displayPlacement.hasNativefmt()) {
                    mergeNativefmt(displayPlacement.getNativefmt());
                }
                if (this.eventBuilder_ == null) {
                    if (!displayPlacement.event_.isEmpty()) {
                        if (this.event_.isEmpty()) {
                            this.event_ = displayPlacement.event_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureEventIsMutable();
                            this.event_.addAll(displayPlacement.event_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.event_.isEmpty()) {
                    if (this.eventBuilder_.isEmpty()) {
                        this.eventBuilder_.dispose();
                        this.eventBuilder_ = null;
                        this.event_ = displayPlacement.event_;
                        this.bitField0_ &= -33;
                        this.eventBuilder_ = DisplayPlacement.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                    } else {
                        this.eventBuilder_.addAllMessages(displayPlacement.event_);
                    }
                }
                if (displayPlacement.hasExt()) {
                    mergeExt(displayPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!displayPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = displayPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(displayPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!displayPlacement.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = displayPlacement.extProto_;
                        this.bitField0_ &= -65;
                        if (DisplayPlacement.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(displayPlacement.extProto_);
                    }
                }
                mergeUnknownFields(displayPlacement.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.DisplayPlacement.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Placement$DisplayPlacement r3 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Placement$DisplayPlacement r4 = (com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.DisplayPlacement) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.DisplayPlacement.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$DisplayPlacement$Builder");
            }

            public int getPosValue() {
                return this.pos_;
            }

            public Builder setPosValue(int i) {
                this.pos_ = i;
                onChanged();
                return this;
            }

            public PlacementPosition getPos() {
                PlacementPosition valueOf = PlacementPosition.valueOf(this.pos_);
                return valueOf == null ? PlacementPosition.UNRECOGNIZED : valueOf;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                if (placementPosition != null) {
                    this.pos_ = placementPosition.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public boolean getInstl() {
                return this.instl_;
            }

            public Builder setInstl(boolean z) {
                this.instl_ = z;
                onChanged();
                return this;
            }

            public Builder clearInstl() {
                this.instl_ = false;
                onChanged();
                return this;
            }

            public boolean getTopframe() {
                return this.topframe_;
            }

            public Builder setTopframe(boolean z) {
                this.topframe_ = z;
                onChanged();
                return this;
            }

            public Builder clearTopframe() {
                this.topframe_ = false;
                onChanged();
                return this;
            }

            private void ensureIfrbustIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.ifrbust_ = new LazyStringArrayList(this.ifrbust_);
                    this.bitField0_ |= 1;
                }
            }

            public ProtocolStringList getIfrbustList() {
                return this.ifrbust_.getUnmodifiableView();
            }

            public int getIfrbustCount() {
                return this.ifrbust_.size();
            }

            public String getIfrbust(int i) {
                return (String) this.ifrbust_.get(i);
            }

            public ByteString getIfrbustBytes(int i) {
                return this.ifrbust_.getByteString(i);
            }

            public Builder setIfrbust(int i, String str) {
                if (str != null) {
                    ensureIfrbustIsMutable();
                    this.ifrbust_.set(i, str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addIfrbust(String str) {
                if (str != null) {
                    ensureIfrbustIsMutable();
                    this.ifrbust_.add(str);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllIfrbust(Iterable<String> iterable) {
                ensureIfrbustIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.ifrbust_);
                onChanged();
                return this;
            }

            public Builder clearIfrbust() {
                this.ifrbust_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder addIfrbustBytes(ByteString byteString) {
                if (byteString != null) {
                    DisplayPlacement.checkByteStringIsUtf8(byteString);
                    ensureIfrbustIsMutable();
                    this.ifrbust_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            public int getClktypeValue() {
                return this.clktype_;
            }

            public Builder setClktypeValue(int i) {
                this.clktype_ = i;
                onChanged();
                return this;
            }

            public ClickType getClktype() {
                ClickType valueOf = ClickType.valueOf(this.clktype_);
                return valueOf == null ? ClickType.UNRECOGNIZED : valueOf;
            }

            public Builder setClktype(ClickType clickType) {
                if (clickType != null) {
                    this.clktype_ = clickType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
            }

            public int getAmpren() {
                return this.ampren_;
            }

            public Builder setAmpren(int i) {
                this.ampren_ = i;
                onChanged();
                return this;
            }

            public Builder clearAmpren() {
                this.ampren_ = 0;
                onChanged();
                return this;
            }

            public int getPtypeValue() {
                return this.ptype_;
            }

            public Builder setPtypeValue(int i) {
                this.ptype_ = i;
                onChanged();
                return this;
            }

            public DisplayPlacementType getPtype() {
                DisplayPlacementType valueOf = DisplayPlacementType.valueOf(this.ptype_);
                return valueOf == null ? DisplayPlacementType.UNRECOGNIZED : valueOf;
            }

            public Builder setPtype(DisplayPlacementType displayPlacementType) {
                if (displayPlacementType != null) {
                    this.ptype_ = displayPlacementType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public int getContextValue() {
                return this.context_;
            }

            public Builder setContextValue(int i) {
                this.context_ = i;
                onChanged();
                return this;
            }

            public DisplayContextType getContext() {
                DisplayContextType valueOf = DisplayContextType.valueOf(this.context_);
                return valueOf == null ? DisplayContextType.UNRECOGNIZED : valueOf;
            }

            public Builder setContext(DisplayContextType displayContextType) {
                if (displayContextType != null) {
                    this.context_ = displayContextType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearContext() {
                this.context_ = 0;
                onChanged();
                return this;
            }

            private void ensureMimeIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.mime_ = new LazyStringArrayList(this.mime_);
                    this.bitField0_ |= 2;
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
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder addMimeBytes(ByteString byteString) {
                if (byteString != null) {
                    DisplayPlacement.checkByteStringIsUtf8(byteString);
                    ensureMimeIsMutable();
                    this.mime_.add(byteString);
                    onChanged();
                    return this;
                }
                throw null;
            }

            private void ensureApiIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.api_ = new ArrayList(this.api_);
                    this.bitField0_ |= 4;
                }
            }

            public List<ApiFramework> getApiList() {
                return new Internal.ListAdapter(this.api_, DisplayPlacement.api_converter_);
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public ApiFramework getApi(int i) {
                return (ApiFramework) DisplayPlacement.api_converter_.convert(this.api_.get(i));
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
                this.bitField0_ &= -5;
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

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 8;
                }
            }

            public List<DisplayCreativeType> getCtypeList() {
                return new Internal.ListAdapter(this.ctype_, DisplayPlacement.ctype_converter_);
            }

            public int getCtypeCount() {
                return this.ctype_.size();
            }

            public DisplayCreativeType getCtype(int i) {
                return (DisplayCreativeType) DisplayPlacement.ctype_converter_.convert(this.ctype_.get(i));
            }

            public Builder setCtype(int i, DisplayCreativeType displayCreativeType) {
                if (displayCreativeType != null) {
                    ensureCtypeIsMutable();
                    this.ctype_.set(i, Integer.valueOf(displayCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addCtype(DisplayCreativeType displayCreativeType) {
                if (displayCreativeType != null) {
                    ensureCtypeIsMutable();
                    this.ctype_.add(Integer.valueOf(displayCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllCtype(Iterable<? extends DisplayCreativeType> iterable) {
                ensureCtypeIsMutable();
                for (DisplayCreativeType number : iterable) {
                    this.ctype_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            public int getCtypeValue(int i) {
                return this.ctype_.get(i).intValue();
            }

            public Builder setCtypeValue(int i, int i2) {
                ensureCtypeIsMutable();
                this.ctype_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer intValue : iterable) {
                    this.ctype_.add(Integer.valueOf(intValue.intValue()));
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

            public int getUnitValue() {
                return this.unit_;
            }

            public Builder setUnitValue(int i) {
                this.unit_ = i;
                onChanged();
                return this;
            }

            public SizeUnit getUnit() {
                SizeUnit valueOf = SizeUnit.valueOf(this.unit_);
                return valueOf == null ? SizeUnit.UNRECOGNIZED : valueOf;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                if (sizeUnit != null) {
                    this.unit_ = sizeUnit.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public boolean getPriv() {
                return this.priv_;
            }

            public Builder setPriv(boolean z) {
                this.priv_ = z;
                onChanged();
                return this;
            }

            public Builder clearPriv() {
                this.priv_ = false;
                onChanged();
                return this;
            }

            private void ensureDisplayfmtIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.displayfmt_ = new ArrayList(this.displayfmt_);
                    this.bitField0_ |= 16;
                }
            }

            public List<DisplayFormat> getDisplayfmtList() {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.displayfmt_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getDisplayfmtCount() {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.displayfmt_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public DisplayFormat getDisplayfmt(int i) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.displayfmt_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setDisplayfmt(int i, DisplayFormat displayFormat) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, displayFormat);
                } else if (displayFormat != null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.set(i, displayFormat);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setDisplayfmt(int i, DisplayFormat.Builder builder) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat displayFormat) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(displayFormat);
                } else if (displayFormat != null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(displayFormat);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addDisplayfmt(int i, DisplayFormat displayFormat) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, displayFormat);
                } else if (displayFormat != null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i, displayFormat);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addDisplayfmt(DisplayFormat.Builder builder) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addDisplayfmt(int i, DisplayFormat.Builder builder) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllDisplayfmt(Iterable<? extends DisplayFormat> iterable) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDisplayfmtIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.displayfmt_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearDisplayfmt() {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.displayfmt_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeDisplayfmt(int i) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDisplayfmtIsMutable();
                    this.displayfmt_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public DisplayFormat.Builder getDisplayfmtBuilder(int i) {
                return getDisplayfmtFieldBuilder().getBuilder(i);
            }

            public DisplayFormatOrBuilder getDisplayfmtOrBuilder(int i) {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.displayfmt_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends DisplayFormatOrBuilder> getDisplayfmtOrBuilderList() {
                RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> repeatedFieldBuilderV3 = this.displayfmtBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.displayfmt_);
            }

            public DisplayFormat.Builder addDisplayfmtBuilder() {
                return getDisplayfmtFieldBuilder().addBuilder(DisplayFormat.getDefaultInstance());
            }

            public DisplayFormat.Builder addDisplayfmtBuilder(int i) {
                return getDisplayfmtFieldBuilder().addBuilder(i, DisplayFormat.getDefaultInstance());
            }

            public List<DisplayFormat.Builder> getDisplayfmtBuilderList() {
                return getDisplayfmtFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<DisplayFormat, DisplayFormat.Builder, DisplayFormatOrBuilder> getDisplayfmtFieldBuilder() {
                if (this.displayfmtBuilder_ == null) {
                    this.displayfmtBuilder_ = new RepeatedFieldBuilderV3<>(this.displayfmt_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.displayfmt_ = null;
                }
                return this.displayfmtBuilder_;
            }

            public boolean hasNativefmt() {
                return (this.nativefmtBuilder_ == null && this.nativefmt_ == null) ? false : true;
            }

            public NativeFormat getNativefmt() {
                SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> singleFieldBuilderV3 = this.nativefmtBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            public Builder setNativefmt(NativeFormat nativeFormat) {
                SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> singleFieldBuilderV3 = this.nativefmtBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(nativeFormat);
                } else if (nativeFormat != null) {
                    this.nativefmt_ = nativeFormat;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setNativefmt(NativeFormat.Builder builder) {
                SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> singleFieldBuilderV3 = this.nativefmtBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.nativefmt_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeNativefmt(NativeFormat nativeFormat) {
                SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> singleFieldBuilderV3 = this.nativefmtBuilder_;
                if (singleFieldBuilderV3 == null) {
                    NativeFormat nativeFormat2 = this.nativefmt_;
                    if (nativeFormat2 != null) {
                        this.nativefmt_ = NativeFormat.newBuilder(nativeFormat2).mergeFrom(nativeFormat).buildPartial();
                    } else {
                        this.nativefmt_ = nativeFormat;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(nativeFormat);
                }
                return this;
            }

            public Builder clearNativefmt() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmt_ = null;
                    onChanged();
                } else {
                    this.nativefmt_ = null;
                    this.nativefmtBuilder_ = null;
                }
                return this;
            }

            public NativeFormat.Builder getNativefmtBuilder() {
                onChanged();
                return getNativefmtFieldBuilder().getBuilder();
            }

            public NativeFormatOrBuilder getNativefmtOrBuilder() {
                SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> singleFieldBuilderV3 = this.nativefmtBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                NativeFormat nativeFormat = this.nativefmt_;
                return nativeFormat == null ? NativeFormat.getDefaultInstance() : nativeFormat;
            }

            private SingleFieldBuilderV3<NativeFormat, NativeFormat.Builder, NativeFormatOrBuilder> getNativefmtFieldBuilder() {
                if (this.nativefmtBuilder_ == null) {
                    this.nativefmtBuilder_ = new SingleFieldBuilderV3<>(getNativefmt(), getParentForChildren(), isClean());
                    this.nativefmt_ = null;
                }
                return this.nativefmtBuilder_;
            }

            private void ensureEventIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.event_ = new ArrayList(this.event_);
                    this.bitField0_ |= 32;
                }
            }

            public List<EventSpec> getEventList() {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.event_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getEventCount() {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public EventSpec getEvent(int i) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setEvent(int i, EventSpec eventSpec) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, eventSpec);
                } else if (eventSpec != null) {
                    ensureEventIsMutable();
                    this.event_.set(i, eventSpec);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setEvent(int i, EventSpec.Builder builder) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addEvent(EventSpec eventSpec) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(eventSpec);
                } else if (eventSpec != null) {
                    ensureEventIsMutable();
                    this.event_.add(eventSpec);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addEvent(int i, EventSpec eventSpec) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, eventSpec);
                } else if (eventSpec != null) {
                    ensureEventIsMutable();
                    this.event_.add(i, eventSpec);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addEvent(EventSpec.Builder builder) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addEvent(int i, EventSpec.Builder builder) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllEvent(Iterable<? extends EventSpec> iterable) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
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
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.event_ = Collections.emptyList();
                    this.bitField0_ &= -33;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeEvent(int i) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventIsMutable();
                    this.event_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public EventSpec.Builder getEventBuilder(int i) {
                return getEventFieldBuilder().getBuilder(i);
            }

            public EventSpecOrBuilder getEventOrBuilder(int i) {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.event_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends EventSpecOrBuilder> getEventOrBuilderList() {
                RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.event_);
            }

            public EventSpec.Builder addEventBuilder() {
                return getEventFieldBuilder().addBuilder(EventSpec.getDefaultInstance());
            }

            public EventSpec.Builder addEventBuilder(int i) {
                return getEventFieldBuilder().addBuilder(i, EventSpec.getDefaultInstance());
            }

            public List<EventSpec.Builder> getEventBuilderList() {
                return getEventFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<EventSpec, EventSpec.Builder, EventSpecOrBuilder> getEventFieldBuilder() {
                if (this.eventBuilder_ == null) {
                    this.eventBuilder_ = new RepeatedFieldBuilderV3<>(this.event_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
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
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
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
                    this.bitField0_ &= -65;
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
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
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

        public static DisplayPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DisplayPlacement> parser() {
            return PARSER;
        }

        public Parser<DisplayPlacement> getParserForType() {
            return PARSER;
        }

        public DisplayPlacement getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public static final class VideoPlacement extends GeneratedMessageV3 implements VideoPlacementOrBuilder {
        public static final int API_FIELD_NUMBER = 11;
        public static final int BOXING_FIELD_NUMBER = 24;
        public static final int CLKTYPE_FIELD_NUMBER = 9;
        public static final int COMPTYPE_FIELD_NUMBER = 26;
        public static final int COMP_FIELD_NUMBER = 25;
        public static final int CTYPE_FIELD_NUMBER = 12;
        private static final VideoPlacement DEFAULT_INSTANCE = new VideoPlacement();
        public static final int DELAY_FIELD_NUMBER = 3;
        public static final int DELIVERY_FIELD_NUMBER = 21;
        public static final int EXT_FIELD_NUMBER = 28;
        public static final int EXT_PROTO_FIELD_NUMBER = 27;
        public static final int H_FIELD_NUMBER = 14;
        public static final int LINEAR_FIELD_NUMBER = 23;
        public static final int MAXBITR_FIELD_NUMBER = 20;
        public static final int MAXDUR_FIELD_NUMBER = 17;
        public static final int MAXEXT_FIELD_NUMBER = 18;
        public static final int MAXSEQ_FIELD_NUMBER = 22;
        public static final int MIME_FIELD_NUMBER = 10;
        public static final int MINBITR_FIELD_NUMBER = 19;
        public static final int MINDUR_FIELD_NUMBER = 16;
        /* access modifiers changed from: private */
        public static final Parser<VideoPlacement> PARSER = new AbstractParser<VideoPlacement>() {
            public VideoPlacement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VideoPlacement(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PLAYEND_FIELD_NUMBER = 8;
        public static final int PLAYMETHOD_FIELD_NUMBER = 7;
        public static final int POS_FIELD_NUMBER = 2;
        public static final int PTYPE_FIELD_NUMBER = 1;
        public static final int SKIPAFTER_FIELD_NUMBER = 6;
        public static final int SKIPMIN_FIELD_NUMBER = 5;
        public static final int SKIP_FIELD_NUMBER = 4;
        public static final int UNIT_FIELD_NUMBER = 15;
        public static final int W_FIELD_NUMBER = 13;
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, ApiFramework> api_converter_ = new Internal.ListAdapter.Converter<Integer, ApiFramework>() {
            public ApiFramework convert(Integer num) {
                ApiFramework valueOf = ApiFramework.valueOf(num.intValue());
                return valueOf == null ? ApiFramework.UNRECOGNIZED : valueOf;
            }
        };
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, CompanionType> comptype_converter_ = new Internal.ListAdapter.Converter<Integer, CompanionType>() {
            public CompanionType convert(Integer num) {
                CompanionType valueOf = CompanionType.valueOf(num.intValue());
                return valueOf == null ? CompanionType.UNRECOGNIZED : valueOf;
            }
        };
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, VideoCreativeType> ctype_converter_ = new Internal.ListAdapter.Converter<Integer, VideoCreativeType>() {
            public VideoCreativeType convert(Integer num) {
                VideoCreativeType valueOf = VideoCreativeType.valueOf(num.intValue());
                return valueOf == null ? VideoCreativeType.UNRECOGNIZED : valueOf;
            }
        };
        /* access modifiers changed from: private */
        public static final Internal.ListAdapter.Converter<Integer, DeliveryMethod> delivery_converter_ = new Internal.ListAdapter.Converter<Integer, DeliveryMethod>() {
            public DeliveryMethod convert(Integer num) {
                DeliveryMethod valueOf = DeliveryMethod.valueOf(num.intValue());
                return valueOf == null ? DeliveryMethod.UNRECOGNIZED : valueOf;
            }
        };
        private static final long serialVersionUID = 0;
        private int apiMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> api_;
        /* access modifiers changed from: private */
        public boolean boxing_;
        /* access modifiers changed from: private */
        public int clktype_;
        /* access modifiers changed from: private */
        public List<Companion> comp_;
        private int comptypeMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> comptype_;
        private int ctypeMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> ctype_;
        /* access modifiers changed from: private */
        public int delay_;
        private int deliveryMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> delivery_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        /* access modifiers changed from: private */
        public int h_;
        /* access modifiers changed from: private */
        public int linear_;
        /* access modifiers changed from: private */
        public int maxbitr_;
        /* access modifiers changed from: private */
        public int maxdur_;
        /* access modifiers changed from: private */
        public int maxext_;
        /* access modifiers changed from: private */
        public int maxseq_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public LazyStringList mime_;
        /* access modifiers changed from: private */
        public int minbitr_;
        /* access modifiers changed from: private */
        public int mindur_;
        /* access modifiers changed from: private */
        public int playend_;
        /* access modifiers changed from: private */
        public int playmethod_;
        /* access modifiers changed from: private */
        public int pos_;
        /* access modifiers changed from: private */
        public int ptype_;
        /* access modifiers changed from: private */
        public boolean skip_;
        /* access modifiers changed from: private */
        public int skipafter_;
        /* access modifiers changed from: private */
        public int skipmin_;
        /* access modifiers changed from: private */
        public int unit_;
        /* access modifiers changed from: private */
        public int w_;

        public interface CompanionOrBuilder extends MessageOrBuilder {
            DisplayPlacement getDisplay();

            DisplayPlacementOrBuilder getDisplayOrBuilder();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            int getVcm();

            boolean hasDisplay();

            boolean hasExt();
        }

        private VideoPlacement(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private VideoPlacement() {
            this.memoizedIsInitialized = -1;
            this.ptype_ = 0;
            this.pos_ = 0;
            this.playmethod_ = 0;
            this.playend_ = 0;
            this.clktype_ = 0;
            this.mime_ = LazyStringArrayList.EMPTY;
            this.api_ = Collections.emptyList();
            this.ctype_ = Collections.emptyList();
            this.unit_ = 0;
            this.delivery_ = Collections.emptyList();
            this.linear_ = 0;
            this.comp_ = Collections.emptyList();
            this.comptype_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new VideoPlacement();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private VideoPlacement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            case 8:
                                this.ptype_ = codedInputStream.readEnum();
                                break;
                            case 16:
                                this.pos_ = codedInputStream.readEnum();
                                break;
                            case 24:
                                this.delay_ = codedInputStream.readInt32();
                                break;
                            case 32:
                                this.skip_ = codedInputStream.readBool();
                                break;
                            case 40:
                                this.skipmin_ = codedInputStream.readUInt32();
                                break;
                            case 48:
                                this.skipafter_ = codedInputStream.readUInt32();
                                break;
                            case 56:
                                this.playmethod_ = codedInputStream.readEnum();
                                break;
                            case 64:
                                this.playend_ = codedInputStream.readEnum();
                                break;
                            case 72:
                                this.clktype_ = codedInputStream.readEnum();
                                break;
                            case 82:
                                String readStringRequireUtf8 = codedInputStream.readStringRequireUtf8();
                                if (!z2 || !true) {
                                    this.mime_ = new LazyStringArrayList();
                                    z2 |= true;
                                }
                                this.mime_.add(readStringRequireUtf8);
                                break;
                            case 88:
                                int readEnum = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.api_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.api_.add(Integer.valueOf(readEnum));
                                break;
                            case 90:
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
                            case 96:
                                int readEnum3 = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.ctype_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.ctype_.add(Integer.valueOf(readEnum3));
                                break;
                            case 98:
                                int pushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum4 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.ctype_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.ctype_.add(Integer.valueOf(readEnum4));
                                }
                                codedInputStream.popLimit(pushLimit2);
                                break;
                            case 104:
                                this.w_ = codedInputStream.readUInt32();
                                break;
                            case 112:
                                this.h_ = codedInputStream.readUInt32();
                                break;
                            case 120:
                                this.unit_ = codedInputStream.readEnum();
                                break;
                            case 128:
                                this.mindur_ = codedInputStream.readUInt32();
                                break;
                            case 136:
                                this.maxdur_ = codedInputStream.readUInt32();
                                break;
                            case 144:
                                this.maxext_ = codedInputStream.readInt32();
                                break;
                            case 152:
                                this.minbitr_ = codedInputStream.readUInt32();
                                break;
                            case 160:
                                this.maxbitr_ = codedInputStream.readUInt32();
                                break;
                            case 168:
                                int readEnum5 = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.delivery_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.delivery_.add(Integer.valueOf(readEnum5));
                                break;
                            case 170:
                                int pushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum6 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.delivery_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.delivery_.add(Integer.valueOf(readEnum6));
                                }
                                codedInputStream.popLimit(pushLimit3);
                                break;
                            case 176:
                                this.maxseq_ = codedInputStream.readUInt32();
                                break;
                            case 184:
                                this.linear_ = codedInputStream.readEnum();
                                break;
                            case 192:
                                this.boxing_ = codedInputStream.readBool();
                                break;
                            case LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE:
                                if (!z2 || !true) {
                                    this.comp_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.comp_.add(codedInputStream.readMessage(Companion.parser(), extensionRegistryLite));
                                break;
                            case LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE:
                                int readEnum7 = codedInputStream.readEnum();
                                if (!z2 || !true) {
                                    this.comptype_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.comptype_.add(Integer.valueOf(readEnum7));
                                break;
                            case LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE:
                                int pushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int readEnum8 = codedInputStream.readEnum();
                                    if (!z2 || !true) {
                                        this.comptype_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.comptype_.add(Integer.valueOf(readEnum8));
                                }
                                codedInputStream.popLimit(pushLimit4);
                                break;
                            case 218:
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                break;
                            case 226:
                                Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(struct);
                                    this.ext_ = builder.buildPartial();
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
                            this.ctype_ = Collections.unmodifiableList(this.ctype_);
                        }
                        if (z2 && true) {
                            this.delivery_ = Collections.unmodifiableList(this.delivery_);
                        }
                        if (z2 && true) {
                            this.comp_ = Collections.unmodifiableList(this.comp_);
                        }
                        if (z2 && true) {
                            this.comptype_ = Collections.unmodifiableList(this.comptype_);
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
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                }
                if (z2 && true) {
                    this.delivery_ = Collections.unmodifiableList(this.delivery_);
                }
                if (z2 && true) {
                    this.comp_ = Collections.unmodifiableList(this.comp_);
                }
                if (z2 && true) {
                    this.comptype_ = Collections.unmodifiableList(this.comptype_);
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
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoPlacement.class, Builder.class);
        }

        public static final class Companion extends GeneratedMessageV3 implements CompanionOrBuilder {
            private static final Companion DEFAULT_INSTANCE = new Companion();
            public static final int DISPLAY_FIELD_NUMBER = 3;
            public static final int EXT_FIELD_NUMBER = 5;
            public static final int EXT_PROTO_FIELD_NUMBER = 4;
            public static final int ID_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final Parser<Companion> PARSER = new AbstractParser<Companion>() {
                public Companion parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Companion(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int VCM_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public DisplayPlacement display_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public volatile Object id_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public int vcm_;

            private Companion(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Companion() {
                this.memoizedIsInitialized = -1;
                this.id_ = "";
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Companion();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Companion(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                } else if (readTag == 16) {
                                    this.vcm_ = codedInputStream.readUInt32();
                                } else if (readTag == 26) {
                                    DisplayPlacement.Builder builder = this.display_ != null ? this.display_.toBuilder() : null;
                                    DisplayPlacement displayPlacement = (DisplayPlacement) codedInputStream.readMessage(DisplayPlacement.parser(), extensionRegistryLite);
                                    this.display_ = displayPlacement;
                                    if (builder != null) {
                                        builder.mergeFrom(displayPlacement);
                                        this.display_ = builder.buildPartial();
                                    }
                                } else if (readTag == 34) {
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                } else if (readTag == 42) {
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
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_Companion_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_Companion_fieldAccessorTable.ensureFieldAccessorsInitialized(Companion.class, Builder.class);
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

            public int getVcm() {
                return this.vcm_;
            }

            public boolean hasDisplay() {
                return this.display_ != null;
            }

            public DisplayPlacement getDisplay() {
                DisplayPlacement displayPlacement = this.display_;
                return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
            }

            public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                return getDisplay();
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
                int i = this.vcm_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(2, i);
                }
                if (this.display_ != null) {
                    codedOutputStream.writeMessage(3, getDisplay());
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
                int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
                int i2 = this.vcm_;
                if (i2 != 0) {
                    computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
                }
                if (this.display_ != null) {
                    computeStringSize += CodedOutputStream.computeMessageSize(3, getDisplay());
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
                if (!(obj instanceof Companion)) {
                    return super.equals(obj);
                }
                Companion companion = (Companion) obj;
                if (!getId().equals(companion.getId()) || getVcm() != companion.getVcm() || hasDisplay() != companion.hasDisplay()) {
                    return false;
                }
                if ((hasDisplay() && !getDisplay().equals(companion.getDisplay())) || hasExt() != companion.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(companion.getExt())) && getExtProtoList().equals(companion.getExtProtoList()) && this.unknownFields.equals(companion.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getVcm();
                if (hasDisplay()) {
                    hashCode = (((hashCode * 37) + 3) * 53) + getDisplay().hashCode();
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

            public static Companion parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Companion parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Companion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Companion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Companion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Companion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Companion parseFrom(InputStream inputStream) throws IOException {
                return (Companion) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Companion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Companion) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Companion parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Companion) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Companion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Companion) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Companion parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Companion) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Companion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Companion) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Companion companion) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(companion);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CompanionOrBuilder {
                private int bitField0_;
                private SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> displayBuilder_;
                private DisplayPlacement display_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private int vcm_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_Companion_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_Companion_fieldAccessorTable.ensureFieldAccessorsInitialized(Companion.class, Builder.class);
                }

                private Builder() {
                    this.id_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.id_ = "";
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Companion.alwaysUseFieldBuilders) {
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.vcm_ = 0;
                    if (this.displayBuilder_ == null) {
                        this.display_ = null;
                    } else {
                        this.display_ = null;
                        this.displayBuilder_ = null;
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
                    return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_Companion_descriptor;
                }

                public Companion getDefaultInstanceForType() {
                    return Companion.getDefaultInstance();
                }

                public Companion build() {
                    Companion buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Companion buildPartial() {
                    Companion companion = new Companion((GeneratedMessageV3.Builder) this);
                    Object unused = companion.id_ = this.id_;
                    int unused2 = companion.vcm_ = this.vcm_;
                    SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        DisplayPlacement unused3 = companion.display_ = this.display_;
                    } else {
                        DisplayPlacement unused4 = companion.display_ = singleFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        Struct unused5 = companion.ext_ = this.ext_;
                    } else {
                        Struct unused6 = companion.ext_ = singleFieldBuilderV32.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -2;
                        }
                        List unused7 = companion.extProto_ = this.extProto_;
                    } else {
                        List unused8 = companion.extProto_ = repeatedFieldBuilderV3.build();
                    }
                    onBuilt();
                    return companion;
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
                    if (message instanceof Companion) {
                        return mergeFrom((Companion) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Companion companion) {
                    if (companion == Companion.getDefaultInstance()) {
                        return this;
                    }
                    if (!companion.getId().isEmpty()) {
                        this.id_ = companion.id_;
                        onChanged();
                    }
                    if (companion.getVcm() != 0) {
                        setVcm(companion.getVcm());
                    }
                    if (companion.hasDisplay()) {
                        mergeDisplay(companion.getDisplay());
                    }
                    if (companion.hasExt()) {
                        mergeExt(companion.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!companion.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = companion.extProto_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(companion.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!companion.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                            this.extProtoBuilder_ = null;
                            this.extProto_ = companion.extProto_;
                            this.bitField0_ &= -2;
                            if (Companion.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(companion.extProto_);
                        }
                    }
                    mergeUnknownFields(companion.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion r3 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion r4 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Companion.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$VideoPlacement$Companion$Builder");
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
                    this.id_ = Companion.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    if (byteString != null) {
                        Companion.checkByteStringIsUtf8(byteString);
                        this.id_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public int getVcm() {
                    return this.vcm_;
                }

                public Builder setVcm(int i) {
                    this.vcm_ = i;
                    onChanged();
                    return this;
                }

                public Builder clearVcm() {
                    this.vcm_ = 0;
                    onChanged();
                    return this;
                }

                public boolean hasDisplay() {
                    return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
                }

                public DisplayPlacement getDisplay() {
                    SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                public Builder setDisplay(DisplayPlacement displayPlacement) {
                    SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(displayPlacement);
                    } else if (displayPlacement != null) {
                        this.display_ = displayPlacement;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setDisplay(DisplayPlacement.Builder builder) {
                    SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.display_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeDisplay(DisplayPlacement displayPlacement) {
                    SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        DisplayPlacement displayPlacement2 = this.display_;
                        if (displayPlacement2 != null) {
                            this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
                        } else {
                            this.display_ = displayPlacement;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(displayPlacement);
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

                public DisplayPlacement.Builder getDisplayBuilder() {
                    onChanged();
                    return getDisplayFieldBuilder().getBuilder();
                }

                public DisplayPlacementOrBuilder getDisplayOrBuilder() {
                    SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    DisplayPlacement displayPlacement = this.display_;
                    return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
                }

                private SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> getDisplayFieldBuilder() {
                    if (this.displayBuilder_ == null) {
                        this.displayBuilder_ = new SingleFieldBuilderV3<>(getDisplay(), getParentForChildren(), isClean());
                        this.display_ = null;
                    }
                    return this.displayBuilder_;
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

            public static Companion getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Companion> parser() {
                return PARSER;
            }

            public Parser<Companion> getParserForType() {
                return PARSER;
            }

            public Companion getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public int getPtypeValue() {
            return this.ptype_;
        }

        public VideoPlacementType getPtype() {
            VideoPlacementType valueOf = VideoPlacementType.valueOf(this.ptype_);
            return valueOf == null ? VideoPlacementType.UNRECOGNIZED : valueOf;
        }

        public int getPosValue() {
            return this.pos_;
        }

        public PlacementPosition getPos() {
            PlacementPosition valueOf = PlacementPosition.valueOf(this.pos_);
            return valueOf == null ? PlacementPosition.UNRECOGNIZED : valueOf;
        }

        public int getDelay() {
            return this.delay_;
        }

        public boolean getSkip() {
            return this.skip_;
        }

        public int getSkipmin() {
            return this.skipmin_;
        }

        public int getSkipafter() {
            return this.skipafter_;
        }

        public int getPlaymethodValue() {
            return this.playmethod_;
        }

        public PlaybackMethod getPlaymethod() {
            PlaybackMethod valueOf = PlaybackMethod.valueOf(this.playmethod_);
            return valueOf == null ? PlaybackMethod.UNRECOGNIZED : valueOf;
        }

        public int getPlayendValue() {
            return this.playend_;
        }

        public PlaybackCessationMode getPlayend() {
            PlaybackCessationMode valueOf = PlaybackCessationMode.valueOf(this.playend_);
            return valueOf == null ? PlaybackCessationMode.UNRECOGNIZED : valueOf;
        }

        public int getClktypeValue() {
            return this.clktype_;
        }

        public ClickType getClktype() {
            ClickType valueOf = ClickType.valueOf(this.clktype_);
            return valueOf == null ? ClickType.UNRECOGNIZED : valueOf;
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

        public List<VideoCreativeType> getCtypeList() {
            return new Internal.ListAdapter(this.ctype_, ctype_converter_);
        }

        public int getCtypeCount() {
            return this.ctype_.size();
        }

        public VideoCreativeType getCtype(int i) {
            return ctype_converter_.convert(this.ctype_.get(i));
        }

        public List<Integer> getCtypeValueList() {
            return this.ctype_;
        }

        public int getCtypeValue(int i) {
            return this.ctype_.get(i).intValue();
        }

        public int getW() {
            return this.w_;
        }

        public int getH() {
            return this.h_;
        }

        public int getUnitValue() {
            return this.unit_;
        }

        public SizeUnit getUnit() {
            SizeUnit valueOf = SizeUnit.valueOf(this.unit_);
            return valueOf == null ? SizeUnit.UNRECOGNIZED : valueOf;
        }

        public int getMindur() {
            return this.mindur_;
        }

        public int getMaxdur() {
            return this.maxdur_;
        }

        public int getMaxext() {
            return this.maxext_;
        }

        public int getMinbitr() {
            return this.minbitr_;
        }

        public int getMaxbitr() {
            return this.maxbitr_;
        }

        public List<DeliveryMethod> getDeliveryList() {
            return new Internal.ListAdapter(this.delivery_, delivery_converter_);
        }

        public int getDeliveryCount() {
            return this.delivery_.size();
        }

        public DeliveryMethod getDelivery(int i) {
            return delivery_converter_.convert(this.delivery_.get(i));
        }

        public List<Integer> getDeliveryValueList() {
            return this.delivery_;
        }

        public int getDeliveryValue(int i) {
            return this.delivery_.get(i).intValue();
        }

        public int getMaxseq() {
            return this.maxseq_;
        }

        public int getLinearValue() {
            return this.linear_;
        }

        public LinearityMode getLinear() {
            LinearityMode valueOf = LinearityMode.valueOf(this.linear_);
            return valueOf == null ? LinearityMode.UNRECOGNIZED : valueOf;
        }

        public boolean getBoxing() {
            return this.boxing_;
        }

        public List<Companion> getCompList() {
            return this.comp_;
        }

        public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
            return this.comp_;
        }

        public int getCompCount() {
            return this.comp_.size();
        }

        public Companion getComp(int i) {
            return this.comp_.get(i);
        }

        public CompanionOrBuilder getCompOrBuilder(int i) {
            return this.comp_.get(i);
        }

        public List<CompanionType> getComptypeList() {
            return new Internal.ListAdapter(this.comptype_, comptype_converter_);
        }

        public int getComptypeCount() {
            return this.comptype_.size();
        }

        public CompanionType getComptype(int i) {
            return comptype_converter_.convert(this.comptype_.get(i));
        }

        public List<Integer> getComptypeValueList() {
            return this.comptype_;
        }

        public int getComptypeValue(int i) {
            return this.comptype_.get(i).intValue();
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
            if (this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(1, this.ptype_);
            }
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                codedOutputStream.writeEnum(2, this.pos_);
            }
            int i = this.delay_;
            if (i != 0) {
                codedOutputStream.writeInt32(3, i);
            }
            boolean z = this.skip_;
            if (z) {
                codedOutputStream.writeBool(4, z);
            }
            int i2 = this.skipmin_;
            if (i2 != 0) {
                codedOutputStream.writeUInt32(5, i2);
            }
            int i3 = this.skipafter_;
            if (i3 != 0) {
                codedOutputStream.writeUInt32(6, i3);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                codedOutputStream.writeEnum(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                codedOutputStream.writeEnum(9, this.clktype_);
            }
            for (int i4 = 0; i4 < this.mime_.size(); i4++) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.mime_.getRaw(i4));
            }
            if (getApiList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(90);
                codedOutputStream.writeUInt32NoTag(this.apiMemoizedSerializedSize);
            }
            for (int i5 = 0; i5 < this.api_.size(); i5++) {
                codedOutputStream.writeEnumNoTag(this.api_.get(i5).intValue());
            }
            if (getCtypeList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(98);
                codedOutputStream.writeUInt32NoTag(this.ctypeMemoizedSerializedSize);
            }
            for (int i6 = 0; i6 < this.ctype_.size(); i6++) {
                codedOutputStream.writeEnumNoTag(this.ctype_.get(i6).intValue());
            }
            int i7 = this.w_;
            if (i7 != 0) {
                codedOutputStream.writeUInt32(13, i7);
            }
            int i8 = this.h_;
            if (i8 != 0) {
                codedOutputStream.writeUInt32(14, i8);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                codedOutputStream.writeEnum(15, this.unit_);
            }
            int i9 = this.mindur_;
            if (i9 != 0) {
                codedOutputStream.writeUInt32(16, i9);
            }
            int i10 = this.maxdur_;
            if (i10 != 0) {
                codedOutputStream.writeUInt32(17, i10);
            }
            int i11 = this.maxext_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(18, i11);
            }
            int i12 = this.minbitr_;
            if (i12 != 0) {
                codedOutputStream.writeUInt32(19, i12);
            }
            int i13 = this.maxbitr_;
            if (i13 != 0) {
                codedOutputStream.writeUInt32(20, i13);
            }
            if (getDeliveryList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(170);
                codedOutputStream.writeUInt32NoTag(this.deliveryMemoizedSerializedSize);
            }
            for (int i14 = 0; i14 < this.delivery_.size(); i14++) {
                codedOutputStream.writeEnumNoTag(this.delivery_.get(i14).intValue());
            }
            int i15 = this.maxseq_;
            if (i15 != 0) {
                codedOutputStream.writeUInt32(22, i15);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                codedOutputStream.writeEnum(23, this.linear_);
            }
            boolean z2 = this.boxing_;
            if (z2) {
                codedOutputStream.writeBool(24, z2);
            }
            for (int i16 = 0; i16 < this.comp_.size(); i16++) {
                codedOutputStream.writeMessage(25, this.comp_.get(i16));
            }
            if (getComptypeList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE);
                codedOutputStream.writeUInt32NoTag(this.comptypeMemoizedSerializedSize);
            }
            for (int i17 = 0; i17 < this.comptype_.size(); i17++) {
                codedOutputStream.writeEnumNoTag(this.comptype_.get(i17).intValue());
            }
            for (int i18 = 0; i18 < this.extProto_.size(); i18++) {
                codedOutputStream.writeMessage(27, this.extProto_.get(i18));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(28, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeEnumSize = this.ptype_ != VideoPlacementType.VIDEO_PLACEMENT_TYPE_INVALID.getNumber() ? CodedOutputStream.computeEnumSize(1, this.ptype_) + 0 : 0;
            if (this.pos_ != PlacementPosition.PLACEMENT_POSITION_INVALID.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(2, this.pos_);
            }
            int i2 = this.delay_;
            if (i2 != 0) {
                computeEnumSize += CodedOutputStream.computeInt32Size(3, i2);
            }
            boolean z = this.skip_;
            if (z) {
                computeEnumSize += CodedOutputStream.computeBoolSize(4, z);
            }
            int i3 = this.skipmin_;
            if (i3 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(5, i3);
            }
            int i4 = this.skipafter_;
            if (i4 != 0) {
                computeEnumSize += CodedOutputStream.computeUInt32Size(6, i4);
            }
            if (this.playmethod_ != PlaybackMethod.PLAYBACK_METHOD_INVALID.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(7, this.playmethod_);
            }
            if (this.playend_ != PlaybackCessationMode.PLAYBACK_CESSATION_MODE_INVALID.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(8, this.playend_);
            }
            if (this.clktype_ != ClickType.CLICK_TYPE_NON_CLICKABLE.getNumber()) {
                computeEnumSize += CodedOutputStream.computeEnumSize(9, this.clktype_);
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.mime_.size(); i6++) {
                i5 += computeStringSizeNoTag(this.mime_.getRaw(i6));
            }
            int size = computeEnumSize + i5 + (getMimeList().size() * 1);
            int i7 = 0;
            for (int i8 = 0; i8 < this.api_.size(); i8++) {
                i7 += CodedOutputStream.computeEnumSizeNoTag(this.api_.get(i8).intValue());
            }
            int i9 = size + i7;
            if (!getApiList().isEmpty()) {
                i9 = i9 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i7);
            }
            this.apiMemoizedSerializedSize = i7;
            int i10 = 0;
            for (int i11 = 0; i11 < this.ctype_.size(); i11++) {
                i10 += CodedOutputStream.computeEnumSizeNoTag(this.ctype_.get(i11).intValue());
            }
            int i12 = i9 + i10;
            if (!getCtypeList().isEmpty()) {
                i12 = i12 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i10);
            }
            this.ctypeMemoizedSerializedSize = i10;
            int i13 = this.w_;
            if (i13 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(13, i13);
            }
            int i14 = this.h_;
            if (i14 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(14, i14);
            }
            if (this.unit_ != SizeUnit.SIZE_UNIT_INVALID.getNumber()) {
                i12 += CodedOutputStream.computeEnumSize(15, this.unit_);
            }
            int i15 = this.mindur_;
            if (i15 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(16, i15);
            }
            int i16 = this.maxdur_;
            if (i16 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(17, i16);
            }
            int i17 = this.maxext_;
            if (i17 != 0) {
                i12 += CodedOutputStream.computeInt32Size(18, i17);
            }
            int i18 = this.minbitr_;
            if (i18 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(19, i18);
            }
            int i19 = this.maxbitr_;
            if (i19 != 0) {
                i12 += CodedOutputStream.computeUInt32Size(20, i19);
            }
            int i20 = 0;
            for (int i21 = 0; i21 < this.delivery_.size(); i21++) {
                i20 += CodedOutputStream.computeEnumSizeNoTag(this.delivery_.get(i21).intValue());
            }
            int i22 = i12 + i20;
            if (!getDeliveryList().isEmpty()) {
                i22 = i22 + 2 + CodedOutputStream.computeUInt32SizeNoTag(i20);
            }
            this.deliveryMemoizedSerializedSize = i20;
            int i23 = this.maxseq_;
            if (i23 != 0) {
                i22 += CodedOutputStream.computeUInt32Size(22, i23);
            }
            if (this.linear_ != LinearityMode.LINEARITY_MODE_INVALID.getNumber()) {
                i22 += CodedOutputStream.computeEnumSize(23, this.linear_);
            }
            boolean z2 = this.boxing_;
            if (z2) {
                i22 += CodedOutputStream.computeBoolSize(24, z2);
            }
            for (int i24 = 0; i24 < this.comp_.size(); i24++) {
                i22 += CodedOutputStream.computeMessageSize(25, this.comp_.get(i24));
            }
            int i25 = 0;
            for (int i26 = 0; i26 < this.comptype_.size(); i26++) {
                i25 += CodedOutputStream.computeEnumSizeNoTag(this.comptype_.get(i26).intValue());
            }
            int i27 = i22 + i25;
            if (!getComptypeList().isEmpty()) {
                i27 = i27 + 2 + CodedOutputStream.computeUInt32SizeNoTag(i25);
            }
            this.comptypeMemoizedSerializedSize = i25;
            for (int i28 = 0; i28 < this.extProto_.size(); i28++) {
                i27 += CodedOutputStream.computeMessageSize(27, this.extProto_.get(i28));
            }
            if (this.ext_ != null) {
                i27 += CodedOutputStream.computeMessageSize(28, getExt());
            }
            int serializedSize = i27 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VideoPlacement)) {
                return super.equals(obj);
            }
            VideoPlacement videoPlacement = (VideoPlacement) obj;
            if (this.ptype_ != videoPlacement.ptype_ || this.pos_ != videoPlacement.pos_ || getDelay() != videoPlacement.getDelay() || getSkip() != videoPlacement.getSkip() || getSkipmin() != videoPlacement.getSkipmin() || getSkipafter() != videoPlacement.getSkipafter() || this.playmethod_ != videoPlacement.playmethod_ || this.playend_ != videoPlacement.playend_ || this.clktype_ != videoPlacement.clktype_ || !getMimeList().equals(videoPlacement.getMimeList()) || !this.api_.equals(videoPlacement.api_) || !this.ctype_.equals(videoPlacement.ctype_) || getW() != videoPlacement.getW() || getH() != videoPlacement.getH() || this.unit_ != videoPlacement.unit_ || getMindur() != videoPlacement.getMindur() || getMaxdur() != videoPlacement.getMaxdur() || getMaxext() != videoPlacement.getMaxext() || getMinbitr() != videoPlacement.getMinbitr() || getMaxbitr() != videoPlacement.getMaxbitr() || !this.delivery_.equals(videoPlacement.delivery_) || getMaxseq() != videoPlacement.getMaxseq() || this.linear_ != videoPlacement.linear_ || getBoxing() != videoPlacement.getBoxing() || !getCompList().equals(videoPlacement.getCompList()) || !this.comptype_.equals(videoPlacement.comptype_) || hasExt() != videoPlacement.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(videoPlacement.getExt())) && getExtProtoList().equals(videoPlacement.getExtProtoList()) && this.unknownFields.equals(videoPlacement.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.ptype_) * 37) + 2) * 53) + this.pos_) * 37) + 3) * 53) + getDelay()) * 37) + 4) * 53) + Internal.hashBoolean(getSkip())) * 37) + 5) * 53) + getSkipmin()) * 37) + 6) * 53) + getSkipafter()) * 37) + 7) * 53) + this.playmethod_) * 37) + 8) * 53) + this.playend_) * 37) + 9) * 53) + this.clktype_;
            if (getMimeCount() > 0) {
                hashCode = (((hashCode * 37) + 10) * 53) + getMimeList().hashCode();
            }
            if (getApiCount() > 0) {
                hashCode = (((hashCode * 37) + 11) * 53) + this.api_.hashCode();
            }
            if (getCtypeCount() > 0) {
                hashCode = (((hashCode * 37) + 12) * 53) + this.ctype_.hashCode();
            }
            int w = (((((((((((((((((((((((((((((((hashCode * 37) + 13) * 53) + getW()) * 37) + 14) * 53) + getH()) * 37) + 15) * 53) + this.unit_) * 37) + 16) * 53) + getMindur()) * 37) + 17) * 53) + getMaxdur()) * 37) + 18) * 53) + getMaxext()) * 37) + 19) * 53) + getMinbitr()) * 37) + 20) * 53) + getMaxbitr();
            if (getDeliveryCount() > 0) {
                w = (((w * 37) + 21) * 53) + this.delivery_.hashCode();
            }
            int maxseq = (((((((((((w * 37) + 22) * 53) + getMaxseq()) * 37) + 23) * 53) + this.linear_) * 37) + 24) * 53) + Internal.hashBoolean(getBoxing());
            if (getCompCount() > 0) {
                maxseq = (((maxseq * 37) + 25) * 53) + getCompList().hashCode();
            }
            if (getComptypeCount() > 0) {
                maxseq = (((maxseq * 37) + 26) * 53) + this.comptype_.hashCode();
            }
            if (hasExt()) {
                maxseq = (((maxseq * 37) + 28) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                maxseq = (((maxseq * 37) + 27) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (maxseq * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static VideoPlacement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static VideoPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static VideoPlacement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VideoPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static VideoPlacement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VideoPlacement parseFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VideoPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VideoPlacement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VideoPlacement parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VideoPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VideoPlacement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VideoPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(VideoPlacement videoPlacement) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(videoPlacement);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VideoPlacementOrBuilder {
            private List<Integer> api_;
            private int bitField0_;
            private boolean boxing_;
            private int clktype_;
            private RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> compBuilder_;
            private List<Companion> comp_;
            private List<Integer> comptype_;
            private List<Integer> ctype_;
            private int delay_;
            private List<Integer> delivery_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private int h_;
            private int linear_;
            private int maxbitr_;
            private int maxdur_;
            private int maxext_;
            private int maxseq_;
            private LazyStringList mime_;
            private int minbitr_;
            private int mindur_;
            private int playend_;
            private int playmethod_;
            private int pos_;
            private int ptype_;
            private boolean skip_;
            private int skipafter_;
            private int skipmin_;
            private int unit_;
            private int w_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(VideoPlacement.class, Builder.class);
            }

            private Builder() {
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.delivery_ = Collections.emptyList();
                this.linear_ = 0;
                this.comp_ = Collections.emptyList();
                this.comptype_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ptype_ = 0;
                this.pos_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = LazyStringArrayList.EMPTY;
                this.api_ = Collections.emptyList();
                this.ctype_ = Collections.emptyList();
                this.unit_ = 0;
                this.delivery_ = Collections.emptyList();
                this.linear_ = 0;
                this.comp_ = Collections.emptyList();
                this.comptype_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (VideoPlacement.alwaysUseFieldBuilders) {
                    getCompFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.ptype_ = 0;
                this.pos_ = 0;
                this.delay_ = 0;
                this.skip_ = false;
                this.skipmin_ = 0;
                this.skipafter_ = 0;
                this.playmethod_ = 0;
                this.playend_ = 0;
                this.clktype_ = 0;
                this.mime_ = LazyStringArrayList.EMPTY;
                this.bitField0_ &= -2;
                this.api_ = Collections.emptyList();
                this.bitField0_ &= -3;
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -5;
                this.w_ = 0;
                this.h_ = 0;
                this.unit_ = 0;
                this.mindur_ = 0;
                this.maxdur_ = 0;
                this.maxext_ = 0;
                this.minbitr_ = 0;
                this.maxbitr_ = 0;
                this.delivery_ = Collections.emptyList();
                this.bitField0_ &= -9;
                this.maxseq_ = 0;
                this.linear_ = 0;
                this.boxing_ = false;
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.comp_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.comptype_ = Collections.emptyList();
                this.bitField0_ &= -33;
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -65;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_VideoPlacement_descriptor;
            }

            public VideoPlacement getDefaultInstanceForType() {
                return VideoPlacement.getDefaultInstance();
            }

            public VideoPlacement build() {
                VideoPlacement buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public VideoPlacement buildPartial() {
                VideoPlacement videoPlacement = new VideoPlacement((GeneratedMessageV3.Builder) this);
                int unused = videoPlacement.ptype_ = this.ptype_;
                int unused2 = videoPlacement.pos_ = this.pos_;
                int unused3 = videoPlacement.delay_ = this.delay_;
                boolean unused4 = videoPlacement.skip_ = this.skip_;
                int unused5 = videoPlacement.skipmin_ = this.skipmin_;
                int unused6 = videoPlacement.skipafter_ = this.skipafter_;
                int unused7 = videoPlacement.playmethod_ = this.playmethod_;
                int unused8 = videoPlacement.playend_ = this.playend_;
                int unused9 = videoPlacement.clktype_ = this.clktype_;
                if ((this.bitField0_ & 1) != 0) {
                    this.mime_ = this.mime_.getUnmodifiableView();
                    this.bitField0_ &= -2;
                }
                LazyStringList unused10 = videoPlacement.mime_ = this.mime_;
                if ((this.bitField0_ & 2) != 0) {
                    this.api_ = Collections.unmodifiableList(this.api_);
                    this.bitField0_ &= -3;
                }
                List unused11 = videoPlacement.api_ = this.api_;
                if ((this.bitField0_ & 4) != 0) {
                    this.ctype_ = Collections.unmodifiableList(this.ctype_);
                    this.bitField0_ &= -5;
                }
                List unused12 = videoPlacement.ctype_ = this.ctype_;
                int unused13 = videoPlacement.w_ = this.w_;
                int unused14 = videoPlacement.h_ = this.h_;
                int unused15 = videoPlacement.unit_ = this.unit_;
                int unused16 = videoPlacement.mindur_ = this.mindur_;
                int unused17 = videoPlacement.maxdur_ = this.maxdur_;
                int unused18 = videoPlacement.maxext_ = this.maxext_;
                int unused19 = videoPlacement.minbitr_ = this.minbitr_;
                int unused20 = videoPlacement.maxbitr_ = this.maxbitr_;
                if ((this.bitField0_ & 8) != 0) {
                    this.delivery_ = Collections.unmodifiableList(this.delivery_);
                    this.bitField0_ &= -9;
                }
                List unused21 = videoPlacement.delivery_ = this.delivery_;
                int unused22 = videoPlacement.maxseq_ = this.maxseq_;
                int unused23 = videoPlacement.linear_ = this.linear_;
                boolean unused24 = videoPlacement.boxing_ = this.boxing_;
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.comp_ = Collections.unmodifiableList(this.comp_);
                        this.bitField0_ &= -17;
                    }
                    List unused25 = videoPlacement.comp_ = this.comp_;
                } else {
                    List unused26 = videoPlacement.comp_ = repeatedFieldBuilderV3.build();
                }
                if ((this.bitField0_ & 32) != 0) {
                    this.comptype_ = Collections.unmodifiableList(this.comptype_);
                    this.bitField0_ &= -33;
                }
                List unused27 = videoPlacement.comptype_ = this.comptype_;
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused28 = videoPlacement.ext_ = this.ext_;
                } else {
                    Struct unused29 = videoPlacement.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 64) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -65;
                    }
                    List unused30 = videoPlacement.extProto_ = this.extProto_;
                } else {
                    List unused31 = videoPlacement.extProto_ = repeatedFieldBuilderV32.build();
                }
                onBuilt();
                return videoPlacement;
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
                if (message instanceof VideoPlacement) {
                    return mergeFrom((VideoPlacement) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VideoPlacement videoPlacement) {
                if (videoPlacement == VideoPlacement.getDefaultInstance()) {
                    return this;
                }
                if (videoPlacement.ptype_ != 0) {
                    setPtypeValue(videoPlacement.getPtypeValue());
                }
                if (videoPlacement.pos_ != 0) {
                    setPosValue(videoPlacement.getPosValue());
                }
                if (videoPlacement.getDelay() != 0) {
                    setDelay(videoPlacement.getDelay());
                }
                if (videoPlacement.getSkip()) {
                    setSkip(videoPlacement.getSkip());
                }
                if (videoPlacement.getSkipmin() != 0) {
                    setSkipmin(videoPlacement.getSkipmin());
                }
                if (videoPlacement.getSkipafter() != 0) {
                    setSkipafter(videoPlacement.getSkipafter());
                }
                if (videoPlacement.playmethod_ != 0) {
                    setPlaymethodValue(videoPlacement.getPlaymethodValue());
                }
                if (videoPlacement.playend_ != 0) {
                    setPlayendValue(videoPlacement.getPlayendValue());
                }
                if (videoPlacement.clktype_ != 0) {
                    setClktypeValue(videoPlacement.getClktypeValue());
                }
                if (!videoPlacement.mime_.isEmpty()) {
                    if (this.mime_.isEmpty()) {
                        this.mime_ = videoPlacement.mime_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMimeIsMutable();
                        this.mime_.addAll(videoPlacement.mime_);
                    }
                    onChanged();
                }
                if (!videoPlacement.api_.isEmpty()) {
                    if (this.api_.isEmpty()) {
                        this.api_ = videoPlacement.api_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureApiIsMutable();
                        this.api_.addAll(videoPlacement.api_);
                    }
                    onChanged();
                }
                if (!videoPlacement.ctype_.isEmpty()) {
                    if (this.ctype_.isEmpty()) {
                        this.ctype_ = videoPlacement.ctype_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureCtypeIsMutable();
                        this.ctype_.addAll(videoPlacement.ctype_);
                    }
                    onChanged();
                }
                if (videoPlacement.getW() != 0) {
                    setW(videoPlacement.getW());
                }
                if (videoPlacement.getH() != 0) {
                    setH(videoPlacement.getH());
                }
                if (videoPlacement.unit_ != 0) {
                    setUnitValue(videoPlacement.getUnitValue());
                }
                if (videoPlacement.getMindur() != 0) {
                    setMindur(videoPlacement.getMindur());
                }
                if (videoPlacement.getMaxdur() != 0) {
                    setMaxdur(videoPlacement.getMaxdur());
                }
                if (videoPlacement.getMaxext() != 0) {
                    setMaxext(videoPlacement.getMaxext());
                }
                if (videoPlacement.getMinbitr() != 0) {
                    setMinbitr(videoPlacement.getMinbitr());
                }
                if (videoPlacement.getMaxbitr() != 0) {
                    setMaxbitr(videoPlacement.getMaxbitr());
                }
                if (!videoPlacement.delivery_.isEmpty()) {
                    if (this.delivery_.isEmpty()) {
                        this.delivery_ = videoPlacement.delivery_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureDeliveryIsMutable();
                        this.delivery_.addAll(videoPlacement.delivery_);
                    }
                    onChanged();
                }
                if (videoPlacement.getMaxseq() != 0) {
                    setMaxseq(videoPlacement.getMaxseq());
                }
                if (videoPlacement.linear_ != 0) {
                    setLinearValue(videoPlacement.getLinearValue());
                }
                if (videoPlacement.getBoxing()) {
                    setBoxing(videoPlacement.getBoxing());
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                if (this.compBuilder_ == null) {
                    if (!videoPlacement.comp_.isEmpty()) {
                        if (this.comp_.isEmpty()) {
                            this.comp_ = videoPlacement.comp_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureCompIsMutable();
                            this.comp_.addAll(videoPlacement.comp_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.comp_.isEmpty()) {
                    if (this.compBuilder_.isEmpty()) {
                        this.compBuilder_.dispose();
                        this.compBuilder_ = null;
                        this.comp_ = videoPlacement.comp_;
                        this.bitField0_ &= -17;
                        this.compBuilder_ = VideoPlacement.alwaysUseFieldBuilders ? getCompFieldBuilder() : null;
                    } else {
                        this.compBuilder_.addAllMessages(videoPlacement.comp_);
                    }
                }
                if (!videoPlacement.comptype_.isEmpty()) {
                    if (this.comptype_.isEmpty()) {
                        this.comptype_ = videoPlacement.comptype_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureComptypeIsMutable();
                        this.comptype_.addAll(videoPlacement.comptype_);
                    }
                    onChanged();
                }
                if (videoPlacement.hasExt()) {
                    mergeExt(videoPlacement.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!videoPlacement.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = videoPlacement.extProto_;
                            this.bitField0_ &= -65;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(videoPlacement.extProto_);
                        }
                        onChanged();
                    }
                } else if (!videoPlacement.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = videoPlacement.extProto_;
                        this.bitField0_ &= -65;
                        if (VideoPlacement.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(videoPlacement.extProto_);
                    }
                }
                mergeUnknownFields(videoPlacement.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.VideoPlacement.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.adcom.Placement$VideoPlacement r3 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.VideoPlacement) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.adcom.Placement$VideoPlacement r4 = (com.explorestack.protobuf.adcom.Placement.VideoPlacement) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.adcom.Placement.VideoPlacement) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.VideoPlacement.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$VideoPlacement$Builder");
            }

            public int getPtypeValue() {
                return this.ptype_;
            }

            public Builder setPtypeValue(int i) {
                this.ptype_ = i;
                onChanged();
                return this;
            }

            public VideoPlacementType getPtype() {
                VideoPlacementType valueOf = VideoPlacementType.valueOf(this.ptype_);
                return valueOf == null ? VideoPlacementType.UNRECOGNIZED : valueOf;
            }

            public Builder setPtype(VideoPlacementType videoPlacementType) {
                if (videoPlacementType != null) {
                    this.ptype_ = videoPlacementType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPtype() {
                this.ptype_ = 0;
                onChanged();
                return this;
            }

            public int getPosValue() {
                return this.pos_;
            }

            public Builder setPosValue(int i) {
                this.pos_ = i;
                onChanged();
                return this;
            }

            public PlacementPosition getPos() {
                PlacementPosition valueOf = PlacementPosition.valueOf(this.pos_);
                return valueOf == null ? PlacementPosition.UNRECOGNIZED : valueOf;
            }

            public Builder setPos(PlacementPosition placementPosition) {
                if (placementPosition != null) {
                    this.pos_ = placementPosition.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPos() {
                this.pos_ = 0;
                onChanged();
                return this;
            }

            public int getDelay() {
                return this.delay_;
            }

            public Builder setDelay(int i) {
                this.delay_ = i;
                onChanged();
                return this;
            }

            public Builder clearDelay() {
                this.delay_ = 0;
                onChanged();
                return this;
            }

            public boolean getSkip() {
                return this.skip_;
            }

            public Builder setSkip(boolean z) {
                this.skip_ = z;
                onChanged();
                return this;
            }

            public Builder clearSkip() {
                this.skip_ = false;
                onChanged();
                return this;
            }

            public int getSkipmin() {
                return this.skipmin_;
            }

            public Builder setSkipmin(int i) {
                this.skipmin_ = i;
                onChanged();
                return this;
            }

            public Builder clearSkipmin() {
                this.skipmin_ = 0;
                onChanged();
                return this;
            }

            public int getSkipafter() {
                return this.skipafter_;
            }

            public Builder setSkipafter(int i) {
                this.skipafter_ = i;
                onChanged();
                return this;
            }

            public Builder clearSkipafter() {
                this.skipafter_ = 0;
                onChanged();
                return this;
            }

            public int getPlaymethodValue() {
                return this.playmethod_;
            }

            public Builder setPlaymethodValue(int i) {
                this.playmethod_ = i;
                onChanged();
                return this;
            }

            public PlaybackMethod getPlaymethod() {
                PlaybackMethod valueOf = PlaybackMethod.valueOf(this.playmethod_);
                return valueOf == null ? PlaybackMethod.UNRECOGNIZED : valueOf;
            }

            public Builder setPlaymethod(PlaybackMethod playbackMethod) {
                if (playbackMethod != null) {
                    this.playmethod_ = playbackMethod.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPlaymethod() {
                this.playmethod_ = 0;
                onChanged();
                return this;
            }

            public int getPlayendValue() {
                return this.playend_;
            }

            public Builder setPlayendValue(int i) {
                this.playend_ = i;
                onChanged();
                return this;
            }

            public PlaybackCessationMode getPlayend() {
                PlaybackCessationMode valueOf = PlaybackCessationMode.valueOf(this.playend_);
                return valueOf == null ? PlaybackCessationMode.UNRECOGNIZED : valueOf;
            }

            public Builder setPlayend(PlaybackCessationMode playbackCessationMode) {
                if (playbackCessationMode != null) {
                    this.playend_ = playbackCessationMode.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearPlayend() {
                this.playend_ = 0;
                onChanged();
                return this;
            }

            public int getClktypeValue() {
                return this.clktype_;
            }

            public Builder setClktypeValue(int i) {
                this.clktype_ = i;
                onChanged();
                return this;
            }

            public ClickType getClktype() {
                ClickType valueOf = ClickType.valueOf(this.clktype_);
                return valueOf == null ? ClickType.UNRECOGNIZED : valueOf;
            }

            public Builder setClktype(ClickType clickType) {
                if (clickType != null) {
                    this.clktype_ = clickType.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearClktype() {
                this.clktype_ = 0;
                onChanged();
                return this;
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
                    VideoPlacement.checkByteStringIsUtf8(byteString);
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
                return new Internal.ListAdapter(this.api_, VideoPlacement.api_converter_);
            }

            public int getApiCount() {
                return this.api_.size();
            }

            public ApiFramework getApi(int i) {
                return (ApiFramework) VideoPlacement.api_converter_.convert(this.api_.get(i));
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

            private void ensureCtypeIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.ctype_ = new ArrayList(this.ctype_);
                    this.bitField0_ |= 4;
                }
            }

            public List<VideoCreativeType> getCtypeList() {
                return new Internal.ListAdapter(this.ctype_, VideoPlacement.ctype_converter_);
            }

            public int getCtypeCount() {
                return this.ctype_.size();
            }

            public VideoCreativeType getCtype(int i) {
                return (VideoCreativeType) VideoPlacement.ctype_converter_.convert(this.ctype_.get(i));
            }

            public Builder setCtype(int i, VideoCreativeType videoCreativeType) {
                if (videoCreativeType != null) {
                    ensureCtypeIsMutable();
                    this.ctype_.set(i, Integer.valueOf(videoCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addCtype(VideoCreativeType videoCreativeType) {
                if (videoCreativeType != null) {
                    ensureCtypeIsMutable();
                    this.ctype_.add(Integer.valueOf(videoCreativeType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllCtype(Iterable<? extends VideoCreativeType> iterable) {
                ensureCtypeIsMutable();
                for (VideoCreativeType number : iterable) {
                    this.ctype_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearCtype() {
                this.ctype_ = Collections.emptyList();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public List<Integer> getCtypeValueList() {
                return Collections.unmodifiableList(this.ctype_);
            }

            public int getCtypeValue(int i) {
                return this.ctype_.get(i).intValue();
            }

            public Builder setCtypeValue(int i, int i2) {
                ensureCtypeIsMutable();
                this.ctype_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addCtypeValue(int i) {
                ensureCtypeIsMutable();
                this.ctype_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllCtypeValue(Iterable<Integer> iterable) {
                ensureCtypeIsMutable();
                for (Integer intValue : iterable) {
                    this.ctype_.add(Integer.valueOf(intValue.intValue()));
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

            public int getUnitValue() {
                return this.unit_;
            }

            public Builder setUnitValue(int i) {
                this.unit_ = i;
                onChanged();
                return this;
            }

            public SizeUnit getUnit() {
                SizeUnit valueOf = SizeUnit.valueOf(this.unit_);
                return valueOf == null ? SizeUnit.UNRECOGNIZED : valueOf;
            }

            public Builder setUnit(SizeUnit sizeUnit) {
                if (sizeUnit != null) {
                    this.unit_ = sizeUnit.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearUnit() {
                this.unit_ = 0;
                onChanged();
                return this;
            }

            public int getMindur() {
                return this.mindur_;
            }

            public Builder setMindur(int i) {
                this.mindur_ = i;
                onChanged();
                return this;
            }

            public Builder clearMindur() {
                this.mindur_ = 0;
                onChanged();
                return this;
            }

            public int getMaxdur() {
                return this.maxdur_;
            }

            public Builder setMaxdur(int i) {
                this.maxdur_ = i;
                onChanged();
                return this;
            }

            public Builder clearMaxdur() {
                this.maxdur_ = 0;
                onChanged();
                return this;
            }

            public int getMaxext() {
                return this.maxext_;
            }

            public Builder setMaxext(int i) {
                this.maxext_ = i;
                onChanged();
                return this;
            }

            public Builder clearMaxext() {
                this.maxext_ = 0;
                onChanged();
                return this;
            }

            public int getMinbitr() {
                return this.minbitr_;
            }

            public Builder setMinbitr(int i) {
                this.minbitr_ = i;
                onChanged();
                return this;
            }

            public Builder clearMinbitr() {
                this.minbitr_ = 0;
                onChanged();
                return this;
            }

            public int getMaxbitr() {
                return this.maxbitr_;
            }

            public Builder setMaxbitr(int i) {
                this.maxbitr_ = i;
                onChanged();
                return this;
            }

            public Builder clearMaxbitr() {
                this.maxbitr_ = 0;
                onChanged();
                return this;
            }

            private void ensureDeliveryIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.delivery_ = new ArrayList(this.delivery_);
                    this.bitField0_ |= 8;
                }
            }

            public List<DeliveryMethod> getDeliveryList() {
                return new Internal.ListAdapter(this.delivery_, VideoPlacement.delivery_converter_);
            }

            public int getDeliveryCount() {
                return this.delivery_.size();
            }

            public DeliveryMethod getDelivery(int i) {
                return (DeliveryMethod) VideoPlacement.delivery_converter_.convert(this.delivery_.get(i));
            }

            public Builder setDelivery(int i, DeliveryMethod deliveryMethod) {
                if (deliveryMethod != null) {
                    ensureDeliveryIsMutable();
                    this.delivery_.set(i, Integer.valueOf(deliveryMethod.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addDelivery(DeliveryMethod deliveryMethod) {
                if (deliveryMethod != null) {
                    ensureDeliveryIsMutable();
                    this.delivery_.add(Integer.valueOf(deliveryMethod.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllDelivery(Iterable<? extends DeliveryMethod> iterable) {
                ensureDeliveryIsMutable();
                for (DeliveryMethod number : iterable) {
                    this.delivery_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearDelivery() {
                this.delivery_ = Collections.emptyList();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public List<Integer> getDeliveryValueList() {
                return Collections.unmodifiableList(this.delivery_);
            }

            public int getDeliveryValue(int i) {
                return this.delivery_.get(i).intValue();
            }

            public Builder setDeliveryValue(int i, int i2) {
                ensureDeliveryIsMutable();
                this.delivery_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addDeliveryValue(int i) {
                ensureDeliveryIsMutable();
                this.delivery_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllDeliveryValue(Iterable<Integer> iterable) {
                ensureDeliveryIsMutable();
                for (Integer intValue : iterable) {
                    this.delivery_.add(Integer.valueOf(intValue.intValue()));
                }
                onChanged();
                return this;
            }

            public int getMaxseq() {
                return this.maxseq_;
            }

            public Builder setMaxseq(int i) {
                this.maxseq_ = i;
                onChanged();
                return this;
            }

            public Builder clearMaxseq() {
                this.maxseq_ = 0;
                onChanged();
                return this;
            }

            public int getLinearValue() {
                return this.linear_;
            }

            public Builder setLinearValue(int i) {
                this.linear_ = i;
                onChanged();
                return this;
            }

            public LinearityMode getLinear() {
                LinearityMode valueOf = LinearityMode.valueOf(this.linear_);
                return valueOf == null ? LinearityMode.UNRECOGNIZED : valueOf;
            }

            public Builder setLinear(LinearityMode linearityMode) {
                if (linearityMode != null) {
                    this.linear_ = linearityMode.getNumber();
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearLinear() {
                this.linear_ = 0;
                onChanged();
                return this;
            }

            public boolean getBoxing() {
                return this.boxing_;
            }

            public Builder setBoxing(boolean z) {
                this.boxing_ = z;
                onChanged();
                return this;
            }

            public Builder clearBoxing() {
                this.boxing_ = false;
                onChanged();
                return this;
            }

            private void ensureCompIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.comp_ = new ArrayList(this.comp_);
                    this.bitField0_ |= 16;
                }
            }

            public List<Companion> getCompList() {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.comp_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getCompCount() {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.comp_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Companion getComp(int i) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.comp_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setComp(int i, Companion companion) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, companion);
                } else if (companion != null) {
                    ensureCompIsMutable();
                    this.comp_.set(i, companion);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setComp(int i, Companion.Builder builder) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCompIsMutable();
                    this.comp_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addComp(Companion companion) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(companion);
                } else if (companion != null) {
                    ensureCompIsMutable();
                    this.comp_.add(companion);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addComp(int i, Companion companion) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, companion);
                } else if (companion != null) {
                    ensureCompIsMutable();
                    this.comp_.add(i, companion);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addComp(Companion.Builder builder) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCompIsMutable();
                    this.comp_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addComp(int i, Companion.Builder builder) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCompIsMutable();
                    this.comp_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllComp(Iterable<? extends Companion> iterable) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCompIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.comp_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearComp() {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.comp_ = Collections.emptyList();
                    this.bitField0_ &= -17;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeComp(int i) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCompIsMutable();
                    this.comp_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Companion.Builder getCompBuilder(int i) {
                return getCompFieldBuilder().getBuilder(i);
            }

            public CompanionOrBuilder getCompOrBuilder(int i) {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.comp_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends CompanionOrBuilder> getCompOrBuilderList() {
                RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> repeatedFieldBuilderV3 = this.compBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.comp_);
            }

            public Companion.Builder addCompBuilder() {
                return getCompFieldBuilder().addBuilder(Companion.getDefaultInstance());
            }

            public Companion.Builder addCompBuilder(int i) {
                return getCompFieldBuilder().addBuilder(i, Companion.getDefaultInstance());
            }

            public List<Companion.Builder> getCompBuilderList() {
                return getCompFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Companion, Companion.Builder, CompanionOrBuilder> getCompFieldBuilder() {
                if (this.compBuilder_ == null) {
                    this.compBuilder_ = new RepeatedFieldBuilderV3<>(this.comp_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.comp_ = null;
                }
                return this.compBuilder_;
            }

            private void ensureComptypeIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.comptype_ = new ArrayList(this.comptype_);
                    this.bitField0_ |= 32;
                }
            }

            public List<CompanionType> getComptypeList() {
                return new Internal.ListAdapter(this.comptype_, VideoPlacement.comptype_converter_);
            }

            public int getComptypeCount() {
                return this.comptype_.size();
            }

            public CompanionType getComptype(int i) {
                return (CompanionType) VideoPlacement.comptype_converter_.convert(this.comptype_.get(i));
            }

            public Builder setComptype(int i, CompanionType companionType) {
                if (companionType != null) {
                    ensureComptypeIsMutable();
                    this.comptype_.set(i, Integer.valueOf(companionType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addComptype(CompanionType companionType) {
                if (companionType != null) {
                    ensureComptypeIsMutable();
                    this.comptype_.add(Integer.valueOf(companionType.getNumber()));
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder addAllComptype(Iterable<? extends CompanionType> iterable) {
                ensureComptypeIsMutable();
                for (CompanionType number : iterable) {
                    this.comptype_.add(Integer.valueOf(number.getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder clearComptype() {
                this.comptype_ = Collections.emptyList();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public List<Integer> getComptypeValueList() {
                return Collections.unmodifiableList(this.comptype_);
            }

            public int getComptypeValue(int i) {
                return this.comptype_.get(i).intValue();
            }

            public Builder setComptypeValue(int i, int i2) {
                ensureComptypeIsMutable();
                this.comptype_.set(i, Integer.valueOf(i2));
                onChanged();
                return this;
            }

            public Builder addComptypeValue(int i) {
                ensureComptypeIsMutable();
                this.comptype_.add(Integer.valueOf(i));
                onChanged();
                return this;
            }

            public Builder addAllComptypeValue(Iterable<Integer> iterable) {
                ensureComptypeIsMutable();
                for (Integer intValue : iterable) {
                    this.comptype_.add(Integer.valueOf(intValue.intValue()));
                }
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
                if ((this.bitField0_ & 64) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 64;
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
                    this.bitField0_ &= -65;
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
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
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

        public static VideoPlacement getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<VideoPlacement> parser() {
            return PARSER;
        }

        public Parser<VideoPlacement> getParserForType() {
            return PARSER;
        }

        public VideoPlacement getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public String getTagid() {
        Object obj = this.tagid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tagid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTagidBytes() {
        Object obj = this.tagid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tagid_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getSsai() {
        return this.ssai_;
    }

    public String getSdk() {
        Object obj = this.sdk_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdk_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkBytes() {
        Object obj = this.sdk_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdk_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getSdkver() {
        Object obj = this.sdkver_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.sdkver_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getSdkverBytes() {
        Object obj = this.sdkver_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.sdkver_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean getReward() {
        return this.reward_;
    }

    public ProtocolStringList getBcatList() {
        return this.bcat_;
    }

    public int getBcatCount() {
        return this.bcat_.size();
    }

    public String getBcat(int i) {
        return (String) this.bcat_.get(i);
    }

    public ByteString getBcatBytes(int i) {
        return this.bcat_.getByteString(i);
    }

    public int getCattaxValue() {
        return this.cattax_;
    }

    public CategoryTaxonomy getCattax() {
        CategoryTaxonomy valueOf = CategoryTaxonomy.valueOf(this.cattax_);
        return valueOf == null ? CategoryTaxonomy.UNRECOGNIZED : valueOf;
    }

    public ProtocolStringList getBadvList() {
        return this.badv_;
    }

    public int getBadvCount() {
        return this.badv_.size();
    }

    public String getBadv(int i) {
        return (String) this.badv_.get(i);
    }

    public ByteString getBadvBytes(int i) {
        return this.badv_.getByteString(i);
    }

    public ProtocolStringList getBappList() {
        return this.bapp_;
    }

    public int getBappCount() {
        return this.bapp_.size();
    }

    public String getBapp(int i) {
        return (String) this.bapp_.get(i);
    }

    public ByteString getBappBytes(int i) {
        return this.bapp_.getByteString(i);
    }

    public List<CreativeAttribute> getBattrList() {
        return new Internal.ListAdapter(this.battr_, battr_converter_);
    }

    public int getBattrCount() {
        return this.battr_.size();
    }

    public CreativeAttribute getBattr(int i) {
        return battr_converter_.convert(this.battr_.get(i));
    }

    public List<Integer> getBattrValueList() {
        return this.battr_;
    }

    public int getBattrValue(int i) {
        return this.battr_.get(i).intValue();
    }

    public ProtocolStringList getWlangList() {
        return this.wlang_;
    }

    public int getWlangCount() {
        return this.wlang_.size();
    }

    public String getWlang(int i) {
        return (String) this.wlang_.get(i);
    }

    public ByteString getWlangBytes(int i) {
        return this.wlang_.getByteString(i);
    }

    public boolean getSecure() {
        return this.secure_;
    }

    public boolean getAdmx() {
        return this.admx_;
    }

    public boolean getCurlx() {
        return this.curlx_;
    }

    public boolean hasDisplay() {
        return this.display_ != null;
    }

    public DisplayPlacement getDisplay() {
        DisplayPlacement displayPlacement = this.display_;
        return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
    }

    public DisplayPlacementOrBuilder getDisplayOrBuilder() {
        return getDisplay();
    }

    public boolean hasVideo() {
        return this.video_ != null;
    }

    public VideoPlacement getVideo() {
        VideoPlacement videoPlacement = this.video_;
        return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
    }

    public VideoPlacementOrBuilder getVideoOrBuilder() {
        return getVideo();
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
        if (!getTagidBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.tagid_);
        }
        int i = this.ssai_;
        if (i != 0) {
            codedOutputStream.writeUInt32(2, i);
        }
        if (!getSdkBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.sdkver_);
        }
        boolean z = this.reward_;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        for (int i2 = 0; i2 < this.bcat_.size(); i2++) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.bcat_.getRaw(i2));
        }
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            codedOutputStream.writeEnum(7, this.cattax_);
        }
        for (int i3 = 0; i3 < this.badv_.size(); i3++) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.badv_.getRaw(i3));
        }
        for (int i4 = 0; i4 < this.bapp_.size(); i4++) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.bapp_.getRaw(i4));
        }
        if (getBattrList().size() > 0) {
            codedOutputStream.writeUInt32NoTag(90);
            codedOutputStream.writeUInt32NoTag(this.battrMemoizedSerializedSize);
        }
        for (int i5 = 0; i5 < this.battr_.size(); i5++) {
            codedOutputStream.writeEnumNoTag(this.battr_.get(i5).intValue());
        }
        for (int i6 = 0; i6 < this.wlang_.size(); i6++) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.wlang_.getRaw(i6));
        }
        boolean z2 = this.secure_;
        if (z2) {
            codedOutputStream.writeBool(13, z2);
        }
        boolean z3 = this.admx_;
        if (z3) {
            codedOutputStream.writeBool(14, z3);
        }
        boolean z4 = this.curlx_;
        if (z4) {
            codedOutputStream.writeBool(15, z4);
        }
        if (this.display_ != null) {
            codedOutputStream.writeMessage(16, getDisplay());
        }
        if (this.video_ != null) {
            codedOutputStream.writeMessage(17, getVideo());
        }
        for (int i7 = 0; i7 < this.extProto_.size(); i7++) {
            codedOutputStream.writeMessage(19, this.extProto_.get(i7));
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(20, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getTagidBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.tagid_) + 0 : 0;
        int i2 = this.ssai_;
        if (i2 != 0) {
            computeStringSize += CodedOutputStream.computeUInt32Size(2, i2);
        }
        if (!getSdkBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(3, this.sdk_);
        }
        if (!getSdkverBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(4, this.sdkver_);
        }
        boolean z = this.reward_;
        if (z) {
            computeStringSize += CodedOutputStream.computeBoolSize(5, z);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.bcat_.size(); i4++) {
            i3 += computeStringSizeNoTag(this.bcat_.getRaw(i4));
        }
        int size = computeStringSize + i3 + (getBcatList().size() * 1);
        if (this.cattax_ != CategoryTaxonomy.CATEGORY_TAXONOMY_INVALID.getNumber()) {
            size += CodedOutputStream.computeEnumSize(7, this.cattax_);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.badv_.size(); i6++) {
            i5 += computeStringSizeNoTag(this.badv_.getRaw(i6));
        }
        int size2 = size + i5 + (getBadvList().size() * 1);
        int i7 = 0;
        for (int i8 = 0; i8 < this.bapp_.size(); i8++) {
            i7 += computeStringSizeNoTag(this.bapp_.getRaw(i8));
        }
        int size3 = size2 + i7 + (getBappList().size() * 1);
        int i9 = 0;
        for (int i10 = 0; i10 < this.battr_.size(); i10++) {
            i9 += CodedOutputStream.computeEnumSizeNoTag(this.battr_.get(i10).intValue());
        }
        int i11 = size3 + i9;
        if (!getBattrList().isEmpty()) {
            i11 = i11 + 1 + CodedOutputStream.computeUInt32SizeNoTag(i9);
        }
        this.battrMemoizedSerializedSize = i9;
        int i12 = 0;
        for (int i13 = 0; i13 < this.wlang_.size(); i13++) {
            i12 += computeStringSizeNoTag(this.wlang_.getRaw(i13));
        }
        int size4 = i11 + i12 + (getWlangList().size() * 1);
        boolean z2 = this.secure_;
        if (z2) {
            size4 += CodedOutputStream.computeBoolSize(13, z2);
        }
        boolean z3 = this.admx_;
        if (z3) {
            size4 += CodedOutputStream.computeBoolSize(14, z3);
        }
        boolean z4 = this.curlx_;
        if (z4) {
            size4 += CodedOutputStream.computeBoolSize(15, z4);
        }
        if (this.display_ != null) {
            size4 += CodedOutputStream.computeMessageSize(16, getDisplay());
        }
        if (this.video_ != null) {
            size4 += CodedOutputStream.computeMessageSize(17, getVideo());
        }
        for (int i14 = 0; i14 < this.extProto_.size(); i14++) {
            size4 += CodedOutputStream.computeMessageSize(19, this.extProto_.get(i14));
        }
        if (this.ext_ != null) {
            size4 += CodedOutputStream.computeMessageSize(20, getExt());
        }
        int serializedSize = size4 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Placement)) {
            return super.equals(obj);
        }
        Placement placement = (Placement) obj;
        if (!getTagid().equals(placement.getTagid()) || getSsai() != placement.getSsai() || !getSdk().equals(placement.getSdk()) || !getSdkver().equals(placement.getSdkver()) || getReward() != placement.getReward() || !getBcatList().equals(placement.getBcatList()) || this.cattax_ != placement.cattax_ || !getBadvList().equals(placement.getBadvList()) || !getBappList().equals(placement.getBappList()) || !this.battr_.equals(placement.battr_) || !getWlangList().equals(placement.getWlangList()) || getSecure() != placement.getSecure() || getAdmx() != placement.getAdmx() || getCurlx() != placement.getCurlx() || hasDisplay() != placement.hasDisplay()) {
            return false;
        }
        if ((hasDisplay() && !getDisplay().equals(placement.getDisplay())) || hasVideo() != placement.hasVideo()) {
            return false;
        }
        if ((hasVideo() && !getVideo().equals(placement.getVideo())) || hasExt() != placement.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(placement.getExt())) && getExtProtoList().equals(placement.getExtProtoList()) && this.unknownFields.equals(placement.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTagid().hashCode()) * 37) + 2) * 53) + getSsai()) * 37) + 3) * 53) + getSdk().hashCode()) * 37) + 4) * 53) + getSdkver().hashCode()) * 37) + 5) * 53) + Internal.hashBoolean(getReward());
        if (getBcatCount() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getBcatList().hashCode();
        }
        int i = (((hashCode * 37) + 7) * 53) + this.cattax_;
        if (getBadvCount() > 0) {
            i = (((i * 37) + 9) * 53) + getBadvList().hashCode();
        }
        if (getBappCount() > 0) {
            i = (((i * 37) + 10) * 53) + getBappList().hashCode();
        }
        if (getBattrCount() > 0) {
            i = (((i * 37) + 11) * 53) + this.battr_.hashCode();
        }
        if (getWlangCount() > 0) {
            i = (((i * 37) + 12) * 53) + getWlangList().hashCode();
        }
        int hashBoolean = (((((((((((i * 37) + 13) * 53) + Internal.hashBoolean(getSecure())) * 37) + 14) * 53) + Internal.hashBoolean(getAdmx())) * 37) + 15) * 53) + Internal.hashBoolean(getCurlx());
        if (hasDisplay()) {
            hashBoolean = (((hashBoolean * 37) + 16) * 53) + getDisplay().hashCode();
        }
        if (hasVideo()) {
            hashBoolean = (((hashBoolean * 37) + 17) * 53) + getVideo().hashCode();
        }
        if (hasExt()) {
            hashBoolean = (((hashBoolean * 37) + 20) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            hashBoolean = (((hashBoolean * 37) + 19) * 53) + getExtProtoList().hashCode();
        }
        int hashCode2 = (hashBoolean * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Placement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Placement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Placement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Placement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Placement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Placement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Placement parseFrom(InputStream inputStream) throws IOException {
        return (Placement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Placement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Placement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Placement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Placement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Placement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Placement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Placement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Placement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Placement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Placement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Placement placement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(placement);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlacementOrBuilder {
        private boolean admx_;
        private LazyStringList badv_;
        private LazyStringList bapp_;
        private List<Integer> battr_;
        private LazyStringList bcat_;
        private int bitField0_;
        private int cattax_;
        private boolean curlx_;
        private SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> displayBuilder_;
        private DisplayPlacement display_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private boolean reward_;
        private Object sdk_;
        private Object sdkver_;
        private boolean secure_;
        private int ssai_;
        private Object tagid_;
        private SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> videoBuilder_;
        private VideoPlacement video_;
        private LazyStringList wlang_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_fieldAccessorTable.ensureFieldAccessorsInitialized(Placement.class, Builder.class);
        }

        private Builder() {
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.bcat_ = LazyStringArrayList.EMPTY;
            this.cattax_ = 0;
            this.badv_ = LazyStringArrayList.EMPTY;
            this.bapp_ = LazyStringArrayList.EMPTY;
            this.battr_ = Collections.emptyList();
            this.wlang_ = LazyStringArrayList.EMPTY;
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.tagid_ = "";
            this.sdk_ = "";
            this.sdkver_ = "";
            this.bcat_ = LazyStringArrayList.EMPTY;
            this.cattax_ = 0;
            this.badv_ = LazyStringArrayList.EMPTY;
            this.bapp_ = LazyStringArrayList.EMPTY;
            this.battr_ = Collections.emptyList();
            this.wlang_ = LazyStringArrayList.EMPTY;
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Placement.alwaysUseFieldBuilders) {
                getExtProtoFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.tagid_ = "";
            this.ssai_ = 0;
            this.sdk_ = "";
            this.sdkver_ = "";
            this.reward_ = false;
            this.bcat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            this.cattax_ = 0;
            this.badv_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            this.bapp_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            this.battr_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.wlang_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -17;
            this.secure_ = false;
            this.admx_ = false;
            this.curlx_ = false;
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
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -33;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return AdcomProto.internal_static_bidmachine_protobuf_adcom_Placement_descriptor;
        }

        public Placement getDefaultInstanceForType() {
            return Placement.getDefaultInstance();
        }

        public Placement build() {
            Placement buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Placement buildPartial() {
            Placement placement = new Placement((GeneratedMessageV3.Builder) this);
            Object unused = placement.tagid_ = this.tagid_;
            int unused2 = placement.ssai_ = this.ssai_;
            Object unused3 = placement.sdk_ = this.sdk_;
            Object unused4 = placement.sdkver_ = this.sdkver_;
            boolean unused5 = placement.reward_ = this.reward_;
            if ((this.bitField0_ & 1) != 0) {
                this.bcat_ = this.bcat_.getUnmodifiableView();
                this.bitField0_ &= -2;
            }
            LazyStringList unused6 = placement.bcat_ = this.bcat_;
            int unused7 = placement.cattax_ = this.cattax_;
            if ((this.bitField0_ & 2) != 0) {
                this.badv_ = this.badv_.getUnmodifiableView();
                this.bitField0_ &= -3;
            }
            LazyStringList unused8 = placement.badv_ = this.badv_;
            if ((this.bitField0_ & 4) != 0) {
                this.bapp_ = this.bapp_.getUnmodifiableView();
                this.bitField0_ &= -5;
            }
            LazyStringList unused9 = placement.bapp_ = this.bapp_;
            if ((this.bitField0_ & 8) != 0) {
                this.battr_ = Collections.unmodifiableList(this.battr_);
                this.bitField0_ &= -9;
            }
            List unused10 = placement.battr_ = this.battr_;
            if ((this.bitField0_ & 16) != 0) {
                this.wlang_ = this.wlang_.getUnmodifiableView();
                this.bitField0_ &= -17;
            }
            LazyStringList unused11 = placement.wlang_ = this.wlang_;
            boolean unused12 = placement.secure_ = this.secure_;
            boolean unused13 = placement.admx_ = this.admx_;
            boolean unused14 = placement.curlx_ = this.curlx_;
            SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                DisplayPlacement unused15 = placement.display_ = this.display_;
            } else {
                DisplayPlacement unused16 = placement.display_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV32 = this.videoBuilder_;
            if (singleFieldBuilderV32 == null) {
                VideoPlacement unused17 = placement.video_ = this.video_;
            } else {
                VideoPlacement unused18 = placement.video_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV33 = this.extBuilder_;
            if (singleFieldBuilderV33 == null) {
                Struct unused19 = placement.ext_ = this.ext_;
            } else {
                Struct unused20 = placement.ext_ = singleFieldBuilderV33.build();
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 32) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -33;
                }
                List unused21 = placement.extProto_ = this.extProto_;
            } else {
                List unused22 = placement.extProto_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return placement;
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
            if (message instanceof Placement) {
                return mergeFrom((Placement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Placement placement) {
            if (placement == Placement.getDefaultInstance()) {
                return this;
            }
            if (!placement.getTagid().isEmpty()) {
                this.tagid_ = placement.tagid_;
                onChanged();
            }
            if (placement.getSsai() != 0) {
                setSsai(placement.getSsai());
            }
            if (!placement.getSdk().isEmpty()) {
                this.sdk_ = placement.sdk_;
                onChanged();
            }
            if (!placement.getSdkver().isEmpty()) {
                this.sdkver_ = placement.sdkver_;
                onChanged();
            }
            if (placement.getReward()) {
                setReward(placement.getReward());
            }
            if (!placement.bcat_.isEmpty()) {
                if (this.bcat_.isEmpty()) {
                    this.bcat_ = placement.bcat_;
                    this.bitField0_ &= -2;
                } else {
                    ensureBcatIsMutable();
                    this.bcat_.addAll(placement.bcat_);
                }
                onChanged();
            }
            if (placement.cattax_ != 0) {
                setCattaxValue(placement.getCattaxValue());
            }
            if (!placement.badv_.isEmpty()) {
                if (this.badv_.isEmpty()) {
                    this.badv_ = placement.badv_;
                    this.bitField0_ &= -3;
                } else {
                    ensureBadvIsMutable();
                    this.badv_.addAll(placement.badv_);
                }
                onChanged();
            }
            if (!placement.bapp_.isEmpty()) {
                if (this.bapp_.isEmpty()) {
                    this.bapp_ = placement.bapp_;
                    this.bitField0_ &= -5;
                } else {
                    ensureBappIsMutable();
                    this.bapp_.addAll(placement.bapp_);
                }
                onChanged();
            }
            if (!placement.battr_.isEmpty()) {
                if (this.battr_.isEmpty()) {
                    this.battr_ = placement.battr_;
                    this.bitField0_ &= -9;
                } else {
                    ensureBattrIsMutable();
                    this.battr_.addAll(placement.battr_);
                }
                onChanged();
            }
            if (!placement.wlang_.isEmpty()) {
                if (this.wlang_.isEmpty()) {
                    this.wlang_ = placement.wlang_;
                    this.bitField0_ &= -17;
                } else {
                    ensureWlangIsMutable();
                    this.wlang_.addAll(placement.wlang_);
                }
                onChanged();
            }
            if (placement.getSecure()) {
                setSecure(placement.getSecure());
            }
            if (placement.getAdmx()) {
                setAdmx(placement.getAdmx());
            }
            if (placement.getCurlx()) {
                setCurlx(placement.getCurlx());
            }
            if (placement.hasDisplay()) {
                mergeDisplay(placement.getDisplay());
            }
            if (placement.hasVideo()) {
                mergeVideo(placement.getVideo());
            }
            if (placement.hasExt()) {
                mergeExt(placement.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!placement.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = placement.extProto_;
                        this.bitField0_ &= -33;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(placement.extProto_);
                    }
                    onChanged();
                }
            } else if (!placement.extProto_.isEmpty()) {
                if (this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.dispose();
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                    this.extProtoBuilder_ = null;
                    this.extProto_ = placement.extProto_;
                    this.bitField0_ &= -33;
                    if (Placement.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                    }
                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.extProtoBuilder_.addAllMessages(placement.extProto_);
                }
            }
            mergeUnknownFields(placement.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.explorestack.protobuf.adcom.Placement.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.adcom.Placement.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.explorestack.protobuf.adcom.Placement r3 = (com.explorestack.protobuf.adcom.Placement) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.explorestack.protobuf.adcom.Placement r4 = (com.explorestack.protobuf.adcom.Placement) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.explorestack.protobuf.adcom.Placement) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.adcom.Placement.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.adcom.Placement$Builder");
        }

        public String getTagid() {
            Object obj = this.tagid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tagid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTagidBytes() {
            Object obj = this.tagid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tagid_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setTagid(String str) {
            if (str != null) {
                this.tagid_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearTagid() {
            this.tagid_ = Placement.getDefaultInstance().getTagid();
            onChanged();
            return this;
        }

        public Builder setTagidBytes(ByteString byteString) {
            if (byteString != null) {
                Placement.checkByteStringIsUtf8(byteString);
                this.tagid_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public int getSsai() {
            return this.ssai_;
        }

        public Builder setSsai(int i) {
            this.ssai_ = i;
            onChanged();
            return this;
        }

        public Builder clearSsai() {
            this.ssai_ = 0;
            onChanged();
            return this;
        }

        public String getSdk() {
            Object obj = this.sdk_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdk_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkBytes() {
            Object obj = this.sdk_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdk_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSdk(String str) {
            if (str != null) {
                this.sdk_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearSdk() {
            this.sdk_ = Placement.getDefaultInstance().getSdk();
            onChanged();
            return this;
        }

        public Builder setSdkBytes(ByteString byteString) {
            if (byteString != null) {
                Placement.checkByteStringIsUtf8(byteString);
                this.sdk_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getSdkver() {
            Object obj = this.sdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.sdkver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSdkverBytes() {
            Object obj = this.sdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.sdkver_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setSdkver(String str) {
            if (str != null) {
                this.sdkver_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearSdkver() {
            this.sdkver_ = Placement.getDefaultInstance().getSdkver();
            onChanged();
            return this;
        }

        public Builder setSdkverBytes(ByteString byteString) {
            if (byteString != null) {
                Placement.checkByteStringIsUtf8(byteString);
                this.sdkver_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean getReward() {
            return this.reward_;
        }

        public Builder setReward(boolean z) {
            this.reward_ = z;
            onChanged();
            return this;
        }

        public Builder clearReward() {
            this.reward_ = false;
            onChanged();
            return this;
        }

        private void ensureBcatIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.bcat_ = new LazyStringArrayList(this.bcat_);
                this.bitField0_ |= 1;
            }
        }

        public ProtocolStringList getBcatList() {
            return this.bcat_.getUnmodifiableView();
        }

        public int getBcatCount() {
            return this.bcat_.size();
        }

        public String getBcat(int i) {
            return (String) this.bcat_.get(i);
        }

        public ByteString getBcatBytes(int i) {
            return this.bcat_.getByteString(i);
        }

        public Builder setBcat(int i, String str) {
            if (str != null) {
                ensureBcatIsMutable();
                this.bcat_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addBcat(String str) {
            if (str != null) {
                ensureBcatIsMutable();
                this.bcat_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllBcat(Iterable<String> iterable) {
            ensureBcatIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.bcat_);
            onChanged();
            return this;
        }

        public Builder clearBcat() {
            this.bcat_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder addBcatBytes(ByteString byteString) {
            if (byteString != null) {
                Placement.checkByteStringIsUtf8(byteString);
                ensureBcatIsMutable();
                this.bcat_.add(byteString);
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

        private void ensureBadvIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.badv_ = new LazyStringArrayList(this.badv_);
                this.bitField0_ |= 2;
            }
        }

        public ProtocolStringList getBadvList() {
            return this.badv_.getUnmodifiableView();
        }

        public int getBadvCount() {
            return this.badv_.size();
        }

        public String getBadv(int i) {
            return (String) this.badv_.get(i);
        }

        public ByteString getBadvBytes(int i) {
            return this.badv_.getByteString(i);
        }

        public Builder setBadv(int i, String str) {
            if (str != null) {
                ensureBadvIsMutable();
                this.badv_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addBadv(String str) {
            if (str != null) {
                ensureBadvIsMutable();
                this.badv_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllBadv(Iterable<String> iterable) {
            ensureBadvIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.badv_);
            onChanged();
            return this;
        }

        public Builder clearBadv() {
            this.badv_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder addBadvBytes(ByteString byteString) {
            if (byteString != null) {
                Placement.checkByteStringIsUtf8(byteString);
                ensureBadvIsMutable();
                this.badv_.add(byteString);
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureBappIsMutable() {
            if ((this.bitField0_ & 4) == 0) {
                this.bapp_ = new LazyStringArrayList(this.bapp_);
                this.bitField0_ |= 4;
            }
        }

        public ProtocolStringList getBappList() {
            return this.bapp_.getUnmodifiableView();
        }

        public int getBappCount() {
            return this.bapp_.size();
        }

        public String getBapp(int i) {
            return (String) this.bapp_.get(i);
        }

        public ByteString getBappBytes(int i) {
            return this.bapp_.getByteString(i);
        }

        public Builder setBapp(int i, String str) {
            if (str != null) {
                ensureBappIsMutable();
                this.bapp_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addBapp(String str) {
            if (str != null) {
                ensureBappIsMutable();
                this.bapp_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllBapp(Iterable<String> iterable) {
            ensureBappIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.bapp_);
            onChanged();
            return this;
        }

        public Builder clearBapp() {
            this.bapp_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder addBappBytes(ByteString byteString) {
            if (byteString != null) {
                Placement.checkByteStringIsUtf8(byteString);
                ensureBappIsMutable();
                this.bapp_.add(byteString);
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureBattrIsMutable() {
            if ((this.bitField0_ & 8) == 0) {
                this.battr_ = new ArrayList(this.battr_);
                this.bitField0_ |= 8;
            }
        }

        public List<CreativeAttribute> getBattrList() {
            return new Internal.ListAdapter(this.battr_, Placement.battr_converter_);
        }

        public int getBattrCount() {
            return this.battr_.size();
        }

        public CreativeAttribute getBattr(int i) {
            return (CreativeAttribute) Placement.battr_converter_.convert(this.battr_.get(i));
        }

        public Builder setBattr(int i, CreativeAttribute creativeAttribute) {
            if (creativeAttribute != null) {
                ensureBattrIsMutable();
                this.battr_.set(i, Integer.valueOf(creativeAttribute.getNumber()));
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addBattr(CreativeAttribute creativeAttribute) {
            if (creativeAttribute != null) {
                ensureBattrIsMutable();
                this.battr_.add(Integer.valueOf(creativeAttribute.getNumber()));
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllBattr(Iterable<? extends CreativeAttribute> iterable) {
            ensureBattrIsMutable();
            for (CreativeAttribute number : iterable) {
                this.battr_.add(Integer.valueOf(number.getNumber()));
            }
            onChanged();
            return this;
        }

        public Builder clearBattr() {
            this.battr_ = Collections.emptyList();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public List<Integer> getBattrValueList() {
            return Collections.unmodifiableList(this.battr_);
        }

        public int getBattrValue(int i) {
            return this.battr_.get(i).intValue();
        }

        public Builder setBattrValue(int i, int i2) {
            ensureBattrIsMutable();
            this.battr_.set(i, Integer.valueOf(i2));
            onChanged();
            return this;
        }

        public Builder addBattrValue(int i) {
            ensureBattrIsMutable();
            this.battr_.add(Integer.valueOf(i));
            onChanged();
            return this;
        }

        public Builder addAllBattrValue(Iterable<Integer> iterable) {
            ensureBattrIsMutable();
            for (Integer intValue : iterable) {
                this.battr_.add(Integer.valueOf(intValue.intValue()));
            }
            onChanged();
            return this;
        }

        private void ensureWlangIsMutable() {
            if ((this.bitField0_ & 16) == 0) {
                this.wlang_ = new LazyStringArrayList(this.wlang_);
                this.bitField0_ |= 16;
            }
        }

        public ProtocolStringList getWlangList() {
            return this.wlang_.getUnmodifiableView();
        }

        public int getWlangCount() {
            return this.wlang_.size();
        }

        public String getWlang(int i) {
            return (String) this.wlang_.get(i);
        }

        public ByteString getWlangBytes(int i) {
            return this.wlang_.getByteString(i);
        }

        public Builder setWlang(int i, String str) {
            if (str != null) {
                ensureWlangIsMutable();
                this.wlang_.set(i, str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addWlang(String str) {
            if (str != null) {
                ensureWlangIsMutable();
                this.wlang_.add(str);
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder addAllWlang(Iterable<String> iterable) {
            ensureWlangIsMutable();
            AbstractMessageLite.Builder.addAll(iterable, this.wlang_);
            onChanged();
            return this;
        }

        public Builder clearWlang() {
            this.wlang_ = LazyStringArrayList.EMPTY;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder addWlangBytes(ByteString byteString) {
            if (byteString != null) {
                Placement.checkByteStringIsUtf8(byteString);
                ensureWlangIsMutable();
                this.wlang_.add(byteString);
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

        public boolean getAdmx() {
            return this.admx_;
        }

        public Builder setAdmx(boolean z) {
            this.admx_ = z;
            onChanged();
            return this;
        }

        public Builder clearAdmx() {
            this.admx_ = false;
            onChanged();
            return this;
        }

        public boolean getCurlx() {
            return this.curlx_;
        }

        public Builder setCurlx(boolean z) {
            this.curlx_ = z;
            onChanged();
            return this;
        }

        public Builder clearCurlx() {
            this.curlx_ = false;
            onChanged();
            return this;
        }

        public boolean hasDisplay() {
            return (this.displayBuilder_ == null && this.display_ == null) ? false : true;
        }

        public DisplayPlacement getDisplay() {
            SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        public Builder setDisplay(DisplayPlacement displayPlacement) {
            SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(displayPlacement);
            } else if (displayPlacement != null) {
                this.display_ = displayPlacement;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setDisplay(DisplayPlacement.Builder builder) {
            SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.display_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeDisplay(DisplayPlacement displayPlacement) {
            SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 == null) {
                DisplayPlacement displayPlacement2 = this.display_;
                if (displayPlacement2 != null) {
                    this.display_ = DisplayPlacement.newBuilder(displayPlacement2).mergeFrom(displayPlacement).buildPartial();
                } else {
                    this.display_ = displayPlacement;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(displayPlacement);
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

        public DisplayPlacement.Builder getDisplayBuilder() {
            onChanged();
            return getDisplayFieldBuilder().getBuilder();
        }

        public DisplayPlacementOrBuilder getDisplayOrBuilder() {
            SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> singleFieldBuilderV3 = this.displayBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            DisplayPlacement displayPlacement = this.display_;
            return displayPlacement == null ? DisplayPlacement.getDefaultInstance() : displayPlacement;
        }

        private SingleFieldBuilderV3<DisplayPlacement, DisplayPlacement.Builder, DisplayPlacementOrBuilder> getDisplayFieldBuilder() {
            if (this.displayBuilder_ == null) {
                this.displayBuilder_ = new SingleFieldBuilderV3<>(getDisplay(), getParentForChildren(), isClean());
                this.display_ = null;
            }
            return this.displayBuilder_;
        }

        public boolean hasVideo() {
            return (this.videoBuilder_ == null && this.video_ == null) ? false : true;
        }

        public VideoPlacement getVideo() {
            SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        public Builder setVideo(VideoPlacement videoPlacement) {
            SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(videoPlacement);
            } else if (videoPlacement != null) {
                this.video_ = videoPlacement;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setVideo(VideoPlacement.Builder builder) {
            SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.video_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeVideo(VideoPlacement videoPlacement) {
            SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 == null) {
                VideoPlacement videoPlacement2 = this.video_;
                if (videoPlacement2 != null) {
                    this.video_ = VideoPlacement.newBuilder(videoPlacement2).mergeFrom(videoPlacement).buildPartial();
                } else {
                    this.video_ = videoPlacement;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(videoPlacement);
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

        public VideoPlacement.Builder getVideoBuilder() {
            onChanged();
            return getVideoFieldBuilder().getBuilder();
        }

        public VideoPlacementOrBuilder getVideoOrBuilder() {
            SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> singleFieldBuilderV3 = this.videoBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            VideoPlacement videoPlacement = this.video_;
            return videoPlacement == null ? VideoPlacement.getDefaultInstance() : videoPlacement;
        }

        private SingleFieldBuilderV3<VideoPlacement, VideoPlacement.Builder, VideoPlacementOrBuilder> getVideoFieldBuilder() {
            if (this.videoBuilder_ == null) {
                this.videoBuilder_ = new SingleFieldBuilderV3<>(getVideo(), getParentForChildren(), isClean());
                this.video_ = null;
            }
            return this.videoBuilder_;
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
            if ((this.bitField0_ & 32) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 32;
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
                this.bitField0_ &= -33;
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
                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
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

    public static Placement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Placement> parser() {
        return PARSER;
    }

    public Parser<Placement> getParserForType() {
        return PARSER;
    }

    public Placement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
