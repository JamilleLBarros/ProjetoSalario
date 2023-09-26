import java.util.Scanner;

public class Reajustes{

    public double salario, novoSal;

    public void Entrada(){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salario = s.nextDouble();

    }

    public void Aumento(){
        if(salario <= 280){
            novoSal = (salario * 0.20) + salario;
            System.out.println("Seu salário era R$ " + salario + " Após o aumento de 20% seu salário atual é de R$ " + novoSal);
        } else if (salario > 280 && salario <= 700 ){
           novoSal = (salario * 0.15) + salario;
            System.out.println("Seu salário era R$ " + salario + ". Após o aumento de 15% seu salário atual é de R$ " + novoSal);
        }else if(salario > 700 && salario <= 1500){
             novoSal = (salario * 0.10) + salario;
            System.out.println("Seu salário era R$ " + salario + ". Após o aumento de 10% seu salário atual é de R$ " + novoSal);
        }else if(salario > 1500){
             novoSal = (salario * 0.05) + salario;
            System.out.println("Seu salário era R$ " + salario + ". Após o aumento de 5% seu salário atual é de R$ " + novoSal);
        }
    }

}
