package com.github.openshift.circe.gen.networkconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ClusterNetwork extends Bean {

	@YamlPropertyName(value="cidr")
	String getCIDR() throws Exception;

	@YamlPropertyName(value="hostSubnetLength")
	Long getHostSubnetLength() throws Exception;

	interface EZ extends ClusterNetwork {

		default String getCIDR() throws Exception { return null; }

		default Long getHostSubnetLength() throws Exception { return null; }

	}

}
