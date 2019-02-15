package com.github.openshift.circe.gen.openshiftcontrollermanagerconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ResourceQuotaControllerConfig extends Bean {

	@YamlPropertyName(value="concurrentSyncs")
	Long getConcurrentSyncs() throws Exception;

	@YamlPropertyName(value="syncPeriod")
	Duration getSyncPeriod() throws Exception;

	@YamlPropertyName(value="minResyncPeriod")
	Duration getMinResyncPeriod() throws Exception;

	interface EZ extends ResourceQuotaControllerConfig {

		default Long getConcurrentSyncs() throws Exception { return null; }

		default Duration getSyncPeriod() throws Exception { return null; }

		default Duration getMinResyncPeriod() throws Exception { return null; }

	}

}
