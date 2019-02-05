package com.github.openshift.config.impl.cluster;

import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.gen.machineset.v1alpha1.MachineSet;
import com.github.openshift.circe.gen.tuned.v1alpha1.Tuned;
import com.github.openshift.circe.gen.tuned.v1alpha1.TunedSpec;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.tuning.OpsDefaultTunedSpec;

import java.util.Map;

/**
 * Base class for all online clusters (starter / pro)
 */
public abstract class DedicatedTypeClusterDefinition extends BaseClusterDefinition{

    public DedicatedTypeClusterDefinition(ClusterCriterion.ClusterType type, ClusterCriterion.ClusterEnvironment env, String name, Map<String, String> attributes) {
        super(type, env, name, attributes);
    }

    @Override
    public Tuned getTuned() {
        return new Tuned() {
            @Override
            public TunedSpec getSpec() {
                return new OpsDefaultTunedSpec();
            }
        };
    }

    @Override
    public KubeList<MachineSet> getMachineSetList() {
        return null;
    }

}
