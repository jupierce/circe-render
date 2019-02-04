package com.github.openshift.circe.gen.project;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Project extends Bean {
	default String getKind() { return "Project"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHit() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHit()); }
	//json:spec
	ProjectSpec getSpec() throws Exception;
}
