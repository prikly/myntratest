package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.StructProto;
import com.explorestack.protobuf.adcom.AdcomProto;

public final class InitProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001ebidmachine/protobuf/init.proto\u0012\u0013bidmachine.protobuf\u001a%bidmachine/protobuf/adcom/adcom.proto\u001a$bidmachine/protobuf/extensions.proto\u001a\u001cgoogle/protobuf/struct.proto\"§\u0003\n\u000bInitRequest\u0012\u0011\n\tseller_id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006bundle\u0018\u0002 \u0001(\t\u0012)\n\u0002os\u0018\u0003 \u0001(\u000e2\u001d.bidmachine.protobuf.adcom.OS\u0012\u000b\n\u0003osv\u0018\u0004 \u0001(\t\u00123\n\u0003geo\u0018\u0005 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u0012\u000b\n\u0003sdk\u0018\u0006 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0007 \u0001(\t\u0012\u000b\n\u0003ifa\u0018\b \u0001(\t\u0012\u000b\n\u0003ifv\u0018\u000b \u0001(\t\u0012\u000e\n\u0006bm_ifv\u0018\f \u0001(\t\u0012:\n\u000bdevice_type\u0018\t \u0001(\u000e2%.bidmachine.protobuf.adcom.DeviceType\u0012:\n\u0007contype\u0018\n \u0001(\u000e2).bidmachine.protobuf.adcom.ConnectionType\u0012\u000f\n\u0007app_ver\u0018\r \u0001(\t\u0012\u0012\n\nsession_id\u0018\u000e \u0001(\t\u0012$\n\u0003ext\u0018\u000f \u0001(\u000b2\u0017.google.protobuf.Struct\"\u0003\n\tAdNetwork\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\nclass_name\u0018\u0002 \u0001(\t\u0012G\n\rcustom_params\u0018\u0003 \u0003(\u000b20.bidmachine.protobuf.AdNetwork.CustomParamsEntry\u00127\n\bad_units\u0018\u0004 \u0003(\u000b2%.bidmachine.protobuf.AdNetwork.AdUnit\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a \u0001\n\u0006AdUnit\u0012\u0011\n\tad_format\u0018\u0001 \u0001(\t\u0012N\n\rcustom_params\u0018\u0002 \u0003(\u000b27.bidmachine.protobuf.AdNetwork.AdUnit.CustomParamsEntry\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"\\\n\u0017AdCachePlacementControl\u0012\u0016\n\u000emax_cache_size\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010max_retain_count\u0018\u0004 \u0001(\r\u0012\u000f\n\u0007max_age\u0018\u0003 \u0001(\r\"â\u0001\n\u0011SdkAnalyticConfig\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007context\u0018\u0002 \u0001(\t\u0012\u0010\n\binterval\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005count\u0018\u0004 \u0001(\u0005\u0012K\n\u000emetric_configs\u0018\u0005 \u0003(\u000b23.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig\u001aA\n\fMetricConfig\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\ndimensions\u0018\u0002 \u0003(\t\u0012\u000f\n\u0007metrics\u0018\u0003 \u0003(\t\"Ô\u0004\n\fInitResponse\u0012\u0010\n\bendpoint\u0018\u0001 \u0001(\t\u00122\n\u0005event\u0018\u0002 \u0003(\u000b2#.bidmachine.protobuf.adcom.Ad.Event\u0012\u001b\n\u0013session_reset_after\u0018\u0003 \u0001(\r\u00123\n\u000bad_networks\u0018\u0004 \u0003(\u000b2\u001e.bidmachine.protobuf.AdNetwork\u0012#\n\u001bad_networks_loading_timeout\u0018\t \u0001(\r\u0012=\n\u0010ad_cache_control\u0018\u0005 \u0001(\u000e2#.bidmachine.protobuf.AdCacheControl\u0012\u0018\n\u0010ad_cache_max_age\u0018\u0006 \u0001(\r\u0012b\n\u001aad_cache_placement_control\u0018\b \u0003(\u000b2>.bidmachine.protobuf.InitResponse.AdCachePlacementControlEntry\u0012\u0017\n\u000fad_request_tmax\u0018\u0007 \u0001(\r\u0012C\n\u0013sdk_analytic_config\u0018\n \u0001(\u000b2&.bidmachine.protobuf.SdkAnalyticConfig\u001al\n\u001cAdCachePlacementControlEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012;\n\u0005value\u0018\u0002 \u0001(\u000b2,.bidmachine.protobuf.AdCachePlacementControl:\u00028\u0001\"¼\u0003\n\u0012SdkAnalyticContext\u0012\u0011\n\tseller_id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006bundle\u0018\u0002 \u0001(\t\u0012)\n\u0002os\u0018\u0003 \u0001(\u000e2\u001d.bidmachine.protobuf.adcom.OS\u0012\u000b\n\u0003osv\u0018\u0004 \u0001(\t\u00123\n\u0003geo\u0018\u0005 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u0012\u000b\n\u0003sdk\u0018\u0006 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0007 \u0001(\t\u0012\u000b\n\u0003ifa\u0018\b \u0001(\t\u0012\u000b\n\u0003ifv\u0018\u000b \u0001(\t\u0012\u000e\n\u0006bm_ifv\u0018\f \u0001(\t\u0012:\n\u000bdevice_type\u0018\t \u0001(\u000e2%.bidmachine.protobuf.adcom.DeviceType\u0012:\n\u0007contype\u0018\n \u0001(\u000e2).bidmachine.protobuf.adcom.ConnectionType\u0012\u000f\n\u0007app_ver\u0018\r \u0001(\t\u0012\u0012\n\nsession_id\u0018\u000e \u0001(\t\u0012\f\n\u0004dcid\u0018\u000f \u0001(\t\u0012$\n\u0003ext\u0018\u0010 \u0001(\u000b2\u0017.google.protobuf.StructB+\n\u0016io.bidmachine.protobufB\tInitProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{AdcomProto.getDescriptor(), ExtensionsProto.getDescriptor(), StructProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitRequest_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitResponse_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable;

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private InitProto() {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_InitRequest_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SellerId", "Bundle", "Os", "Osv", "Geo", "Sdk", "Sdkver", "Ifa", "Ifv", "BmIfv", "DeviceType", "Contype", "AppVer", "SessionId", "Ext"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_AdNetwork_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Name", "ClassName", "CustomParams", "AdUnits"});
        Descriptors.Descriptor descriptor4 = internal_static_bidmachine_protobuf_AdNetwork_descriptor.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = internal_static_bidmachine_protobuf_AdNetwork_descriptor.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"AdFormat", "CustomParams"});
        Descriptors.Descriptor descriptor6 = internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"MaxCacheSize", "MaxRetainCount", "MaxAge"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Url", "Context", "Interval", "Count", "MetricConfigs"});
        Descriptors.Descriptor descriptor9 = internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Name", "Dimensions", "Metrics"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_InitResponse_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Endpoint", "Event", "SessionResetAfter", "AdNetworks", "AdNetworksLoadingTimeout", "AdCacheControl", "AdCacheMaxAge", "AdCachePlacementControl", "AdRequestTmax", "SdkAnalyticConfig"});
        Descriptors.Descriptor descriptor11 = internal_static_bidmachine_protobuf_InitResponse_descriptor.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(5);
        internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor = descriptor12;
        internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"SellerId", "Bundle", "Os", "Osv", "Geo", "Sdk", "Sdkver", "Ifa", "Ifv", "BmIfv", "DeviceType", "Contype", "AppVer", "SessionId", "Dcid", "Ext"});
        AdcomProto.getDescriptor();
        ExtensionsProto.getDescriptor();
        StructProto.getDescriptor();
    }
}
