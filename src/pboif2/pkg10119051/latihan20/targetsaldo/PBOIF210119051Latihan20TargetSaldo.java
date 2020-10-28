/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan20.targetsaldo;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk menaampilkan Target Saldo Tabungan
 */
public class PBOIF210119051Latihan20TargetSaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  bunga,saldo,saldoAwal, saldoTarget, saldoAkhir;
        
        saldoAwal =3500000;
        bunga = 8;
        saldoTarget = 6000000;
        saldoAkhir = 0;
        
        
        for (int i = 1; saldoAkhir <= saldoTarget ; i++){
            saldo = saldoAwal * bunga/100; 
            saldoAkhir = saldo + saldoAwal;
            System.out.println("Saldo di bulan ke-"+ i + " Rp."+ saldoAkhir); 
            saldoAwal += saldo;
          
        }
    }
    
}
