/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan33userlogin;

/**
 *
 * @author andreas
 */
public class User {
    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private static boolean statusAkun;
    
    private boolean cekAkun (String parUserName, String parPassword) {
        if (parUserName.equals(username) && parPassword.equals(password)) {
            return true;
        }
        return false;
    }
    
    private void hasilLogin (boolean status, String parUserName) {
        if (status) {
            parUserName = parUserName.toUpperCase();
            System.out.println("\n******HALLO " + parUserName + "******");
            System.out.println("Selamat Datang di Aplikasi ini");
        } else {
            System.out.println("\nOoops, Username atau Password anda salah");
        }
    }
    
    public void pengecekanLogin (String parUserName, String parPassword) {
        statusAkun = this.cekAkun(parUserName, parPassword);
        
        this.hasilLogin(statusAkun, parUserName);
    }
}
