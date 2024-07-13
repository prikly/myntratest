package io.bidmachine.protobuf;

import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.SdkAnalyticConfig;
import java.util.List;

public interface SdkAnalyticConfigOrBuilder extends MessageOrBuilder {
    String getContext();

    ByteString getContextBytes();

    int getCount();

    int getInterval();

    SdkAnalyticConfig.MetricConfig getMetricConfigs(int i);

    int getMetricConfigsCount();

    List<SdkAnalyticConfig.MetricConfig> getMetricConfigsList();

    SdkAnalyticConfig.MetricConfigOrBuilder getMetricConfigsOrBuilder(int i);

    List<? extends SdkAnalyticConfig.MetricConfigOrBuilder> getMetricConfigsOrBuilderList();

    String getUrl();

    ByteString getUrlBytes();
}
