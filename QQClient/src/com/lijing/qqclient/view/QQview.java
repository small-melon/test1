package com.lijing.qqclient.view;


import com.lijing.qq.utils.Utility;

//菜单界面
public class QQview {
    private boolean loop = true;//控制显示菜单
    private String key = "";//控制输出
    //显示主菜单
    public static void main(String[] args) {
    // new QQview().mainMenu();
        System.out.println("\t\t  break Syste你好斤斤计较jj");

    }
        private  void mainMenu() {
            while (loop) {
                System.out.println("=============welcome to online communication system============");
                System.out.println("\t\t 1 sign in System");
                System.out.println("\t\t 9 break System");
                System.out.println("Please enter your choice");
                key = Utility.readString(1);
                switch (key) {
                    case "1":
                        System.out.println("id:");
                        String userid=Utility.readString(50);
                        System.out.println("password:");
                        String pwd=Utility.readString(50);
                        if(true){
                        System.out.println("success sign in System");
                            System.out.println("============welcome ======="+userid+"==============");
                        while(loop){
                            System.out.println("\t========online communication system"+userid);
                            System.out.println("\t\t 1 Send a message");
                            System.out.println("\t\t 9 break System");
                            System.out.println("\t\t Please enter your choice");
key=Utility.readString(1);
switch(key){
    case "1":
        System.out.println("\t\t 1 Send a message");
        break;
    case "9":
        loop=false;
        break;
}
                        }

                        }
                      else {    System.out.println( "Login failed");
                        }

                        break;
                    case "9":
                        loop = false;
                        break;
                }
            }

        }
    }
