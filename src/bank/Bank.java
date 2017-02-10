package bank;

import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Savina
 */
public class Bank {
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str, str1;
        int choice,z,pin=1234,counter=0,a=3;
        int t,s,tab=50000;
        
        JOptionPane.showMessageDialog(null,"Selamat Datang\n ANJUNGAN TUNAI MANDIRI \n BNI SYARIAH-BOJONEGORO \n\nMasukkan 4 Digit PIN Anda!","WELCOME",1);
        
        try{
        do{
        str = JOptionPane.showInputDialog(null,"Masukkan 4 Digit PIN Anda :","ATM BNI SYARIAH-BOJONEGORO",0);
        pin = Integer.parseInt(str);
        counter+=1;
        
        if(pin==1234)
            do{
                str = JOptionPane.showInputDialog(null, "[1] INFORMASI SALDO \n[2] PENYETORAN \n[3] PENARIKAN \n[4] PETUNJUK \n[5] KELUAR \n\nMasukkan Pilihan Menu :","Pilih Transaksi",3);
                choice = Integer.parseInt(str);
        
        switch(choice){
            case 1 : JOptionPane.showMessageDialog(null,"Saldo Anda saat ini sebesar : " + tab);
            z = JOptionPane.showConfirmDialog(null, "Melanjutkan transaksi lain ?","ATM BNI SYARIAH-BOJONEGORO",JOptionPane.YES_NO_OPTION,3);
            
            if(z==0)
            break;
            else
            JOptionPane.showMessageDialog(null,"Terima Kasih telah menggunakan ATM BNI SYARIAH-BOJONEGORO, ambil kartu ATM anda.");
            System.exit(0);
            
            case 2 :
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran : ");
            s = Integer.parseInt(str1);
            setor hasil = new setor();
            hasil.menabung(tab,s);
            tab = hasil.getsaldo();
            
            z = JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO",JOptionPane.YES_NO_OPTION,3);
            
            if(z==0)
            break;
            else
            JOptionPane.showMessageDialog(null,"Terima Kasih telah menggunakan ATM BRI, ambil ATM anda.");
            System.exit(0);
            
            case 3 :
            str1 = JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " );
            t = Integer.parseInt(str1);
            tarik mengambil = new tarik();
            mengambil.ambil(tab,t);
            tab = mengambil.getsaldo();
            
            z = JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM BNI SYARIAH-BOJONEGORO",JOptionPane.YES_NO_OPTION,3);
            
            if(z==0)
            break;
            else
            JOptionPane.showMessageDialog(null,"Terima Kasih telah menggunakan ATM BRI, ambil ATM anda.");
            System.exit(0);
            
            case 4 : JOptionPane.showMessageDialog(null,"Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan Benar\n[2] Bertransaksiah dengan benar sesuai pilihan\n"
                    + "[3] Gunakan Uang sesuai kebutuhan dan rajinlah menabung\n ","INFO",1);
            break;
            
            case 5 :
            z = JOptionPane.showConfirmDialog(null, "Anda ingin keluar?","Keluar", JOptionPane.YES_NO_OPTION, 0);
            
            if(z==0) {
            JOptionPane.showMessageDialog(null,"Terima Kasih telah menggunakan ATM BRI, ambil kartu ATM anda.");
            System.exit(0); }
        
            else
            break;
            default : JOptionPane.showMessageDialog(null,"Pilihan Menu tidak tersedia\n Silahkan ulangi lagi","ERROR",0);
        }
        }
        
        while (1==1);
        else if (counter<3) {
                a--; //Menghitung Kesalahan login dan memberikan kesempatan login
                JOptionPane.showMessageDialog(null, "PIN Salah!\nPastikan PIN yang anda masukkan Benar!","ERROR",0);
                JOptionPane.showMessageDialog(null,"\nKesempatan login " + a + " kali lagi" + "\n"); 
                }
        else {
        JOptionPane.showMessageDialog(null, "Untuk bantuan nasabah, \nSilahkan Menghubungi call center 555123(Gratis)", "Kartu ATM Anda di Blokir!",0);
        System.exit(0);
        }
        }
        while (1==1);
        }
        
        catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Kesalahan! \nPastikan kode yang anda masukkan berformat benar! \n PROGRAM KELUAR! \nTerima Kasih","ERROR",0);
        }
        }
    
}
