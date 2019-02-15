package com.github.openshift.circe.gen.machineset.v1alpha1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface ProviderSpec extends Bean {

	@YamlPropertyName(value="value")
	String getValue() throws Exception;

	@YamlPropertyName(value="valueFrom")
	ProviderSpecSource getValueFrom() throws Exception;

	interface EZ extends ProviderSpec {

		default String getValue() throws Exception { return null; }

		default ProviderSpecSource getValueFrom() throws Exception { return null; }

	}

}
