/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejlotoarreglos;
import java.util.*;
/**
 *
 * @author NTK_MDR
 */
public class EjLotoArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int apU, apS, contC=0,k;
        int vecUsuario[] = new int[6];
        int vecSorteo[] = new int[6];
        
        Scanner leer = new Scanner(System.in);
        Random azar = new Random();
        for(apU=0;apU<6;apU++){
            do{
                System.out.println("Ingrese numero "+(apU+1));
                vecUsuario[apU] = leer.nextInt();
            }while(vecUsuario[apU]<=0 || vecUsuario[apU]>=37);
            k=0;
            while(k<apU || vecUsuario[k]!=vecUsuario[apU]){
            //for(k=0;k<apU;k++)
                if(vecUsuario[apU]==vecUsuario[k])
                    apU--;   
                k++;
            }
        }
        
        for(apS=0;apS<6;apS++){
            vecSorteo[apS] = azar.nextInt(36)+1;
            k=0;
            while(k<apS || vecSorteo[k]!=vecSorteo[apS]){
                if(vecUsuario[apS]==vecUsuario[k])
                    apS--; 
            k++;
            }
        }
        
        for (k=0;k<6;k++)
            System.out.print(vecSorteo[k]+" - ");
        System.out.println();
        
        for(apU=0;apU<6;apU++)
            for(apS=0;apS<6;apS++)
                if(vecUsuario[apU]==vecSorteo[apS])
                    contC++;
        System.out.println("Coincidencias: "+contC);
        if (contC==6)
            System.out.println("Felicidades Ganho el loto");
        else
            if(contC==5)
                System.out.println("5 Coincidencias - $ 1");
            else
                System.out.println("Siga participando");
    }
    
}
