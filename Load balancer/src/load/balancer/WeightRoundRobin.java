/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package load.balancer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Umer
 */
public class WeightRoundRobin   {   
    private static Integer pos;   

    public static String getServer()   
    {   
        // Reconstruct a Map to avoid concurrency problems caused by the server's upload and download. 
        Map<String, Integer> serverMap =    
                new HashMap<String, Integer>();   
        serverMap.putAll(IpMap.serverWeightMap);   

        // Get the Ip address List 
        Set<String> keySet = serverMap.keySet();   
        Iterator<String> iterator = keySet.iterator();   

        List<String> serverList = new ArrayList<String>();   
        while (iterator.hasNext())   
        {   
            String server = iterator.next();   
            int weight = serverMap.get(server);   
            for (int i = 0; i < weight; i++)   
                serverList.add(server);   
        }   

        String server = null;   
        synchronized (pos)   
        {   
            if (pos > keySet.size())   
                pos = 0;   
            server = serverList.get(pos);   
            pos ++;   
        }   

        return server;   
    }   
}