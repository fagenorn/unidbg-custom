package com.github.unidbg.linux.struct;

import com.github.unidbg.file.linux.StatFsStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

public class StatFs32 extends StatFsStructure {

    public StatFs32(Pointer p) {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("f_type", "f_bsize", "f_blocks", "f_bfree", "f_bavail", "f_files", "f_ffree", "f_fsid",
                "f_namelen", "f_frsize", "f_flags", "f_spare");
    }

}
