/*
   Copyright 2008-2013 ITACA-TSB, http://www.tsb.upv.es/
   Instituto Tecnologico de Aplicaciones de Comunicacion 
   Avanzadas - Grupo Tecnologias para la Salud y el 
   Bienestar (TSB)


   See the NOTICE file distributed with this work for additional 
   information regarding copyright ownership

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.zsmartsystems.zigbee.dongle.cc2531.network.packet.simple;

import com.zsmartsystems.zigbee.dongle.cc2531.network.packet.ResponseStatus;
import com.zsmartsystems.zigbee.dongle.cc2531.network.packet.ZToolCMD;
import com.zsmartsystems.zigbee.dongle.cc2531.network.packet.ZToolPacket;
import com.zsmartsystems.zigbee.dongle.cc2531.zigbee.util.DoubleByte;

/**
 * @author <a href="mailto:alfiva@aaa.upv.es">Alvaro Fides Valero</a>
 * @version $LastChangedRevision: 799 $ ($LastChangedDate: 2013-08-06 19:00:05 +0300 (Tue, 06 Aug 2013) $)
 */
public class ZB_START_CONFIRM extends ZToolPacket /*implements IRESPONSE_CALLBACK,ISIMPLEAPI*/ {
    /// <name>TI.ZPI2.ZB_START_CONFIRM.Status</name>
    /// <summary>The immediate return value from executing the RPC.</summary>
    public int Status;

    /// <name>TI.ZPI2.ZB_START_CONFIRM</name>
    /// <summary>Constructor</summary>
    public ZB_START_CONFIRM() {
    }

    /// <name>TI.ZPI2.ZB_START_CONFIRM</name>
    /// <summary>Constructor</summary>
    public ZB_START_CONFIRM(int[] framedata) {
        this.Status = framedata[0];
        super.buildPacket(new DoubleByte(ZToolCMD.ZB_START_CONFIRM), framedata);
    }

    @Override
    public String toString() {
        return "ZB_START_CONFIRM{" +
                "Status=" + ResponseStatus.getStatus(Status) +
                '}';
    }
}
