package com.github.openshift.circe.gen.authentication;

import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface SecretNameReference extends Bean {
	//json:name
	String getName() throws Exception;
}
