package com.interest.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.interest.auth","com.interest.common"})
public class InterestAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterestAuthApplication.class, args);
/*        int[] arr={6,3,8,2,9,1};
        System.out.println("排序前数组为：");
        for(int num:arr){
            System.out.println(num+" ");
        }
        for(int i=0;i<arr.length-1;i++){//外层循环控制排序趟数
             for(int j=0;j<arr.length-1-i;j++){//
                 System.out.print(" "+arr[j]);
                  if(arr[j]<arr[j+1]){ 
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
             }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for(int num:arr){
            System.out.print(num+" ");
        }*/
    }

}
