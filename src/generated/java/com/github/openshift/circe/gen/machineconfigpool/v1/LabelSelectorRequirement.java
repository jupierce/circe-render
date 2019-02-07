package com.github.openshift.circe.gen.machineconfigpool.v1;
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

}