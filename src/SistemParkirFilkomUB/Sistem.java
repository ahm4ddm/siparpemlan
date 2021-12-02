/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemParkirFilkomUB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahm4d
 */
public class Sistem {
    private String noParkir;
    private String nopol;
    private String manufaktur;
    private String jenis;
    private String warna;
    private String transmisi;
    private String harga;
    private String status;
    public static ArrayList<Sistem>dataParkirArrayList = new ArrayList<>();
    public static String fileDataParkir = Paths.get("").toAbsolutePath().toString()+"//dataParkir//dataParkir.txt";
    
    public Sistem() {
    }

    public Sistem(String noParkir, String nopol, String manufaktur, String jenis, String warna, String transmisi, String harga, String status) {
        this.noParkir = noParkir;
        this.nopol = nopol;
        this.manufaktur = manufaktur;
        this.jenis = jenis;
        this.warna = warna;
        this.transmisi = transmisi;
        this.harga = harga;
        this.status = status;
    }

    public Sistem(String nopol, String manufaktur, String jenis, String warna, String transmisi, String harga, String status) {
        noParkir = dataParkirArrayList.get(0).noParkir;
        this.nopol = nopol;
        this.manufaktur = manufaktur;
        this.jenis = jenis;
        this.warna = warna;
        this.transmisi = transmisi;
        this.harga = harga;
        this.status = status;
    }
    
    

    public String getNoParkir() {
        return noParkir;
    }

    public String getNopol() {
        return nopol;
    }

    public String getJenis() {
        return jenis;
    }

    public String getManufaktur() {
        return manufaktur;
    }

    public String getWarna() {
        return warna;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public String getHarga() {
        return harga;
    }

    public String getStatus() {
        return status;
    }

    public void setNoParkir(String noParkir) {
        this.noParkir = noParkir;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setStatus(String status) {
        this.status = status;
    }    
    
    
    public static void inisialisasiDataParkir(){
        File dataParkirTxt = new File (fileDataParkir);
        try{
            Scanner ambilDataParkirtxt = new Scanner(dataParkirTxt);
            while(ambilDataParkirtxt.hasNextLine()){
                prosesCetak(ambilDataParkirtxt.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
    
    public void tambahDataParkir(){
        try {
            FileWriter tambahData = new FileWriter(fileDataParkir, false);
            for (int i = 0; i < dataParkirArrayList.size(); i++) {
                tambahData.write(dataParkirArrayList.get(i).noParkir+"|");
                tambahData.write(dataParkirArrayList.get(i).nopol+"|");
                tambahData.write(dataParkirArrayList.get(i).manufaktur+"|");
                tambahData.write(dataParkirArrayList.get(i).jenis+"|");
                tambahData.write(dataParkirArrayList.get(i).warna+"|");
                tambahData.write(dataParkirArrayList.get(i).transmisi+"|");
                tambahData.write(dataParkirArrayList.get(i).harga+"|");
                tambahData.write(dataParkirArrayList.get(i).status);
                tambahData.write(System.getProperty("line.separator"));
            }
            tambahData.flush();
            tambahData.close();
        }catch(IOException e){
            System.out.println("Error :"+e);
        }
    }
    
    public static void prosesCetak(String data){ 
        int pemisahKe = 0;
        String tempDataStr ="";
        
        String noParkir = "";
        String nopol = "";
        String manufaktur = "";
        String jenis = "";
        String warna = "";
        String transmisi = "";
        String harga = "";
        String status = "";
        
        for (int i = 0; i < data.length();i++) {
            if(data.charAt(i) != '|'){
                tempDataStr = tempDataStr + data.charAt(i);
            }else{
                pemisahKe = pemisahKe+1;
                if(pemisahKe == 1){
                    noParkir = tempDataStr;
                }
                if(pemisahKe == 2){
                    nopol = tempDataStr;
                }
                if(pemisahKe == 3){
                    manufaktur = tempDataStr;
                }
                if(pemisahKe == 4){
                    jenis = tempDataStr;
                }
                if(pemisahKe == 5){
                    warna = tempDataStr;
                }
                if(pemisahKe == 6){
                    transmisi = tempDataStr;
                }
                if(pemisahKe == 7){
                    harga = tempDataStr;
                }
                tempDataStr = "";
            } 
        }
        status = tempDataStr;
        dataParkirArrayList.add(new Sistem(noParkir, nopol, manufaktur, jenis, warna, transmisi, harga, status)); 
    }
    
    public int cariDengan(ArrayList<Sistem>dataParkirArrayList, String nopar){
        int awal = -1;
        int i = 0;
        for (; i < dataParkirArrayList.size(); i++) {
            if(dataParkirArrayList.get(i).noParkir.equals(nopar)){
                awal = i;
                break;
            }
        }
        return awal;
    }
    
}
