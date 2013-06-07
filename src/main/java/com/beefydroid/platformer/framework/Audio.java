package com.beefydroid.platformer.framework;

/**
 * Created by Leo on 7/06/13.
 *
 * Interface for types of Audio
 * Music: Constant streaming from disk
 * Sound: Loaded into RAM and played from RAM
 */
public interface Audio {
    public Music newMusic(String filename);

    public Sound newSound(String filename);
}
