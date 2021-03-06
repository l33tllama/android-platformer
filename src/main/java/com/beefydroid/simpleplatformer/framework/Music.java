/**
 * Created by Leo on 7/06/13.
 *
 * Streaming music from "disk" interface
 *
 */

package com.beefydroid.simpleplatformer.framework;

public interface Music {
    public void play();

    public void stop();

    public void pause();

    public void setLooping(boolean looping);

    public void setVolume(float volume);

    public boolean isPlaying();

    public boolean isStopped();

    public boolean isLooping();

    public void dispose();
}
