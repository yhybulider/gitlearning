package com.atguigu.java2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class throwable {
    public static void main(String args[]){
        Date date = readDate();
    }

    private static Date readDate() {
        try{
            String str = "2019-12-05";//格式要下面的simpledataformat相同
            DateFormat df = new SimpleDateFormat("YYYY-MM-dd");//new一个df的dataformat
            Date date = df.parse(str);
            return date;
//解析异常，就是上面的str格式不对之后，就会报错
        }catch(ParseException e){
            System.out.println("处理ParseException");
            e.printStackTrace();
        }
        return  null;
    }
}
