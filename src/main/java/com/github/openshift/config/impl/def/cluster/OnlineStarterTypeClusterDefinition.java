package com.github.openshift.config.impl.def.cluster;

import com.github.openshift.circe.beans.KubeList;
import com.github.openshift.circe.gen.machineset.v1alpha1.MachineSet;
import com.github.openshift.circe.gen.networkconfig.v1.NetworkConfig;
import com.github.openshift.circe.gen.tuned.v1alpha1.Tuned;
import com.github.openshift.circe.gen.tuned.v1alpha1.TunedSpec;
import com.github.openshift.config.ClusterCriterion;
import com.github.openshift.config.impl.network.OnlineNetworkConfig;
import com.github.openshift.config.impl.tuning.OpsDefaultTunedSpec;

/**
 * Base class for all "starter" type clusters.
 */
@ClusterCriterion(type = ClusterCriterion.ClusterType.ONLINE_STARTER)
public class OnlineStarterTypeClusterDefinition extends OnlineTypeClusterDefinition {

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

    @Override
    public final NetworkConfig getNetworkConfig() {
        return new OnlineNetworkConfig();
    }

}