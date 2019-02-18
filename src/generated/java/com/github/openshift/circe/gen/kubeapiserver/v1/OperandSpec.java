package com.github.openshift.circe.gen.kubeapiserver.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface OperandSpec extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="operandContainerSpecs")
	List<OperandContainerSpec> getOperandContainerSpecs() throws Exception;

	@YamlPropertyName(value="unsupportedResourcePatches")
	List<ResourcePatch> getUnsupportedResourcePatches() throws Exception;

	interface EZ extends OperandSpec {

		default String getName() throws Exception { return null; }

		default List<OperandContainerSpec> getOperandContainerSpecs() throws Exception { return null; }

		default List<ResourcePatch> getUnsupportedResourcePatches() throws Exception { return null; }

	}

}