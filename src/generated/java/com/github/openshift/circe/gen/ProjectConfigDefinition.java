package com.github.openshift.circe.gen;

import java.util.*;
import com.github.openshift.circe.yaml.*;
import com.github.openshift.circe.gen.project.*;
import com.github.openshift.circe.gen.template.*;
import com.github.openshift.circe.beans.*;

public interface ProjectConfigDefinition extends ConfigUnit {

	@RenderOrder(value ="0001")
	Project getProject() throws Exception;

	@RenderOrder(value ="0002")
	Template getTemplate() throws Exception;


}
