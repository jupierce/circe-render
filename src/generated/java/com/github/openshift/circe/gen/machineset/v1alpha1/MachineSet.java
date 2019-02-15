package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface MachineSet extends Bean {

	default String getKind() { return "MachineSet"; }
	default String getApiVersion() { return "v1alpha1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return "openshift-cluster-api"; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "default"; }
	ObjectMeta getMetadata() throws Exception;
	@YamlPropertyName(value="spec")
	MachineSetSpec getSpec() throws Exception;

	interface EZ extends MachineSet {

		default MachineSetSpec getSpec() throws Exception { return null; }

	}

}
