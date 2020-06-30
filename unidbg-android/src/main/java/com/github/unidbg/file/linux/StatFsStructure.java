package com.github.unidbg.file.linux;

import com.github.unidbg.pointer.UnicornStructure;
import com.sun.jna.Pointer;

public abstract class StatFsStructure extends UnicornStructure {

    public StatFsStructure(Pointer p) {
        super(p);
    }

    public int f_type;
    public int f_bsize;
    public long f_blocks;
    public long f_bfree;
    public long f_bavail;
    public long f_files;
    public long f_ffree;
    public int f_fsid;
    public int f_namelen;
    public int f_frsize;
    public int f_flags;
    public int[] f_spare = new int[4];
}
