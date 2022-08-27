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
public class Hash      {      
    public static String getServer()      
    {      
        Map<String, Integer> serverMap =       
                new HashMap<String, Integer>();      
        serverMap.putAll(IpMap.serverWeightMap);      

        Set<String> keySet = serverMap.keySet();      
        ArrayList<String> keyList = new ArrayList<String>();      
        keyList.addAll(keySet);      

        String remoteIp = "127.0.0.1";      
        int hashCode = remoteIp.hashCode();      
        int serverListSize = keyList.size();      
        int serverPos = hashCode % serverListSize;      

        return keyList.get(serverPos);      
    }      
}
