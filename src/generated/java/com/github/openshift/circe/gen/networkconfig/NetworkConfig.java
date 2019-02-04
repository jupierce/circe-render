package com.github.openshift.circe.gen.networkconfig;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface NetworkConfig extends Bean {
	default String getKind() { return "NetworkConfig"; }
	default String getApiVersion() { return "v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHit() { return "default"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHit()); }
	//json:spec
	NetworkConfigSpec getSpec() throws Exception;
}
