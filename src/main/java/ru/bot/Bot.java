package ru.bot;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;

public class Bot {

    public static void main(String[] arg) {
        TransportClient tranClien = new HttpTransportClient();
        VkApiClient vk = new VkApiClient(tranClien);
        System.out.println("Uspeshna");
    }

}
