package com.github.unidbg.linux.file;

import com.github.unidbg.Emulator;

public class StatusFileIO extends ByteArrayFileIO {
    public StatusFileIO(int oflags, String path, Emulator emulator) {
        super(oflags, path, getStatusData(emulator));
    }

    private static byte[] getStatusData(Emulator emulator) {
        StringBuilder builder = new StringBuilder();
        String name = emulator.getProcessName();
        if (name.length() > 15) {
            name = emulator.getProcessName().substring(name.length() - 15, name.length());
        }

        builder.append("Name:	");
        builder.append(name);
        builder.append("\n");

        builder.append("State:	");
        builder.append("R (running)");
        builder.append("\n");

        builder.append("Tgid:	");
        builder.append(emulator.getPid());
        builder.append("\n");

        builder.append("Pid:	");
        builder.append(emulator.getPid());
        builder.append("\n");

        builder.append("PPid:	");
        builder.append("28866");
        builder.append("\n");

        builder.append("TracerPid:	");
        builder.append("0");
        builder.append("\n");

        builder.append("Uid:	");
        builder.append("10118	10118	10118	10118");
        builder.append("\n");

        builder.append("Gid:	");
        builder.append("10118	10118	10118	10118");
        builder.append("\n");

        builder.append("FDSize:	");
        builder.append("256");
        builder.append("\n");

        builder.append("Groups:	");
        builder.append("3003 9997 50118 ");
        builder.append("\n");

        builder.append("VmPeak:	 ");
        builder.append("2125288 kB");
        builder.append("\n");

        builder.append("VmSize:	 ");
        builder.append("2055352 kB");
        builder.append("\n");

        builder.append("VmLck:	       ");
        builder.append("0 kB");
        builder.append("\n");

        builder.append("VmPin:	       ");
        builder.append("0 kB");
        builder.append("\n");

        builder.append("VmHWM:	  ");
        builder.append("221800 kB");
        builder.append("\n");

        builder.append("VmRSS:	  ");
        builder.append("221764 kB");
        builder.append("\n");

        builder.append("VmData:	  ");
        builder.append("283156 kB");
        builder.append("\n");

        builder.append("VmRSS:	  ");
        builder.append("283156 kB");
        builder.append("\n");

        builder.append("VmStk:	    ");
        builder.append("8196 kB");
        builder.append("\n");

        builder.append("VmExe:	      ");
        builder.append("20 kB");
        builder.append("\n");

        builder.append("VmLib:	  ");
        builder.append("234804 kB");
        builder.append("\n");

        builder.append("VmPTE:	     ");
        builder.append("812 kB");
        builder.append("\n");

        builder.append("VmSwap:	       ");
        builder.append("0 kB");
        builder.append("\n");

        builder.append("Threads:	");
        builder.append("161");
        builder.append("\n");

        builder.append("SigQ:	");
        builder.append("0/19948");
        builder.append("\n");

        builder.append("SigPnd:	");
        builder.append("0000000000000000");
        builder.append("\n");

        builder.append("ShdPnd:	");
        builder.append("0000000000000000");
        builder.append("\n");

        builder.append("SigBlk:	");
        builder.append("0000000000001204");
        builder.append("\n");

        builder.append("SigIgn:	");
        builder.append("0000000000000000");
        builder.append("\n");

        builder.append("SigCgt:	");
        builder.append("00000002400094f8");
        builder.append("\n");

        builder.append("CapInh:	");
        builder.append("0000000000000000");
        builder.append("\n");

        builder.append("CapPrm:	");
        builder.append("0000000000000000");
        builder.append("\n");

        builder.append("CapEff:	");
        builder.append("0000000000000000");
        builder.append("\n");

        builder.append("CapBnd:	");
        builder.append("ffffffe000000000");
        builder.append("\n");

        builder.append("Cpus_allowed:	");
        builder.append("f");
        builder.append("\n");

        builder.append("Cpus_allowed_list:	");
        builder.append("0-3");
        builder.append("\n");

        builder.append("voluntary_ctxt_switches:	");
        builder.append("4112");
        builder.append("\n");

        builder.append("nonvoluntary_ctxt_switches:	");
        builder.append("2437");
        builder.append("\n");

        return builder.toString().getBytes();
    }
}