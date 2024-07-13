package com.appodeal.ads.unified.tasks;

public interface AdParamsResolver<InputType, OutputType> {
    void processResponse(InputType inputtype, AdParamsResolverCallback<OutputType> adParamsResolverCallback);
}
