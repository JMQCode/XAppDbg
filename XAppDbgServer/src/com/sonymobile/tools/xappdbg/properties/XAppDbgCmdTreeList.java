/*
 * Copyright (C) 2012 Sony Mobile Communications AB
 *
 * This file is part of XAppDbg.
 *
 * XAppDbg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * XAppDbg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with XAppDbg.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.sonymobile.tools.xappdbg.properties;

import com.sonymobile.tools.xappdbg.XAppDbgCmdIDs;
import com.sonymobile.tools.xappdbg.XAppDbgCommand;
import com.sonymobile.tools.xappdbg.Packet;

import java.io.IOException;

public class XAppDbgCmdTreeList extends XAppDbgCommand {

    private XAppDbgTreeModule mMod;

    public XAppDbgCmdTreeList(XAppDbgTreeModule mod) {
        super(XAppDbgCmdIDs.CMD_LIST_PROP);
        mMod = mod;
    }

    @Override
    public boolean exec(Packet in, Packet out) throws IOException {
        return mMod.cmdTreeList(in, out);
    }

}
