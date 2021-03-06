/**
 * Created by Leo on 7/06/13.
 *
 * File management interface class.
 *
 */
package com.beefydroid.simpleplatformer.framework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface FileIO {
    public InputStream readAsset(String fileName) throws IOException;

    public InputStream readFile(String fileName) throws IOException;

    public OutputStream writeFile(String fileName) throws IOException;
}
