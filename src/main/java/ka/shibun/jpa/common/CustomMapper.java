package ka.shibun.jpa.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */
public class CustomMapper extends ObjectMapper {
    public CustomMapper() {
//属性为null的不序列化
        this.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        // 设置 SerializationFeature.FAIL_ON_EMPTY_BEANS 为 false
//告诉Jackson空对象不要抛异常
        this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}