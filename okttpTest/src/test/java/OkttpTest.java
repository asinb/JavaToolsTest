
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import okhttp3.*;
import org.junit.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 郑兴华
 * @CreateTime: 2022-01-14 14:12
 * @Description:
 */
public class OkttpTest {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");



    /**
     * 发送GET请求
     */
    @Test
    public void getRequest() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://httpbin.org/get")
                .build();

        Response response = client.newCall(request).execute();

        if (response.isSuccessful()) {
            System.out.println(response.body().string());
        }

    }

    /**
     * POST请求
     */
    @Test
    public void postRequest() throws IOException {
        OkHttpClient client = new OkHttpClient();

        // 提交FormData
        FormBody.Builder form = new FormBody.Builder();
        form.add("name", "Tom");
        form.add("age", "23");

        Request request = new Request.Builder()
                .url("http://httpbin.org/post")
                .post(form.build())
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());

    }



    /**
     * 提交Json
     */
    @Test
    public void postJsonRequest() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Tom");
        map.put("age", 23);

        Gson gson = new Gson();
        String data = gson.toJson(map);

//        System.out.println("数据："+data);
//
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","郑兴华");
//        System.out.println(jsonObject.toString());

        RequestBody requestBody = RequestBody.create(JSON,  jsonObject.toString());

        Request request = new Request.Builder()
                .url("http://httpbin.org/post")
                .post(requestBody)
                .build();

        Response response = client.newCall(request).execute();
        System.out.println( response.body().string());

    }



}
