
    import java.util.Scanner;

    public class SalarioDesc{
        public double precoHoras,horas,salarioB,ir,inss, fgts,totalDesc, salarioL;
          Scanner x = new Scanner(System.in);

        public void Leitura(){
            System.out.println("Digite quanto você ganha por horas trabalhadas: ");
            precoHoras = x.nextDouble();
    
            System.out.println("Digite suas horas trabalhadas: ");
            horas = x.nextDouble();

        }
         public double SalarioB(){
            salarioB = precoHoras * horas;
            System.out.println("Salário Bruto: " + salarioB);
            return salarioB;
        }
    
        public double CalcIr(){
            SalarioB();
            if(salarioB <= 900){
                System.out.println("Isento de imposto de renda!");
            }else if(salarioB > 900 && salarioB <=1500){
                ir = salarioB * 0.05;
            }else if(salarioB == 1500 && salarioB <= 2500){
                ir = salarioB * 0.10;
            }else if(salarioB > 2500){
                ir = salarioB * 0.20;
            } return ir;
        }
       
        public double Inss(){
           inss = salarioB * 0.10;
           System.out.println("(-)INSS:  " + inss);
           return inss;
        }
    
        public double Fgts(){
             fgts = salarioB * 0.11;
             System.out.println("(-)FGTS: " + fgts);
             return fgts;
        }
        public double TotalDesc(){
            totalDesc = inss + ir + fgts;
            System.out.println("Total de descontos: " + totalDesc);
            return totalDesc;
        }
        public double SalarioL(){
          salarioL = salarioB - totalDesc;
          System.out.println("Salário Liquído: " + salarioL) ;
          return salarioL;
        }
    }
