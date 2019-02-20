package com.github.openshift.circe.gen.validatingwebhookconfiguration.v1beta1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface LabelSelectorRequirement extends Bean {

	@YamlPropertyName(value="key")
	String getKey() throws Exception;

	@YamlPropertyName(value="operator")
	String getOperator() throws Exception;

	@YamlPropertyName(value="values")
	List<String> getValues() throws Exception;

	interface EZ extends LabelSelectorRequirement {

		default String getKey() throws Exception { return null; }

		default String getOperator() throws Exception { return null; }

		default List<String> getValues() throws Exception { return null; }

	}

}