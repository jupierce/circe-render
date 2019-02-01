package com.redhat.openshift.circe.gen.template;

import com.redhat.openshift.circe.gen.impl.*;
import com.redhat.openshift.circe.yaml.Bean;
import java.util.*;

public interface Parameter extends Bean {
	//json:name
	String getName() throws Exception;
	//json:displayName
	String getDisplayName() throws Exception;
	//json:description
	String getDescription() throws Exception;
	//json:value
	String getValue() throws Exception;
	//json:generate
	String getGenerate() throws Exception;
	//json:from
	String getFrom() throws Exception;
	//json:required
	Boolean getRequired() throws Exception;
}
