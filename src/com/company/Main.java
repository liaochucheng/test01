package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\com.bjsxt.test");
        File[] f = file.listFiles(new FileNameFilter());
        for(File f1 : f){
            System.out.println(f1.getName());
        }
//        File[]  files= file.listFiles();
//        for(File f : files){
////            System.out.println(f.lastModified());
//              String name = f.getName();
//              if(name.endsWith("iml")){
//                  System.out.println(name);
//              }
//
//        }
//        String[] names =file.list();
//        for(String name : names){
//            System.out.println(name);
//        }







//        File file = new File("D://廖楚城");
//        boolean boo = file.createNewFile();
//        System.out.println(boo);

    }
}
