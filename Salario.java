public class Salario {
    
    public static void main(String[] args) {
        Reajustes r = new Reajustes();
        r.Entrada();
        r.Aumento();

        SalarioDesc sd = new SalarioDesc();
        sd.Leitura();
        sd.CalcIr();
        
        System.out.println("(-)IR: " + sd.ir);
        sd.Fgts();
        sd.Inss();
        sd.TotalDesc();
        sd.SalarioL();
    }
} 
