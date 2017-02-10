package bank;

import javax.swing.JOptionPane;
/**
 *
 * @author Savina
 */
class setor {
    private int saldo;
    public void menabung (int bal, int s) {
    if(s%100!=0)
        JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan Ulangi Kembali",
                "Transaksi Gagal", 0);
    
    else if(s<50000)
        JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah rp.50.000,00","ERROR",0);
    
    else if(s>=50000)
    {
    saldo = bal+s;
    JOptionPane.showMessageDialog(null, "Saldo Anda saat ini sebesar : " + saldo);
    }
    }
    
    public int getsaldo(){
    return saldo;
    }
}
