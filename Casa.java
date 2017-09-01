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
    /**
     * Permite dibujar la casa llamando los metodos "makeVisibe();" de los
     * objetos de los que esta compuesta
     */
    void dibujate(){
        techo.makeVisible();
        pared.makeVisible();
        puerta.makeVisible();
        ventana.makeVisible();
    }
    /**
     * Permite mover la casa abajo llamando los metodos "moveDown();" de los
     * objetos de los que esta compuesta
     */
    void moverAbajo(){
        techo.moveDown();
        pared.moveDown();
        puerta.moveDown();
        ventana.moveDown();
    }
    /**
     * Permite mover la casa arriba llamando los metodos "moveUp();" de los
     * objetos de los que esta compuesta
     */
    void moverArriba(){
        techo.moveUp();
        pared.moveUp();
        puerta.moveUp();
        ventana.moveUp();
    }
    /**
     * Permite mover la casa derecha llamando los metodos "moveRight();" de los
     * objetos de los que esta compuesta
     */
    void moverDerecha(){
        techo.moveRight();
        pared.moveRight();
        puerta.moveRight();
        ventana.moveRight();
    }
    /**
     * Permite mover la casa a la izquierda llamando los metodos "moveDown();" de los
     * objetos de los que esta compuesta
     */
    void moverIzquierda(){
        techo.moveLeft();
        pared.moveLeft();
        puerta.moveLeft();
        ventana.moveLeft();
    }
    /**
     * Mediante una serie de pasos con los elementos de los que esta compuesta la casa
     * los acomoda de forma que puedan aparentar una casa
     */
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