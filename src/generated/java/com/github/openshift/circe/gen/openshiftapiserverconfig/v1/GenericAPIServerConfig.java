package com.github.openshift.circe.gen.openshiftapiserverconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface GenericAPIServerConfig extends Bean {

	@YamlPropertyName(value="servingInfo")
	HTTPServingInfo getServingInfo() throws Exception;

	@YamlPropertyName(value="corsAllowedOrigins")
	List<String> getCORSAllowedOrigins() throws Exception;

	@YamlPropertyName(value="auditConfig")
	AuditConfig getAuditConfig() throws Exception;

	@YamlPropertyName(value="storageConfig")
	EtcdStorageConfig getStorageConfig() throws Exception;

	@YamlPropertyName(value="admissionPluginConfig")
	Map<String,AdmissionPluginConfig> getAdmissionPluginConfig() throws Exception;

	@YamlPropertyName(value="kubeClientConfig")
	KubeClientConfig getKubeClientConfig() throws Exception;

	interface EZ extends GenericAPIServerConfig {

		default HTTPServingInfo getServingInfo() throws Exception { return null; }

		default List<String> getCORSAllowedOrigins() throws Exception { return null; }

		default AuditConfig getAuditConfig() throws Exception { return null; }

		default EtcdStorageConfig getStorageConfig() throws Exception { return null; }

		default Map<String,AdmissionPluginConfig> getAdmissionPluginConfig() throws Exception { return null; }

		default KubeClientConfig getKubeClientConfig() throws Exception { return null; }

	}

}
