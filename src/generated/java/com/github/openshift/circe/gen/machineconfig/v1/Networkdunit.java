package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Networkdunit extends Bean {
	@YamlPropertyName(value="contents")
	String getContents() throws Exception;

	@YamlPropertyName(value="dropins")
	List<NetworkdDropin> getDropins() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

}
