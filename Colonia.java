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
    void Dibuja(){
    X.dibujate();
    Y.dibujate();
    }
}