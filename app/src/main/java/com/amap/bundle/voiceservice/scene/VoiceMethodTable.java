package com.amap.bundle.voiceservice.scene;

import android.util.Pair;
import com.amap.bundle.voiceservice.dispatch.IVoiceDriveDispatcher;
import com.amap.bundle.voiceservice.dispatch.IVoiceFootDispatcher;
import com.amap.bundle.voiceservice.dispatch.IVoiceOperationDispatcher;
import com.amap.bundle.voiceservice.dispatch.IVoicePoiSelectorDispatcher;
import com.amap.bundle.voiceservice.dispatch.IVoiceRideDispatcher;
import com.amap.bundle.voiceservice.dispatch.IVoiceRouteDispatcher;
import com.amap.bundle.voiceservice.dispatch.IVoiceSearchDispatcher;
import java.util.HashMap;
import java.util.Map;
import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

@Keep
@KeepClassMembers
public class VoiceMethodTable {
    private static Map<String, Map<Long, SceneBean>> mMap = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceDriveDispatcher.class, "requestRoute", false, 2));
        mMap.put("requestRoute", hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceDriveDispatcher.class, "requestTruckRoute", false, 2));
        mMap.put("requestTruckRoute", hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(Long.valueOf(4096), generateSceneBean(IVoiceDriveDispatcher.class, "startNavi", false, 2));
        hashMap3.put(Long.valueOf(IjkMediaMeta.AV_CH_TOP_BACK_CENTER), generateSceneBean(IVoiceRideDispatcher.class, "startNavi", false, 2));
        hashMap3.put(Long.valueOf(IjkMediaMeta.AV_CH_TOP_BACK_RIGHT), generateSceneBean(IVoiceFootDispatcher.class, "startNavi", false, 2));
        mMap.put("startNavi", hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(Long.valueOf(4096), generateSceneBean(IVoiceDriveDispatcher.class, "enterRadarMode", false, 2));
        mMap.put("enterRadarMode", hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(Long.valueOf(Long.MIN_VALUE), generateSceneBean(IVoiceDriveDispatcher.class, "hasTruckInfo", false, 1));
        mMap.put("hasTruckInfo", hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "searchAlongInNavi", false, 0));
        hashMap6.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "searchAlongInNavi", false, 0));
        mMap.put("searchAlong", hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceOperationDispatcher.class, "setFavoritePoi", false, 1));
        mMap.put("setFavoritePoi", hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(Long.valueOf(4096), generateSceneBean(IVoiceDriveDispatcher.class, "switchRoute", false, 0));
        hashMap8.put(Long.valueOf(8192), generateSceneBean(IVoiceDriveDispatcher.class, "switchRoute", false, 0));
        hashMap8.put(Long.valueOf(IjkMediaMeta.AV_CH_TOP_BACK_CENTER), generateSceneBean(IVoiceRouteDispatcher.class, "switchRouteInBike", false, 0));
        hashMap8.put(Long.valueOf(IjkMediaMeta.AV_CH_TOP_BACK_RIGHT), generateSceneBean(IVoiceRouteDispatcher.class, "switchRouteInWalk", false, 0));
        mMap.put("switchRoute", hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(Long.valueOf(1024), generateSceneBean(IVoiceRouteDispatcher.class, "switchRouteWay", false, 0));
        hashMap9.put(Long.valueOf(2), generateSceneBean(IVoiceRouteDispatcher.class, "switchRouteWay", false, 0));
        mMap.put("switchRouteWay", hashMap9);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(Long.valueOf(1024), generateSceneBean(IVoiceRouteDispatcher.class, "swapStartEndPoi", false, 0));
        hashMap10.put(Long.valueOf(2), generateSceneBean(IVoiceRouteDispatcher.class, "swapStartEndPoi", false, 0));
        hashMap10.put(Long.valueOf(549755813888L), generateSceneBean(IVoiceDriveDispatcher.class, "swapStartEndPoi", false, 0));
        mMap.put("swapStartEndPoi", hashMap10);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(Long.valueOf(1024), generateSceneBean(IVoiceRouteDispatcher.class, "addMidPois", false, 0));
        hashMap11.put(Long.valueOf(2), generateSceneBean(IVoiceRouteDispatcher.class, "addMidPois", false, 0));
        hashMap11.put(Long.valueOf(549755813888L), generateSceneBean(IVoiceDriveDispatcher.class, "addMidPois", false, 0));
        mMap.put("addMidPois", hashMap11);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceDriveDispatcher.class, "getHistoryRoutes", false, 1));
        mMap.put("getHistoryRoutes", hashMap12);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(Long.valueOf(1), generateSceneBean(IVoiceOperationDispatcher.class, "setTraffic", false, 0));
        hashMap13.put(Long.valueOf(4096), generateSceneBean(IVoiceDriveDispatcher.class, "setTrafficRoutePage", false, 0));
        hashMap13.put(Long.valueOf(8192), generateSceneBean(IVoiceDriveDispatcher.class, "setTrafficRoutePage", false, 0));
        hashMap13.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "setTraffic", false, 0));
        hashMap13.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "setTraffic", false, 0));
        mMap.put("setTraffic", hashMap13);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(Long.valueOf(1), generateSceneBean(IVoiceSearchDispatcher.class, "requestTrafficMessage", false, 2));
        hashMap14.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "requestTrafficMessage", false, 0));
        hashMap14.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "requestTrafficMessage", false, 0));
        mMap.put("requestTrafficMessage", hashMap14);
        HashMap hashMap15 = new HashMap();
        hashMap15.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "setRouteParamsInNavi", true, 0));
        hashMap15.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "setRouteParamsInNavi", true, 0));
        hashMap15.put(Long.valueOf(4096), generateSceneBean(IVoiceDriveDispatcher.class, "setRouteParamsInCarRoutePage", true, 0));
        mMap.put("setRouteParams", hashMap15);
        HashMap hashMap16 = new HashMap();
        hashMap16.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "refreshRouteInNavi", true, 0));
        hashMap16.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "refreshRouteInNavi", true, 0));
        hashMap16.put(Long.valueOf(4096), generateSceneBean(IVoiceDriveDispatcher.class, "refreshRouteInCarRoutePage", false, 0));
        hashMap16.put(Long.valueOf(8192), generateSceneBean(IVoiceDriveDispatcher.class, "refreshRouteInTruckRoutePage", false, 0));
        mMap.put("refreshRoute", hashMap16);
        HashMap hashMap17 = new HashMap();
        hashMap17.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "exitNavi", true, 0));
        hashMap17.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "exitNavi", true, 0));
        hashMap17.put(Long.valueOf(IjkMediaMeta.AV_CH_WIDE_LEFT), generateSceneBean(IVoiceRouteDispatcher.class, "exitNavi", true, 0));
        hashMap17.put(Long.valueOf(IjkMediaMeta.AV_CH_WIDE_RIGHT), generateSceneBean(IVoiceRouteDispatcher.class, "exitNavi", true, 0));
        mMap.put("exitNavi", hashMap17);
        HashMap hashMap18 = new HashMap();
        hashMap18.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "previewMap", false, 0));
        hashMap18.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "previewMap", false, 0));
        mMap.put("previewMap", hashMap18);
        HashMap hashMap19 = new HashMap();
        hashMap19.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "requestGuideInfo", false, 0));
        hashMap19.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "requestGuideInfo", false, 0));
        mMap.put("requestGuideInfo", hashMap19);
        HashMap hashMap20 = new HashMap();
        hashMap20.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "requestNaviInfo", false, 0));
        mMap.put("requestNaviInfo", hashMap20);
        HashMap hashMap21 = new HashMap();
        hashMap21.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "adjustVolume", false, 0));
        hashMap21.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "adjustVolume", false, 0));
        mMap.put("adjustVolume", hashMap21);
        HashMap hashMap22 = new HashMap();
        hashMap22.put(Long.valueOf(1), generateSceneBean(IVoiceOperationDispatcher.class, "operateMap", false, 0));
        hashMap22.put(Long.valueOf(4096), generateSceneBean(IVoiceOperationDispatcher.class, "operateMap", false, 0));
        hashMap22.put(Long.valueOf(8192), generateSceneBean(IVoiceOperationDispatcher.class, "operateMap", false, 0));
        hashMap22.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "operateMap", false, 0));
        hashMap22.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "operateMap", false, 0));
        mMap.put("operateMap", hashMap22);
        HashMap hashMap23 = new HashMap();
        hashMap23.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceOperationDispatcher.class, "getCurrentLocationInfo", false, 2));
        hashMap23.put(Long.valueOf(IjkMediaMeta.AV_CH_STEREO_LEFT), generateSceneBean(IVoiceDriveDispatcher.class, "getCurrentLocationInfo", false, 0));
        hashMap23.put(Long.valueOf(1073741824), generateSceneBean(IVoiceDriveDispatcher.class, "getCurrentLocationInfo", false, 0));
        mMap.put("getCurrentLocationInfo", hashMap23);
        HashMap hashMap24 = new HashMap();
        hashMap24.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceOperationDispatcher.class, "openFavoritePage", true, 2));
        mMap.put("openFavoritePage", hashMap24);
        HashMap hashMap25 = new HashMap();
        hashMap25.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceRouteDispatcher.class, "requestRoutePlan", true, 2));
        mMap.put("requestRoutePlan", hashMap25);
        HashMap hashMap26 = new HashMap();
        hashMap26.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceRouteDispatcher.class, "requestRouteRideNavi", true, 2));
        mMap.put("requestRouteRideNavi", hashMap26);
        HashMap hashMap27 = new HashMap();
        hashMap27.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceRouteDispatcher.class, "requestRouteFootNavi", true, 2));
        mMap.put("requestRouteFootNavi", hashMap27);
        HashMap hashMap28 = new HashMap();
        hashMap28.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceRouteDispatcher.class, "searchSubwayLine", true, 2));
        mMap.put("searchSubwayLine", hashMap28);
        HashMap hashMap29 = new HashMap();
        hashMap29.put(Long.valueOf(4611686018427387904L), generateSceneBean(IVoiceRouteDispatcher.class, "searchBusLine", true, 2));
        mMap.put("searchBusLine", hashMap29);
        HashMap hashMap30 = new HashMap();
        hashMap30.put(Long.valueOf(1), generateSceneBean(IVoiceOperationDispatcher.class, "moveMapView", false, 0));
        mMap.put("moveMapView", hashMap30);
        HashMap hashMap31 = new HashMap();
        hashMap31.put(Long.valueOf(1), generateSceneBean(IVoiceOperationDispatcher.class, "setZoomDiff", false, 0));
        mMap.put("setZoomDiff", hashMap31);
        HashMap hashMap32 = new HashMap();
        hashMap32.put(Long.valueOf(2199023255552L), generateSceneBean(IVoicePoiSelectorDispatcher.class, "cancel", false, 0));
        mMap.put("cancel", hashMap32);
        HashMap hashMap33 = new HashMap();
        hashMap33.put(Long.valueOf(2199023255552L), generateSceneBean(IVoicePoiSelectorDispatcher.class, "selectPoi", false, 0));
        mMap.put("selectPoi", hashMap33);
    }

    public static SceneBean generateSceneBean(Class cls, String str, boolean z, int i) {
        Pair<Class, String> pair = new Pair<>(cls, str);
        SceneBean sceneBean = new SceneBean();
        sceneBean.mBlockBool = z;
        sceneBean.mPair = pair;
        sceneBean.mMethodType = i;
        return sceneBean;
    }

    public static Map<Long, SceneBean> get(String str) {
        return mMap.get(str);
    }
}