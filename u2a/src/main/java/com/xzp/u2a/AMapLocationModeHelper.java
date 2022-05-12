package com.xzp.u2a;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationClientOption.AMapLocationMode;
import com.amap.api.location.AMapLocationClient;
public class AMapLocationModeHelper {
    public void hightAccuracy(AMapLocationClientOption mLocationOption)
    {
        //初始化定位
       
        mLocationOption.setLocationMode(AMapLocationMode.Hight_Accuracy);
    }
    public void batterySaving(AMapLocationClientOption mLocationOption)
    {
        mLocationOption.setLocationMode(AMapLocationMode.Battery_Saving);
    }
    public void deviceSensors(AMapLocationClientOption mLocationOption)
    {
        mLocationOption.setLocationMode(AMapLocationMode.Device_Sensors);
    }
    public void onceLocation(AMapLocationClientOption mLocationOption)
    {
        mLocationOption.setOnceLocation(true);
    }
    public void onceLocationLatest(AMapLocationClientOption mLocationOption)
    {
        mLocationOption.setOnceLocationLatest(true);
    }
    public void interval(AMapLocationClientOption mLocationOption,int time)
    {
        mLocationOption.setInterval(time);
    }
    public void wifiActiveScan(AMapLocationClientOption mLocationOption)
    {
        mLocationOption.setWifiScan(false);
    }
    public void mockEnable(AMapLocationClientOption mLocationOption)
    {
        mLocationOption.setMockEnable(false);
    }
    public void needAddress(AMapLocationClientOption mLocationOption){
        mLocationOption.setNeedAddress(false);
    }
}
