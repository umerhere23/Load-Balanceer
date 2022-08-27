/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package load.balancer;

import java.util.HashMap;

/**
 *
 * @author Umer
 */
public class IpMap   {   
    // The list of Ips to be routed, Key for Ip, Value for the weight of the Ip 
    public static HashMap<String, Integer> serverWeightMap =    
            new HashMap<String, Integer>();   

    static   
    {   
        serverWeightMap.put("192.168.1.100", 1);   
        serverWeightMap.put("192.168.1.101", 1);   
        // Weight 4 
        serverWeightMap.put("192.168.1.102", 4);   
        serverWeightMap.put("192.168.1.103", 1);   
        serverWeightMap.put("192.168.1.104", 1);   
        // Weight 3 
        serverWeightMap.put("192.168.1.105", 3);   
        serverWeightMap.put("192.168.1.106", 1);   
        // Weight 2 
        serverWeightMap.put("192.168.1.107", 2);   
        serverWeightMap.put("192.168.1.108", 1);   
        serverWeightMap.put("192.168.1.109", 1);   
        serverWeightMap.put("192.168.1.110", 1);   
    }   
}
