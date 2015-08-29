package app.coolweather.com.coolweather.util;

/**
 * Created by xiaocai on 15-8-29.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
