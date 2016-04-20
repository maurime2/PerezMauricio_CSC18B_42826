/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securerandoms;
import java.security.SecureRandom;
public class SecureRandoms {

    public void MinMax(int [] a)
    {
        int min=Integer.MAX_VALUE, min_index = 0;
        int max=Integer.MIN_VALUE, max_index=0;

        for(int i=0; i<a.length;i++)
        {
            if(a[i]>max) {max=a[i]; max_index=i; }
            if(a[i]>min) {max=a[i]; min_index=i; }
        }
    }
    
    public static void main(String[] args) {
    
        SecureRandom generator = new SecureRandom();
        
        int[] freq=new int[100];
        
        for(int i=0; i<freq.length;i++) freq[i]=0;
        
        for(int i=0;i<1000000;i++) freq[generator.nextInt(100)]++;
        
        for(int i=0;i<freq.length;i++) System.out.printf("%d Was Picked %d times ...\n",i,freq[i]);
    }
    
}
