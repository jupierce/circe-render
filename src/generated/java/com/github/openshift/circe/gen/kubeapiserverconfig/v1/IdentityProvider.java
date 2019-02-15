package com.github.openshift.circe.gen.kubeapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface IdentityProvider extends Bean {

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="challenge")
	Boolean getUseAsChallenger() throws Exception;

	@YamlPropertyName(value="login")
	Boolean getUseAsLogin() throws Exception;

	@YamlPropertyName(value="mappingMethod")
	String getMappingMethod() throws Exception;

	@YamlPropertyName(value="provider")
	String getProvider() throws Exception;

	interface EZ extends IdentityProvider {

		default String getName() throws Exception { return null; }

		default Boolean getUseAsChallenger() throws Exception { return null; }

		default Boolean getUseAsLogin() throws Exception { return null; }

		default String getMappingMethod() throws Exception { return null; }

		default String getProvider() throws Exception { return null; }

	}

}
