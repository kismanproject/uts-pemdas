/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 *
 * @author KISMAN
 */
public class UTS {
    int beratbadan;
    int tinggibadan;

    
      public UTS(int beratbadan, int tinggibadan) {
          this.beratbadan = beratbadan;
          this.tinggibadan = tinggibadan;
      }
      
      
      public void BMI() {
          double x = beratbadan / (tinggibadan * 2 / 100);
          if (x < 18.5) {
          System.out.println("anda termasuk dalam kategori kurus");}
          else if (x >= 18.5 && x <= 24.9) {
          System.out.println("anda masuk dalam kategori normal"); }
          else if (x >= 25 && x <= 29.9) {
          System.out.println("anda masuk dalam kategori berat badan berlebih");}
          else{
          System.out.println("anda masuk dalam kategori obesitas");}
                  
      }
}
