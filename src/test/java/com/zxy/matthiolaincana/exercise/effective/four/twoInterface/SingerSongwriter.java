package com.zxy.matthiolaincana.exercise.effective.four.twoInterface;

import java.applet.AudioClip;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2020/5/22 13:55
 * @Description:
 */
public interface SingerSongwriter extends Singer, Songwriter {
    AudioClip strum();

    void actSensitive();
}
