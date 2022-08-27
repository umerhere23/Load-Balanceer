/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package load.balancer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Umer
 */
public class Random   {   
    public static String getServer()   
    {   
        // Reconstruct a Map to avoid concurrency problems caused by the server's upload and download. 
        Map<String, Integer> serverMap =    
                new HashMap<String, Integer>();   
        serverMap.putAll(IpMap.serverWeightMap);   

        // Get the Ip address List 
        Set<String> keySet = serverMap.keySet();   
        ArrayList<String> keyList = new ArrayList<String>();   
        keyList.addAll(keySet);   

        java.util.Random random = new java.util.Random();   
        int randomPos = random.nextInt(keyList.size());   

        return keyList.get(randomPos);   
    }   
}