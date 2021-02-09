package com.company;

import java.io.*;

public class Hello {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://123.txt"));
        int len =0;
        byte[] buffer = new byte[bis.available()];
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D://321.txt"));
        while((len = bis.read(buffer))!=-1){
            bos.write(buffer,0,len);
        }
        bis.close();
        bos.close();



















//        FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\20210204_085415.mp4");
//        FileOutputStream fos = new FileOutputStream("D://131.mp4");
//        int len = 0;
//        while((len=fis.read(new byte[50]))!=-1){
//            fos.write(len);
//        }
//        fis.close();
//        fos.close();












//       FileInputStream fis = new FileInputStream("D://123.jpg");
//        FileOutputStream fos = new FileOutputStream("D://12345.jpg");
//
//        int len ;
//
//       while((len=fis.read(new byte[10000]))!=-1){
//           System.out.println("=========");
//           fos.write(len);
//
//       };












//        FileInputStream f = new FileInputStream("b//1.txt");









//        int len ;
////        System.out.println((char)f.read());
////        System.out.println((char)f.read());
////        System.out.println((char)f.read());
//
//        while((f.read())!=-1){
//            System.out.println((char)f.read());
//        }
//        File file = new File("D://untitled16//b//1.txt");
//        file.mkdirs();



//        int len = f.read();
//        System.out.println(len);

    }





}
