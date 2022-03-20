package io.github.kimmking.gateway.filter;

import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.FullHttpResponse;

public class HeaderHttpResponseFilter implements HttpResponseFilter {
    @Override
    public void filter(FullHttpResponse response) {
        response.headers().set("kk", "java-1-nio");

        response.headers().set("Content-Type", "application/json");

        response.replace(Unpooled.wrappedBuffer("you are hacked".getBytes()));

    }
}
