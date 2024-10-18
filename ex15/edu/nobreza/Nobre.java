package edu.nobreza;
public interface Nobre  {
    public void governar();
    public final Conselheiro conselheiro = new Conselheiro();
    public final Soldado[] soldados = new Soldado[10];
}