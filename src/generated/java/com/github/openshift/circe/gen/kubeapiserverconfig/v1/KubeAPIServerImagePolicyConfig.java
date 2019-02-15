package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface KubeAPIServerImagePolicyConfig extends Bean {

	@YamlPropertyName(value="internalRegistryHostname")
	String getInternalRegistryHostname() throws Exception;

	@YamlPropertyName(value="externalRegistryHostnames")
	List<String> getExternalRegistryHostnames() throws Exception;

	interface EZ extends KubeAPIServerImagePolicyConfig {

		default String getInternalRegistryHostname() throws Exception { return null; }

		default List<String> getExternalRegistryHostnames() throws Exception { return null; }

	}

}
