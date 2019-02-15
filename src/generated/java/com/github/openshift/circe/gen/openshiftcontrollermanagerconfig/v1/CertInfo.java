package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface CertInfo extends Bean {

	@YamlPropertyName(value="certFile")
	String getCertFile() throws Exception;

	@YamlPropertyName(value="keyFile")
	String getKeyFile() throws Exception;

	interface EZ extends CertInfo {

		default String getCertFile() throws Exception { return null; }

		default String getKeyFile() throws Exception { return null; }

	}

}
