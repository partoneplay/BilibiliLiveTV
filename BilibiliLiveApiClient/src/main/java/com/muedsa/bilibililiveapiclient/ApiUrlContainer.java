package com.muedsa.bilibililiveapiclient;

public class ApiUrlContainer {
    public static String ROOM_PLAY_URL = "https://api.live.bilibili.com/room/v1/Room/playUrl?cid=%d&qn=%d&platform=android";

    public static String GET_ROOM_LIST = "https://api.live.bilibili.com/room/v3/area/getRoomList?page=%d&page_size=%d&parent_area_id=%d&sort_type=%s";

    public static String GET_ROOM_INFO = "https://api.live.bilibili.com/room/v1/Room/get_info";

    public static String GET_INFO = "https://api.live.bilibili.com/xlive/web-room/v1/index/getInfoByRoom?room_id=%d";

    public static String GET_DANMU_INFO = "https://api.live.bilibili.com/xlive/web-room/v1/index/getDanmuInfo?id=%d&type=0";

    public static String WS_CHAT = "wss://broadcastlv.chat.bilibili.com:443/sub";

    public static String SEARCH_LIVE = "https://api.bilibili.com/x/web-interface/search/type?page=%d&page_size=%d&order=online&platform=android&keyword=%s&search_type=live";

    public static String SEARCH_VIDEO = "https://api.bilibili.com/x/web-interface/search/type?page=%d&page_size=%d&order=online&platform=android&keyword=%s&search_type=video";

    public static String SEARCH_ALL = "https://api.bilibili.com/x/web-interface/search/all?page=%d&page_size=%d&order=online&platform=android&keyword=%s";

    public static String USER_NAV = "https://api.bilibili.com/x/web-interface/nav";

    public static String GET_LOGIN_URL = "https://passport.bilibili.com/qrcode/getLoginUrl";

    public static String GET_LOGIN_INFO = "https://passport.bilibili.com/qrcode/getLoginInfo";

    public static String VIDEO_URL = "https://www.bilibili.com/video/%s?p=%d";

    public static String HISTORY_LIST = "https://api.bilibili.com/x/web-interface/history/cursor?max=0&view_at=0&business=";

    public static String VIDEO_DANMAKU_VIEW = "https://api.bilibili.com/x/v2/dm/web/view?type=1&oid=%d";

    public static String VIDEO_DANMAKU_SEGMENT = "https://api.bilibili.com/x/v2/dm/web/seg.so?type=1&oid=%d&segment_index=%d";

    public static String POPULAR = "https://api.bilibili.com/x/web-interface/popular?pn=%d&ps=%d";

    public static String VIDEO_HEARTBEAT = "https://api.bilibili.com/x/click-interface/web/heartbeat";

    public static String LIVE_USER_WEB_LIST = "https://api.live.bilibili.com/xlive/web-ucenter/v1/xfetter/GetWebList?page=%d&page_size=%d&_=%d";

    public static String DYNAMIC_NEW = "https://api.vc.bilibili.com/dynamic_svr/v1/dynamic_svr/dynamic_new?uid=%d&type_list=%s";

    public static String DYNAMIC_FEED_ALL = "https://api.bilibili.com/x/polymer/web-dynamic/v1/feed/all?timezone_offset=-480&offset=%s&page=%d&type=%s&features=itemOpusStyle";

    public static String SPACE_SEARCH = "https://api.bilibili.com/x/space/wbi/arc/search";
}
