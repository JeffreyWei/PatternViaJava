package com.jeffrey.pattern.decorate.fileimp;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wei on 15/5/2.
 */
public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream s) {
        super(s);
    }

    public int read() throws IOException {
        int c = this.in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }


    public int read(byte[] var1, int var2, int var3) throws IOException {
        int result = this.in.read(var1, var2, var3);
        for (int i = var2; i < var2 + var3; i++) {
            var1[i] = (byte) Character.toLowerCase((char) var1[i]);
        }
        return result;
    }
}
