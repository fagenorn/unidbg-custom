package com.github.unidbg.file.linux;

import com.github.unidbg.Emulator;
import com.github.unidbg.file.BaseFileIO;
import com.sun.jna.Pointer;

public abstract class BaseAndroidFileIO extends BaseFileIO implements AndroidFileIO {

    public BaseAndroidFileIO(int oflags) {
        super(oflags);
    }

    @Override
    public int fstat(Emulator<?> emulator, StatStructure stat) {
        throw new AbstractMethodError(getClass().getName());
    }

    @Override
    public int statfs(Emulator<?> emulator, StatFsStructure stat) {
        stat.f_type = 0xef53; // EXT4
        stat.f_bsize = 512;
        stat.f_blocks = 15966247;
        stat.f_bfree = 7538724;
        stat.f_bavail = 799625;
        stat.f_files = 2580480;
        stat.f_ffree = 2237787;
        stat.f_fsid = 1946252203;
        stat.f_namelen = 255;
        stat.f_frsize = 512;
        stat.f_flags = 4129;
        stat.pack();
        return 0;
    }

    @Override
    public int getdents64(Pointer dirp, int size) {
        throw new UnsupportedOperationException(getClass().getName());
    }

    @Override
    public AndroidFileIO accept(Pointer addr, Pointer addrlen) {
        throw new AbstractMethodError(getClass().getName());
    }

    @Override
    protected void setFlags(long arg) {
        if ((IOConstants.O_APPEND & arg) != 0) {
            oflags |= IOConstants.O_APPEND;
        }
        if ((IOConstants.O_RDWR & arg) != 0) {
            oflags |= IOConstants.O_RDWR;
        }
        if ((IOConstants.O_NONBLOCK & arg) != 0) {
            oflags |= IOConstants.O_NONBLOCK;
        }
    }
}
