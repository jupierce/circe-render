// GENERATED FILE -- DO NOT ALTER (circe.go)

package com.github.openshift.circe.gen.machineconfig.v1;
import com.github.openshift.circe.beans.*;
import com.github.openshift.circe.yaml.*;
import java.util.*;

public interface File extends Bean {

	@YamlPropertyName(value="node")
	@YamlPropertyInline
	Node getNode() throws Exception;

	@YamlPropertyName(value="fileEmbedded1")
	@YamlPropertyInline
	FileEmbedded1 getFileEmbedded1() throws Exception;

	interface EZ extends File {

		@YamlPropertyName(value="node")
		@YamlPropertyInline
		default Node getNode() throws Exception { return null; }

		@YamlPropertyName(value="fileEmbedded1")
		@YamlPropertyInline
		default FileEmbedded1 getFileEmbedded1() throws Exception { return null; }

	}

}
