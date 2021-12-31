package com.zxh.www;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: 郑兴华
 * @CreateTime: 2021-12-31 15:41
 * @Description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "my")
public class Content {
    private  String url ;
    private  String data ;
}
