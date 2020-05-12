package com.jakehan.jakecustomgesture.util;

import android.content.Context;

/**
 * Created by Jake Han on 2020/05/11 15:50
 */
public class DimensionUtil {
    /**
     * 工具类说明(修改工具类时请完善文档注释)：
     *
     * 1.类属性/常量：(暂无)
     *
     * 2.工具方法:
     * {@link DimensionUtil#dp2px(Context, float)} dp转px
     * {@link DimensionUtil#px2dp(Context, float)} px转dp
     */


    /**
     * dp转px
     *
     * @param context 上下文环境
     * @param dp      独立像素密度（像素无关）
     */
    public static int dp2px(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5F);
    }

    /**
     * px转dp
     *
     * @param context 上下文环境
     * @param px      像素
     */
    public static int px2dp(Context context, float px) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5F);
    }
}
