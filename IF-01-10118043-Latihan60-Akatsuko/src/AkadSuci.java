/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class AkadSuci {
    protected String nama, asalDesa, asalNegara, karakter, jurusAndalan;
    
    public AkadSuci(String nama, String asalDesa, String asalNegara,String karakter,String jurusAndalan){
        this.nama = nama;
        this.asalDesa = asalDesa;
        this.asalNegara = asalNegara;
        this.karakter = karakter;
        this.jurusAndalan = jurusAndalan;
        
    }
    public void displayAnggota(){
        System.out.println("Nama            = "+nama);
        System.out.println("Asal Desa       = "+asalDesa);
        System.out.println("Asal Negara     = "+asalNegara);
        System.out.println("Karakter        = "+karakter);
        System.out.println("Jurus Andalan   = "+jurusAndalan+"\n");
        
    }
}
