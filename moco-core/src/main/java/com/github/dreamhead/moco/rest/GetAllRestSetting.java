package com.github.dreamhead.moco.rest;

import com.github.dreamhead.moco.RequestMatcher;
import com.github.dreamhead.moco.ResponseHandler;
import com.github.dreamhead.moco.RestSetting;
import com.google.common.base.Optional;

import static com.github.dreamhead.moco.Moco.and;
import static com.github.dreamhead.moco.Moco.by;
import static com.github.dreamhead.moco.Moco.uri;
import static com.github.dreamhead.moco.util.URLs.resourceRoot;

public class GetAllRestSetting extends RestAllSetting {
    public GetAllRestSetting(final Optional<RequestMatcher> matcher,
                             final ResponseHandler responseHandler) {
        super(matcher, responseHandler);
    }
}
