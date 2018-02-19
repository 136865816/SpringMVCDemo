package com.gaussic.util;

import org.apache.commons.io.IOUtils;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;

public class HttpUtil {


    public static String readPostJsonData(HttpServletRequest request) throws IOException {
        if (request == null) {
            return null;
        }
        if (request instanceof ContentCachingRequestWrapper) {

            ContentCachingRequestWrapper requestWrapper = (ContentCachingRequestWrapper) request;
            int contentLenth = request.getContentLength();
            if (contentLenth <= 0) {
                return null;
            }
            byte[] bytes = new byte[contentLenth];
            InputStream is = requestWrapper.getInputStream();
            for (int index = 0; index < contentLenth; index++) {
                int value = is.read();
                if (value == -1) {
//                is.reset();
                    break;
                }
                bytes[index] = (byte) value;
            }
            requestWrapper.getContentAsByteArray();
            String data = new String(bytes);
            System.out.println("http util .........data:" + data);
            System.out.println("http util .........data:" + new String(requestWrapper.getContentAsByteArray()));
            return data;
        }
        System.out.println("http util no data in request body");
        return "";
    }
}
