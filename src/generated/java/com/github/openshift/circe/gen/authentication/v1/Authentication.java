// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.authentication.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Authentication extends Bean {

	default String getKind() { return "Authentication"; }
	default String getApiVersion() { return "config.openshift.io/v1"; }
	@YamlPropertyIgnore
	default String _getGeneratorNamespaceHint() { return ""; }
	@YamlPropertyIgnore
	default String _getGeneratorNameHint() { return "cluster"; }
	default ObjectMeta getMetadata() throws Exception { return new ObjectMeta(_getGeneratorNamespaceHint(), _getGeneratorNameHint()); }
	@YamlPropertyName(value="spec")
	AuthenticationSpec getSpec() throws Exception;

	interface EZ extends Authentication {

		@YamlPropertyName(value="spec")
		default AuthenticationSpec getSpec() throws Exception { return null; }

	}

}
