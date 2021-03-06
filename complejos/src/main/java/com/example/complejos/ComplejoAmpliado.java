package com.example.complejos;

class ComplejoAmpliado extends Complejo {

    private boolean esReal;

    public boolean isEsReal() {
        return esReal;
    }

    public void setEsReal(boolean esReal) {
        this.esReal = esReal;
    }

    public ComplejoAmpliado(double re, double im) {
        super(re, im);
        esReal = im ==0;
    }

    public ComplejoAmpliado(double re) {
        super(re, 0);
        esReal= true;
    }

    @Override
    public void suma(Complejo v) {
        esReal = imaginario == - v.imaginario;
        super.suma(v);
    }

    @Override
    public String toString() {
        if(esReal) {
            return getReal() + " ¡real!";
        } else{
            return super.toString();
        }
    }

    public boolean esReal(){
        return esReal;
    }

}