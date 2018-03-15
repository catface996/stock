package com.hanma56.cloud.route.config;

import java.util.Collection;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.feign.support.ResponseEntityDecoder;
import org.springframework.cloud.netflix.feign.support.SpringDecoder;
import org.springframework.cloud.netflix.feign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.util.StreamUtils;
import org.springframework.web.multipart.MultipartFile;

import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;

/**
 * @author 张钟
 * @date 2018/3/14
 */
@Configuration
public class MultipartSupportConfig {

    @Autowired
    ObjectFactory<HttpMessageConverters> messageConverters;

    @Bean
    @Primary
    @Scope("prototype")
    public Encoder multipartFormEncoder() {
        return new SpringFormEncoder(new SpringEncoder(messageConverters));
    }

    @Bean
    @Primary
    @Scope("prototype")
    public Decoder decoder() {
        Decoder decoder = (response, type) -> {
            if (type instanceof Class && MultipartFile.class.isAssignableFrom((Class) type)) {
                Collection<String> contentTypes = response.headers().get("content-type");
                String contentType = "application/octet-stream";
                if (contentTypes.size() > 0) {
                    String[] temp = new String[contentTypes.size()];
                    contentTypes.toArray(temp);
                    contentType = temp[0];
                }


                byte[] bytes = StreamUtils.copyToByteArray(response.body().asInputStream());
                InMemoryMultipartFile inMemoryMultipartFile = new InMemoryMultipartFile("file","", contentType,bytes);
                return inMemoryMultipartFile;
            }
            return new SpringDecoder(messageConverters).decode(response, type);
        };
        return new ResponseEntityDecoder(decoder);
    }
}

