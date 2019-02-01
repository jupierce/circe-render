package com.redhat.openshift.circe.gen.oauth;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface OAuthRemoteConnectionInfo extends Bean {
	//json:url
	String getURL() throws Exception;
	//json:ca
	ConfigMapNameReference getCA() throws Exception;
	//json:tlsClientCert
	SecretNameReference getTLSClientCert() throws Exception;
	//json:tlsClientKey
	SecretNameReference getTLSClientKey() throws Exception;
}
