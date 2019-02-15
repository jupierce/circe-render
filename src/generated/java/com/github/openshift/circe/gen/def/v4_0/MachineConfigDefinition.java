package com.github.openshift.circe.gen.def.v4_0;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.machineconfigpool.v1.*;
import com.github.openshift.circe.gen.machineconfig.v1.*;
import com.github.openshift.circe.beans.*;

public interface MachineConfigDefinition extends Definition {

	@RenderOrder(value ="0001")
	KubeList<MachineConfigPool> getMachineConfigPoolList() throws Exception;

	@RenderOrder(value ="0002")
	KubeList<MachineConfig> getMachineConfigList() throws Exception;

	interface EZ extends MachineConfigDefinition {

		default KubeList<MachineConfigPool> getMachineConfigPoolList() throws Exception { return null; }

		default KubeList<MachineConfig> getMachineConfigList() throws Exception { return null; }

	}


}
