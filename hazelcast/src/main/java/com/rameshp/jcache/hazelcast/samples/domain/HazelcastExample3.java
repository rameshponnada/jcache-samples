package com.rameshp.jcache.hazelcast.samples.domain;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientNetworkConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Map;

/**
 * Created by ivy4760 on 5/20/15.
 */
public class HazelcastExample3 {
    public static void main(String[] args) {
        ClientNetworkConfig clientConfig = new ClientNetworkConfig();
        clientConfig.addAddress("127.0.0.1:5701");
        HazelcastInstance client = HazelcastClient.newHazelcastClient(new ClientConfig().setNetworkConfig(clientConfig));

        Map<Integer, Employee> mapCustomers = client.getMap("employees");
        mapCustomers.put(1, new Employee("Joe","Joe","Joe@Joe.com"));
        mapCustomers.put(2, new Employee("Ali", "Ali", "Ali@Ali.com"));
        mapCustomers.put(3, new Employee("Avi", "Avi", "Avi@Avi.com"));


        IMap map = client.getMap("employees");
        System.out.println("Map Size:" + map.size());
    }
}
