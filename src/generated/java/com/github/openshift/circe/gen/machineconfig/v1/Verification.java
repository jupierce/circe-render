package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface Verification extends Bean {
	@YamlPropertyName(value="hash")
	String getHash() throws Exception;

}