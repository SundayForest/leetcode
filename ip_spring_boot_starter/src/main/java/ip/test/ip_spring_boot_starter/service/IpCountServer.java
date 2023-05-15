package ip.test.ip_spring_boot_starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import properties.IpProperties;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunday
 * @create 2023 --- 05 --- 13 --- 14:10
 */
public class IpCountServer {
    private Map<String,Integer> ipCountMap = new HashMap<>();
    //当前的 request 对象的注入工作由使用当前 starter 的工程提供自动装配
    @Autowired
    private HttpServletRequest httpServletRequest;
    @Autowired
    private IpProperties ipProperties;
    public void count(){
        String ip = httpServletRequest.getRemoteAddr();
        System.out.println(ip + "---------------");
        if(ipCountMap.containsKey(ip)){
            System.out.println(ipCountMap.get(ip) + 1);
            ipCountMap.put(ip,ipCountMap.get(ip) + 1);
        }else{
            System.out.println(666);
            ipCountMap.put(ip,1);
        }
    }
//    读取的值 或者 ：后的默认值
//    @Scheduled(cron = "0/${tools.ip.cycle:5} * * * * ?")
    @Scheduled(cron = "0/#{ipProperties.cycle} * * * * ?")
    public void print(){
        if(ipProperties.getModel().equals(IpProperties.LogModel.DETAIL.getValue())){
            System.out.println("ip监控访问");
            System.out.println("+-----ip-address-----+--num--+");
            for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(String.format("|%18s  |%5d  |", key, value));
            }
            System.out.println("+--------------------+-------+");
        }else if(ipProperties.getModel().equals(IpProperties.LogModel.SIMPLE.getValue())){
            System.out.println("ip监控访问");
            System.out.println("+-----ip-address-----+");
            for (String key : ipCountMap.keySet()) {
                System.out.println(String.format("|%18s  |", key));
            }
            System.out.println("+--------------------+");
        }

        if(ipProperties.getCycleReset()){
            ipCountMap.clear();
        }
    }

}
