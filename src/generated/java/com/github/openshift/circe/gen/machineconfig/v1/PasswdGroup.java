package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface PasswdGroup extends Bean {

	@YamlPropertyName(value="gid")
	Long getGid() throws Exception;

	@YamlPropertyName(value="name")
	String getName() throws Exception;

	@YamlPropertyName(value="passwordHash")
	String getPasswordHash() throws Exception;

	@YamlPropertyName(value="system")
	Boolean getSystem() throws Exception;

	interface EZ extends PasswdGroup {

		default Long getGid() throws Exception { return null; }

		default String getName() throws Exception { return null; }

		default String getPasswordHash() throws Exception { return null; }

		default Boolean getSystem() throws Exception { return null; }

	}

}
