package main.java;

//Definindo os atributos do Corpo Humano
public class CorpoHumano {
    public double massa;
    private double volume;
    private double densidade;
    private double imc;
    private double altura;

    //Criando o constructor do corpo humano
    public CorpoHumano(double massa, double volume, double densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    //Metodos get do corpo humano
    public double getMassa(){
        return massa;
    }

    public double getVolume(){
        return volume;
    }

    public double getDensidade(){
        return densidade;
    }


    public double getAltura(){
        return altura;
    }

    //Metodos set do corpo humano
    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setMassa(double massa){
        this.massa = massa;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }
    public void setDensidade(double densidade){
        this.densidade = densidade;
    }

    //Metodo para calcular e exibir o IMC
    public double calcularIMC(){
        return this.imc = this.massa / (this.altura * this.altura);
    }

}