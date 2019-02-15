package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LinkEmbedded1 extends Bean {

	@YamlPropertyName(value="hard")
	Boolean getHard() throws Exception;

	@YamlPropertyName(value="target")
	String getTarget() throws Exception;

	interface EZ extends LinkEmbedded1 {

		default Boolean getHard() throws Exception { return null; }

		default String getTarget() throws Exception { return null; }

	}

}
