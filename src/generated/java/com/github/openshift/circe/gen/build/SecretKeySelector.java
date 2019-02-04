package com.github.openshift.circe.gen.build;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface SecretKeySelector extends Bean {
	//json:localObjectReference
	LocalObjectReference getLocalObjectReference() throws Exception;
	//json:key
	String getKey() throws Exception;
	//json:optional
	Boolean getOptional() throws Exception;
}