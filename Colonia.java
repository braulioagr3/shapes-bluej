class Colonia
{
    Casa X;
    Casa Y;
    Colonia()
    {
        X = new Casa();
        Y = new Casa();
        X.Acomodate();
        Y.Acomodate();
    }
    /**
     * Desplaza una casa a la derecha para que asi sea visible
     */
    void Constructora(){
        Y.moverDerecha();
        Y.moverDerecha();
        Y.moverDerecha();
        Y.moverDerecha();
        Y.moverDerecha();
        Y.moverDerecha();
        X.moverIzquierda();
        X.moverIzquierda();
    }
    /**
     * Manda dibujar las casas para que puedan distiguirse
     */
    void Dibuja(){
    X.dibujate();
    Y.dibujate();
    }
}