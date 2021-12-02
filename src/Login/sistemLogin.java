/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahm4d
 */
public class sistemLogin {
    private String uname;
    private String pass;
    public static ArrayList<sistemLogin> Arrusers = new ArrayList<>();
    public static String fileDataLogin = Paths.get("").toAbsolutePath().toString()+"//dataUser//dataUser.txt";

    public sistemLogin(String uname, String pass) {
        this.uname = uname;
        this.pass = pass;
    }

    public String getUname() {
        return uname;
    }

    public String getPass() {
        return pass;
    }
    
    
    
    public static void inisialisasiData(){
        File file = new File(fileDataLogin);
        try{
            Scanner ambil = new Scanner(file);
            while(ambil.hasNextLine()){
                proses(ambil.nextLine());
            }
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    public static void proses(String data){
        String user = "";
        String pass = "";
        int pemisahKe = 0;
        int i = 0;
        String temp = "";
        for (i = 0; i < data.length(); i++) {
            if(data.charAt(i) != '|'){
                temp = temp + data.charAt(i);
            }else{
                pemisahKe = pemisahKe+1;
                if(pemisahKe == 1){
                    user = temp;
                }
                temp = "";
            }
        }
        pass = temp;
        Arrusers.add(new sistemLogin(user, pass));    
    }
}
