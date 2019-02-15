package com.github.openshift.circe.gen.oauth.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GitLabIdentityProvider extends Bean {

	@YamlPropertyName(value="clientID")
	String getClientID() throws Exception;

	@YamlPropertyName(value="clientSecret")
	SecretNameReference getClientSecret() throws Exception;

	@YamlPropertyName(value="url")
	String getURL() throws Exception;

	@YamlPropertyName(value="ca")
	ConfigMapNameReference getCA() throws Exception;

	interface EZ extends GitLabIdentityProvider {

		default String getClientID() throws Exception { return null; }

		default SecretNameReference getClientSecret() throws Exception { return null; }

		default String getURL() throws Exception { return null; }

		default ConfigMapNameReference getCA() throws Exception { return null; }

	}

}
