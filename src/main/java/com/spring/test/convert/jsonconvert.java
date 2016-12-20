package com.spring.test.convert;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class JsonConvert extends GsonHttpMessageConverter{
    public MmoJsonConverter(){
        //更换Gson转换器
        super.setGson(new GsonBuilder()
                .serializeNulls()		//null值属性也需要序列化
                .setDateFormat("yyyy-MM-dd HH:mm:ss") //设置日期转换
                .create());
    }
}
