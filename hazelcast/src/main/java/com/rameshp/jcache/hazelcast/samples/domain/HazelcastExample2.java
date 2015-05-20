package com.rameshp.jcache.hazelcast.samples.domain;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import java.util.Map;
import java.util.Queue;

/**
 * Created by ivy4760 on 5/20/15.
 */
public class HazelcastExample2 {

    public static void main(String[] args) {
        Config cfg = new Config();
        HazelcastInstance instance = Hazelcast.newHazelcastInstance(cfg);
        Map<Integer, Employee> mapCustomers = instance.getMap("employees");
        mapCustomers.put(1, new Employee("Joe","Joe","Joe@Joe.com"));
        mapCustomers.put(2, new Employee("Ali", "Ali", "Ali@Ali.com"));
        mapCustomers.put(3, new Employee("Avi", "Avi", "Avi@Avi.com"));

        System.out.println("Employee with key 1: " + mapCustomers.get(1));
        System.out.println("Map Size:" + mapCustomers.size());

        Queue<Employee> queueCustomers = instance.getQueue("employees");
        queueCustomers.offer(new Employee("Tom","Tom","Tom@Tom.com"));
        queueCustomers.offer(new Employee("Mary","Mary","Mary@Mary.com"));
        queueCustomers.offer(new Employee("Jane","Jane","Jane@Jane.com"));
        queueCustomers.offer(new Employee("Tom","Tom","Tom@Tom.com"));


        System.out.println("First Employee: " + queueCustomers.poll());
        System.out.println("Second Employee: "+ queueCustomers.peek());
        System.out.println("Queue size: " + queueCustomers.size());
    }
}
