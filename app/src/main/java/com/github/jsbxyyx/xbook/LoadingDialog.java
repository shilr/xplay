package com.github.jsbxyyx.xbook;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author jsbxyyx
 */
public class LoadingDialog extends Dialog {

    private TextView tvLoading;
    private ImageView ivLoading;

    public LoadingDialog(Context context) {
        this(context, R.style.loading_dialog, "玩命加载中...");

    }

    public LoadingDialog(Context context, String string) {
        this(context, R.style.loading_dialog, string);
    }

    protected LoadingDialog(Context context, int theme, String string) {
        super(context, theme);
        setCanceledOnTouchOutside(true);//点击其他区域时   true  关闭弹窗  false  不关闭弹窗
        setContentView(R.layout.loading_dialog);//加载布局
        tvLoading = findViewById(R.id.tv_loading_tx);
        tvLoading.setText(string);
        ivLoading = findViewById(R.id.iv_loading);
        // 加载动画
        Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(context, R.anim.loading_animation);
        // 使用ImageView显示动画
        ivLoading.startAnimation(hyperspaceJumpAnimation);

        getWindow().getAttributes().gravity = Gravity.CENTER;//居中显示
        getWindow().getAttributes().dimAmount = 0.5f;//背景透明度  取值范围 0 ~ 1
    }

    //关闭弹窗
    @Override
    public void dismiss() {
        super.dismiss();
    }
}