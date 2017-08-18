class Casa{
    //Variables de Instancìa
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    Casa(){
        //Declaracion de atributos
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
        //Ajuste de tamaños
        ventana.changeColor("blue");
        techo.changeColor("yellow");
        pared.changeColor("green");
        techo.changeSize(50,115);
        pared.changeSize(100);
        puerta.changeSize(50);
    }
    void dibujate(){
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
        ventana.makeVisible();
    }
    void moverAbajo(){
        techo.moveDown();
        pared.moveDown();
        puerta.moveDown();
        ventana.moveDown();
    }
    void moverArriba(){
        techo.moveUp();
        pared.moveUp();
        puerta.moveUp();
        ventana.moveUp();
    }
    void moverDerecha(){
        techo.moveRight();
        pared.moveRight();
        puerta.moveRight();
        ventana.moveRight();
    }
    void moverIzquierda(){
        techo.moveLeft();
        pared.moveLeft();
        puerta.moveLeft();
        ventana.moveLeft();
    }
    void Acomodate(){
        //Acomodo
        puerta.moveDown();
        puerta.moveDown();
        techo.moveRight();
        techo.moveRight();
        techo.moveRight();
        techo.moveUp();
        puerta.moveDown();
        techo.moveVertical(5);
        puerta.moveVertical(10);
        puerta.moveRight();
        puerta.moveRight();
        puerta.moveHorizontal(-5);
        ventana.moveUp();
        ventana.moveUp();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveRight();
        ventana.moveHorizontal(-5);
        ventana.moveVertical(-5);
        puerta.moveUp();
        puerta.moveHorizontal(-10);
    }
}